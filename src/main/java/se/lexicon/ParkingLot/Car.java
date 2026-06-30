package se.lexicon.ParkingLot;

public class Car {

    private String regNumber;

    public Car(String regNumber) {
        if(regNumber == null || regNumber.isBlank()) {
            throw new IllegalArgumentException("Registration number cannot be blank");
        }
        this.regNumber = regNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
