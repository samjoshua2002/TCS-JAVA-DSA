import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int i = sc.nextInt();
        System.out.println("Enter number of columns:");
        int j = sc.nextInt();

        int[][] arr = new int[i][j];
        int[][] arr2 = new int[i][j];
        int initial = 1;

        
        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) {
                arr[k][k2] = initial;
                initial++;
            }
        }

       
        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) {
                arr2[k][k2] = initial;
                initial++;
            }
        }

       
        System.out.println("First Matrix:");
        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) {
                System.out.print(arr[k][k2] + "  ");
            }
            System.out.println();
        }

        
        System.out.println("Second Matrix:");
        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) {
                System.out.print(arr2[k][k2] + "  ");
            }
            System.out.println();
        }

       
        int[][] ans = new int[i][j];
        System.out.println("Sum of Matrices:");
        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) {
                ans[k][k2] = arr[k][k2] + arr2[k][k2];
                System.out.print(ans[k][k2] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
