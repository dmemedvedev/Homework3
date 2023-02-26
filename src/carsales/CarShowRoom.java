package carsales;

import java.awt.*;
import java.util.ArrayList;

public class CarShowRoom {
    public static void main(String[] args) {

        private final List<CarModel> Cars = new ArrayList<>();

        public boolean addCar(Car newCar) {
            Cars.add(newCar);
            return true;
        }

        public static void main( String[] args ) {
            final CarShowRoom showroom = new CarShowRoom();
            final Car v1 = new Car("BlUE", "KIA", 2021, 3 );
            showroom.addCar( v1 );
        }
    }
}
