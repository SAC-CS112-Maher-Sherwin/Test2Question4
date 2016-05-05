package test2question4;
import java.util.Scanner;

public class Test2Question4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                         
        System.out.print("Please enter the number of dice you want to roll: ");
        int numberOfDice = input.nextInt();
        int newOpCycle = Dice.Throw(numberOfDice);
        System.out.println("You rolled a total of " + newOpCycle);
        
    // Creation of Truck
        
        Automobile truck = new Automobile();
        truck.setYear(2007);
        truck.setMake("Toyota");
        truck.setModel("Tacoma");
        truck.setColor("White");
        truck.setName("Trucky");
        truck.setGears(3);
        
        truck.setOperatingCycle(newOpCycle);
        
        System.out.println(truck.About());
        truck.Status(newOpCycle, truck.getCurrentGear(), truck.getCurrentSpeed(), truck.getDistanceTraveled());
        
    // Test the creation of the van
    
        Automobile van = new Automobile();
        van.setYear(2005);
        van.setMake("Ford");
        van.setModel("Aerostar");
        van.setColor("Yellow");
        van.setName("Vany");
        van.setGears(4);
        
        van.setOperatingCycle(newOpCycle);
        
        System.out.println("");
        System.out.println(van.About());
        van.Status(newOpCycle, van.getCurrentGear(), van.getCurrentSpeed(), van.getDistanceTraveled());
        
        
    // Test the creation of the sports car
    
        Automobile car = new Automobile();
        car.setYear(2016);
        car.setMake("Mazda");
        car.setModel("Miata");
        car.setColor("Red");
        car.setName("Sporty");
        car.setGears(6);
        
        car.setOperatingCycle(newOpCycle);
        
        System.out.println("");
        System.out.println(car.About());
        car.Status(newOpCycle, car.getCurrentGear(), car.getCurrentSpeed(), car.getDistanceTraveled());
        
    }
    
}
