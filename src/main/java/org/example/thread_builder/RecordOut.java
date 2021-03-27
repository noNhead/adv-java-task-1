package org.example.thread_builder;

public class RecordOut implements Runnable {
    private final HotelRequestOperation hotelRequestOperation;

    RecordOut(HotelRequestOperation hotelRequestOperation){
        this.hotelRequestOperation = hotelRequestOperation;
    }

    @Override
    public void run() {
        try {
            //hotelRequestOperation.deleteRecord();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread is sleep on a 100 millis");
            Thread.currentThread().interrupt();
        }
    }
}
