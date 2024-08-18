package youtube;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value for x");
        // int i = sc.nextInt();
        // System.out.println();
        // System.out.println("Enter the value for y");
        // int j = sc.nextInt();
        // System.out.println();
        // int initial =1;

        // int[][] arr= new int[i][j];

        // for (int k = 0; k < i; k++) {
        //     for (int k2 = 0; k2 < j; k2++) {
        //         arr[k][k2]=initial;
        //         initial++;

                
        //     }
            
        // }

        // for (int k = 0; k < i; k++) {
        //     for (int k2 = 0; k2 < j; k2++) {
        //         System.out.print(arr[k][k2]+" ");
                
        //     }
        //     System.out.println();
            
            
        // }

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of rows");
        int i = sc.nextInt();
        System.out.println();
        System.out.println("Enter no of rows");
        int j = sc.nextInt();
        System.out.println();
        int[][] arr =new int[i][j];
        int initial=1;
        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) {
                arr[k][k2]= initial;
                initial++;
                
            }

            
        }
        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) 
            {
                System.out.print(arr[k][k2]+" ");
                
            }
            System.out.println();
            
            
        }


        
        sc.close();

    }
    
}
