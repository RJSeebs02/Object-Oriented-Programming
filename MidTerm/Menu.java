public class Menu{
    private String label[] = {"No.", "Name", "Price"};
    private String products[][] = {{"Sparerib", "Backribs", "Boneless Bangus", "Pork Barbecue"},{"Purified Water", "Mountain Dew", "Iced Tea", "Coca Cola"}};
    protected int productNo[][] = {{1, 2, 3, 4},{5, 6, 7, 8}};
    protected double price[][] = {{99.00, 175.00, 125.00, 89.00}, {15.00, 20.00, 25.00, 20.00}};


    public void DisplayMenu(){

        System.out.println("\nMENU:");
        System.out.println("--------------DISHES--------------");
        System.out.println(label[0] + "\t\t" + label[1] + "\t\t\t" + label[2]);
        for (int i = 0; i < 4; i++){
            System.out.println(productNo[0][i] + "\t\t" + products[0][i] +  "\t-\tPhp" + price[0][i]);
        }
        System.out.println("\n-------------BEVERAGES-------------");
        System.out.println(label[0] + "\t\t" + label[1] + "\t\t\t" + label[2]);
        for (int i = 0; i < 4; i++){
            System.out.println(productNo[1][i] + "\t\t" + products[1][i] +  "\t-\tPhp" + price[1][i]);
        }
    }
}