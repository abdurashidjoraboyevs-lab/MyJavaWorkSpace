package lessson1;

public class Main2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("");
        employee.setSalary(0);
        employee.setDepartment(7);
        employee.employeeInfo();

        int a = 3;
        int c = 1000;

        int empSalary2x = employee.getSalary()*2;
        int empSalaryX = employee.getSalary()*a;
        int empSalaryMinus = employee.getSalary()-c;

        employee.setDepartment(2);

        System.out.println("Salary 2x: "+empSalary2x);
        System.out.println(employee.getSalary()+"(Salary) * "+ a + " = " + empSalaryX);
        System.out.println(employee.getSalary()+"(Salary) - "+ c + " = " + empSalaryMinus);
        System.out.println("Employee Changed Dept:"+employee.department);
    }

}
