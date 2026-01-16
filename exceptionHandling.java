public class exceptionHandling {
    public static void main(String[] a) {
        int i = 2;
        int j = 0;

        int arr[] = new int[5];



        try
        {
            j = 18/i;       //if exception, will exit from the try, no continue
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e) 
        {
            System.out.println("Don't divide by 0!");
        }
        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Index is out of memory, check SIZE!");
        }
        catch(Exception e) 
        {
            System.out.println("Something is wrong.....");
        }
 
        System.out.println(j);
        System.out.println("Executed");


    }
}
