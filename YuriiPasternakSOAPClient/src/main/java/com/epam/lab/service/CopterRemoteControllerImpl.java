
package com.epam.lab.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CopterRemoteControllerImpl", targetNamespace = "http://service.lab.epam.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CopterRemoteControllerImpl {


    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     * @throws IllegalPositionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reset", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.Reset")
    @ResponseWrapper(localName = "resetResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.ResetResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/resetRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/resetResponse", fault = {
        @FaultAction(className = IllegalPositionException.class, value = "http://service.lab.epam.com/CopterRemoteControllerImpl/reset/Fault/IllegalPositionException")
    })
    public Position reset()
        throws IllegalPositionException
    ;

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPosition", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetPosition")
    @ResponseWrapper(localName = "getPositionResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetPositionResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/getPositionRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/getPositionResponse")
    public Position getPosition();

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     * @throws IllegalPositionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moveUp", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveUp")
    @ResponseWrapper(localName = "moveUpResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveUpResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveUpRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveUpResponse", fault = {
        @FaultAction(className = IllegalPositionException.class, value = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveUp/Fault/IllegalPositionException")
    })
    public Position moveUp()
        throws IllegalPositionException
    ;

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     * @throws IllegalPositionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moveDown", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveDown")
    @ResponseWrapper(localName = "moveDownResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveDownResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveDownRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveDownResponse", fault = {
        @FaultAction(className = IllegalPositionException.class, value = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveDown/Fault/IllegalPositionException")
    })
    public Position moveDown()
        throws IllegalPositionException
    ;

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDefaultPosition", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetDefaultPosition")
    @ResponseWrapper(localName = "getDefaultPositionResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetDefaultPositionResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/getDefaultPositionRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/getDefaultPositionResponse")
    public Position getDefaultPosition();

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     * @throws IllegalPositionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moveForward", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveForward")
    @ResponseWrapper(localName = "moveForwardResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveForwardResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveForwardRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveForwardResponse", fault = {
        @FaultAction(className = IllegalPositionException.class, value = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveForward/Fault/IllegalPositionException")
    })
    public Position moveForward()
        throws IllegalPositionException
    ;

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     * @throws IllegalPositionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moveBackward", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveBackward")
    @ResponseWrapper(localName = "moveBackwardResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveBackwardResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveBackwardRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveBackwardResponse", fault = {
        @FaultAction(className = IllegalPositionException.class, value = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveBackward/Fault/IllegalPositionException")
    })
    public Position moveBackward()
        throws IllegalPositionException
    ;

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     * @throws IllegalPositionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moveRight", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveRight")
    @ResponseWrapper(localName = "moveRightResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveRightResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveRightRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveRightResponse", fault = {
        @FaultAction(className = IllegalPositionException.class, value = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveRight/Fault/IllegalPositionException")
    })
    public Position moveRight()
        throws IllegalPositionException
    ;

    /**
     * 
     * @return
     *     returns com.epam.lab.service.Position
     * @throws IllegalPositionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moveLeft", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveLeft")
    @ResponseWrapper(localName = "moveLeftResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.MoveLeftResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveLeftRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveLeftResponse", fault = {
        @FaultAction(className = IllegalPositionException.class, value = "http://service.lab.epam.com/CopterRemoteControllerImpl/moveLeft/Fault/IllegalPositionException")
    })
    public Position moveLeft()
        throws IllegalPositionException
    ;

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDefaultRadius", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetDefaultRadius")
    @ResponseWrapper(localName = "getDefaultRadiusResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetDefaultRadiusResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/getDefaultRadiusRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/getDefaultRadiusResponse")
    public int getDefaultRadius();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDefaultStep", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetDefaultStep")
    @ResponseWrapper(localName = "getDefaultStepResponse", targetNamespace = "http://service.lab.epam.com/", className = "com.epam.lab.service.GetDefaultStepResponse")
    @Action(input = "http://service.lab.epam.com/CopterRemoteControllerImpl/getDefaultStepRequest", output = "http://service.lab.epam.com/CopterRemoteControllerImpl/getDefaultStepResponse")
    public int getDefaultStep();

}
