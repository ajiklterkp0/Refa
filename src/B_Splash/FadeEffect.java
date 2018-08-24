package B_Splash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jona
 */
public class FadeEffect {

    public static void fadeIn(final JDialog dialog, int delay, final float incrementSize) {//se declara el primer metodo que sera el efecto-entrada en la que se declaran las variables que se utilizaran dentro de este mismo
        final Timer timer = new Timer(delay, null);//Se hace uso de timer en la que se ocupà la variablñe delay para EL TIEMPO 
        timer.setRepeats(true);// implementa el oyente del actionp para especificar que se cumple el tiempo de temporizador
        timer.addActionListener(new ActionListener() //se crea un metodo para identificar los metyodos que seran escuchados, se declara una nueva accion para escuchar al metodo
        {
            private float opacity = 0;//INDICA la opacidad del efecto

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                opacity += incrementSize;//cuando se capte el metodo se ira incrementando el tamaño para crear el efecto de que va apareciendo
                dialog.setOpacity(Math.min(opacity, 1)); // requires java 1.7, se utiliza el metodo math con los atributos de opacidad y el valor de uno por el que sera multiplicado
                if (opacity >= 1)//se comprara si la opcaidad es diferente o igual a uno se para el temporizador , para cerrar el efecto
                {
                    timer.stop();
                }
            }
        });

        dialog.setOpacity(0); // requires java 1.7 o posterior
        timer.start();
    }

    public static void fadeOut(final JDialog dialog, int delay, final float incrementSize) 
    {
        final Timer timer = new Timer(delay, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            private float opacity = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                opacity -= incrementSize;               
                dialog.setOpacity(Math.max(opacity, 0)); // requires java 1.7
                if (opacity <= 0) {                   
                    timer.stop();
                    dialog.dispose();
                }
            }
        });

        dialog.setOpacity(1); // requires java 1.7
        timer.start();
    }
    
    public static void fadeInFrame(final JFrame frame, int delay, final float incrementSize) {//este efecto es el especifico para el JFRAME
        final Timer timer = new Timer(delay, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            private float opacity = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                opacity += incrementSize;
                frame.setOpacity(Math.min(opacity, 1)); // requires java 1.7
                if (opacity >= 1) {
                    timer.stop();
                }
            }
        });

        frame.setOpacity(0); // requires java 1.7
        timer.start();
//        dialog.setVisible(true);
    }
    
    public static void fadeOutFrameSplash(final JFrame frame, int delay, final float incrementSize) {
        final Timer timer = new Timer(delay, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            private float opacity = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                opacity -= incrementSize;               
                frame.setOpacity(Math.max(opacity, 0)); // requires java 1.7
                if (opacity <= 0) {                   
                    timer.stop();
                    frame.dispose();
                    new Template.Login().setVisible(true);
                }
            }
        });

        frame.setOpacity(1); // requires java 1.7
        timer.start();
    }
}
