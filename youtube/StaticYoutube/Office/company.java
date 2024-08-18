package youtube.StaticYoutube.Office;

public class company {
    public static void main(String[] args) {
        Employee sam = new Employee();
        sam.id=4130;
        sam.name="Sam Joshua";
        sam.salary=70000;
        sam.ceo="Mahesh";
        Employee sanjay = new Employee();
        sanjay.id=4130;
        sanjay.name="Sam Joshua";
        sanjay.salary=70000;
        sanjay.ceo="Mahesh";

        sam.show();
        sanjay.show();
        
        
    }
}
