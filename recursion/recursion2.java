public class recursion2 {

    public static void towerOfHanoi(int n, String Source, String helper, String Destination) {

        if(n == 1) {
            System.out.println("Transferred disk 1 from " + Source + " to " + Destination);
            return;
        }
        towerOfHanoi(n-1, Source, Destination, helper);
        System.out.println("Tranferred disk "+ n + " from "+ Source + " to " + Destination);
        towerOfHanoi(n-1, helper, Source, Destination);
    }

    public static void reversePrint(String s, int n) {
        if (n == 0) {
            System.out.println(s.charAt(n));
            return;
        }
        System.out.println(s.charAt(n));
        reversePrint(s, n-1);
    }

    public static void firstAndLastOccurence(String s, char target, int firstOccurence, int lastOccurence, int index) {

        if(index == s.length()) {
            System.out.println("First occurence of " + target + " is at : " + firstOccurence + " and last occurence is at : " + lastOccurence);
            return;
        }
        
        if(s.charAt(index) == target) {
            if(firstOccurence != -1) {
                lastOccurence = index;
            }
            else {
                firstOccurence = index;
                lastOccurence = index;
            }
        }

        firstAndLastOccurence(s, target, firstOccurence, lastOccurence, index+1);
    }

    public static boolean checkSorted(int arr[], int currIndex, int prevIndex) {

        if(currIndex == arr.length) {
            return true;
        }

        if(arr[currIndex] > arr[prevIndex]) {
            return checkSorted(arr, currIndex+1, prevIndex+1);
        }
        return false;
    }

    public static String putAtEnd(String s, String ans, int index, int count) {

        if(index == s.length()) {
            while(count != 0) {
                ans += 'x';
                count--;
            }
            return ans;
        }

        if(s.charAt(index) == 'x') {
            count++;
        }
        else {
            ans += s.charAt(index);
        }

        return putAtEnd(s, ans, index+1, count);
    }

    public static boolean map[] = new boolean[26];
    public static void removeDuplicates(String s, int index, String ans) {

        if(index == s.length()) {
            System.out.println(ans);
            return;
        } 

        char currChar = s.charAt(index);
        if(map[currChar - 'a']) {
            removeDuplicates(s, index+1, ans);
        }
        else {
            ans += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(s, index+1, ans);
        }
    }

    public static void main(String args[]) {
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");





        // String s = "Hello";
        // reversePrint(s, s.length()-1);





        // String s = "abaacdaefaah";
        // int firstOccurence = -1;
        // int lastOccurence = -1;
        // firstAndLastOccurence(s, 'a', firstOccurence, lastOccurence, 0);







        // int arr[] = {1,3,2,3,4,5};
        // boolean isSorted = checkSorted(arr, 1, 0);
        // if(isSorted == true) {
        //     System.out.println("Array is strictly SORTED in increasing order!");
        // }
        // else {
        //     System.out.println("Array is NOT SORTED strictly in increasing order!");
        // }









        // String s = "axbcxxd";
        // String ans = "";
        // String result = putAtEnd(s, ans, 0, 0);
        // System.out.println("New string after putting 'x' at the end is : "+ result);










        // String str = "abbccda";
        // removeDuplicates(str, 0, "");







        
    }
}
