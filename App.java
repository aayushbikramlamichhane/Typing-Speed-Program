
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

    static String [] words = {"home", "programming", "victory", "Camel",
                        "football", "sport", "book", "learn", "dream", "fun"};
    public static void main(String[] args) throws Exception {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");   
        TimeUnit.SECONDS.sleep(1);

        Random random = new Random();
        for(int i=0; i<10; i++){
            System.out.print(words[random.nextInt(9)] + " ");
        }
        System.out.println();
        double start = LocalTime.now().toNanoOfDay();



        Scanner scanner = new Scanner(System.in);
        String typedWords = scanner.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        System.out.println(seconds);

        int numChars = typedWords.length();
        int wpm = (int) ((((double) numChars / 5) / seconds) * 60);

        System.out.println("Your wpm is " + wpm);
    }
}
