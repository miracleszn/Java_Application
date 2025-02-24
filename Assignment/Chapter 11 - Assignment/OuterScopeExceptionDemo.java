public class OuterScopeExceptionDemo {
    public static void methodWithTry() {
        try {
            throw new NullPointerException("This is a NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("Caught in methodWithTry: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodWithTry();
        try {
            throw new IOException("This is an IOException");
        } catch (IOException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}