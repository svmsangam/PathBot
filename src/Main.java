import models.Path;
import services.MovementService;
import services.impl.MovementServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            Path path = new Path();
            MovementService movementService = new MovementServiceImpl();

            System.out.println("Initial Position:\n" +
                    String.format("%s (%d,%d)",
                            path.getDirection(), path.getxAxis(), path.getyAxis()));
            for(String instruction : args) {

                path = movementService.getMovement(instruction, path);
            }

            System.out.println("New Position:\n" +
                    String.format("%s (%d,%d)",
                            path.getDirection(), path.getxAxis(), path.getyAxis()));

        }else {
            System.out.println("Please provide movement instructions");
        }
    }
}