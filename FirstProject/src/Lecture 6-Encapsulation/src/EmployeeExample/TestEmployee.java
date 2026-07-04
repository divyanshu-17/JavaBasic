package EmployeeExample;

class TestEmployee {
    public static void main(String[] args) {
        Employee emp= new Employee("Dibu",24,45000.1789);
        System.out.println(emp.getEmployeeDetail());
        emp.setAge(22);
        System.out.println(emp.getEmployeeDetail());
        emp.setAge(99);
        System.out.println(emp.getEmployeeDetail());
    }
}
