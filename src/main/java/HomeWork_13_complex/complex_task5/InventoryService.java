package HomeWork_13_complex.complex_task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {

    private Map<String, List<Product>> inventory = new HashMap<>();
    private boolean isInventoryOpen = true;

    public void setIsInventoryOpen (boolean status){
        this.isInventoryOpen = status;
    }

    public void addProduct(Product product){
        if (!isInventoryOpen) return;

        inventory.computeIfAbsent(product.getCategory(), key -> new ArrayList<>()).add(product);
    }

    public Product getProductByCategory(String category){
        List<Product> products = inventory.get(category);

        if (products == null || products.isEmpty()){
            throw new OutOfStockException("Нет товаров в данной категории");
        }
        return products.remove(0);
    }

    public List<Product> filterProductByPrice(double price) {
        return inventory.values().stream()
                .flatMap(l -> l.stream())
                .filter(p -> p.getPrice() >= price)
                .toList();
    }

    public Map<String, List<Product>> getInventory(){
        return new HashMap<>(inventory);
    }

}
