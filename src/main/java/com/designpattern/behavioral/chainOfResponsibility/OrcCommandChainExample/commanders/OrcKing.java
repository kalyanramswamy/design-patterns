package com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.commanders;

import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.handler.RequestHandler;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.request.Request;

public class OrcKing {
    private RequestHandler chain;

    public OrcKing() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }
}
