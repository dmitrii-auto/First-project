package HomeWork_life_3;

public class MathConstants {

    final static private double PI = 3.14159;
    final static private double E = 2.71828;

    static double getPi(){
        return PI;
    }

    static double getE(){
        return E;
    }


    static double calculateCircleArea(double r){
        return PI * r * r;
    }

    static double calculateCircumference(double r){
        return 2 * PI * r;
    }

    static void printCircleInfo(double r){
        System.out.println("Для круга с радиусом = " + r + ":\n площадь = " + MathConstants.calculateCircleArea(r) + "\n длина окружности = " + MathConstants.calculateCircumference(r));
    }


}
