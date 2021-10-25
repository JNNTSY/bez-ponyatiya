public class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "Age: " + age + "Salary: " + salary);
    }
}

