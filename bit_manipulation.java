public class bit_manipulation {
    //get bit
    //set bit
    //clear bit
    //update bit
    
    
    //this whole process of get bit, set bit, clear bit, update bit is called bit mask in java
    //a additional number bit mask is used in all these operations to find the answer or get the output as required







    public static void main(String args[]) {

        //GET BIT
        //we check from right -> left. 
        //BIT MASK = 1 << i (given position)

        //and then AND bitwise operation with the original number


        int num = 5;
        int pos = 2;

        int mask = 1 << pos;

        if((mask & num) == 0) {
            System.out.println("Bit was 0!");
        }
        else {
            System.out.println("Bit was 1!");
        }



        




        //SET BIT
        //Bit mask = 1 << i (Position)
        //OR Operation = mask | num
        setBit();







        //CLEAR BIT
        //BIT MASK = 1 << position
        //MASK = NOT MASK = ~mask
        //NEW NUMBER = num & mask
        clearBit();






        //UPDATE BIT
        //
        updateBit();


    }






    public static void setBit() {
        int num = 5;
        int pos = 1;

        int mask = 1 << pos;

        int newNumber = num | mask;

        System.out.println("New number : " + newNumber);
    }


    public static void clearBit() {
        int num = 5;
        int pos = 2;

        int mask = 1 << pos;
        mask = ~mask;

        int newNumber = num & mask;

        System.out.println("New number after Clear Bit : " + newNumber);
    }



    public static void updateBit() {
        int num = 5;
        int pos = 1;
        
        int newNumber;

        int updateTo = 1;
        if(updateTo == 1) {
            int mask = 1 << pos;
            newNumber = num | mask;    
        }
        else {
            int mask = 0 << pos;
            newNumber = num & mask;
        }

        System.out.println("New number after Update : " + newNumber);
    }

}
