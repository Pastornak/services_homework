package com.epam.lab.service.model;

import com.epam.lab.service.model.exception.IllegalPositionException;

public class Copter {
    private Position position;
    private int radius;

    public Copter(){}

    public Copter(int x, int y, int z, int radius) throws IllegalPositionException {
        Position inputPosition = new Position(x, y, z);
        if(!isPositionCorrect(inputPosition, radius)){
            throwException();
        }
        position = inputPosition;
        this.radius = radius;
    }

    public Copter(Position inputPosition, int radius) throws IllegalPositionException{
        if(!isPositionCorrect(inputPosition, radius)){
            throwException();
        }
        this.position = inputPosition;
        this.radius = radius;
    }

    public Position moveForward(int amount) throws IllegalPositionException{
        Position newPosition = new Position(position);
        newPosition.setY(newPosition.getY() + amount);
        if(isPositionCorrect(newPosition, radius)){
            position = newPosition;
        } else{
            throwException();
        }
        return position;
    }

    public Position moveBackward(int amount) throws IllegalPositionException{
        Position newPosition = new Position(position);
        newPosition.setY(newPosition.getY() - amount);
        if(isPositionCorrect(newPosition, radius)){
            position = newPosition;
        } else{
            throwException();
        }
        return position;
    }

    public Position moveRight(int amount) throws IllegalPositionException{
        Position newPosition = new Position(position);
        newPosition.setX(newPosition.getX() + amount);
        if(isPositionCorrect(newPosition, radius)){
            position = newPosition;
        } else{
            throwException();
        }
        return position;
    }

    public Position moveLeft(int amount) throws IllegalPositionException{
        Position newPosition = new Position(position);
        newPosition.setX(newPosition.getX() - amount);
        if(isPositionCorrect(newPosition, radius)){
            position = newPosition;
        } else{
            throwException();
        }
        return position;
    }

    public Position moveUp(int amount) throws IllegalPositionException{
        Position newPosition = new Position(position);
        newPosition.setZ(newPosition.getZ() + amount);
        if(isPositionCorrect(newPosition, radius)){
            position = newPosition;
        } else{
            throwException();
        }
        return position;
    }

    public Position moveDown(int amount) throws IllegalPositionException{
        Position newPosition = new Position(position);
        newPosition.setZ(newPosition.getZ() - amount);
        if(isPositionCorrect(newPosition, radius)){
            position = newPosition;
        } else{
            throwException();
        }
        return position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private boolean isPositionCorrect(Position position, int radius){
        return position.getZ() >= 0 && position.magnitude() < radius;
    }

    private boolean isPositionCorrect(int x, int y, int z, int radius){
        Position position = new Position(x, y, z);
        return isPositionCorrect(position, radius);
    }

    private void throwException() throws IllegalPositionException{
        throw new IllegalPositionException("Altitude(z coordinate) cannot be less than 0 OR position magnitude more than radius");
    }
}
