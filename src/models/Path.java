package models;

import enums.Direction;

public class Path {
    /*
    * Path is used as model class
    * which used several fields to store and
    * manipulate bot's direction and steps.
    * Default constructor is used to set
    * bot's initial position as (0,0) facing north when initializing Path with new keyword.
    * */


    private int xAxis;
    private int yAxis;
    private Direction direction;


    public Path(){
        this.xAxis = 0;
        this.yAxis = 0;
        this.direction = Direction.NORTH;
    }


    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
