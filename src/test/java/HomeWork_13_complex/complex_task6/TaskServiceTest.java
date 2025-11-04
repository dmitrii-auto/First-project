package HomeWork_13_complex.complex_task6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    public void addUniqueTaskTest(){
        TaskService<Integer> taskService = new TaskService<>();

        Task<Integer> task1 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,11,11));
        taskService.addTask(task1);

        assertTrue(taskService.getTasks().contains(task1));
    }

    @Test
    public void addNotUniqueTaskTest(){
        TaskService<Integer> taskService = new TaskService<>();

        Task<Integer> task1 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,11,11));
        Task<Integer> task2 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,11,11));
        taskService.addTask(task1);

        assertThrows(IllegalArgumentException.class, () -> taskService.addTask(task2));
    }

    @Test
    public void deleteTaskTest(){
        TaskService<Integer> taskService = new TaskService<>();

        Task<Integer> task1 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,11,11));
        taskService.addTask(task1);
        taskService.deleteTask(1);
        assertFalse(taskService.getTasks().contains(task1));
    }

    @Test
    public void deleteInvalidTaskTest(){
        TaskService<Integer> taskService = new TaskService<>();

        Task<Integer> task1 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,11,11));
        taskService.addTask(task1);
        assertThrows(IllegalArgumentException.class, ()-> taskService.deleteTask(3));
    }

    @Test
    public void filterTaskByStatusTest(){
        TaskService<Integer> taskService = new TaskService<>();

        Task<Integer> task1 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,11,11));
        Task<Integer> task2 = new Task<>(2,"В процессе", "Высокий", LocalDate.of(2025,12,11));
        Task<Integer> task3 = new Task<>(3,"Новая задача", "Низкий", LocalDate.of(2025,10,11));
        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        List<Task<Integer>> result = taskService.filterTasksByStatus("Новая задача");

        assertTrue(result.contains(task1));
        assertTrue(result.contains(task3));

        assertFalse(result.contains(task2));
    }

    @Test
    public void filterTaskByInvalidStatusTest(){
        TaskService<Integer> taskService = new TaskService<>();

        Task<Integer> task1 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,11,11));
        Task<Integer> task2 = new Task<>(2,"В процессе", "Высокий", LocalDate.of(2025,12,11));
        Task<Integer> task3 = new Task<>(3,"Новая задача", "Низкий", LocalDate.of(2025,10,11));
        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        assertThrows(IllegalArgumentException.class, () -> taskService.filterTasksByStatus("123"));
    }

    @Test
    public void sortedTaskByDateTest(){
        TaskService<Integer> taskService = new TaskService<>();

        Task<Integer> task1 = new Task<>(1,"Новая задача", "Высокий", LocalDate.of(2025,10,11));
        Task<Integer> task2 = new Task<>(2,"В процессе", "Высокий", LocalDate.of(2025,12,11));
        Task<Integer> task3 = new Task<>(3,"Новая задача", "Низкий", LocalDate.of(2025,11,11));
        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        List<Task<Integer>> result = taskService.sortedTasksByDate();

        assertTrue(result.get(0).equals(task1));
        assertTrue(result.get(1).equals(task3));
        assertTrue(result.get(2).equals(task2));
    }




}
