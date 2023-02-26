package carsales;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class CarFactory {
    public static void main(String[] args) {

    
        private String carsOnStock;
        private String models;
        private int engineVolumes;
        private String colors;
        private int wheelSizes;

        public CarFactory(String models, int engineVolumes, String colors, int wheelSizes, int stockSize) {
            this.models = models;
            this.engineVolumes = engineVolumes;
            this.colors = colors;
            this.wheelSizes = wheelSizes;
            carsOnStock = new ArrayList<>(stockSize);
            for (int i = 0; i < stockSize; i++) {
                carsOnStock.add(createRandomCar());
            }
        }

    private Object createRandomCar() {
    }

    public void printPossibleModels() {
            System.out.println("Possible car models:");
            for (String model : CarModel) {
                System.out.println("- " + model);
            }
        }

        public void printPossibleEngineVolumes() {
            System.out.println("Possible engine volumes:");
            for (int engineVolume : engineVolumes) {
                System.out.println("- " + engineVolume + " cc");
            }
        }

        public void printPossibleColors() {
            System.out.println("Possible car colors:");
            for (CarColor color : colors) {
                System.out.println("- " + color);
            }
        }

        public void printPossibleWheelSizes() {
            System.out.println("Possible wheel sizes:");
            for (int wheelSize : wheelSizes) {
                System.out.println("- " + wheelSize + " inches");
            }
        }