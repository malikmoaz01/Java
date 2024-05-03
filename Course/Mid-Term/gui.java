import javax.swing.*;
import java.util.*;

class StringCustomException extends Exception {
    public StringCustomException(String message) {
        super(message);
    }
}

public class gui {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num = in.nextInt();
        System.out.println("Enter Number 2: ");
        int num1 = in.nextInt();
        try {
            int add1 = add(num, num1);
            System.out.println("Sum: " + add1);
        } catch (StringCustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int add(int a, int b) throws StringCustomException {
        if (a == 'a' || b == 'a' || a == 'b' || b == 'b' || a == 'c' || b == 'c') {
            throw new StringCustomException("Please Enter Only Integers");
        }
        return a + b;
    }

}
