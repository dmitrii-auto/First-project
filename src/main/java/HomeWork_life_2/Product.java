package HomeWork_life_2;

public class Product {

    String name;
    int price;

    Product (String someName, int somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return this.name;
    }

    int getPrice(){
        return this.price;
    }

    void setPrice(int newPrice){
        this.price = newPrice;
    }

    int applyDiscount(int discount){
        if (discount >= 0 && discount <= 100){
            return price = price - ((price / 100) * discount);
        } else {
            throw new IllegalArgumentException("Недопустимый размер скидки");
        }
    }

    void printInfo(){
        System.out.println("Товар " + name + " стоит " + price + " рублей");
    }



}
