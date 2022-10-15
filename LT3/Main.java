public class Main extends Teacher{
    protected Main() {
        super("A","B","C");
    }
    public static void main(String[] args) {
        Teacher obj = new Teacher("Teacher","CET","Programming");
        College College = new College();
//accessing the fields of parent class
        System.out.println(obj.collegeName); // Retrieve as non private
        System.out.println(obj.getDesignation()); // Retrieve as private using getter
        System.out.println(obj.getSubjectName());

        obj.setDesignation("Lecturer"); // Change value as private
        System.out.println(obj.getDesignation());

        System.out.println(obj.getSubjectName()); // from sub class

        System.out.print("Object does\t: ");
        obj.does(); //Method from Teacher class

        System.out.print("\nCollege\t\t: ");
        College.viewCollegeName(); //Method from College class

// This will show an error due to private method
// obj.does("Private");
    }
}