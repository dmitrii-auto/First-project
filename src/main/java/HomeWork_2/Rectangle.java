package HomeWork_2;

public class Rectangle {

    // предположил что размеры сторон прямоугольника могут быть не только целыми числами поэтому использую double
    double width;
    double height;

    Rectangle (double someWidth, double someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight(){
        return this.height;
    }

    void setWidth (double newWidth){
        this.width = newWidth;
    }

    public double calculateArea (){
        return width * height;
    }


}
