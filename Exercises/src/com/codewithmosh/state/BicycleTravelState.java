package com.codewithmosh.state;

public class BicycleTravelState implements TravelState {

    @Override
    public int getETA() {
        return 0;
    }

    @Override
    public String getDirection() {
        return "EAST";
    }
}
