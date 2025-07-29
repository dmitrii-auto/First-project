package practice_6.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager restaurantManager = new RestaurantManager();

        restaurantManager.addNewOrder("Картошка Фри");
        restaurantManager.addNewOrder("Спагетти");
        restaurantManager.addNewOrder("Маргарита");
        restaurantManager.addNewOrder("Бургер");
        restaurantManager.addNewOrder("Цезарь");
        restaurantManager.printOrders();

        restaurantManager.deleteOrder("Бургер");
        restaurantManager.printOrders();
        restaurantManager.deleteOrder("Спагетти");

        restaurantManager.printOrders();
    }
}
