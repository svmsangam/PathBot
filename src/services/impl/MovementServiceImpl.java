package services.impl;


import enums.Direction;
import models.Path;
import services.MovementService;


public class MovementServiceImpl implements MovementService {

    /*
     * MovementServiceImpl is implementation of
     * MovementService interface and actual implementation logic
     * for all the defined methods in the interface
     * */

    //method to turn  bot counter-clock-wise or left
    @Override
    public Path turnCounterClockWise(Path path) {
        switch (path.getDirection()) {
            case NORTH:
                path.setDirection(Direction.WEST);
                break;
            case EAST:
                path.setDirection(Direction.NORTH);
                break;
            case SOUTH:
                path.setDirection(Direction.EAST);
                break;
            case WEST:
                path.setDirection(Direction.SOUTH);
                break;
        }
        return path;
    }

    //method to turn bot clock-wise or right
    @Override
    public Path turnClockWise(Path path) {
        switch (path.getDirection()) {
            case NORTH :
                path.setDirection(Direction.EAST);
                break;
            case EAST :
                path.setDirection(Direction.SOUTH);
                break;
            case SOUTH :
                path.setDirection(Direction.WEST);
                break;
            case WEST :
                path.setDirection(Direction.NORTH);
                break;
        }
        return path;
    }

    //method to move bot to given steps based on direction it's facing
    @Override
    public Path moveSteps(Path path, int steps) {
        switch (path.getDirection()){
            case NORTH :
                path.setyAxis(path.getyAxis() + steps);
                break;
            case EAST :
                path.setxAxis(path.getxAxis() + steps);
                break;
            case SOUTH :
                path.setyAxis(path.getyAxis() - steps);
                break;
            case WEST :
                path.setxAxis(path.getxAxis() - steps);
                break;
        }
        return path;
    }


    @Override
    public Path getMovement(String instructions, Path path) {
        for (char instructionChar  : instructions.toCharArray()){
            switch (instructionChar){
                case 'R':
                    turnClockWise(path);
                    break;
                case 'L':
                    turnCounterClockWise(path);
                    break;
                case 'M':
                    int steps = Integer.parseInt(instructions.substring(2));
                    moveSteps(path,steps);
                    break;
            }
        }

        return path;
    }
}
