package org.minijuego;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class minijuego extends JFrame implements ActionListener, NativeKeyListener {

    private JFrame vMinijuego = new JFrame();
    private JButton bSalir = new JButton();
    private JPanel contentPane;
    private JButton bReiniciar = new JButton();

    private List<Point> snake; // Cuerpo de la serpiente
    private Point apple;  // Posición de la manzana
    private int direction = KeyEvent.VK_RIGHT; // Dirección inicial

    private static final int UNIT_SIZE = 20; //Tamaño de cada bloque (cuadrados)
    private static final int DELAY = 100; //tiempo en ms entre movimientos
    private Timer timer;
    private boolean gameOver = false;

    private int tamanoX;
    private int tamanoY;

    public minijuego() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        tamanoX = screenSize.width;
        tamanoY = screenSize.height;
        vMinijuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vMinijuego.setTitle("Minijuego");
        vMinijuego.setBounds(0, 0, tamanoX, tamanoY);


        // Panel principal donde dibujaremos el juego
        contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Fondo negro
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());

                // Dibujar manzana
                g.setColor(Color.RED);
                g.fillRect(apple.x, apple.y, UNIT_SIZE, UNIT_SIZE);

                // Dibujar serpiente
                g.setColor(Color.WHITE);
                for (Point p : snake) {
                    g.fillRect(p.x, p.y, UNIT_SIZE, UNIT_SIZE);
                }

                if (gameOver) {
                    String msg = "Game Over!";
                    g.setColor(Color.RED);
                    g.setFont(new Font("Arial", Font.BOLD, 48));
                    FontMetrics metrics = getFontMetrics(g.getFont());
                    g.drawString(msg, (getWidth() - metrics.stringWidth(msg)) / 2, getHeight() / 2);
                    bReiniciar.setVisible(true);
                }
            }
        };

        contentPane.setLayout(null);
        vMinijuego.setContentPane(contentPane);
        contentPane.setFocusable(true);
        contentPane.requestFocusInWindow();

        // salir
        bSalir.setText("Salir");
        int cSalidaX = tamanoX - 110;
        int cSalidaY = 10;
        int tSalidaX = 100;
        int tSalidaY = 40;
        bSalir.setBounds(cSalidaX, cSalidaY, tSalidaX, tSalidaY);
        bSalir.setBackground(Color.RED);
        bSalir.setForeground(Color.WHITE);
        bSalir.addActionListener(this);
        bSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                bSalir.setBackground(new Color(138, 0, 0));
                bSalir.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bSalir.setBackground(Color.RED);
                bSalir.setForeground(Color.WHITE);
            }
        });
        contentPane.add(bSalir);

        bReiniciar.setText("REINICIAR O PUTO?");
        bReiniciar.setBounds(tamanoX/2-UNIT_SIZE*7, tamanoY/2 -100, tSalidaX + 200, tSalidaY);
        bReiniciar.setBackground(Color.RED);
        bReiniciar.setForeground(Color.WHITE);
        bReiniciar.addActionListener(this);
        bReiniciar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                bReiniciar.setBackground(new Color(138, 0, 0));
                bReiniciar.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                bReiniciar.setBackground(Color.RED);
                bReiniciar.setForeground(Color.WHITE);
            }
        });
        bReiniciar.setVisible(false);
        contentPane.add(bReiniciar);

        //empezar el juego
        initGame();

        //configurar y comenzar el timer que mueve la serpiente(si hay que utilizar lambda o como se diga me ha costado pillarlo)
        timer = new Timer(DELAY, e -> {
            if (!gameOver) {
                moveSnake();
                checkCollision();
                contentPane.repaint();
            }
        });
        timer.start();

        vMinijuego.setVisible(true);
    }

    private void initGame() {
        snake = new ArrayList<>();
        // Inicializar serpiente con 3 bloques
        int startX = tamanoX / 2;
        int startY = tamanoY / 2;
        snake.add(new Point(startX, startY));
        snake.add(new Point(startX - UNIT_SIZE, startY));
        snake.add(new Point(startX - 2 * UNIT_SIZE, startY));

        spawnApple();
        direction = KeyEvent.VK_RIGHT; // Dirección inicial
        gameOver = false;
    }

    private void spawnApple() {
        Random random = new Random();
        int maxX = (tamanoX / UNIT_SIZE) - 1;
        int maxY = (tamanoY / UNIT_SIZE) - 1;
        int x, y;
        Point p;
        do {
            x = random.nextInt(maxX) * UNIT_SIZE;
            y = random.nextInt(maxY) * UNIT_SIZE;
            p = new Point(x, y);
        } while (snake.contains(p));
        apple = p;
    }

    private void moveSnake() {
        Point head = snake.get(0);
        Point newHead = new Point(head);

        switch (direction) {
            case KeyEvent.VK_UP -> newHead.translate(0, -UNIT_SIZE);
            case KeyEvent.VK_DOWN -> newHead.translate(0, UNIT_SIZE);
            case KeyEvent.VK_LEFT -> newHead.translate(-UNIT_SIZE, 0);
            case KeyEvent.VK_RIGHT -> newHead.translate(UNIT_SIZE, 0);
        }

        snake.add(0, newHead);

        if (newHead.equals(apple)) {
            // Come la manzana, generar nueva
            spawnApple();
        } else {
            // No crece, quitar el último bloque
            snake.remove(snake.size() - 1);
        }
    }

    private void checkCollision() {
        Point head = snake.get(0);

        // Revisar bordes
        if (head.x < 0 || head.x >= tamanoX || head.y < 0 || head.y >= tamanoY) {
            gameOver = true;
            timer.stop();
        }

        // Revisar colisión con el cuerpo (sin contar la cabeza)
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver = true;
                timer.stop();
                break;
            }
        }
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        int key = nativeKeyEvent.getKeyCode();

        // Evitar que la serpiente pueda ir en la dirección opuesta directamente
        if ((key == NativeKeyEvent.VC_W || key == NativeKeyEvent.VC_UP) && direction != KeyEvent.VK_DOWN) {
            direction = KeyEvent.VK_UP;
        } else if ((key == NativeKeyEvent.VC_S || key == NativeKeyEvent.VC_DOWN) && direction != KeyEvent.VK_UP) {
            direction = KeyEvent.VK_DOWN;
        } else if ((key == NativeKeyEvent.VC_A || key == NativeKeyEvent.VC_LEFT) && direction != KeyEvent.VK_RIGHT) {
            direction = KeyEvent.VK_LEFT;
        } else if ((key == NativeKeyEvent.VC_D || key == NativeKeyEvent.VC_RIGHT) && direction != KeyEvent.VK_LEFT) {
            direction = KeyEvent.VK_RIGHT;
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {
        // No usado
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {
        // No usado
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bSalir) {
            System.exit(0);
        } else if (e.getSource() == bReiniciar) {
            
            bReiniciar.setVisible(false);
            gameOver = false;
        } else {
            System.out.println("Error en el evento");
        }

    }

    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
            minijuego game = new minijuego();
            GlobalScreen.addNativeKeyListener(game);
        } catch (NativeHookException e) {
            System.err.println("Error con el hook global del teclado: " + e.getMessage());
        }
    }
}
