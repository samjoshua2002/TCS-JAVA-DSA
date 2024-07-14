/**
 * sample
 */
public class sample {

    public static void main(String[] args) {
        int[] sam =new int[5];
        sam[0]=1;
        sam[1]=2;
        sam[2]=3;
        sam[3]=4;
        sam[4]=5;
        int smallest =sam[0];
       
        for (int i = 0; i < sam.length; i++) {
            if (smallest> sam[i]) {
                smallest=sam[i];
                
            }

            
        }
        System.out.println(smallest);
       
    
    }
}