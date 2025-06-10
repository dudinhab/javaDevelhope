public class Student extends Person{
    Course[] courses;
    int courseCount;
    public Student(String firstName, String lastName, int age){
        super(firstName,lastName,age);
        courses = new Course[5];
        courseCount=0;
    }

    public void addCourse(Course c){
        if (courseCount<courses.length){
            courses[courseCount] = c;
            courseCount++;
        }else{
            System.out.println("Courses pieno!");
        }
    }

    public String findCourseByName(String courseName){
        try{
            for (int i = 0; i < courses.length; i++) {
                if (courses[i].getCourseName().equals(courseName)){
                    return "Nome del corso: "+courses[i].getCourseName() +" ha un credito di: "+courses[i].getCredit();
                }
            }
            return null;
        }catch (NullPointerException e){
            System.out.println("Non esiste!");
            return null;
        }
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
