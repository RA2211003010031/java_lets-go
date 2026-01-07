//enumeration - enum

enum Status 
{
    Success, Failed, Pending, Running;
}

public class enums {
    
    public static void main()
    {

        Status s = Status.Success;
        System.out.println(s);

        //also all of these objects of STATUS are having numbering system also
        System.out.println(Status.Failed.ordinal());        //ordinal is used to get the number order of object.   


        //also we can use loops to check all at once or print all at once
        Status[] ss = Status.values();      //putting all status objects in the array ss
        for(Status st : ss) 
        {
            System.out.println(st + ": " + st.ordinal());       //getting objects one by one with their ordering values
        }





        //now how to use enums with if-else 
        //we have status s = Status.Success already up there

        s = Status.Failed;

        switch(s) 
        {
            case Success:
                System.out.println("Success");
                break;
            
            case Failed:
                System.out.println("Failed");
                break;
                
            case Running:
                System.out.println("Running");
                break;
            
            case Pending:
                System.out.println("Pending");
                break;
            
            default:
                System.out.println("Not Found! Please contact administrator!!");
        }

    }

}
