package carsales;

import java.util.List;

public class CarService {
    public static void main(String[] args) {


        private String carRepository;

        public CarService(String carRepository) {
            this.carRepository = carRepository;
        }

        public Car getCarDetails(String car {
            Car car = carRepository.findByName(name);
            if(car == null) {
                throw new CarNotFoundException();
            }
            return car;
        }
    }
