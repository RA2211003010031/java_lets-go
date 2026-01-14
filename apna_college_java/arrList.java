import java.util.*;

public class arrList {
    
    public static void main(String[] args) 
    {

        ArrayList<Integer> list = new ArrayList<>();
        
        //or can be defined like 
        //ArrayList<Integer> list = new ArrayList<Integer>();

        //add element
        list.add(0);
        list.add(1);

        System.out.println(list);

        //get element
        int element = list.get(0);
        System.out.println(element);

        //add elem in btween
        list.add(1,2);
        System.out.println(list);

        //set element
        list.set(0, 1);
        System.out.println(list);


        //delete element
        list.remove(2);
        System.out.println(list);

        //size check
        int n = list.size();
        System.out.println(n);

        //loop
        for(int i : list) {
            System.out.println(i);
        }


        //sorting
        list.add(2, 0); 
        Collections.sort(list);
        System.out.println(list);

    }

}
