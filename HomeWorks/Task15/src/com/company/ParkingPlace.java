package com.company;

class ParkingPlace {
    private int parkingCount;
    private int fine;

    public  ParkingPlace(int parkingCount, int fine) {
        if (parkingCount >=0 && parkingCount <= 200){
            this.parkingCount = parkingCount;
        }
        if (fine > 0){
            this.fine = fine;
        }
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public int getFine() {
        return fine;
    }

    public void addTransport(int Transport){
        if (Transport > 0){
            this.parkingCount = this.parkingCount + Transport;
        }
    }
    public void addFine(int money){
        if(money > 0){
            this.fine = this.fine + money;
        }
    }

}
