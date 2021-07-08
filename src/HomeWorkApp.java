public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
       checkSumSign();
       printColor(27);
       compareNumbers(5,13);
    }

    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    private static void checkSumSign() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }

    }
    private static void printColor(int value){

        if (value <= 0){
            System.out.println("Красный");
        }else if (value >= 1 && value <=100){
            System.out.println("Желтый");
        }else if(value >=101){
            System.out.println("Зеленый");
        }


    }
    private static void compareNumbers(int a, int b){
        if(a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }






    }

