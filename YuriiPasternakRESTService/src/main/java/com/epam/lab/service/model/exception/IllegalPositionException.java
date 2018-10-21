package com.epam.lab.service.model.exception;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "WebFault")
public class IllegalPositionException extends Exception {

    private SeviceFault faultBean;

    public IllegalPositionException(){
        super();
    }

    public IllegalPositionException(String message){
        super(message);
    }

    public IllegalPositionException(String message, SeviceFault faultBean, Throwable cause) {
        super(message, cause);
        this.faultBean = faultBean;
    }

    public IllegalPositionException(String message, SeviceFault faultBean) {
        super(message);
        this.faultBean = faultBean;
    }

    public SeviceFault getFaultInfo() {
        return faultBean;
    }
}
