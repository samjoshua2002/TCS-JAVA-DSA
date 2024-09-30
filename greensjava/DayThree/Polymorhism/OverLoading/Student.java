package greensjava.DayThree.Polymorhism.OverLoading;

public class Student {
    public void std(int id){
        System.out.println(id);
    }
    public  void std(String name){
        System.out.println(name);
    }
    public  void std(boolean isactive){
        System.out.println(isactive);
    }
    public static void main(String[] args) {
        Student obj = new Student();
        obj.std(1);
        obj.std("sam joshua");
        obj.std(true);

    }
}
