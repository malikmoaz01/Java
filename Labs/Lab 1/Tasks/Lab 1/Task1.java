public class Task1 {
    public static void main(String args[]) {
        for (int i = 0; i < 4; i++) {
            int startSpace = 0;
            int endSpace = 13;
            for (int j = 0; j < 14; j++) {
                if (j % 2 != 0) {
                    if (startSpace < i || j >= endSpace) {
                        System.out.print(" ");
                        startSpace++;
                        endSpace -= 2;
                    } else {
                        if (i == 3) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                } else {
                    if (i == 3 && startSpace == i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 2; i >= 0; i--) {
            int startSpace = 0;
            int endSpace = 13;
            for (int j = 0; j < 14; j++) {
                if (j % 2 != 0) {
                    if (startSpace < i || j >= endSpace) {
                        System.out.print(" ");
                        startSpace++;
                        endSpace -= 2;
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
