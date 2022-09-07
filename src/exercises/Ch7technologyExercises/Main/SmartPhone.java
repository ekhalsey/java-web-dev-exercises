package exercises.Ch7technologyExercises.Main;

public class SmartPhone extends Computer {
    private int gigsPerMonth;
    private int hoursBatteryLife;

    public SmartPhone(String aCompany, String aModel, int aGigsOfRam, int aGigsOfMemory, int aGigsPerMonth, int aHoursBatteryLife) {
        super(aCompany, aModel, aGigsOfRam, aGigsOfMemory);
        this.gigsPerMonth = aGigsPerMonth;
        this.hoursBatteryLife = aHoursBatteryLife;
    }

    public int getGigsPerMonth() {
        return gigsPerMonth;
    }

    public void setGigsPerMonth(int gigsPerMonth) {
        this.gigsPerMonth = gigsPerMonth;
    }

    public int getHoursBatteryLife() {
        return hoursBatteryLife;
    }

    public void setHoursBatteryLife(int hoursBatteryLife) {
        this.hoursBatteryLife = hoursBatteryLife;
    }
}
