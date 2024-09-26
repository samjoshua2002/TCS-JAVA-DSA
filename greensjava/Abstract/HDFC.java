package greensjava.Abstract;

public class HDFC extends Bank {
    public void Current() {
        System.out.println("40k");
        
    }
    public void Saving(){
        System.out.println("10k");
    }
    public static void main(String[] args) {
        HDFC obj = new HDFC();
        obj.Current();
        obj.Salary();
        obj.Saving();
    }


    
}
