package org.launchcode.java.CDDVDStudio;

import java.util.ArrayList;

public class DVD extends Disc implements OpticalDisc {
    public DVD(String name, int capacity, ArrayList<String> content, String discType) {
        super(name, capacity, content, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("a DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData(String data) {
        getContent().add(data);
    }

    @Override
    public void coverArt() {
        System.out.println("Cover art: a picture of a dog");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
