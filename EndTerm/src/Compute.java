import javax.swing.*;

class Compute extends Methods{
    public static int computeItemPrice(String value1, String value2, String value3){

        String[] box1 ={"Necklace", "Ring", "Earrings", "Bracelet"};
        String[] box2 ={"Gold", "Silver"};
        String[] box3 ={"Diamond", "Ruby", "Emerald"};

        int[] box1price ={1000, 700, 200, 300};
        int[] box2price ={3200, 1300};
        int[] box3price ={7700, 4600, 3250};

        int labor = 200;
        int price1, price2, price3;

        String jewelryType = value1;
        String mainMaterial = value2;
        String gemStone = value3;

        //Jewelry Type
        if (jewelryType==box1[0]){
            price1 = box1price[0];
        }
        else if (jewelryType==box1[1]){
            price1 = box1price[1];
        }
        else if (jewelryType==box1[2]){
            price1 = box1price[2];
        }
        else{
            price1 = box1price[3];
        }

        //Main Material
        if (mainMaterial==box2[0]){
            price2 = box2price[0];
        }
        else{
            price2 = box2price[1];
        }

        //Gemstone
        if (gemStone==box3[0]){
            price3 = box3price[0];
        }
        else if (gemStone==box3[1]){
            price3 = box3price[1];
        }
        else{
            price3 = box3price[2];
        }

        int profit = (price1 + price2 + price3)/3 ;
        int itemprice = (profit*4) + labor ;
        return itemprice;
    }
    public static void displayResult(String itemprice){
        int fitemprice = Integer.parseInt(itemprice);
        int rprice = fitemprice + ((fitemprice/100)*6);
        int wprice = rprice*2;

        ImageIcon Gems = new ImageIcon("src/logo.png");
        JOptionPane.showMessageDialog( null, "Prices of your selected customized Jewelry:\nWHOLESALE PRICE: Php " + wprice + "\nRETAIL PRICE: Php " + rprice, "Calculated Results" , JOptionPane.INFORMATION_MESSAGE, Gems);
    }
}