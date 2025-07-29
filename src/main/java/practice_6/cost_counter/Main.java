package practice_6.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCost(1, 123.12);
        costCounter.addCost(2, 1233.2);
        costCounter.addCost(3, 3737.1);
        costCounter.addCost(4, 344.2);
        costCounter.addCost(5, 1233.2);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());

    }




}
