
package Sketch;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    int x, y;
    
    public Ventana(){
    setTitle("Ventana 1");
    this.setSize(180, 250);
    this.setUndecorated(false);
    
    this.setResizable(false);//Evitar que el usuario cambie su tamaño
    this.setLocationRelativeTo(null);
    iniciar();

   }
    
    private void iniciar(){
    JPanel panel = new MotionPanel(this);
    panel.setLayout(null);
    panel.setBackground(new Color(0,0,0,0));
    this.getContentPane().add(panel);
    
    ImageIcon imagen= new ImageIcon(getClass().getResource("shi2.gif"));//Gig.
        JLabel etiquetaimg = new JLabel(imagen);
        etiquetaimg.setBounds(-35, 0, 250, 196);
        panel.add(etiquetaimg);
    }
}