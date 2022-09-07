package exercises.Ch7technologyExercises.Main;

public class Computer extends AbstractEntity {
    private String company;
    private String model;
    private int gigsOfRam;
    private int gigsOfMemory;

    public Computer(String aCompany, String aModel, int aGigsOfRam, int aGigsOfMemory) {
        super();
        company = aCompany;
        model = aModel;
        gigsOfRam = aGigsOfRam;
        gigsOfMemory = aGigsOfMemory;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGigsOfRam() {
        return gigsOfRam;
    }

    public void setGigsOfRam(int gigsOfRam) {
        this.gigsOfRam = gigsOfRam;
    }

    public int getGigsOfMemory() {
        return gigsOfMemory;
    }

    public void setGigsOfMemory(int gigsOfMemory) {
        this.gigsOfMemory = gigsOfMemory;
    }
}
