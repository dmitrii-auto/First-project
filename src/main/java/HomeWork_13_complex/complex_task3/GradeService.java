package HomeWork_13_complex.complex_task3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class GradeService <T extends Number> {

    private List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade){
        if (grade.getGrade().intValue() > 0){
            grades.add(grade);
        }
        else {
            throw new InvalidGradeException("Оценка не может быть отрицательной");
        }
    }

    public synchronized double getAverageGradeBySubject(String subject){
        return grades.stream()
                .filter(grade -> grade.getSubject().equals(subject))
                .mapToInt(grade -> grade.getGrade().intValue())
                .average()
                .orElseThrow(() -> new InvalidGradeException("Нет оценок по выбранному предмету"));
    }

    public int size(){
        return grades.size();
    }

    public List<StudentGrade<T>> getAllGrades(){
        return List.copyOf(grades);
    }

}
