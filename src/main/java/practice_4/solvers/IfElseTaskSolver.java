package practice_4.solvers;

public class IfElseTaskSolver {

    public static void main(String[] args) {
        // проверка метода чётности
         System.out.println(checkParity(4));
         System.out.println(checkParity(7));

        // проверка метода определения возраста
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(71));

        // проверка метода нахождения максимльного числа
        System.out.println(checkMax(3,7,5));
    }


    /**
     * Метод для проверки чётности числа
     * @param number
     * @return
     */
    public static String checkParity(int number){
        // if - else
        // number % 2 == 0 -> чётное
        // number % 2 == 1 -> не чётное

        // в методе должен быть 1 return

        String parity = "Нечётное";

        if (number % 2 == 0){
            parity = "Чётное";
        }
        return parity;
    }

    public static String checkAge (int age){

        String ageDescription = "";

        if (age < 18){
            ageDescription = "Несовершеннолетний";
        }
        else if (age >= 18 && age< 60){
            ageDescription = "Взрослый";
        }
        else {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }

    public static int checkMax (int a, int b, int c){
        int maxAB = a;
        if (b > a){
            maxAB = b;
        }
        int max = maxAB;
        if (c > b){
            max = c;
        }
        return max;
    }








}


