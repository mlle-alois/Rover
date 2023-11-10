package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static final String RESSOURCE_PATH = "src/main/resources/";
    public static void main(String[] args) {
        String fileName = args[0];
        try (BufferedReader br = new BufferedReader(new FileReader(RESSOURCE_PATH + fileName))) {
            String line;
            String[] plateauSize = br.readLine().split(" ");
            int plateauX = Integer.parseInt(plateauSize[0]);
            int plateauY = Integer.parseInt(plateauSize[1]);

            while ((line = br.readLine()) != null) {
                String[] roverPosition = line.split(" ");
                int roverX = Integer.parseInt(roverPosition[0]);
                int roverY = Integer.parseInt(roverPosition[1]);
                char roverDirection = roverPosition[2].charAt(0);

                Rover rover = new Rover(roverX, roverY, roverDirection);

                String instructions = br.readLine();
                for (char instruction : instructions.toCharArray()) {
                    rover.move(instruction);
                }

                System.out.println(rover.getPosition());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
