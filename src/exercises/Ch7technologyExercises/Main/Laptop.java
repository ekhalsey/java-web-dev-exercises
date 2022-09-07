package exercises.Ch7technologyExercises.Main;

import exercises.Ch7technologyExercises.Main.Computer;

public class Laptop extends Computer {
    private int numberOfPorts;
    private double screenSizeIn;
    private boolean has10Key;

    public Laptop(String aCompany, String aModel, int aGigsOfRam, int aGigsOfMemory, int aNumberOfPorts, double aScreenSizeIn, boolean aHas10Key) {
        super(aCompany, aModel, aGigsOfRam, aGigsOfMemory);
        this.numberOfPorts = aNumberOfPorts;
        this.screenSizeIn = aScreenSizeIn;
        this.has10Key = aHas10Key;

    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public double getScreenSizeIn() {
        return screenSizeIn;
    }

    public void setScreenSizeIn(double screenSizeIn) {
        this.screenSizeIn = screenSizeIn;
    }

    public boolean isHas10Key() {
        return has10Key;
    }

    public void setHas10Key(boolean has10Key) {
        this.has10Key = has10Key;
    }
}
