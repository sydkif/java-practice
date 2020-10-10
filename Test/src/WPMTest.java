import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMTest {

    static String[] wordList = { "try", "the", "new", "cross", "platform", "windows", "powershell", "corporation",
            "rights", "reserved" };

    public static void main(String[] args) throws InterruptedException {

        for (int s = 3; s > 0; s--) {
            System.out.println(s);
            TimeUnit.SECONDS.sleep(1);
        }

        Random rand = new Random();
        for (int r = 0; r < 10; r++) {
            System.out.print(wordList[rand.nextInt(9)] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();
        Scanner scan = new Scanner(System.in);
        String wordTyped = scan.nextLine();
        scan.close();
        double end = LocalTime.now().toNanoOfDay();
        double timeElapsed = end - start;
        double timeSeconds = timeElapsed / 1E9;
        int charNum = wordTyped.length();
        int wpm = (int) ((((double) charNum / 5) / timeSeconds) * 60);

        System.out.println("Your Words-per-Minute (WPM) is " + wpm);

    }

}