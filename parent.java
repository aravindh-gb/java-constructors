class parent {
    parent(int x) {
        System.out.println(x);
    }
}

class Child extends parent {
    Child() {
        super(10);
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}