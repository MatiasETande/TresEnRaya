import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Lamina lamina = new Lamina();

    public Ventana(){

        this.setSize(800,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Tres en Raya");
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.getContentPane().setBackground(Color.ORANGE);
        //Image miIcono = miPantalla.getImage("src\\power-button (1).png");
        //this.setIconImage(miIcono);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //"src\\power-button (1).png"


        //Lamina lamina = new Lamina();
        this.add(lamina);

        JPanel marcador = new JPanel();
        marcador.setBounds(0,0,this.getWidth(),100);
        marcador.setLayout(null);
        marcador.setBackground(Color.yellow);


        LetraGrande texto2 = new LetraGrande();
        //texto2.setBounds(marcador.getWidth()/4, marcador.getHeight()/4, 200,50);
        texto2.setSize(200,50);
        texto2.setLocation(this.getWidth()/2-100,25);
        marcador.add(texto2);

        //JLabel texto1 = new JLabel("Marcador");
        //texto1.setSize(70,10);
        //texto1.setForeground(Color.BLACK);
        //texto1.setLocation(marcador.getWidth()/2,marcador.getHeight()/2);
       // marcador.add(texto1);

        this.add(marcador);


        /*JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(null);
        this.add(panel);

        JButton btn = new JButton();
        btn.setBounds(0,0,200,200);
        panel.add(btn);*/


    }


    class LetraGrande extends JPanel{



        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.setLayout(null);
            this.setBackground(Color.ORANGE);
            Graphics2D g2 = (Graphics2D) g;
            Font miFuente = new Font( "Arial", Font.BOLD,26);
            g2.setFont(miFuente);
            g2.setBackground(Color.ORANGE);
            g2.setColor(Color.BLACK);
            g2.drawString("- Marcador -",30,30);


        }
    }



}