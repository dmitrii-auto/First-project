package HomeWork_life_2;

public class Laptop {
    String name;
    int price;

    Laptop (String someName, int somePrice){
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

    void setName(String newName){
        this.name = newName;
    }

    void printInfo(){
        System.out.println("Ноутбук бренда " + name + " стоит " + price + " рублей");
    }


}
