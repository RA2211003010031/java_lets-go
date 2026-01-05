
class A {
    public void show ()
    {
        System.out.println("In A show!");
    }
}

class B extends A{
    public void show() {
        System.out.println("In B show!");
    }
}

class D {

}


public class dynamicMethodDispatch {
    public static void main(String args[]) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        // obj = new D();   won't work because no inheritance, only child class can call to create its obj.
        
 
    }
}
