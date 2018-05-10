package com.example.demo;

import java.io.File;

import org.springframework.messaging.Message;

public class DataImporter {

    public Message<File> handleFileImport(Message<File> message) {
        final File file = message.getPayload();
        System.out.println("START Processing file " + file);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ENDED Processing file " + file);
        return message;
    }

}
