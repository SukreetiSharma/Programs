public class Parameterized_Constructor {
    String languages;
    // constructor accepting single value
    Parameterized_Constructor(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Language");
    }
    public static void main(String[] args) {

        // call constructor by passing a single value
        Parameterized_Constructor obj1 = new Parameterized_Constructor("Java");
        Parameterized_Constructor obj2 = new Parameterized_Constructor("Python");
        Parameterized_Constructor obj3 = new Parameterized_Constructor("C");
    }
}

