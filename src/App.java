import java.time.LocalDate;
import java.util.Scanner;

public class App {
//    static int age2 = 6;
    public static void main(String[] args) {
        User user = new User("Kathryn", "2012-12-12" );

        Book romeo = new Book("Romeo and Juliet", "Shakespeare", 330 );
        AudioBook coding = new AudioBook("All About Coding", "Students Everywhere", 20000);
        Ebook example1 = new Ebook("I am another example", "Example Author", 345, "Kindle");
        System.out.println(romeo.toString());
        System.out.println(coding.toString());
        System.out.println(example1.toString());


        user.borrow(romeo);
        System.out.printf("%s was born back in %s and she is now %d years old \n", user.getName(), user.getBirthday(), user.age());

        System.out.printf("%s has borrowed these books: %s \n", user.getName(), user.borrowedBooks());

//        User youngerUser = new User();
//        youngerUser.name = "Kathryn Jr";
//        youngerUser.birthDay = LocalDate.parse("2005-01-31");
//        System.out.printf("%s was born back in %s and she is now %d years old", youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());
//        User olderUser = new User();
//        olderUser.name = "Kathryn Sr";
//        olderUser.birthDay = LocalDate.parse("1985-01-31");
//        System.out.printf("%s was born back in %s and she is now %d years old", olderUser.name, olderUser.birthDay.toString(), olderUser.age());

//        byte  lessThan127 = 5;
//        short aNumberBelow32k = 15000;
//        int aLargeNumber = 2000000;
//        long aSuperLargeNumber = 2000000000;
//        double doubleTheValuesAsFloat = 4.1425;
//        float halfTheValuesAs = 3.14f;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//        System.out.println("Hello, World! I am " + lessThan127 + age2);
    }
}
