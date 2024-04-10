public class Exception {
    public static void main(String[] args) {
        try {
            // int[] arr = new int[5];
            // arr[6] = 10; // ArrayIndexOutOfBoundsException
            String str = null;
            str.length(); // NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }  finally {
            System.out.println("Finally block executed");
        }
    }
}
