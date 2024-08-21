// Written by Divya Rasania on 10/02/2023

package ch11.Figures;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut {
    public static void main(String[] args) {
        Path file = Paths.get("ch11/Figures/Grades.txt");
        String s = "ABCDF";
        byte[] data = s.getBytes();
        OutputStream output = null;

        try {
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        } catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
