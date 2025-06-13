package HomeWork_2;

public class StudentGroup {

    // использовал  String для groupName так как исходя из названия это имя, а не номер группы, если бы было groupNumber, то использовал бы int
    String groupName;
    int studentCount;

    StudentGroup (String someGroupName, int someStudentCount){
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    String getGroupName(){
        return this.groupName;
    }

    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    void setStudentCount (int newStudentCount){
        this.studentCount = newStudentCount;
    }

    void printInfo() {
        System.out.println("В группе " + groupName + " учатся " + studentCount + " студентов" );
    }



}
