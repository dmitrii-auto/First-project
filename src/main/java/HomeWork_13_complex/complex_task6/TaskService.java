package HomeWork_13_complex.complex_task6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskService<T> {

    List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask (Task<T> task){
        if (!tasks.stream().anyMatch(t -> t.getId().equals(task.getId()))){
            tasks.add(task);
        } else {
            throw new IllegalArgumentException("Задача с таким id уже существует");
        }
    }

    public synchronized void deleteTask (T id){
        if (tasks.stream().anyMatch(task -> task.getId().equals(id)))
        {
            tasks.removeIf(task -> task.getId().equals(id));
        }else {
            throw new IllegalArgumentException("Задачи с таким id нет в списке");
        }
    }

    public synchronized List<Task<T>> filterTasksByStatus(String status){
        if (tasks.stream().anyMatch(task -> task.getStatus().equals(status))){
               return tasks.stream()
                    .filter(task -> task.getStatus().equals(status))
                    .toList();
        } else {
            throw new IllegalArgumentException("Задач с таким статусом нет в списке");
        }
    }

    public synchronized List<Task<T>> filterTasksByPriority(String priority){
        if (tasks.stream().anyMatch(task -> task.getPriority().equals(priority))){
            return tasks.stream()
                    .filter(task -> task.getPriority().equals(priority))
                    .toList();
        }else {
            throw new IllegalArgumentException("Задач с таким приоритетом нет в списке");
        }
    }

    public synchronized List<Task<T>> sortedTasksByDate(){
            return tasks.stream()
                    .sorted(Comparator.comparing(task -> task.getDate()))
                    .toList();
    }

    public List<Task<T>> getTasks(){
        return List.copyOf(tasks);
    }



}
