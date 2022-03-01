public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 1000);
        Boat boat = new Boat("Queen Elizabeth 2", 1000);

        System.out.println(clio.doStuff());
        System.out.println(boat.doStuff());
    }
}
