public class Lesson2 {


    public static void main(String[] args) {
        SumTwoNumbers(10, 7);
        Number(0);
        Number1(-2);
        StrChis("Olga", 7);
        VisYear();

    }

    static void SumTwoNumbers(int a, int b) {

        int c = a + b;

        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void Number(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean Number1(int a) {

        if (a > 0) {

            return false;

        } else {
            return true;
        }
    }

    static void StrChis(String a, int b) {

        for (int i = 1; i <= b; i++) {
            System.out.println(+i + "." + " " + a);
        }
    }

    static boolean VisYear() {

        int a = 400;
        if (a % 4 == 0) {
            if ((a % 100 != 0) || (a % 400 == 0)) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}

