package practice_3;

public class Student {

    // статическое поле
    final static int MAX_YEARS = 11;
    static int studentCount;

    // статический блок
    static {
        studentCount = 0;
    }

    // обычные поля
    int age;
    String name;

    Student (int someAge, String someName){
        this.age = someAge;
        this.name = someName;
        studentCount++; // инкрекемент, увеличение значения на 1
    }



    static void printMaxYears(){
        System.out.println(MAX_YEARS);
    }

}
