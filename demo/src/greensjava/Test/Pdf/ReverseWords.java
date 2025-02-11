package greensjava.Test.Pdf;

public class ReverseWords {
    public static String reverse( String i){
        String reverse="";
        for (char s : i.toCharArray()){
            reverse= s+reverse;

        }
        return reverse;
        //return new StringBuilder(i).reverse().toString();

    }
    public static void main(String[] args) {
        String s ="Hello how are you";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length ; i++) {

            arr[i]= reverse(arr[i]);

        }
        for (String r : arr){
            System.out.print(r+" ");
        }
    }
}
