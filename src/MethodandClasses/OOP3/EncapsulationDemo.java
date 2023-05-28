package MethodandClasses.OOP3;

class Employer{
    private int empId;

    public void setEmpId(int empId1){
        empId = empId1;
    }

    public int getEmpId(){
        return empId;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employer e = new Employer();
//        e.empId = 5;
//        System.out.println(e.empId);
        e.setEmpId(10);
        System.out.println("Current employee id: " + e.getEmpId());
    }
}
