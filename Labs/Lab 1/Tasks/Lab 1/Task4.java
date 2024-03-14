public class Task4 {
    public static void main(String args[]){
        int customers = 12467 ;
        double energy = 0.14 ;
        double citrus = 0.64 ;
        int energydrinks = (int) (customers * energy);
        int citrusdrinks = (int) (customers * citrus);
        System.out.println("The Energy Drink Customers are : " + energydrinks);
        System.out.println("The Citrus Drink Customers are : " + citrusdrinks);

    }
}