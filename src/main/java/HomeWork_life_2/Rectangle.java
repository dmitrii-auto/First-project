package HomeWork_life_2;

public class Rectangle {

    double width;
    double height;

    Rectangle (double someWidth, double someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    double getWidth(){
        return this.width;
    }

    double getHeight(){
        return this.height;
    }

    void setWidth(double newWidth ){
        this.width = newWidth;
    }

    double calculateArea(){
        return height * width;
    }




}
