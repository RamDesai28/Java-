class Grandparent {
    void displayGrandparent() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void displayParent() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("Child class");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayGrandparent(); // Method from Grandparent class
        child.displayParent();       // Method from Parent class
        child.displayChild();        // Method from Child class
    }
}

