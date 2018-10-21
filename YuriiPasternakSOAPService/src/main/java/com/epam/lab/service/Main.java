package com.epam.lab.service;

import com.epam.lab.service.model.exception.IllegalPositionException;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) throws IllegalPositionException
    {
        Endpoint.publish("http://localhost:9901/copterService", new CopterRemoteControllerImpl());
    }
}
