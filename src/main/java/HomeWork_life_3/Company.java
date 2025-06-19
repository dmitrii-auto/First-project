package HomeWork_life_3;

public class Company {

    static private String companyName = "OOO ИП";
    final private int EMPLOYEE_ID;
    private String employeeName;

    Company(int someEmployeeID, String someEmployeeName){
            this.EMPLOYEE_ID = someEmployeeID;
            this.employeeName = someEmployeeName;
    }

    int getEmployeeID(){
        return this.EMPLOYEE_ID;
    }

    String getEmployeeName(){
        return  this.employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    static void setCompanyName(String newCompanyName){
        companyName = newCompanyName;
    }


    static void printCompanyName(){
        System.out.println("Имя компании: " + companyName);
    }

    void printInfo(){
        System.out.println("Имя компании: " + companyName + ". Имя сотрудника: " + employeeName + ". ID: " + EMPLOYEE_ID);
    }

}
