package greensjava.DayOne;

public class Son extends Father {
    public void education() {
        System.out.println("CSE");
    }

    public static void main(String[] args) {
        Son obj = new Son();
        obj.education();
        Father.Business();
        obj.money();
    
    
    }
    
}
