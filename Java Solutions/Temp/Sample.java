import java.io.*;
import java.util.*;

public class Sample {

    public static List<String> SolutionLogic(List<String> testCases) {
        /**
         * Args:
         *     testCases (List<String>): All input lines.
         * Returns:
         *     List<String>: Processed output lines.
         */

        List<String> result = new ArrayList<>();
        for (String line : testCases) {
            result.add(line.toUpperCase());  
        }
        return result;
    }

    public static void main(String[] args) {
        String inputFile = "../../input.txt";
        String outputFile = "../../output.txt";

        List<String> testCases = new ArrayList<>();

        // Read input.txt
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                testCases.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Process the test cases
        List<String> results = SolutionLogic(testCases);

        // Write to output.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String result : results) {
                writer.write(result);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing output file: " + e.getMessage());
        }

        System.out.println("All test cases processed. Output written to " + outputFile);
    }
}
