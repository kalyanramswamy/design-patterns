package com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample;

import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.commanders.OrcKing;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.enums.RequestType;
import com.designpattern.behavioral.chainOfResponsibility.OrcCommandChainExample.request.Request;

public class Client {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();

        king.makeRequest(new Request(RequestType.DEFEND_CASTLE));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER));
        king.makeRequest(new Request(RequestType.COLLECT_TAX));
    }
}
