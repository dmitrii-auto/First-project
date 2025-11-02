package HomeWork_13_complex.complex_task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class EntityManagerTest {



    @Test
    public void addEntityTest() {

        /**
         * Добавление элементов:
         *      добавить 1 элеммент в пустой менеджер
         *      добавить 1 элемент в НЕпустой менеджер
         *      добавить 1 элемент несколькими потоками (проверка интеграции)
         *
         */
        EntityManager<Student> manager = new EntityManager<>();

        int initialSize = manager.gettAll().size();

        Student expectedStudent = new Student ("Коля", 17, true);
        Student expectedStudentNewObject = new Student ("Коля", 17, true);

        manager.add(expectedStudent);

        // добавить элемент
        // ожидание 1: он содержится в финальном списке
        // ожидание 2: то, что было добавлено, равно тому что мы передали
        // ожидание 3: добавлен 1 элемент

        // ожидание 1
        assertTrue(manager.gettAll().contains(expectedStudent));

        // ожидание 2
        Student actualStudent = manager.gettAll().getFirst();

        // сравнение как обьект
        //assertEquals(expectedStudentNewObject, actualStudent); // expectedStudentNewObject.equals(actualStudent) - проверяем переопределили ли разработчик метод equals

        // сравнить по полям
        assertEquals(expectedStudentNewObject.getAge(),actualStudent.getAge()); // ==
        assertEquals(expectedStudentNewObject.getName(),actualStudent.getName()); // String equals
        assertEquals(expectedStudentNewObject.isActive(),actualStudent.isActive()); // ==

        // ожидание 3:
        assertEquals(initialSize+1, manager.gettAll().size());
    }

    @Test
    public void removeEntityTest(){
        EntityManager<Student> manager = new EntityManager<>();

        Student KolyaStudent = new Student ("Коля", 17, true);
        Student DimaStudent = new Student ("Дима", 19, true);
        Student IvanStudent = new Student ("Иван", 20, true);

        manager.add(KolyaStudent);
        manager.add(DimaStudent);
        manager.add(IvanStudent);

        int initialSize = manager.gettAll().size();

        assertTrue(manager.remove(KolyaStudent));

        assertFalse(manager.gettAll().contains(KolyaStudent));

        assertEquals(initialSize-1, manager.gettAll().size());

        assertFalse(manager.remove(KolyaStudent));
    }

    @Test
    public void filterByAgeTest(){

        EntityManager<Student> manager = new EntityManager<>();

        Student KolyaStudent = new Student ("Коля", 19, true);
        Student DimaStudent = new Student ("Дима", 20, true);
        Student IvanStudent = new Student ("Иван", 22, true);
        Student PetrStudent = new Student ("Пётр", 25, true);
        Student PavelStudent = new Student ("Павел", 26, true);

        manager.add(KolyaStudent);
        manager.add(DimaStudent);
        manager.add(IvanStudent);
        manager.add(PetrStudent);
        manager.add(PavelStudent);

        int initialSize = manager.gettAll().size();

        List<Student> result = manager.filterByAge(20,25);

        assertEquals(3, result.size());
        assertTrue(result.contains(DimaStudent));
        assertTrue(result.contains(IvanStudent));
        assertTrue(result.contains(PetrStudent));
    }

    @Test
    public void filterByNameTest(){
        EntityManager<Student> manager = new EntityManager<>();

        Student KolyaStudent = new Student ("Коля", 19, true);
        Student Dima0Student = new Student ("Дима", 20, true);
        Student IvanStudent = new Student ("Иван", 22, true);
        Student PetrStudent = new Student ("Пётр", 25, true);
        Student Dima1Student = new Student ("Дима", 26, true);

        manager.add(KolyaStudent);
        manager.add(Dima0Student);
        manager.add(IvanStudent);
        manager.add(PetrStudent);
        manager.add(Dima1Student);

        int initialSize = manager.gettAll().size();

        List<Student> result = manager.fillerByName("Дима");

        assertEquals(2, result.size());
        assertTrue(result.contains(Dima0Student));
        assertTrue(result.contains(Dima1Student));
    }

    @Test
    public void filterByActiveTest(){

        EntityManager<Student> manager = new EntityManager<>();

        Student KolyaStudent = new Student ("Коля", 19, true);
        Student DimaStudent = new Student ("Дима", 20, false);
        Student IvanStudent = new Student ("Иван", 22, true);
        Student PetrStudent = new Student ("Пётр", 25, true);
        Student PavelStudent = new Student ("Павел", 26, false);

        manager.add(KolyaStudent);
        manager.add(DimaStudent);
        manager.add(IvanStudent);
        manager.add(PetrStudent);
        manager.add(PavelStudent);

        int initialSize = manager.gettAll().size();

        List<Student> result = manager.filterByActive();

        assertEquals(3, result.size());
        assertTrue(result.contains(KolyaStudent));
        assertTrue(result.contains(IvanStudent));
        assertTrue(result.contains(PetrStudent));
    }


}
