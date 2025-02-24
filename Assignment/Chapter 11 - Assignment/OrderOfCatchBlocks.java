public class OrderOfCatchBlocks {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("This is ExceptionA");
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}