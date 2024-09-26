package greensjava.Abstract;
abstract class Bank {
    public void Salary() {
        System.out.println("50k");
        
    }
    abstract void Saving();
    abstract void Current();
    
    
}
class HDFC extends Bank {
    public void Current() {
        System.out.println("40k");
        
    }
    public void Saving(){
        System.out.println("10k");
    }
}

public class Main {
    public static void main(String[] args) {
        HDFC obj = new HDFC();
        obj.Current();
        obj.Salary();
        obj.Saving();
    }
}

    

