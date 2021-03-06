package org.example.thread_builder;

public class RecordOut implements Runnable {
    private final HotelRequestOperation hotelRequestOperation;
    private boolean isActive;

    RecordOut(HotelRequestOperation hotelRequestOperation){
        this.hotelRequestOperation = hotelRequestOperation;
        this.isActive = true;
    }

    public void disable(){
        isActive = false;
    }

    @Override
    public void run() {
        try {
            //hotelRequestOperation.deleteRecord();
            Thread.sleep(100);
            System.out.println("Thread is sleep on a 100 millis");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.currentThread().interrupt();
        }
    }
}
