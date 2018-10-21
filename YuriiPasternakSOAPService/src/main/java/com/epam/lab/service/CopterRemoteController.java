package com.epam.lab.service;

import com.epam.lab.service.model.exception.IllegalPositionException;
import com.epam.lab.service.model.Position;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CopterRemoteController {

    @WebMethod
    Position moveForward() throws IllegalPositionException;

    @WebMethod
    Position moveBackward() throws IllegalPositionException;

    @WebMethod
    Position moveRight() throws IllegalPositionException;

    @WebMethod
    Position moveLeft() throws IllegalPositionException;

    @WebMethod
    Position moveUp() throws IllegalPositionException;

    @WebMethod
    Position moveDown() throws IllegalPositionException;

    @WebMethod
    Position reset() throws IllegalPositionException;

    @WebMethod
    Position getPosition();
}
