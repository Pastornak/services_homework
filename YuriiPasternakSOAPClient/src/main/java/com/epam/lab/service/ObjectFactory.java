
package com.epam.lab.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.lab.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Position_QNAME = new QName("http://service.lab.epam.com/", "Position");
    private final static QName _MoveForward_QNAME = new QName("http://service.lab.epam.com/", "moveForward");
    private final static QName _MoveLeftResponse_QNAME = new QName("http://service.lab.epam.com/", "moveLeftResponse");
    private final static QName _MoveUpResponse_QNAME = new QName("http://service.lab.epam.com/", "moveUpResponse");
    private final static QName _MoveDown_QNAME = new QName("http://service.lab.epam.com/", "moveDown");
    private final static QName _GetDefaultPositionResponse_QNAME = new QName("http://service.lab.epam.com/", "getDefaultPositionResponse");
    private final static QName _GetPositionResponse_QNAME = new QName("http://service.lab.epam.com/", "getPositionResponse");
    private final static QName _MoveBackward_QNAME = new QName("http://service.lab.epam.com/", "moveBackward");
    private final static QName _ResetResponse_QNAME = new QName("http://service.lab.epam.com/", "resetResponse");
    private final static QName _GetDefaultRadiusResponse_QNAME = new QName("http://service.lab.epam.com/", "getDefaultRadiusResponse");
    private final static QName _MoveDownResponse_QNAME = new QName("http://service.lab.epam.com/", "moveDownResponse");
    private final static QName _GetDefaultStepResponse_QNAME = new QName("http://service.lab.epam.com/", "getDefaultStepResponse");
    private final static QName _MoveRightResponse_QNAME = new QName("http://service.lab.epam.com/", "moveRightResponse");
    private final static QName _GetPosition_QNAME = new QName("http://service.lab.epam.com/", "getPosition");
    private final static QName _MoveForwardResponse_QNAME = new QName("http://service.lab.epam.com/", "moveForwardResponse");
    private final static QName _MoveUp_QNAME = new QName("http://service.lab.epam.com/", "moveUp");
    private final static QName _GetDefaultRadius_QNAME = new QName("http://service.lab.epam.com/", "getDefaultRadius");
    private final static QName _GetDefaultStep_QNAME = new QName("http://service.lab.epam.com/", "getDefaultStep");
    private final static QName _IllegalPositionException_QNAME = new QName("http://service.lab.epam.com/", "IllegalPositionException");
    private final static QName _MoveBackwardResponse_QNAME = new QName("http://service.lab.epam.com/", "moveBackwardResponse");
    private final static QName _MoveLeft_QNAME = new QName("http://service.lab.epam.com/", "moveLeft");
    private final static QName _Reset_QNAME = new QName("http://service.lab.epam.com/", "reset");
    private final static QName _GetDefaultPosition_QNAME = new QName("http://service.lab.epam.com/", "getDefaultPosition");
    private final static QName _MoveRight_QNAME = new QName("http://service.lab.epam.com/", "moveRight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.lab.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MoveLeftResponse }
     * 
     */
    public MoveLeftResponse createMoveLeftResponse() {
        return new MoveLeftResponse();
    }

    /**
     * Create an instance of {@link MoveForward }
     * 
     */
    public MoveForward createMoveForward() {
        return new MoveForward();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link MoveBackward }
     * 
     */
    public MoveBackward createMoveBackward() {
        return new MoveBackward();
    }

    /**
     * Create an instance of {@link ResetResponse }
     * 
     */
    public ResetResponse createResetResponse() {
        return new ResetResponse();
    }

    /**
     * Create an instance of {@link GetPositionResponse }
     * 
     */
    public GetPositionResponse createGetPositionResponse() {
        return new GetPositionResponse();
    }

    /**
     * Create an instance of {@link GetDefaultPositionResponse }
     * 
     */
    public GetDefaultPositionResponse createGetDefaultPositionResponse() {
        return new GetDefaultPositionResponse();
    }

    /**
     * Create an instance of {@link MoveDown }
     * 
     */
    public MoveDown createMoveDown() {
        return new MoveDown();
    }

    /**
     * Create an instance of {@link MoveUpResponse }
     * 
     */
    public MoveUpResponse createMoveUpResponse() {
        return new MoveUpResponse();
    }

    /**
     * Create an instance of {@link MoveForwardResponse }
     * 
     */
    public MoveForwardResponse createMoveForwardResponse() {
        return new MoveForwardResponse();
    }

    /**
     * Create an instance of {@link GetPosition }
     * 
     */
    public GetPosition createGetPosition() {
        return new GetPosition();
    }

    /**
     * Create an instance of {@link GetDefaultStepResponse }
     * 
     */
    public GetDefaultStepResponse createGetDefaultStepResponse() {
        return new GetDefaultStepResponse();
    }

    /**
     * Create an instance of {@link MoveRightResponse }
     * 
     */
    public MoveRightResponse createMoveRightResponse() {
        return new MoveRightResponse();
    }

    /**
     * Create an instance of {@link MoveDownResponse }
     * 
     */
    public MoveDownResponse createMoveDownResponse() {
        return new MoveDownResponse();
    }

    /**
     * Create an instance of {@link GetDefaultRadiusResponse }
     * 
     */
    public GetDefaultRadiusResponse createGetDefaultRadiusResponse() {
        return new GetDefaultRadiusResponse();
    }

    /**
     * Create an instance of {@link GetDefaultPosition }
     * 
     */
    public GetDefaultPosition createGetDefaultPosition() {
        return new GetDefaultPosition();
    }

    /**
     * Create an instance of {@link MoveRight }
     * 
     */
    public MoveRight createMoveRight() {
        return new MoveRight();
    }

    /**
     * Create an instance of {@link Reset }
     * 
     */
    public Reset createReset() {
        return new Reset();
    }

    /**
     * Create an instance of {@link MoveBackwardResponse }
     * 
     */
    public MoveBackwardResponse createMoveBackwardResponse() {
        return new MoveBackwardResponse();
    }

    /**
     * Create an instance of {@link MoveLeft }
     * 
     */
    public MoveLeft createMoveLeft() {
        return new MoveLeft();
    }

    /**
     * Create an instance of {@link SeviceFault }
     * 
     */
    public SeviceFault createSeviceFault() {
        return new SeviceFault();
    }

    /**
     * Create an instance of {@link GetDefaultStep }
     * 
     */
    public GetDefaultStep createGetDefaultStep() {
        return new GetDefaultStep();
    }

    /**
     * Create an instance of {@link GetDefaultRadius }
     * 
     */
    public GetDefaultRadius createGetDefaultRadius() {
        return new GetDefaultRadius();
    }

    /**
     * Create an instance of {@link MoveUp }
     * 
     */
    public MoveUp createMoveUp() {
        return new MoveUp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Position }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "Position")
    public JAXBElement<Position> createPosition(Position value) {
        return new JAXBElement<Position>(_Position_QNAME, Position.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveForward }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveForward")
    public JAXBElement<MoveForward> createMoveForward(MoveForward value) {
        return new JAXBElement<MoveForward>(_MoveForward_QNAME, MoveForward.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveLeftResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveLeftResponse")
    public JAXBElement<MoveLeftResponse> createMoveLeftResponse(MoveLeftResponse value) {
        return new JAXBElement<MoveLeftResponse>(_MoveLeftResponse_QNAME, MoveLeftResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveUpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveUpResponse")
    public JAXBElement<MoveUpResponse> createMoveUpResponse(MoveUpResponse value) {
        return new JAXBElement<MoveUpResponse>(_MoveUpResponse_QNAME, MoveUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveDown }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveDown")
    public JAXBElement<MoveDown> createMoveDown(MoveDown value) {
        return new JAXBElement<MoveDown>(_MoveDown_QNAME, MoveDown.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getDefaultPositionResponse")
    public JAXBElement<GetDefaultPositionResponse> createGetDefaultPositionResponse(GetDefaultPositionResponse value) {
        return new JAXBElement<GetDefaultPositionResponse>(_GetDefaultPositionResponse_QNAME, GetDefaultPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getPositionResponse")
    public JAXBElement<GetPositionResponse> createGetPositionResponse(GetPositionResponse value) {
        return new JAXBElement<GetPositionResponse>(_GetPositionResponse_QNAME, GetPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBackward }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveBackward")
    public JAXBElement<MoveBackward> createMoveBackward(MoveBackward value) {
        return new JAXBElement<MoveBackward>(_MoveBackward_QNAME, MoveBackward.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "resetResponse")
    public JAXBElement<ResetResponse> createResetResponse(ResetResponse value) {
        return new JAXBElement<ResetResponse>(_ResetResponse_QNAME, ResetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultRadiusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getDefaultRadiusResponse")
    public JAXBElement<GetDefaultRadiusResponse> createGetDefaultRadiusResponse(GetDefaultRadiusResponse value) {
        return new JAXBElement<GetDefaultRadiusResponse>(_GetDefaultRadiusResponse_QNAME, GetDefaultRadiusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveDownResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveDownResponse")
    public JAXBElement<MoveDownResponse> createMoveDownResponse(MoveDownResponse value) {
        return new JAXBElement<MoveDownResponse>(_MoveDownResponse_QNAME, MoveDownResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultStepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getDefaultStepResponse")
    public JAXBElement<GetDefaultStepResponse> createGetDefaultStepResponse(GetDefaultStepResponse value) {
        return new JAXBElement<GetDefaultStepResponse>(_GetDefaultStepResponse_QNAME, GetDefaultStepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveRightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveRightResponse")
    public JAXBElement<MoveRightResponse> createMoveRightResponse(MoveRightResponse value) {
        return new JAXBElement<MoveRightResponse>(_MoveRightResponse_QNAME, MoveRightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getPosition")
    public JAXBElement<GetPosition> createGetPosition(GetPosition value) {
        return new JAXBElement<GetPosition>(_GetPosition_QNAME, GetPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveForwardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveForwardResponse")
    public JAXBElement<MoveForwardResponse> createMoveForwardResponse(MoveForwardResponse value) {
        return new JAXBElement<MoveForwardResponse>(_MoveForwardResponse_QNAME, MoveForwardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveUp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveUp")
    public JAXBElement<MoveUp> createMoveUp(MoveUp value) {
        return new JAXBElement<MoveUp>(_MoveUp_QNAME, MoveUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultRadius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getDefaultRadius")
    public JAXBElement<GetDefaultRadius> createGetDefaultRadius(GetDefaultRadius value) {
        return new JAXBElement<GetDefaultRadius>(_GetDefaultRadius_QNAME, GetDefaultRadius.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getDefaultStep")
    public JAXBElement<GetDefaultStep> createGetDefaultStep(GetDefaultStep value) {
        return new JAXBElement<GetDefaultStep>(_GetDefaultStep_QNAME, GetDefaultStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeviceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "IllegalPositionException")
    public JAXBElement<SeviceFault> createIllegalPositionException(SeviceFault value) {
        return new JAXBElement<SeviceFault>(_IllegalPositionException_QNAME, SeviceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBackwardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveBackwardResponse")
    public JAXBElement<MoveBackwardResponse> createMoveBackwardResponse(MoveBackwardResponse value) {
        return new JAXBElement<MoveBackwardResponse>(_MoveBackwardResponse_QNAME, MoveBackwardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveLeft }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveLeft")
    public JAXBElement<MoveLeft> createMoveLeft(MoveLeft value) {
        return new JAXBElement<MoveLeft>(_MoveLeft_QNAME, MoveLeft.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "reset")
    public JAXBElement<Reset> createReset(Reset value) {
        return new JAXBElement<Reset>(_Reset_QNAME, Reset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "getDefaultPosition")
    public JAXBElement<GetDefaultPosition> createGetDefaultPosition(GetDefaultPosition value) {
        return new JAXBElement<GetDefaultPosition>(_GetDefaultPosition_QNAME, GetDefaultPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveRight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lab.epam.com/", name = "moveRight")
    public JAXBElement<MoveRight> createMoveRight(MoveRight value) {
        return new JAXBElement<MoveRight>(_MoveRight_QNAME, MoveRight.class, null, value);
    }

}
