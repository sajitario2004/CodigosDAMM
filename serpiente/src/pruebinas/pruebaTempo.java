package pruebinas;
import java.awt.event.*;
import javax.swing.*;

public class pruebaTempo {


        public static void main(String [] args) throws Exception{
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    //...Perform a task...

                    System.out.println("Reading SMTP Info.");
                }
            };
            System.out.println(1);
            Timer timer = new Timer(1000 ,taskPerformer);
            timer.setRepeats(true);
            timer.start();

        }


}
