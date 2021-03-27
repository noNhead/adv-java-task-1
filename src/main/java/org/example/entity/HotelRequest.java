package org.example.entity;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Random;

public class HotelRequest {
    private String ad;
    private LocalDate requiredHotelDate;
    private String hotelName;

    public HotelRequest(String ad, LocalDate requiredHotelDate, String hotelName) {
        this.ad = ad;
        this.requiredHotelDate = requiredHotelDate;
        this.hotelName = hotelName;
    }

    public HotelRequest() {
    }

    public void setRandomValue(int length) {
        //byte[] array = new byte[length];
        //new Random().nextBytes(array);
        //this.ad = new String(array, StandardCharsets.UTF_8);
        //this.requiredHotelDate = LocalDate.now();
        //new Random().nextBytes(array);
        //this.hotelName = new String(array, StandardCharsets.UTF_8);
        this.ad = "Advisor";
        this.requiredHotelDate = LocalDate.now();
        this.hotelName = "Hotel Name";
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public LocalDate getRequiredHotelDate() {
        return requiredHotelDate;
    }

    public void setRequiredHotelDate(LocalDate requiredHotelDate) {
        this.requiredHotelDate = requiredHotelDate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
