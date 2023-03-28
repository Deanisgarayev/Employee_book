public class Employee {
   private String fullName;
    private int salary;
    private String electrician;
    private String stonemason;
    private String plumber;
    private String welder;
    private String carpenter;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getSalary() {
        return this.salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }
}
