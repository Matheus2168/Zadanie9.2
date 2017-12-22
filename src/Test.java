import java.io.IOException;
import java.util.Scanner;

public class Test {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ile liczb chcesz wprowadzic ?");
        int numer = sc.nextInt();
        sc.nextLine();

        ArrayAssistant aa = null;
        try {
            aa = new ArrayAssistant(numer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        aa.fillByConsole();
        aa.writeToFile();
    }


}
