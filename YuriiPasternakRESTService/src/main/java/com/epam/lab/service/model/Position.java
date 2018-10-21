package com.epam.lab.service.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Position")
@XmlAccessorType(XmlAccessType.FIELD)
public class Position {
    @XmlElement
    private int x;
    @XmlElement
    private int y;
    @XmlElement
    private int z;

    public Position(){}

    public Position(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position(Position position){
        this.x = position.x;
        this.y = position.y;
        this.z = position.z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int magnitude(){
        return (int)Math.ceil(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }
}
