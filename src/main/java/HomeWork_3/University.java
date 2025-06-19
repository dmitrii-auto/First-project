package HomeWork_3;

public class University {

    static String universityName = "МГУ";
    final int studentID;
    String studentName;

    University (int someStudentID, String someStudentName){
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static void changeUniversityName(String newName){
        universityName = newName;
    }

    String getStudentName(){
        return this.studentName;
    }

    void printStudentInfo(){
        System.out.println("Имя: " + studentName + ". ID: " + studentID + ". Университет: " + universityName);
    }





}
