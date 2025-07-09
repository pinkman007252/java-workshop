package com.vetias.java.workshop.basics.tem.bin;

public class sensor {
    private double SenID;
    private String Name;
    private double Temdate;

    public void setSenID(double senID) {
        SenID = senID;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setTemdate(double temdate) {
        Temdate = temdate;
    }
    public double getSenID() {
        return SenID;
    }
    public String getName() {
        return Name;
    }
    public double getTemdate() {
        return Temdate;
    }

    public static void main(String [] args){
        // You can create and use sensor objects here
    }
}

