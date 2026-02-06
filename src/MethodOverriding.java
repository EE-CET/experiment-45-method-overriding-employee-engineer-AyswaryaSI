class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}
public class Engineer extends Employee {
    void display() {
        System.out.println("Name of class is Engineer");
        super.display();   // calling base class method
    }
    public static void main(String[] args) {

        Engineer e = new Engineer();
        e.display();
    }
}
