package Shuju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("all")
public class IOWriter {
    public static void main(String[] args) throws NumberFormatException, IOException {

        File file_1 = new File("e:/thewriter.txt");
        file_1.createNewFile();

        FileWriter fileWriter = new FileWriter(file_1);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String second = "****************************************************";
        writer.write(second);
        String theContentOfTheFile;
        var array_1 = new String[4];
        writer.newLine();
        String firstline = String.format("%-10s,%-10s,%-10s,%-10s", "ID#", "Item", "Quantity", "Price (€).");
        writer.write(firstline);
        var array = new String[4];
        String theSeperatore = ",";
        double total = 0;
        String fileName = "F:/Groceries.txt";

        FileReader fileReader = new FileReader(fileName);
        // FileWriter fileWriter = new FileWriter(fileName);
        // BufferedWriter writer = new BufferedWriter(fileWriter);
        BufferedReader reader = new BufferedReader(fileReader);
        String theWordsOfTheFile;
        while ((theWordsOfTheFile = reader.readLine()) != null) {
            writer.newLine();
            array = theWordsOfTheFile.split(theSeperatore);
            double price = Double.parseDouble(array[3]);
            total += price;
            System.out.println(theWordsOfTheFile + ".");
            writer.write(theWordsOfTheFile);

        }
        System.out.printf("\nThe total price is %f", (double) Math.round(total));
        // reader.close();

        while ((theContentOfTheFile = reader.readLine()) != null) {
            // writer.newLine();
            array_1 = theContentOfTheFile.split(theSeperatore);
            // String theContent = String.format("%-10s,%-10s,%-10s,%-10s", array_1[0],
            // array_1[1], array_1[2],
            // array_1[3]);
            // System.out.println(theContent);

        }
        writer.newLine();
        writer.write(second);
        writer.newLine();
        writer.write("The grocery shopping total is: €42");
        writer.newLine();
        writer.write(second);
        writer.flush();
        writer.close();
    }
}
