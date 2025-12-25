public class stringbufferAndStringBuilder {
    

    public static void main(String args[]) 
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("adarsh");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());


        sb1.append(" raj");
        System.out.println(sb1);


        //ONLY DIFFERENCE BETWEEN STRING BUFFER AND STRING BUILDER ->
        //stringBuffer is thread safe
        //stringBuilder isn't thread safe



    }


}
