public class Menu {

    private static Employee[] employees = new Employee[3];

    public static void main(String[] args) {


        employees[0] = new Employee("Jon Keks", 1, 12532);
        employees[1] = new Employee("Kris Lo", 2, 43533);
        employees[2] = new Employee("Ron Git", 3, 35163);

        printEmployee();
        System.out.println(sumSalary());
        System.out.println(minSalary());
        System.out.println(maxSalary());
        System.out.println(averageSalary());
        printEmployeesFullName();

    }

    private static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        return sum;
    }
    private static Employee minSalary(){
        Employee min = employees[0];
        for(Employee employee: employees ){
            if(employee.getSalary() < min.getSalary()){
                min = employee;
            }
        }
        return min;
    }
    private static Employee maxSalary(){
        Employee max = employees[0];
        for(Employee employee: employees){
            if(employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
private static double averageSalary(){
        return (double) sumSalary() / employees.length;

}
private static void printEmployeesFullName(){
        for(Employee employee: employees){
            System.out.println(employee.getFullName());
        }

}

}