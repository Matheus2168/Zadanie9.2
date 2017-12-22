import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayAssistant {

    private double[] tab;
    private Scanner sc = new Scanner(System.in);
    private File numbers = new File("numbers.txt");
    private FileWriter fw = new FileWriter(numbers);
    private BufferedWriter bw = new BufferedWriter(fw);


    public ArrayAssistant(int size) throws IOException {
        this.tab = new double[size];
    }

    public void fillByConsole() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj liczbe:");
            tab[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    public void writeToFile() {
        try {
            if (!numbers.exists()) {
                numbers.createNewFile();
            }

            for (int i = 0; i < tab.length; i++) {
                 bw.write(String.valueOf(tab[i]) + "\n");
            }
                bw.close();
            }

            catch (IOException e ){
            e.printStackTrace();
            }


        }

    }

