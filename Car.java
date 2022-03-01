public class Car extends Vehicle {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }
   
   @Override
    public String doStuff(){
    String output = "I am " + getBrand() + " and I go zoom zoom zoom!";
    return output;
}
}

