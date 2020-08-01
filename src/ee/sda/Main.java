package ee.sda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Read a file
        // Fix the next line's bug, make it relative Path
        Path absolutePath = Paths.get("C:/Users/Kasutaja/IdeaProjects/FileReader/src/ee/sda/myFile.txt");

        List<String> fileLines = new ArrayList<>();

        try {
            fileLines = Files.readAllLines(absolutePath);
        } catch (IOException e) {
            System.out.println("IOException happened");
        }

        // From here you can continue to countWords the words
        String takenLine = fileLines.stream().findFirst().get();
        System.out.println(takenLine);

        int countWords = 0;
        int countDots = 0;
        int countCommas = 0;

        for (int i = 0; i < takenLine.length(); i++) {
            if (takenLine.charAt(i) == ' ') {
                countWords++;
            } else if (takenLine.charAt(i) == '.') {
                countDots++;
            } else if (takenLine.charAt(i) == ','){
                countCommas++;
            }
        }
        System.out.println("Total number of words: " + (countWords + 1));
        System.out.println("Total number of dots: " + countDots);
        System.out.println("Total number of commas: " + countCommas);
    }
}
