//variable, method, class

final class A {
    
}

// class B extends A {}  
// not possible because class A is final or constant class and hence no subclass can be formed.


class calc{
    public final void show() {
        System.out.println("Inside show of calc");
    }

    public void add() {
        System.out.println("return sum");
    }
}

class advCalc extends calc {
    // public void show() {} 
    // not possible because the method in parent class is FINAL or CONSTANT and so can't be overridden.

    
}

 
public class finalKey {
    public static void main(String args[]) {

        //final variable is like const in c++. Constant variable
        final int num = 5;
        // num = 10; can't be done

    }
}
