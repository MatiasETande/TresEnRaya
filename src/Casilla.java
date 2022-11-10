import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Casilla extends JButton implements ActionListener{

    int numero;

    public Casilla(int numero, int x, int y){
        this.numero=numero;
        //this.columna=y;
        this.setBounds(x,y,200,200);


        this.addActionListener(this);

    }

    public void marcarCasilla(int turno){
        if(turno % 2==0){
            this.setText("O");
        }else{
            this.setText("X");
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
