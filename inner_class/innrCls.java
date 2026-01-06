package inner_class;

class A {
    public int age;

    public void show() {
        System.out.println("In show");
    }

    class B {
        public void show1() {
            System.out.println("Inside show 1");
        } 

        static class C{
            public void show2() {
                System.out.println("Inside show 2");
            }
        }
    }
}


public class innrCls {
    public static void main(String args[]) {

        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();
        obj2.show1();

        A.B.C obj3 = new A.B.C();
        obj3.show2();
    }
}
