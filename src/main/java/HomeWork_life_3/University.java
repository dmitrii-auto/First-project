package HomeWork_life_3;

public class University {

    static private String universityName;
    final private int studentID;
    private String studentName;

    University(int someStudentID, String someStudentName){
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static String getUniversityName(){
        return universityName;
    }

//    static void setUniversityName(String newUniversityName){
//        universityName = newUniversityName;
//    }

    int getStudentID(){
        return this.studentID;
    }

    String getStudentName(){
        return this.studentName;
    }

    void setStudentName(String newStudentName){
        this.studentName = newStudentName;
    }

    static void changeUniversityName(String newUniversityName){
        universityName = newUniversityName;
    }

    void printStudentInfo(){
        System.out.println("Имя студента: " + studentName + ". ID студента: "  + studentID + ". Университет: " + universityName);
    }

}
