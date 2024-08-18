package youtube.StaticYoutube.Office;

public class Employee {
    int id;
    String name;
    int salary;

    
    static String ceo;

    public Employee() {
        id = 0;
        name = "none";
        salary = 0;
    }
    static{
        ceo="none";
    }
    
    public void show(){
        System.out.println(id+" : "+name+" : "+salary+" : "+ceo);
    }

    
}
