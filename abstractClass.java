abstract class Parent{

    public abstract void drive();

    public void show() {
        System.out.println("Inside abstract class!");
    }

}

class Child extends Parent{

    public void drive() {
        System.out.println("In driving...!");
    }

    public void show() {
        System.out.println("Inside child class!");
    }

}


public class abstractClass {
    public static void main(String args[]) {

        Parent c1 = new Child();
        c1.drive();
        c1.show();
        
    }   
}