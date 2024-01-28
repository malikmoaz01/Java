public class Basics_Java {
    public static void main(String arg[]) {
        int a = 43 ;
        int b = 45 ;
        int sum =  a + b;
        System.out.println(sum);

        // Two Type of Casting in Java 
        // 1. Widening Casting
        // In this casting , we do smaller type to larger type for example int to double   
        int c = 8;
        double d = c;
        double e = d + 0.23;
        System.out.println(e);
        // 2. Narrowing Casting
        // In this casting , we do smaller type from larger type for example int to double   
        double f = 2.45 ;
        int g = (int) f;
        System.out.println(g);

        // Strings 

        String h = "ABC ";
        System.out.println("The length of the txt string is: " + h.length());
        System.out.println(h.toLowerCase());

        // We can Find Index In Java Like This 
        String i = "ABC 'hello'  ";
        System.out.println(i.indexOf("hello"));

        // Concatenate String 
        String j = "DEF ";
        System.out.println(j.concat(i));
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);


        // Java Math 
        // 1. max 
        // 2. min 
        // 3. sqrt
        // 4. abs
        // 5. Random


        System.out.println(Math.max(3,4));
        System.out.println(Math.min(3,4));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-45.3));
        System.out.println(Math.random() * 101); //Print Random 0 to 100


        // If Else Condtional Statement

        int time = 22;
        if (time < 10) {System.out.println("Good morning."); } 
        else if (time < 18) { System.out.println("Good day.");} 
        else { System.out.println("Good evening.");}


        // Switch Break 
        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        }


    }
}
