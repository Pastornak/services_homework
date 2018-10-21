package com.epam.lab.service;

import com.epam.lab.service.model.Copter;
import com.epam.lab.service.model.Position;
import com.epam.lab.service.model.exception.IllegalPositionException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/copterservice/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CopterRemoteControllerService {
    private Copter copter;
    private static final Position DEFAULT_POSITION = new Position(0, 0, 0);
    private static final int DEFAULT_RADIUS = 100;
    private static final int STEP = 15;

    private void init() throws IllegalPositionException{
        copter = new Copter(DEFAULT_POSITION, DEFAULT_RADIUS);
    }

    public CopterRemoteControllerService() throws IllegalPositionException {
        init();
    }

    @GET
    @Path("/position")
    public Position getPosition(){
        return copter.getPosition();
    }

    @GET
    @Path("/defaults/position")
    public Position getDefaultPosition(){
        return DEFAULT_POSITION;
    }

    @GET
    @Path("defaults/radius")
    public int getDefaultRadius(){
        return DEFAULT_RADIUS;
    }

    @GET
    @Path("/defaults/step")
    public int getDefaultStep(){
        return STEP;
    }

    @POST
    @Path("/movement/{direction}/")
    public Position moveInDirection(@PathParam("direction") String direction) throws IllegalPositionException{
        switch(direction){
            case "up":
                copter.moveUp(STEP);
                break;
            case "down":
                copter.moveDown(STEP);
                break;
            case "forward":
                copter.moveForward(STEP);
                break;
            case "backward":
                copter.moveBackward(STEP);
                break;
            case "right":
                copter.moveRight(STEP);
                break;
            case "left":
                copter.moveLeft(STEP);
                break;
        }
        return copter.getPosition();
    }

    @PUT
    @Path("position/reset")
    public Position resetPosition(){
        copter.setPosition(new Position(DEFAULT_POSITION));
        return copter.getPosition();
    }
}
