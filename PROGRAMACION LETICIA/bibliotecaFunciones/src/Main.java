import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (0 != 1) {
                System.out.println("Cual de las siguientes pruebas quieres hacer: \n" +
                        "1-esCapicua \n" +
                        "2-esPrimo \n" +
                        "3-siguientePrimo \n" +
                        "4-digitos \n" +
                        "5-voltea \n" +
                        "6-digitoN \n" +
                        "7-quitarPorDetras \n" +
                        "8-quitarPorDelante \n" +
                        "9-pegarPorAtras \n" +
                        "10-pegarPorDelante \n");
                int seleccion = scanner.nextInt();
                switch (seleccion) {
                    case 1:
                        System.out.println("Escribe el numero");
                        int num = scanner.nextInt();
                        boolean respuesta = biblioFunNacho.esCapicua(num);
                        if (respuesta) {
                            System.out.println("El numero es capicuo");
                        } else {
                            System.out.println("El numero no es capicuo");
                        }
                        break;

                    case 2:
                        System.out.println("Escribe el numero");
                        int num1 = scanner.nextInt();
                        boolean respuesta2 = biblioFunNacho.esPrimo(num1);
                        if (respuesta2) {
                            System.out.println("El numero es primo");
                        } else {
                            System.out.println("El numero no es primo");
                        }
                        break;

                    case 3:
                        System.out.println("Escribe el numero");
                        int num2 = scanner.nextInt();
                        int respuesta3 = biblioFunNacho.siguientePrimo(num2);
                        System.out.println("El siguiente primo es: " + respuesta3);
                        break;

                    case 4:
                        System.out.println("Escribe el numero");
                        int num3 = scanner.nextInt();
                        int respuesta4 = biblioFunNacho.digitos(num3);
                        System.out.println("El numero tiene un total de " + respuesta4 + " digitos");
                        break;

                    case 5:
                        System.out.println("Escribe el numero");
                        int num4 = scanner.nextInt();
                        int respuesta5 = biblioFunNacho.voltea(num4);
                        System.out.println("El numero volteaado es: " + respuesta5);
                        break;

                    case 6:
                        System.out.println("Escribe el numero");
                        int num51 = scanner.nextInt();
                        System.out.println("Escribe digito que estas buscando");
                        int num52 = scanner.nextInt();
                        respuesta5 = biblioFunNacho.digitoN(num51, num52);
                        System.out.println("El digito que estas buscando esta en la posicion"+respuesta5);
                        break;

                    case 7:
                        System.out.println("Escribe el numero");
                        int num61 = scanner.nextInt();
                        System.out.println("Escribe el numero de digitos que quitas por delante");
                        int num62 = scanner.nextInt();
                        int respuesta6 = biblioFunNacho.quitaPorDetras(num61, num62);
                        System.out.println("El numero quitadon " + num62 + " cifras es: " + respuesta6);
                        break;

                    case 8:
                        System.out.println("Escribe el numero");
                        int num71 = scanner.nextInt();
                        System.out.println("Escribe el numero de digitos que quitas por detras");
                        int num72 = scanner.nextInt();
                        int respuesta7 = biblioFunNacho.quitaPorDetras(num71, num72);
                        System.out.println("El numero quitando " + num72 + " cifras es por detras es: " + respuesta7);
                        break;

                    case 9:
                        System.out.println("Escribe el numero");
                        int num81 = scanner.nextInt();
                        System.out.println("Cuantos numeros quieres pegar por detra");
                        int num82 = scanner.nextInt();
                        int respuesta9 = biblioFunNacho.pegaPorDetras(num81, num82);
                        System.out.println("El numero ahora es " + respuesta9);
                        break;

                    case 10:
                        System.out.println("Escribe el numero");
                        int num91 = scanner.nextInt();
                        System.out.println("Cuantos numeros quieres pegar por delante");
                        int num92 = scanner.nextInt();
                        int respuesta10 = biblioFunNacho.pegaPorDelante(num91, num92);
                        System.out.println("El numero ahora es " + respuesta10);
                        break;
                    default:
                }
            }
        }
    }
