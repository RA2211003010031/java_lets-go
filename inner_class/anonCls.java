package inner_class;

class A {
    public void show()
    {
        System.out.println("Inside A show");
    }
}

public class anonCls {
    
    public static void main(String args[]) 
    {

        A obj = new A()
        {
            public void show() 
            {
                System.out.println("Inside the new show of ANONYMOUS SHOW");
            }
        };
        obj.show();

        A obj2 = new A();
        obj2.show();

    }

}
