package HomeWork_13_complex.complex_task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    /**
     * добавить оценку в пустой список
     * добавить оценку в непустой список
     *
     * добавить отрицательную оценку
     *
     * посчитать среднюю оценку
     *
     * посчитать среднюю оценку когда нет оценок
     */

    @Test
    public void addGradeInEmptyListTest(){
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> DimaMath = new StudentGrade<>("Дима", "Математика", 5);

        gradeService.addGrade(DimaMath);

        assertTrue(gradeService.getAllGrades().contains(DimaMath));
        assertEquals(1,gradeService.size());
    }

    @Test
    public void addGradeInNotEmptyListTest(){
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> DimaMath = new StudentGrade<>("Дима", "Математика", 5);
        gradeService.addGrade(DimaMath);

        int initialSize = gradeService.size();

        StudentGrade<Integer> IvanMath = new StudentGrade<>("Иван", "Математика", 5);
        gradeService.addGrade(IvanMath);

        assertTrue(gradeService.getAllGrades().contains(IvanMath));
        assertEquals(2,gradeService.size());
    }

    @Test
    public void addInvalidGradeTest(){
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> DimaMath = new StudentGrade<>("Дима", "Математика", -5);

        assertThrows(InvalidGradeException.class, ()-> gradeService.addGrade(DimaMath));
        assertEquals(0,gradeService.size());
    }

    @Test
    public void averageGradeTest(){
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> DimaMath = new StudentGrade<>("Дима", "Математика", 5);
        StudentGrade<Integer> IvanMath = new StudentGrade<>("Иван", "Математика", 3);
        StudentGrade<Integer> KolyaEng = new StudentGrade<>("Коля", "Английский", 5);

        gradeService.addGrade(DimaMath);
        gradeService.addGrade(IvanMath);
        gradeService.addGrade(KolyaEng);

        assertEquals(4.0, gradeService.getAverageGradeBySubject("Математика"));
    }

    @Test
    public void averageGradeInvalidTest(){
        GradeService<Integer> gradeService = new GradeService<>();
        StudentGrade<Integer> DimaMath = new StudentGrade<>("Дима", "Математика", 5);
        StudentGrade<Integer> IvanMath = new StudentGrade<>("Иван", "Математика", 3);
        StudentGrade<Integer> KolyaEng = new StudentGrade<>("Коля", "Английский", 5);

        gradeService.addGrade(DimaMath);
        gradeService.addGrade(IvanMath);
        gradeService.addGrade(KolyaEng);

        assertThrows(InvalidGradeException.class, () -> gradeService.getAverageGradeBySubject("Физика"));
    }

}
