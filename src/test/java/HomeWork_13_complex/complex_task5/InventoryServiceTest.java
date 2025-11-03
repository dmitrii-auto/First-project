package HomeWork_13_complex.complex_task5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {

    @Test
    public void addProductTest(){
        InventoryService service = new InventoryService();
        Product car = new Product("Ауди 100", 500000, "Машины");

        service.addProduct(car);

        assertTrue(service.getInventory().containsKey("Машины"));

        List<Product> cars = service.getInventory().get("Машины");
        assertTrue(cars.contains(car));

        Product storedProduct = cars.get(0);
        assertEquals("Ауди 100", storedProduct.getName());
        assertEquals(500000, storedProduct.getPrice());
    }

    @Test
    public void addProductWhenInventoryClosedTest(){
        InventoryService service = new InventoryService();
        service.setIsInventoryOpen(false);
        Product car = new Product("Ауди 100", 500000, "Машины");
        service.addProduct(car);

        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Машины") );

        service.setIsInventoryOpen(true);
    }

    @Test
    public void getProductByCategoryTest(){
        InventoryService service = new InventoryService();
        Product car = new Product("Ауди 100", 500000, "Машины");

        service.addProduct(car);

        Product product = service.getProductByCategory("Машины");

        assertEquals("Ауди 100", product.getName());
        assertEquals(500000, product.getPrice());
    }

    @Test
    public void filterByPriceTest(){
        InventoryService service = new InventoryService();
        Product car = new Product("Ауди 100", 500000, "Машины");
        Product phone = new Product("Айфон 1", 30000, "Телефоны");

        service.addProduct(car);
        service.addProduct(phone);

        List<Product> filtered = service.filterProductByPrice(400000);

        assertTrue(filtered.contains(car));
        assertFalse(filtered.contains(phone));
    }




}
