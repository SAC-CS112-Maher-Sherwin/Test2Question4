package test2question4;
import java.util.Scanner;

public class Test2Question4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                         
        System.out.print("Please enter the number of dice you want to roll: ");
        int numberOfDice = input.nextInt();
        int rollResult = Dice.Throw(numberOfDice);
        System.out.println("You rolled " + Dice.Throw(numberOfDice));
        
    // Creation of Truck
        
        Automobile truck = new Automobile();
        truck.setYear(2007);
        truck.setMake("Toyota");
        truck.setModel("Tacoma");
        truck.setColor("White");
        truck.setName("Trucky");
        truck.setGears(3);
        
        truck.setOperatingCycle(rollResult);
        
        System.out.println(truck.About());
        System.out.println("Operating cycle set to " + truck.getOperatingCycle());
        System.out.println("Current gear is " + truck.getCurrentGear());
        System.out.println("Current speed is " + truck.getCurrentSpeed() + "mph");
        System.out.printf("Distance traveled is %.3f", truck.getDistanceTraveled());
        
    // Test the creation of the van
    
        Automobile van = new Automobile();
        van.setYear(2005);
        van.setMake("Ford");
        van.setModel("Aerostar");
        van.setColor("Yellow");
        van.setName("Vany");
        van.setGears(4);
        
        van.setOperatingCycle(rollResult);
        
        System.out.println("");
        System.out.println(van.About());
        System.out.println("Operating cycle set to " + van.getOperatingCycle());
        System.out.println("Current gear is " + van.getCurrentGear());
        System.out.println("Current speed is " + van.getCurrentSpeed() + "mph");
        System.out.printf("Distance traveled is %.3f", van.getDistanceTraveled());
        
        
    // Test the creation of the sports car
    
        Automobile car = new Automobile();
        car.setYear(2016);
        car.setMake("Mazda");
        car.setModel("Miata");
        car.setColor("Red");
        car.setName("Sporty");
        car.setGears(6);
        
        car.setOperatingCycle(rollResult);
        
        System.out.println("");
        System.out.println(car.About());
        System.out.println("Operating cycle set to " + car.getOperatingCycle());
        System.out.println("Current gear is " + car.getCurrentGear());
        System.out.println("Current speed is " + car.getCurrentSpeed() + "mph");
        System.out.printf("Distance traveled is %.3f", car.getDistanceTraveled());

                
    }
    
}
