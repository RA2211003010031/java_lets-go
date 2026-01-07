interface Computer 
{
    void show();
}

class Desktop implements Computer
{
    public void show()
    {
        System.out.println("Code, Do, Repeat : FASTER");
    }
}

class Laptop implements Computer
{
    public void show() 
    {
        System.out.println("Code, Do, Repeat");
    }
}

class Dev 
{
    public void code(Computer com) 
    {
        com.show();
    }
}


public class intrf1 {
    
    public static void main(String args[])
    {

        Laptop l1 = new Laptop();
        Desktop d1 = new Desktop();

        Dev dv1 = new Dev();
        dv1.code(d1);
        dv1.code(l1);
    }

}
