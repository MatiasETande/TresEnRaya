import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class TresEnRaya extends JPanel implements ActionListener {

    int[][] tabla = new int[3][3];
    Ventana unaVentana= new Ventana();
    int turno=1;


    public TresEnRaya(){
        this.inicializandoTabla();
        this.unaVentana.lamina.tabla[0][0].addActionListener(this);
        this.unaVentana.lamina.tabla[0][1].addActionListener(this);
        this.unaVentana.lamina.tabla[0][2].addActionListener(this);
    }


    public void inicializandoTabla(){
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                this.tabla[i][j]=1+(i+1)*2+(j+1)*3;
            }

        }
    }

    public void mostrarTabla(){
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+this.tabla[i][j]);;
            }
            System.out.println("\n");
        }
    }

    public boolean comprobarLinea(int x){

        if (this.tabla[x][0] == this.tabla[x][1] && this.tabla[x][0] == this.tabla[x][2] ){
            return true;
        }else {
            return false;
        }
    }

    public boolean comprobarLineas(){

        if (comprobarLinea(0) || comprobarLinea(1) || comprobarLinea(2) ){
            return true;
        }else {
            return false;
        }


    }

    public boolean comprobarColumna(int y){

        if (this.tabla[0][y] == this.tabla[1][y] && this.tabla[0][y] == this.tabla[2][y] ){
            return true;
        }else {
            return false;
        }
    }

    public boolean comprobarColumnas(){

        if (comprobarColumna(0) || comprobarColumna(1) || comprobarColumna(2) ){
            return true;
        }else {
            return false;
        }


    }

    public boolean comprobarDiagonales(){
        if ((this.tabla[0][0] == this.tabla[1][1] && this.tabla[0][0] == this.tabla[2][2])
            || (this.tabla[2][0] == this.tabla[1][1] && this.tabla[2][0] == this.tabla[0][2]) ){
            return true;
        }else {
            return false;
        }

    }

    public boolean comprobarTresEnRaya(){

        if (this.comprobarColumnas() || this.comprobarLineas() || this.comprobarDiagonales()){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Casilla botonPulsado = (Casilla) e.getSource();
        System.out.println("Estamos aqui");

        switch (botonPulsado.numero){

            case 0:
                    {
                        if ((this.turno % 2 ==0) && (this.tabla[0][0]!=2) && (this.tabla[0][0]!=1) ){
                            this.tabla[0][0]=2;
                            System.out.println("soy la casilla numero: "+botonPulsado.numero);
                            this.mostrarTabla();
                            this.unaVentana.lamina.tabla[0][0].marcarCasilla(this.turno);
                            turno+=1;
                            break;
                        }else{
                            if((this.turno % 2 ==0) && (this.tabla[0][0]!=2) && (this.tabla[0][0]!=1)){
                                this.tabla[0][0] = 1;
                                System.out.println("soy la casilla numero: " + botonPulsado.numero);
                                this.mostrarTabla();
                                this.unaVentana.lamina.tabla[0][0].marcarCasilla(this.turno);
                                turno+=1;
                                break;
                            }
                        }
                    }
            case 1:
                    {
                        if (this.turno % 2 ==0){
                            this.tabla[0][1]=2;
                            System.out.println("soy la casilla numero: "+botonPulsado.numero);
                            this.mostrarTabla();
                            this.unaVentana.lamina.tabla[0][1].marcarCasilla(this.turno);
                            turno+=1;
                            break;
                        }else{
                            this.tabla[0][1]=1;
                            System.out.println("soy la casilla numero: "+botonPulsado.numero);
                            this.mostrarTabla();
                            this.unaVentana.lamina.tabla[0][1].marcarCasilla(this.turno);
                            turno+=1;
                            break;
                        }
                    }

            case 2:
                    {
                        if (this.turno % 2 ==0){
                            this.tabla[0][2]=2;
                            System.out.println("soy la casilla numero: "+botonPulsado.numero);
                            this.mostrarTabla();
                            this.unaVentana.lamina.tabla[0][2].marcarCasilla(this.turno);
                            turno+=1;
                            break;
                        }else{
                            this.tabla[0][2]=1;
                            System.out.println("soy la casilla numero: "+botonPulsado.numero);
                            this.mostrarTabla();
                            this.unaVentana.lamina.tabla[0][2].marcarCasilla(this.turno);
                            turno+=1;
                            break;
                        }
                    }
            case 3:
                    {
                        if (this.turno % 2 ==0){
                            this.tabla[1][0]=2;
                            System.out.println("soy la casilla numero: "+botonPulsado.numero);
                            this.mostrarTabla();
                            this.unaVentana.lamina.tabla[1][0].marcarCasilla(this.turno);
                            turno+=1;
                            break;
                        }else{
                            this.tabla[1][0]=1;
                            System.out.println("soy la casilla numero: "+botonPulsado.numero);
                            this.mostrarTabla();
                            this.unaVentana.lamina.tabla[1][0].marcarCasilla(this.turno);
                            turno+=1;
                            break;
                        }
                    }
            case 4:break;

            default:break;

        }

        this.comprobarTresEnRaya();

    }




}
