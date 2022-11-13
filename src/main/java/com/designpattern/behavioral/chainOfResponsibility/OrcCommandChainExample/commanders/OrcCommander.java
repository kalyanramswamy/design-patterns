package com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.commanders;

import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.enums.RequestType;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.handler.RequestHandler;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.request.Request;

public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if(req.getRequestType().equals(RequestType.DEFEND_CASTLE)){
            req.markHandled();
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orcs Commander";
    }
}
