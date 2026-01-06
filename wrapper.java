public class wrapper {
    
    public static void main(String args[]) {

        int n1 = 3;
        Integer n2 = n1;        //autoboxing

        int n3 = n1;        //auto - unboxing

        System.out.println(n2);

        String str = "12";
        // System.out.println(str * 2); wrong

        int s1 = Integer.parseInt(str);     
        System.out.println(s1*2);

    }

}
