public class Constructor_Class {
    String name;
    Constructor_Class() {
        System.out.println("Constructor Example :");
        name = "Constructor";
    }
    public static void main(String args[]) {
        Constructor_Class obj = new Constructor_Class();
        System.out.println("The name is " + obj.name);
    }
}
