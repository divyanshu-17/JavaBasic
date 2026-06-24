package course;

public class Course {
    static int maxCapacity=100;
    String studentName;
    String courseName;
    int enrollments;

    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
    }

    String[] enrolledStudents= new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }
    void enrollStudents(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;
    }
    void  unEnrollStudents(String studentName){
        System.out.println("Students removed");
        enrollments--;
    }
}
