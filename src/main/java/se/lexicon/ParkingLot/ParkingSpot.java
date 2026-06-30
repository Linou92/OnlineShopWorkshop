package se.lexicon.ParkingLot;

public class ParkingSpot {

    private int spotNumber;
    private boolean occupied;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void occupySpot(){
        occupied = true;
    }

    public void freeSpot(){
        occupied = false;
    }
}
