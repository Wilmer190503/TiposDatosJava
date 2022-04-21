package modelo;

public class Punto 
{
    //---------
    //Atributos
    //---------
    private int x;
    private int y;

    //-------
    //Metodos
    //-------
    public Punto(int x, int d)
    {
        this.x = x;
        this.y = d;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
