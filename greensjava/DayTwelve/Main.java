package greensjava.DayTwelve;

public class Main {
    public Main(){
        System.out.println("1st one");
    }
    public Main(int a){
        System.out.println("2nd one");
    }
    public void Main(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2= new Main(10);
        obj2.Main(10);
        
    }
    
}
