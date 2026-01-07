interface Car       // Abstract class
{

    int num = 4;
    String name = "Car";

    void show();        //No need for public static or public abstract 
    void wheel();
}

class Maruti implements Car
{



    public void show()
    {
        System.out.println("Inside maruti show");
    }

    public void wheel()
    {
        System.out.println("Inside maruti wheel");
    }
 
}

public class intrf {
    public static void main(String args[]) 
    {

        Car obj;
        obj = new Maruti();
        obj.show();
        obj.wheel();

        System.out.println(Car.name);
        System.out.println(Car.num);

    }
}
