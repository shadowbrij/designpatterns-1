package com.codewithmosh.state;

public class DirectionService {
    private final TravelState travelState;

    public DirectionService(TravelState travelState) {
        this.travelState = travelState;
    }

    public int getETA(){
        return travelState.getETA();
    }
    public  String getDirection(){
        return travelState.getDirection();
    }
}
