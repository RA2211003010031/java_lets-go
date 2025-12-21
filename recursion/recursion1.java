public class recursion1 {

    public static void printNum(int n) {
        if(n == 0) return;
        System.out.println(n);
        printNum(n-1);
    }

    public static void printNum2(int num) {
        if(num == 6) return;
        System.out.println(num);
        printNum2(num+1);
    }

    public static void printSum(int i, int n, int sum) {
        if(i == n) {
            sum += i;
            System.out.println("Sum = " + sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static int printFact(int num, int fact) {
        // if(num == 1) {
        //     System.out.println("Factorial = " + fact);
        //     return;
        // }
        // fact *= num;
        // printFact(num-1, fact);


        if(num == 1 || num == 0) {
            return 1;
        }
        int fact_nm1 = printFact(num-1, fact);
        int fact_n = num * fact_nm1;
        return fact_n;
    }

    public static void printFib(int a, int b, int n) {
        if(n == 0) return;
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static void main(String args[]) {
        // int n = 5;
        // printNum(n);


        // int n = 1;
        // printNum2(n);


        // int n = 10;
        // printSum(0, n, 0);



        // int n = 5;
        // int ans = printFact(n, 1);
        // System.out.println("Factorial of "+n+" is : "+ans);




        // int n = 5;
        // System.out.println(0);
        // System.out.println(1);
        // printFib(0,1,n-2);




        
    }
}
