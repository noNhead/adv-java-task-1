package org.example.thread_builder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadQueue {
    private static final int MAX_THREAD_IN_PULL = 5;
    public static final int NUMBER_OF_THREAD_REQUEST_REQUESTER = 9;
    public static final int NUMBER_OF_THREAD_REQUEST_OPERATION = 9;

    public void threadBuilder() {
        HotelRequestOperation hotelRequestOperation = new HotelRequestOperation();
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREAD_IN_PULL);
        RecordOut recordOut = new RecordOut(hotelRequestOperation);
        RecordPut recordPut = new RecordPut(hotelRequestOperation);

        for (int i = 0; i < NUMBER_OF_THREAD_REQUEST_REQUESTER; i++) {
            executor.submit(recordPut);
        }

        for (int i = 0; i < NUMBER_OF_THREAD_REQUEST_OPERATION; i++) {
            executor.submit(recordOut);
        }
    }
}
