public class table {
    public static void main(String[] args) {
        int count = 6;
        for (int i = count; i >= 0; i--) {
            for (int k = i; k <= count - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}