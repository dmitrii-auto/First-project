package HomeWork_2;

public class Product {

    String name;
    double price;

    Product (String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice ){
        this.price = newPrice;
    }

    double applyDiscount(int discount){
        if (discount >= 0 && discount <= 100){
            price = price - ( (price / 100 ) * discount);
            return price;
        } else {
            throw new  IllegalArgumentException("Введён некорректный процент скидки");
        }
    }

    void printInfo(){
        System.out.println("Продукт " + name + " стоит " + price + " рублей");
    }
}
