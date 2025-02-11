package greensjava.DayThree.Polymorhism.OverLoading;

public class Student {
    public void std(int id){
        System.out.println(id);
    }
    public void std(int a ,int b){
        int c=a+b;
        System.out.println(c);
    }
    
    public  void std(String name){
        System.out.println(name);
    }
    public  void std(boolean isactive){
        System.out.println(isactive);
    }
    public static void main(String[] args) {
        Student obj = new Student();
        int a=1;
        int b=2;obj.std(a,b);
        obj.std(1);
        obj.std("sam joshua");
        obj.std(true);

    }
}
