// Written by Divya Rasania on 10/02/2023

package ch11.Figures;

import java.nio.file.*;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        Path file = Paths.get("ch11/Figures/Grades.txt");
        InputStream input = null;

        try {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = null;

            s = reader.readLine();

            System.out.println(s);

            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
