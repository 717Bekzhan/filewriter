package com.company;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Alphabet");) {
            writer.write("A\nB\nC\nD\nE\nF\nG\nH\nI\nK\nL\nM\nN\nO\nP\nQ\nR\nS\nT\nV\nX\n" +
                    "Y\nZ\n1\n2\n3\n4\n5\n6\n7\n8\n9\n");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader fileReader = new FileReader("Alphabet")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException a) {
            System.out.println(a.getMessage());        }
    }


}
