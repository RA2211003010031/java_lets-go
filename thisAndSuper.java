class A 
    {
        public A() 
        {
            System.out.println("In A");
        }

        public A(int n) 
        {   
            System.out.println("In A INT");
        }
    }

class B extends A 
    {
        public B() 
        {
            System.out.println("In B");
        }

        public B(int n) 
        {
            super(n);
            System.out.println("In B INT");
        }
    }


public class thisAndSuper {
    public static void main(String args[])
    {
        B obj = new B(5);
    }
}
