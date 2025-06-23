package practice_4.solvers;

public class ForTaskSolver {


    public static void main(String[] args) {

        // проверка таблицы умножения для числа
        // myltiplyTable(5);

        // проверка суммы всех чисел до числа
        // System.out.println(sumOfAllNumbers(10));

        // проверка простое число или нет
//        System.out.println(checkNumberIsSimple(13));
//        System.out.println(checkNumberIsSimple(12));

        // проверка метода по распечатке всех простых чисел от 1 до 100
        printAllSimpleNumbersBefore100();

    }



    public static void myltiplyTable (int number){

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumbers(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    // Простые числа

    public static boolean checkNumberIsSimple(int number){
        // просто число - число которое делится без остатка только на 1 и на само себя

        boolean isSimple = true;

        for (int i = 2; i < number; i++ ){
            if (number % i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100(){
        for (int i = 2; i <= 100; i++){
            if (checkNumberIsSimple(i)){
                System.out.println(i);
            }
        }
    }

}
