package modelo;

public class TiposDatosJava
{
    public static void main(String[] args) 
    {
        // Tipo de datos primitivos
        int x = 12;
        short w = 2;
        char c = '@';
        double y = 2.45;
        boolean esta = true;
        System.out.println("Tipos de datos primitivos");
        System.out.println("x = " + x);
                
        //Tipo de datos referneciados
        String s = "UIS SOCORRO";
        int[] a = new int[12];
        Punto p1 = new Punto(2,3);
        System.out.println("Tipos de datos referenciados");
        System.out.println("Punto: " + p1);     
    }
}