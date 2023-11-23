import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        String proceed = "yes";
        while (proceed.equals("yes")) {
            System.out.println("Choose figure what you want:\n" +
                    "    1 - Rectangle;\n" +
                    "    2 - RightTriangle;\n" +
                    "    3 - InvertedTriangle;\n" +
                    "    4 - NormalTriangle");
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();
            chooseFigure(userAnswer);
            System.out.println("Do you want create new figure? yes - no");
            proceed = scanner.next();

        }

    }

    static void chooseFigure(int figureType){
        switch (figureType) {
            case 1:
                System.out.println("Rectangle");
                createRectangle();
                break;
            case 2:
                System.out.println("RightTriangle");
                createRightTriangle();
                break;
            case 3:
                System.out.println("InvertedTriangle");
                createInvertedTriangle();
                break;
            case 4:
                System.out.println("NormalTriangle");
                createNormalTriangle();
                break;
        }


    }
    static void createRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width");
        int width = scanner.nextInt();
        System.out.println("Input height");
        int height = scanner.nextInt();
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    static void createRightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height");
        int height = scanner.nextInt();
        for (int i = height; i >= 0; i--) {
            for (int k = i; k <= height - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void createInvertedTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void createNormalTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
