package com.codewithmosh.state;

public class CarTravelState implements TravelState {
    @Override
    public int getETA() {
        return 0;
    }

    @Override
    public String getDirection() {
        return "North";
    }
}
