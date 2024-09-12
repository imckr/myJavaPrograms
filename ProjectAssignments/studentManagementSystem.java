public class Student {
    String name;
    int age;
    int rollNo;
    String courseName;
    double averageMarks;
    
    public Student(String name, int age, int rollNo, String courseName, double averageMarks) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.courseName = courseName;
        this.averageMarks = averageMarks;
    }

    public double calculateGrade() {
        if (averageMarks >= 90) {
            return 'A';
        } else if (averageMarks >= 80) {
            return 'B';
        } else if (averageMarks >= 70) {
            return 'C';
        } else if (averageMarks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public double getAverageMarks() {
        return averageMarks;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", courseName=" + courseName + ", averageMarks=" + averageMarks + ", grade=" + calculateGrade() + "]";
    }
    
    public static void main(String[] args) {

        int a = 1;

        switch (a) {
            a : 1 {
                System.out.println("Inside Switch case 1");
                break a;
            }
            a : 2 {
                System.out.println("Inside Switch case 2");
                break a;
            }
        }

        Student student1 = new Student("John Doe", 20, 101, "Computer Science", 85.5);
        System.out.println(student1);
        
        Student student2 = new Student("Jane Smith", 19, 102, "Mathematics", 92.0);
        System.out.println(student2);
    }
}