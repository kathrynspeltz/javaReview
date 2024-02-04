import java.util.Scanner;

public class App {
    static int age2 = 6;
    public static void main(String[] args) throws Exception {
        byte  lessThan127 = 5;
        short aNumberBelow32k = 15000;
        int aLargeNumber = 2000000;
        long aSuperLargeNumber = 2000000000;
        double doubleTheValuesAsFloat = 4.1425;
        float halfTheValuesAs = 3.14f;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);



        System.out.println("Hello, World! I am " + lessThan127 + age2);
    }
}
