package lessson1;

 class Employee {
     public int salary;
     public String name;
     public int department;

     public int getSalary() {
         if (salary <= 0){
             System.out.println("Invalid data");
             return 0;
         }else {
             return salary;
         }

     }

     public void setSalary(int salary) {
         if (salary <=0) {
             System.out.println("Invalid name");
         } else {
             this.salary = salary;
         }
     }

     public String getName() {
         if (name.length() <= 0){
             System.out.println("Invalid data");
             return "error";
         }else {
             return name;
         }
     }

     public void setName(String name) {
         if (name == null || name.isEmpty()) {
             System.out.println("Invalid name");
         } else {
             this.name = name;
         }
     }

     public int getDepartment() {
         return department;
     }

     public void setDepartment(int department) {
         this.department = department;
     }

     public void employeeInfo(){
         System.out.println("Employee Info:");
         System.out.println("  Salary: " + salary);
         System.out.println("  Name: " + name);
         System.out.println("  Department: " + department);

     }
 }
