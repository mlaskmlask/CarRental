public class DataBase {

    private Vehicle[] vehicles = new Vehicle[5];

    DataBase() {
        this.vehicles[0] = new Car("BMW", "S4", 300, "KR35365", "red");
        this.vehicles[1] = new Car("Audi", "A5", 250, "KR84104", "white");
        this.vehicles[2] = new Car("Skoda", "F7", 270, "KR92741", "black");
        this.vehicles[3] = new Bus("Opel", "B4", 200, "KR95826", 8, 6);
        this.vehicles[4] = new Bus("Mazda", "R6", 220, "KR94186", 6, 4);
    }

    public Car[] getCars() {
        int carCounter = 0;
        for (Vehicle currentVehicle : this.vehicles) {
            if (currentVehicle instanceof Car) {
                carCounter++;
            }
        }
        Car[] result = new Car[carCounter];
        int counter = 0;
        for (int i = 0; i < this.vehicles.length; i++) {
            if (this.vehicles[i] instanceof Car) {
                result[counter] = (Car) this.vehicles[i];
                counter++;
            }
        }
        return result;
    }

}
