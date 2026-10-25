class students {
    String name;

    students(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        students s = new students("Aravindh");
        s.display();
    }
}