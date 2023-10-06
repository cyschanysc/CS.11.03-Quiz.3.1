public class Main {
    public static void main(String[] args) {
        System.out.println(calculateGrade(90));
        System.out.println(calculateGrade(79));

        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(16));

        System.out.println(frontBack("hello"));
        System.out.println(frontBack("hi"));
        System.out.println(frontBack("g"));

        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(4, 11, -7));
        System.out.println(twoAsOne(4, 6, 12));

        System.out.println(endUp("hello"));
        System.out.println(endUp("for sure"));
        System.out.println(endUp("gg"));
    }

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }

    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String front = str.substring(0, 2);
            return front + str + front;
        }
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String front = str.substring(0, str.length() - 3);
            String end = str.substring(str.length() - 3);
            return front + end.toUpperCase();
        }
    }
}

