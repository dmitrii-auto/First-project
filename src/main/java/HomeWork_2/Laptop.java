package HomeWork_2;

public class Laptop {

    String brand;
    int price;

    Laptop (String someBrand, int somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    String getBrand(){
        return this.brand;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(int newPrice){
        this.price = newPrice;
    }

    void printInfo(){
        System.out.println("Ноутбук " + brand + " стоит " + price + " рублей");
    }
}
