// Written by Divya Rasania on 10/05/2023

package ch11.ProgrammingAssignment;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class StudentsStanding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path goodFile = Paths.get("ch11/YouDoIt/Good Standing.txt");
        Path probationFile = Paths.get("ch11/YouDoIt/Academic Probation.txt");
        final String ID_FORMAT = "00000";
        final String FIRST_NAME_FORMAT = "          ";
        final String LAST_NAME_FORMAT = "          ";
        final int FNAME_LENGTH = FIRST_NAME_FORMAT.length();
        final int LNAME_LENGTH = LAST_NAME_FORMAT.length();
        final String STANDING = "  ";
        final String GPA_FORMAT = "0.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter + FIRST_NAME_FORMAT + delimiter + LAST_NAME_FORMAT +
                delimiter + GPA_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();
        FileChannel fcGood = null;
        FileChannel fcProbation = null;
        String idString;
        int id;
        String fName, lName;
        double gpa;
        final String QUIT = "999";

        createEmptyFile(goodFile, s);
        createEmptyFile(probationFile, s);

        try {
            fcGood = (FileChannel) Files.newByteChannel(goodFile, CREATE, WRITE);
            fcProbation = (FileChannel) Files.newByteChannel(probationFile, CREATE, WRITE);

            System.out.print("Enter student id number >> ");
            idString = input.nextLine();

            while (!(idString.equals(QUIT))) {
                id = Integer.parseInt(idString);

                System.out.print("Enter student's first name >> ");
                fName = input.nextLine();

                StringBuilder sb = new StringBuilder(fName);
                sb.setLength(FNAME_LENGTH);
                fName = sb.toString();

                System.out.print("Enter student's last name >> ");
                lName = input.nextLine();

                sb = new StringBuilder(lName);
                sb.setLength(LNAME_LENGTH);
                lName = sb.toString();

                System.out.print("Enter GPA >> ");
                gpa = input.nextDouble();

                input.nextLine();

                DecimalFormat df = new DecimalFormat(GPA_FORMAT);

                s = idString + delimiter + fName + delimiter + lName + delimiter +
                        df.format(gpa) + System.getProperty("line.separator");

                byte data[] = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);

                if (gpa >= 2.0) {
                    fcGood.position(id * RECSIZE);
                    fcGood.write(buffer);
                } else {
                    fcProbation.position(id * RECSIZE);
                    fcProbation.write(buffer);
                }

                System.out.print("Enter next stdent id number or " + QUIT + " to quit >> ");
                idString = input.nextLine();
            }
            fcGood.close();
            fcProbation.close();
        } catch (Exception e) {
            System.out.println("Error message: " + e);
        }

        input.close();
    }

    private static void createEmptyFile(Path file, String s) {
        final int NUMRECS = 1000;

        try {
            OutputStream outputStr = new BufferedOutputStream(
                    Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));

            for (int count = 0; count < NUMRECS; ++count)
                writer.write(s, 0, s.length());

            writer.close();
        } catch (Exception e) {
            System.out.println("Error message: " + e);
        }
    }
}
