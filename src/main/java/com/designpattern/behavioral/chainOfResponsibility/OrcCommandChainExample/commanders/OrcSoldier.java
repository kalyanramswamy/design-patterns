package com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.commanders;

import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.enums.RequestType;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.handler.RequestHandler;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.request.Request;

public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if(req.getRequestType().equals(RequestType.COLLECT_TAX)) {
            req.markHandled();
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orcs Soldier";
    }
}
