package org.example.thread_builder;

public class RecordPut implements Runnable {
    private final HotelRequestOperation hotelRequestOperation;

    RecordPut(HotelRequestOperation hotelRequestOperation) {
        this.hotelRequestOperation = hotelRequestOperation;
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
