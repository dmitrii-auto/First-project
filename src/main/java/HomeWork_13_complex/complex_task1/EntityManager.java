package HomeWork_13_complex.complex_task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager <T extends Entity> {

    private CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void add(T entity){
        entities.add(entity);
    }

    public boolean remove(T entity){
        return entities.remove(entity); // перепроверить false
    }

    public List<T> gettAll(){
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int min, int max){
       return entities.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .collect(Collectors.toList());
    }

    public List<T> fillerByName(String name){
        return entities.stream().filter(entity -> entity.getName().equals(name) )
                .collect(Collectors.toList());
    }

    public List<T> filterByActive(){
        return entities.stream().filter(Entity::isActive)
                .collect(Collectors.toList());
    }
}
