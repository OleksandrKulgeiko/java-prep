package com.kulgeiko.designpatterns.c_behavioral.strategy;

import lombok.Setter;

@Setter
public class StrategyContext {

    private ArchivingStrategy arcStrat;

    public StrategyContext(ArchivingStrategy arcStrat){
        this.arcStrat = arcStrat;
    }

    public void archive(String path) {
        arcStrat.archive(path);
    }
}