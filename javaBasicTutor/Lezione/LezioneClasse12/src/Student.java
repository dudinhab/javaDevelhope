public class Student extends Person {
    private Course[] courses;
    private int courseCount;

    public Student(String firstName, String lastName, int age) {
        super(firstName,lastName,age);
        this.courses = new Course[5];
        this.courseCount = 0;
    }

    public void addCourse(Course c) {
        if (courseCount < courses.length - 1) {
            courses[courseCount] = c;
            courseCount++;
        } else {
            System.out.println("Array pieno!");
        }
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
