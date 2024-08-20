package ShakeenGang;
import java.util.*;
public class InBetweenNumber{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements to be stored in an array");
        int N = sc.nextInt();
        System.out.println("Enter "+N+" elements :");
        int[] A= new int[N];
        for( int i=0 ; i<N; i++){
            A[i]= sc.nextInt();

        }
        System.out.println("Enter the value of X");
        
        int X = sc.nextInt();
        System.out.println("Enter the value of Y");
        int Y = sc.nextInt();
        for(int i=0 ; i<A.length;i++){
            for (int j = X+1; j < Y; j++) {
                if (A[i]==j) {
                    System.out.print(j+" ");
                    
                }
                
            }
        }


        sc.close();
    }
}
