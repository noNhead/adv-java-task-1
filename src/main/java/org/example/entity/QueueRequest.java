package org.example.entity;

import java.util.Queue;

public class QueueRequest {
    private String nameOfQueue;
    private Queue<HotelRequest> hotelRequests;

    public QueueRequest(String nameOfQueue, Queue<HotelRequest> hotelRequests) {
        this.nameOfQueue = nameOfQueue;
        this.hotelRequests = hotelRequests;
    }

    public String getNameOfQueue() {
        return nameOfQueue;
    }

    public void setNameOfQueue(String nameOfQueue) {
        this.nameOfQueue = nameOfQueue;
    }

    public Queue<HotelRequest> getHotelRequest() {
        return hotelRequests;
    }

    public void setHotelRequest(Queue<HotelRequest> hotelRequest) {
        this.hotelRequests = hotelRequest;
    }
}
