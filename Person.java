class Person {
    String name = "Parent";
}

class Student extends Person {
    String name = "Child";

    void display() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}