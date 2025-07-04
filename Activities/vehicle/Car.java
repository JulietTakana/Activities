package vehicle;   //creating a package

import java.util.Scanner; //importing the scanner class from the util package

class Car{

//declaring private instance variables

private String model;
private int year;
private double price;

{ //Adding an instance initializer block

System.out.println("Initializing...");

}

public Car(String model, int year, double price){ // parameterised constructor that initializes values
this.model = model;
this.year = year;
this.price = price;
}

public void displayDetails(){   //method to show car info
int wholePrice = (int) price;

System.out.println("Model:" + "" + model);
System.out.println("Year:" + "" + year);
System.out.println("Price:" + "R" + price);
}

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);  // creating an instance of a scanner class

System.out.println("Enter the car model");
String model = scanner.nextLine();          //using the scanner object to ask users to enter car details

System.out.println("Enter the year");
int year = scanner.nextInt();

System.out.println("Enter the price");
double price = scanner.nextDouble();

Car mycar = new Car(model,year,price);
mycar.displayDetails();

scanner.close();
}
}
