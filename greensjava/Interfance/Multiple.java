package greensjava.Interfance;

interface Dad  {
    public void ShowDadDetails();
  

    
}
interface Mom {
    public void ShowMomDetails();
}
class Family implements Dad,Mom {
    @Override
    public void ShowDadDetails(){
        System.out.println("Father's Name: John");
        System.out.println("Father's Occupation: Engineer");
    }
    @Override
    public void ShowMomDetails(){
        System.out.println("Mother's Name: Jane");
        System.out.println("Mother's Occupation: Doctor");
    }


}
public class Multiple {
    public static void main(String[] args) {
        Family family = new Family();

        
        System.out.println("Father's Details:");
        family.ShowDadDetails();

        System.out.println("\nMother's Details:");
        family.ShowMomDetails();

        
    }

    
}