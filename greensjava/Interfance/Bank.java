package greensjava.Interfance;
interface BankSalary {
    public void salary();
    public void amount();
    
    
}

class AxisBank implements BankSalary {
    
    public void salary() {
        System.out.println("Axis Bank salary");
    }

   
    public void amount() {
        System.out.println("Axis Bank amount");
    }
}

// SBI class implements Bank
class SBI implements BankSalary {
   
    public void salary() {
        System.out.println("SBI salary");
    }

    
    public void amount() {
        System.out.println("SBI amount");
    }
}
public class Bank {
    public static void main(String[] args) {
        AxisBank axis = new AxisBank();
        SBI sbi = new SBI();
        axis.amount();
        axis.salary();
        sbi.amount();
        sbi.salary();
    }

    
}