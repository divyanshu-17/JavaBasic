public class StudentToString {
    String name;
    int age;
    double marks;

    public StudentToString(String name,int age,double marks){  //
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    @Override
    public String toString() {
        return "Student- "+"{Name: "+name+" ,age: "+age+" and marks: "+marks+"}";
    }

    public static void main(String[] args) {
        StudentToString student= new StudentToString("Dibu",20,65.5);
        System.out.println(student);
    }
}
