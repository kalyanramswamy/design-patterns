package com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.commanders;

import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.enums.RequestType;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.handler.RequestHandler;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.request.Request;

public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler handler){
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if(req.getRequestType().equals(RequestType.TORTURE_PRISONER)){
            req.markHandled();
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orcs Officer";
    }
}
