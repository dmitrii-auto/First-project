package practice_6.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // ArrayList - динамический массив
    // массив, индекс = номер месяца
    private ArrayList<Double> costPerMonth;

    public CostCounter(){
        this.costPerMonth = new ArrayList<>();
    }

    // метод добавления значения по номеру месяца (от 1 до 12) и расходам в этот месяц
    public void addCost (int month, Double costs){
        costPerMonth.add(month - 1, costs );
    }

    // метод получения значения расхода по месяцам
    public Double getCosts (int month){
       return costPerMonth.get(month-1);
    }

    // считать месяц с минимальным расходом
    public Double minCostsPerMonth(){
        AtomicReference<Double> min = new AtomicReference<>(costPerMonth.getFirst());
        costPerMonth.forEach(
                costPerMonth ->{
                    if (costPerMonth < min.get()){
                            min.set(costPerMonth);
                    }
                }
        );
        return min.get();
    }
}
