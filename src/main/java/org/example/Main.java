package org.example;

import org.example.thread_builder.ThreadQueue;

public class Main{
    public static void main(String[] args) {
        ThreadQueue threadQueue = new ThreadQueue();
        threadQueue.threadBuilder();
    }
}
