package dojo2;

import java.util.*;

public class Auto
{
    private String color = "red";
    private static int numWheels = 4;
    private String id;
    private enum FuelType {GASOLINE, DIESEL, ELECTRIC}
    private FuelType fuelType = FuelType.DIESEL;
    private int runKms = 100;

    public Auto() {}

    public Auto(String color, FuelType fuelType, int runKms, String id)
    {
        this.color = color;
        this.fuelType = fuelType;
        this.runKms = runKms;
        this.id = id;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public static int getNumWheels() {return numWheels;}
    public static void setNumWheels(int numWheels) {Auto.numWheels = numWheels;}
    public FuelType getFuelType() {return fuelType;}
    public void setFuelType(FuelType fuelType) {this.fuelType = fuelType;}
    public int getRunKms() {return runKms;}
    public void setRunKms(int runKms) {this.runKms = runKms;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    @Override
    public String toString() {return color + "\t" + fuelType.toString() + "\t" + runKms;}

    @Override
    public int hashCode() {return -1;}

    @Override
    public boolean equals(Object obj)
    {
        Auto auto = (Auto)obj;
        return auto.getId().equals(id);
    }

    public static void main(String [] args) {
        Auto auto1 = new Auto("red", FuelType.DIESEL, 1000, "ABC321");
        Auto auto2 = new Auto("red", FuelType.GASOLINE, 1200, "ABC321");
        Auto auto3 = new Auto("red", FuelType.ELECTRIC, 500, "ABC321");

        List<Auto> autok = new ArrayList<Auto>();
        autok.add(auto1);
        autok.add(auto2);
        autok.add(auto3);
        System.out.println(autok.indexOf(auto2));

//        Map<Auto, String> autok = new HashMap<Auto, String>();
//        autok.put(auto1, "verda1");
//        autok.put(auto2, "verda2");
//        autok.put(auto3, "verda3");
//
//        System.out.println(autok.size());
//        System.out.println(autok.get(auto2));
    }
}