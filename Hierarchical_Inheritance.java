public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Science objA = new Science();
        objA.printA();
        objA.printB();

        Commerce objB = new Commerce();
        objB.printA();
        objB.printC();

        Arts objC = new Arts();
        objC.printA();
        objC.printD();
    }
}
class Student {
    public void printA() {
        System.out.println("Class Student");
    }
}

class Science extends Student {
    public void printB() {
        System.out.println("Class Science");
    }
}

class Commerce extends Student {
    public void printC() {
        System.out.println("Class Commerce");
    }
}

class Arts extends Student {
    public void printD() {
        System.out.println("Class Arts");
    }
}
