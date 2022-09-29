package org.launchcode.java.CDDVDStudio;

import java.util.ArrayList;

public class Main {
    public static void main (String args[]) {
        CD myCD = new CD("Breakaway", 12, new ArrayList<>(), "CD");
        myCD.coverArt();
        myCD.spinDisc();
        myCD.storeData("Because of You");
        myCD.storeData("Addicted");
        myCD.reportInformation();
        DVD myDVD = new DVD("the Pacifier", 1, new ArrayList<>(), "DVD");
        
    }
}
