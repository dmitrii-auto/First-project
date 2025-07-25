package HomeWork_2;

public class Circle {

    double radius;

    Circle (double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    double calculateArea(){
        return Math.PI * radius * radius;
    }

    double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    void printInfo(){
        System.out.println("Площадь круга = " + calculateArea());
        System.out.println("Длина окружности круга = " + calculateCircumference());
    }

}
