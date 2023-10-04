public class Main {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee("Lapshin Alexander Nikolaevich", 1, 5000);
        employees[1] = new Employee("Kurdyum Alexey Anatolyevich", 2, 3000);
        employees[2] = new Employee("Gaziev Zhaudat Yaukhatovichh", 3, 4000);
        employees[3] = new Employee("Shestakov Daniil Zakharovich", 2, 3500);
        employees[4] = new Employee("Morozov Dmitry Yaroslavovich", 1, 4500);

//        print all employees
        printEmployees();
        printSpace();
//        calculate total expenses of employees
        calculateTotalExpense(employees);
        printSpace();
//        get employee with min salary
        findEmployeeWithMinSalary(employees);
        printSpace();
//        get employee with max salary
        findEmployeeWithMaxSalary(employees);
        printSpace();
//        calculate middle expenses of employees
        calculateMiddleExpense(employees);
        printSpace();
//        print all employee names
        printEmployeesNames();
        printSpace();
    }

    public static void printSpace() {
        System.out.println();
    }

    //    prints all employees
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //    calculates total expenses of employees
    public static void calculateTotalExpense(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        System.out.println("Сумма трат на зарплаты составила =  " + sum);
    }

    //    gets employee with min salary
    public static void findEmployeeWithMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        Employee resultedEmployee = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                resultedEmployee = employee;
            }
        }
        System.out.println(resultedEmployee);
    }

    //    gets employee with max salary
    public static void findEmployeeWithMaxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        Employee resultedEmployee = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                resultedEmployee = employee;
            }
        }
        System.out.println(resultedEmployee);
    }

    //    calculates middle expenses of employees
    public static void calculateMiddleExpense(Employee[] employees) {
        int middleSum = 0;
        int sum = 0;
        int day = 30;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            middleSum = sum / day;

        }
        System.out.println("Сумма трат на зарплаты составила =  " + middleSum);
    }

    //    prints all employee names
    public static void printEmployeesNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}