/**
 * Nariz
 */
public class Nariz 
{
    private String tamano;
    private String color;

    public Nariz()
    {

    }
    public Nariz(String tamano, String color)
    {
        this.tamano = tamano;
        this.color = color;

    }
    public String getTamano()
    {
        return tamano;
    }
    public String getColor()
    {
        return color;
    }
    public void inhalar(Personas a)
    {
        System.out.println(a.getName() + " estoy inhalando ");
    }
    public void exhalar(Personas a)
    {
        System.out.println(a.getName() + " estoy exhalando ");
    }


    
}