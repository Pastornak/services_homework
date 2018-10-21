package com.epam.lab.service;

import com.epam.lab.service.model.Copter;
import com.epam.lab.service.model.exception.IllegalPositionException;
import com.epam.lab.service.model.Position;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CopterRemoteControllerImpl implements CopterRemoteController {
    private Copter copter;
    private static final Position DEFAULT_POSITION = new Position(0, 0, 0);
    private static final int DEFAULT_RADIUS = 100;
    private static final int STEP = 15;

    public CopterRemoteControllerImpl() throws IllegalPositionException {
        copter = new Copter(DEFAULT_POSITION, DEFAULT_RADIUS);
    }

    @WebMethod
    public Position moveForward() throws IllegalPositionException{
        return copter.moveForward(STEP);
    }

    @WebMethod
    public Position moveBackward() throws IllegalPositionException{
        return copter.moveBackward(STEP);
    }

    @WebMethod
    public Position moveRight() throws IllegalPositionException{
        return copter.moveRight(STEP);
    }

    @WebMethod
    public Position moveLeft() throws IllegalPositionException{
        return copter.moveLeft(STEP);
    }

    @WebMethod
    public Position moveUp() throws IllegalPositionException{
        return copter.moveUp(STEP);
    }

    @WebMethod
    public Position moveDown() throws IllegalPositionException{
        return copter.moveDown(STEP);
    }

    @WebMethod
    public Position reset() throws IllegalPositionException{
        copter = new Copter(DEFAULT_POSITION, DEFAULT_RADIUS);
        return copter.getPosition();
    }

    @WebMethod
    public Position getPosition(){
        return copter.getPosition();
    }

    @WebMethod
    public Position getDefaultPosition(){
        return DEFAULT_POSITION;
    }

    @WebMethod
    public int getDefaultRadius(){
        return DEFAULT_RADIUS;
    }

    @WebMethod
    public int getDefaultStep(){
        return STEP;
    }
}
