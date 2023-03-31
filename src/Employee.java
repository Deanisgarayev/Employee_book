public class Employee {
   private String fullName;
    private int salary;
    private String department;
//    private String electrician;
//    private String stonemason;
//    private String plumber;
//    private String welder;
//    private String carpenter;

    public Employee(String fullName, int salary, String department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department =department;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Имя " + fullName + " Отдел " + department + " Зарплата " + salary;
    }
}
