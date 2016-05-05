package test2question4;

public class Automobile {
    private int year = 2015;
    private String make = "";
    private String model = "";
    private String color = "black";
    private String name = "";
    private int gears = 6;
    private int opcycle;
    private int currentgear;
    private int currentspeed;
    private double distance;
    
    public void setYear(int y){
        year = y;
    }
    
    public void setMake (String ma){
        make = ma;
    }
    
    public void setGears(int g){
        gears = g;
    }
    
    public void setModel (String mo){
        model = mo;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setOperatingCycle (int op){
        opcycle = op;
    }
    
    public int getOperatingCycle() {
        return opcycle;
    }
    
    public int getCurrentGear (){
        if (opcycle > gears)
            currentgear = gears;
        else
            currentgear = opcycle;
        
        return currentgear;
    }
    
    public int getCurrentSpeed (){
        currentspeed = currentgear*10;
        return currentspeed;
    }
    
    public double getDistanceTraveled (){
        int i = 0;
        while (i < opcycle) {
            distance = distance + (((double)currentspeed)/60);
            i++;
        }
        return distance;
    }
    
    public String About(){
        String about = ("\nName = " + name);
        about = about + ("\nYear = " + year);
        about = about + ("\nMake = " + make);
        about = about + ("\nModel = " + model);
        about = about + ("\nTransmission = " + gears + " gears");
        about = about + ("\nColor = " + color + "\n");
        return about;
    }  
    
    public void Status(int newOpCycle, int x, int y, double z){
        System.out.printf("Operating cycle set to %d."
                + "\nCurrent gear is %d"
                + "\nCurrent speed is %d mph"
                + "\nDistance traveled is %.2f miles", newOpCycle,currentgear, currentspeed, distance);
    }
}
