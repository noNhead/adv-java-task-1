package org.example.thread_builder;

import org.example.entity.HotelRequest;
import org.example.entity.QueueRequest;

import java.util.LinkedList;
public class HotelRequestOperation {
    public static final int NUMBER_OF_LENGTH_RANDOM_STRING = 7;
    public static final int THREAD_TIME_TO_SLEEP = 500;
    private final QueueRequest queueRequest = new QueueRequest("Thread test", new LinkedList<>());

    public synchronized void put() {
        HotelRequest hr = new HotelRequest();
        hr.setRandomValue(NUMBER_OF_LENGTH_RANDOM_STRING);
        queueRequest.getHotelRequest().add(hr);
        System.out.println("New entry added: " + hr.getAd()
                + " | " + hr.getHotelName()
                + " | " + hr.getRequiredHotelDate());
        notifyAll();
    }

    public synchronized void deleteRecord() throws InterruptedException {
        HotelRequest hr = queueRequest.getHotelRequest().poll();
        while (hr != null) {
            wait(THREAD_TIME_TO_SLEEP);
        }
        System.out.println("The entry has been deleted: " + hr.toString());
        notifyAll();
    }

    public QueueRequest getQueueRequest() {
        return this.queueRequest;
    }
}
