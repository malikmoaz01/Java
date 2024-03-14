public class Task2 {
    public static void main(String args[]){
        System.out.println("Today is 14 August Pakistan`s Anniversary");
        printCake();
    }

    public static void printCake(){
        // For Top Layer of Cake 
        printLayer(10, '*');
        System.out.println();

        // For Middle layer of Cake 
        for (int i = 0; i < 3; i++) {
            printLayer(10, '&');
            System.out.println();
        }

        // for Bottom Layer 
        printLayer(10, '%');
    }

    public static void printLayer(int width , char character){
        for(int i=0; i < width ; i++){
            System.out.print(character);
        }
    }

}
