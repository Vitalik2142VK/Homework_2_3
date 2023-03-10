import Vehicle.*;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };
        ServiceStation station = new ServiceStation();
        System.out.println("##########");
        for (int i = 0; i < vehicle.length; i++) {
            station.check(vehicle[i]);
            System.out.println("##########");
        }
    }
}