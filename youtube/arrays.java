package youtube;

public class arrays {
    public static void main(String[] args) {
        // String[] fruits={"apple","mango","kiwi"};
        // System.out.println(fruits[0]);
        // 1d array
        // String[] sam = new String[2];
        // sam[0]="joshua";
        // sam[1]="baranbas";
        // for (int i = 0; i < sam.length; i++) {
        //     System.out.println(sam[i]);
        // }


        //2d arrays

        String[][] sam = new String[2][2];
        sam[0][0]="one";
        sam[0][1]="two";
        sam[1][0]="three";
        sam[1][1]="four";
        
        for (int i = 0; i < sam.length; i++) {
            
            for (int j = 0; j < sam[i].length; j++) {
                System.out.println(sam[i][j]+ " ");
                
            }
            
        }


    }
}
