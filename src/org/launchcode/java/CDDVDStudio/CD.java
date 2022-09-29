package org.launchcode.java.CDDVDStudio;

import java.util.ArrayList;

public class CD extends Disc implements OpticalDisc {
    public CD(String name, int capacity, ArrayList<String> content, String discType) {
        super(name, capacity, content, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("a CD spins at a rate of 200-500 rpm.");
    }

    @Override
    public void storeData(String data) {
        getContent().add(data);
    }

    @Override
    public void coverArt() {
        System.out.println("sharpie track list scribbles");
    }


    // TODO: Implement your custom interface.

        // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
        //  need to be declared separately.

}
