
package Sketch;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Main extends JFrame {
    JButton boton1, boton2;
     JFrame frame = new JFrame();
     
    public Ventana_Main(){
    setTitle("Wander Sprite");
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);
    iniciar();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
    
    private void iniciar(){
    JPanel panel = new JPanel();
    panel.setBackground(Color.GREEN);
    panel.setLayout(null);
    this.getContentPane().add(panel);
    
    boton1 = new JButton("Launch");
    boton1.setBounds(5, 5, 80, 40);
    panel.add(boton1);
    
    boton2 = new JButton("Cerrar");
    boton2.setBounds(90, 5, 80, 40);
    panel.add(boton2);
    
    Ventana v2 = new Ventana();
    
    boton1.addActionListener(new ActionListener(){//Implementación para la función de abrir la otra ventana.
        public void actionPerformed(ActionEvent e){
            
            v2.setVisible(true);
        }
    });
    
    boton2.addActionListener(new ActionListener(){//Implementación para la función de cerrar la otra ventana.
        public void actionPerformed(ActionEvent e){
            
            v2.dispose();
        }
    });
    
    ImageIcon imagen= new ImageIcon(Ventana_Main.class.getResource("shi.gif"));//Gig.
        JLabel etiquetaimg = new JLabel(imagen);
        etiquetaimg.setBounds(0, 70, 500, 391);
        panel.add(etiquetaimg);
    }
}
