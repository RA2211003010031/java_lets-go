import java.util.*;

public class l10 {

    public static void main(String[] args) {
    // int[] arr = new int[2];
    // int arr[] = new int[3];

    // int arr1[] = {1,2,3,4,5};

    // int arr2[][] = new int[5][5];

    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();
    int col = sc.nextInt();

    int mat[][] = new int[row][col];

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            mat[i][j] = sc.nextInt();
        }
    }

    int x = sc.nextInt();

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            if(mat[i][j] == x) {
                System.out.println("value found at index : "+ i + " " + j);
            }
        }
    }

    sc.close();

}

}