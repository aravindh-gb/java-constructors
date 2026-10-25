class persons {
    String name;

    persons(String name) {
        this.name = name;
    }
}

class Employee extends persons {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Arun", 45000);
        e.display();
    }
}