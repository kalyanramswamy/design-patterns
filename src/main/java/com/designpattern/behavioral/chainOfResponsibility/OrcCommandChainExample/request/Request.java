package com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.request;

import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.enums.RequestType;


public class Request {
    private RequestType requestType;
    private boolean handled;

    public Request(RequestType requestType) {
        this.requestType = requestType;
    }

    public RequestType getRequestType() { return requestType; }

    public void markHandled() { this.handled = true; }
    public boolean isHandled(){
        return this.handled;
    }

    @Override
    public String toString() {
        return "requestType=" + requestType;
    }
}
