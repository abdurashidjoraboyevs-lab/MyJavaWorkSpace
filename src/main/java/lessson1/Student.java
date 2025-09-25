package lessson1;

 class Student {
     public int id;
     public String name;
     public int age;
     public String gender;
     public String course;

     public Student(int id, String name, int age, String gender, String course){
         this.id = id;
         this.name = name;
         this.age = age;
         this.gender = gender;
         this.course = course;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getGender() {
         return gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
     }

     public String getCourse() {
         return course;
     }

     public void setCourse(String course) {
         this.course = course;
     }
     public void studentInfo(){
         System.out.println("Student Info:");
         System.out.println("  ID: " + id);
         System.out.println("  Name: " + name);
         System.out.println("  Age: " + age);
         System.out.println("  Gender: " + gender);
         System.out.println("  Course: " + course);
     }
 }
