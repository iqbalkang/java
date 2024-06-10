public class TryCatch {

    public static void main(String[] args) {
        hopeForTheBest();

    }

    public static void hopeForTheBest() {
        int[] array = {1, 2, 3, 4, 5, 0};


        try {
            int result = array[4] / array[1];
            System.out.println(result);
            System.out.println(array[10]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("no index found");
        } finally {
            System.out.println("program ended");
        }

    }
}
