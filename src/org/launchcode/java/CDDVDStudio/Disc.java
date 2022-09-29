package org.launchcode.java.CDDVDStudio;

import java.util.ArrayList;

public abstract class Disc {

        private String name;
        private  int capacity;
        private ArrayList<String> content = new ArrayList<>();
        private String discType;
        public Disc(String name, int capacity, ArrayList<String> content, String discType) {
            this.name = name;
            this.capacity = capacity;
            this.content = content;
            this.discType = discType;
        }
        public void writeDataWithLaser(String data){
            this.content.add(data);
        }
        public void readDataWithLaser(){
            for (String line: content){
                System.out.println(line);
            }
        }
        public void reportInformation(){
            System.out.println(getName() + "\n" + getDiscType() +"\n" + getCapacity());
            readDataWithLaser();
        }
        public String getName() {
            return name;
        }
        public int getCapacity() {
            return capacity;
        }
        public ArrayList<String> getContent() {
            return content;
        }
        public String getDiscType() {
            return discType;
        }
}
