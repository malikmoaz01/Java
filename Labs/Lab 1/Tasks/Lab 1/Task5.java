public class Task5 {
    public static void main(String[] args) {
        int number = 153; 
        if(isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number; 
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length(); // 153
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
