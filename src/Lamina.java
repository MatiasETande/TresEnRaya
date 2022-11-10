import javax.swing.*;
import java.awt.*;

public class Lamina extends JPanel {

    Casilla[][] tabla= new Casilla[3][3];


    public Lamina(){

        this.setLayout(null);
        this.setBounds(100,100,600,600);
        this.setBackground(Color.RED);


        /*Casilla casilla1 = new Casilla(1,0,0);
        this.add(casilla1);

        Casilla casilla2 = new Casilla(2,200,0);
        this.add(casilla2);

        Casilla casilla3 = new Casilla(3,400,0);
        this.add(casilla3);*/
        int contador=0;
        /*
        int x=200;
        int y=0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                this.tabla[i][j] = new Casilla(contador,0,0);
            }
            y+=200;

        }*/

        int x=0;
        int y=0;
        int tamano = 200;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Cargando la casilla numero: "+contador);
                //this.add( tabla[i][j].setBounds( x, y,50*(i+1),50*(j+1) ) );
                this.tabla[i][j] = new Casilla(contador,x,y);
                //tabla[i][j] = new JButton("btn["+i+","+j+"]");
                //tabla[i][j].setBounds( x, y,tamano,tamano );
                this.add(tabla[i][j]);
                System.out.println("Contenido numero: "+this.tabla[i][j].numero);
                x+=tamano;
                contador+=1;
            }
            y+=tamano;
            x=0;

        }

        //tabla[0][0].setBackground(Color.ORANGE);
        //tabla[0][0].setLayout(null);
        //JLabel etiqueta = new JLabel("Soy un btn");
        //etiqueta.setLocation(150,150);
        //tabla[0][0].add(etiqueta);
        //tabla[0][0].setText("x");
        //tabla[0][0].setLayout(null);
        //ImageIcon botonInicio = new ImageIcon("src\\power-button (1).png");
        //Icon icon = new ImageIcon(botonInicio.getImage().getScaledInstance(tabla[0][0].getWidth()-20,tabla[0][0].getHeight()-20,Image.SCALE_DEFAULT));
        //tabla[0][0].setIcon(icon);
        //tabla[0][0].setText("O");
        //System.out.println("Numero: "+tabla[0][0].numero);








    }


}
