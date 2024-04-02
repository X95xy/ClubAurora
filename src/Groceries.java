package Shuju;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Groceries {
    @SuppressWarnings("all")
    public static void main(String[] args) throws IOException {
        var array = new String[4];
        String theSeperatore = ",";
        double total = 0;
        String fileName = "F:\\Groceries.txt";

        FileReader fileReader = new FileReader(fileName);
        // FileWriter fileWriter = new FileWriter(fileName);
        // BufferedWriter writer = new BufferedWriter(fileWriter);
        BufferedReader reader = new BufferedReader(fileReader);
        String theWordsOfTheFile;
        while ((theWordsOfTheFile = reader.readLine()) != null) {
            array = theWordsOfTheFile.split(theSeperatore);
            double price = Double.parseDouble(array[3]);
            total += price;
            System.out.println(theWordsOfTheFile + ".");

        }
        System.out.printf("\nThe total price is %f", (double) Math.round(total));
        reader.close();
        // writer.flush();
        // writer.close();

    }

}
