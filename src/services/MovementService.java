package services;

import enums.Direction;
import models.Path;

public interface MovementService {
    /*
     * MovementService interface has definition of all the methods
     * required to perform bot's movement operation
     * */
    Path turnClockWise(Path direction);

    Path turnCounterClockWise(Path direction);

    Path moveSteps(Path direction,int steps);

    Path getMovement(String instructions, Path path);
}
