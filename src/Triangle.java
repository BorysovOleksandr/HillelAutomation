public class Triangle {
        public static void main(String[] args) {
            int n = 5; // This determines the height of the triangle. You can change this value.

            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int j = 0; j <= i - 1; j++) {
                    System.out.print(" *");
                }

                // Move to the next line
                System.out.println();
            }
        }

}
