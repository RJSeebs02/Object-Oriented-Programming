//OOP CLE1:MIDTERM EXAM

//BSIT 2-A
//Faeldonea, Elijah Zachary
//Seva, Romeo III

public class Main extends Order{
    public static void main(String []args){
        Menu m = new Menu();
        Order o = new Order();
        Restaurant r = new Restaurant("Default Name", "Insert Motto");

        r.setRName("RIBSHACK");
        r.setRMotto("Grilled Spareribs, Backribs, and Pork BBQ");
        System.out.println("Welcome to " + r.getRName() + ": " + r.getRMotto() + "!");
        m.DisplayMenu();
        o.DisplayOrder();
        o.DisplayDecision();
        o.DisplayPayment();
    }
}
