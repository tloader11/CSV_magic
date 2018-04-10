package nl.powergamer.play.csv_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        Rooster rooster = new Rooster();
        try {
            File file = new File("rooster.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            rooster.importData(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(rooster.getData().size() > 0)
        {
            System.out.println("Rooster imported!! :D ");
        }
    }
}
