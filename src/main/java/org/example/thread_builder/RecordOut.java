package org.example.thread_builder;

public class RecordOut implements Runnable {
    public static final int TIME_TO_THREAD_WAIT = 500;
    private final HotelRequestOperation hotelRequestOperation;

    RecordOut(HotelRequestOperation hotelRequestOperation){
        this.hotelRequestOperation = hotelRequestOperation;
    }

    @Override
    public void run() {
        try {
            hotelRequestOperation.deleteRecord();
            wait(TIME_TO_THREAD_WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread is sleep on a 100 millis");
            Thread.currentThread().interrupt();
        }
    }
}
