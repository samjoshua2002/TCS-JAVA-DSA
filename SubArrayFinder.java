import java.util.*;
class SubArrayFinder {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of big array: ");
        int bigArr=sc.nextInt();
        System.out.print("Enter the size of small array: ");
        int smallArr=sc.nextInt();
        ArrayList <Integer> lst=new ArrayList<>();
        ArrayList <Integer> display=new ArrayList<>();
        int arr1[]=new int[bigArr];
        // int arr1[]=new int[smallArr];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<smallArr;i++){
            int val=sc.nextInt();
            lst.add(val);
        }
            boolean match=false;
        for(int i=0;i<=bigArr-smallArr;i++){
            int count=0;
              display.clear();
            for(int j=i;j<i+smallArr;j++){
                if(lst.contains(arr1[j])){
                    lst.remove(Integer.valueOf(arr1[j]));
                    count++;
                    display.add(arr1[j]);
                }else{
                    break;
                }
            } 
                if(count ==smallArr){
                System.out.println("from index "+i+" to "+(i+smallArr-1)+" : "+ display);
                match=true;
                }
        }
        if(!match)
            System.out.println("no match found");
            sc.close();
    }
}