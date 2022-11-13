package com.designpattern.structural.facade.goldMineExample.facade;

import com.designpattern.structural.facade.goldMineExample.subsystems.GoldDigger;
import com.designpattern.structural.facade.goldMineExample.subsystems.MineWorker;
import com.designpattern.structural.facade.goldMineExample.subsystems.TunnelDigger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GoldmineFacade {
    private final List<MineWorker> workers = new ArrayList<>();

    public GoldmineFacade() {
        workers.add(new GoldDigger());
        workers.add(new TunnelDigger());
    }

    public void startNewDay() {
        makeActions(workers, MineWorker.Action.WAKE_UP, MineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, MineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, MineWorker.Action.GO_HOME, MineWorker.Action.GO_TO_SLEEP);
    }

    private static void makeActions(Collection<MineWorker> workers, MineWorker.Action... actions) {
        workers.forEach(worker -> worker.action(actions));
    }
}
