package org.example.thread_builder;

public class RecordPut implements Runnable {
    private final HotelRequestOperation hotelRequestOperation;
    private boolean isActive;


    RecordPut(HotelRequestOperation hotelRequestOperation){
        this.hotelRequestOperation = hotelRequestOperation;
        this.isActive = true;
    }

    public void disable() {
        this.isActive = false;
    }

    @Override
    public void run() {
        try {
            hotelRequestOperation.put();
        } finally {
            System.out.println("Thread dead");
            Thread.currentThread().interrupt();
        }
    }
}
