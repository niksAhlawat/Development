public class TryCatchTest {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            
            try {
            //    int n = 10/0;
            } catch (ArithmeticException r) {
               
                System.out.println("Exception");
            }
            System.out.println("Cought");
        }
    }
}
