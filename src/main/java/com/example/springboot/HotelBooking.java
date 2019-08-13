package com.example.springboot;

public class HotelBooking {

    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights){
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getTotalPrice(){
        return pricePerNight * nbOfNights;
    }
}
