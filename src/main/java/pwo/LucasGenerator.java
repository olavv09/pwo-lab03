package pwo;

import java.io.FileWriter;
import java.io.IOException;

public class LucasGenerator {
    public static void main(String[] args) {
        int n = 100;
        long[] lucasArray = new long[n];
        lucasArray[0] = 2;
        lucasArray[1] = 1;

        for (int i = 2; i < n; i++) {
            lucasArray[i] = lucasArray[i - 1] + lucasArray[i - 2];
        }

        try {
            FileWriter writer = new FileWriter("LucasGenerator.txt");
            for (int i = 0; i < n; i++) {
                writer.write("L(" + (i + 1) + ") = " + lucasArray[i] + "\n");
            }
            writer.close();
            System.out.println("Pomyślnie zapisano ciąg Lucasa do pliku.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania do pliku.");
            e.printStackTrace();
        }
    }
}
