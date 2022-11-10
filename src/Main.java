public class Main {

    public static void main(String[] args) {

        TresEnRaya miTabla = new TresEnRaya();




        miTabla.mostrarTabla();

        /*miTabla.tabla[0][0]=1;
        miTabla.tabla[1][1]=1;
        miTabla.tabla[2][2]=1;

        miTabla.tabla[0][2]=1;
        miTabla.tabla[1][1]=1;
        miTabla.tabla[2][0]=99;*/

        miTabla.mostrarTabla();

        System.out.println(miTabla.comprobarLinea(0));
        System.out.println(miTabla.comprobarLineas());

        System.out.println(miTabla.comprobarColumna(2));
        System.out.println(miTabla.comprobarColumnas());

        System.out.println(miTabla.comprobarDiagonales());

        System.out.println(miTabla.comprobarTresEnRaya());

    }

}
