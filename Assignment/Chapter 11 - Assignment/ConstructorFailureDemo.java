class SomeClass {
    public SomeClass() throws Exception {
        throw new Exception("Constructor failed");
    }
}

public class ConstructorFailureDemo {
    public static void main(String[] args) {
        try {
            SomeClass obj = new SomeClass();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}