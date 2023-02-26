package carsales;

import java.awt.*;

public class Car {
        public static void main(String[] args) {


            String color;
            String model;
            int year;
            int wheelSize;
            double engineVolume;
            String options;

        public Car(String color,String model,int year,int WheelSize,intengineVolume, List<Options > options)
            {
                this.color = color;
                this.model = model;
                this.year = year;
                this.wheelSize = wheelSize;
                this.engineVolume = engineVolume;
                this.options = options;
            }

            public void setColor (String color){
                this.color = color;
            }

            public void setWheelSize (WheelSize wheelSize){
                this.wheelSize = wheelSize;
            }

            public void addOption (Options option){
                options.add(option);
            }

            public void removeOption (Options option){
                options.remove(option);
            }

            public void printInfo () {
                System.out.println("Model: " + model);
                System.out.println("Year: " + year);
                System.out.println("Color: " + color);
                System.out.println("Wheel size: " + wheelSize);
                System.out.println("Engine volume: " + engineVolume);
                System.out.println("Options: ");
                for (Options option : options) {
                    System.out.println("- " + option.getName() + " ($" + option.getPrice() + ")");
                }
            }




