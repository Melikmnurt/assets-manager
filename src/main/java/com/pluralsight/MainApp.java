package com.pluralsight;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        // Create an ArrayList of Asset objects
        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add houses
        myAssets.add(new House(
                "My House",
                "2020-05-15",
                250000,
                "123 Main Street",
                1,
                2000,
                10000));

        myAssets.add(new House(
                "Vacation Home",
                "2018-07-20",
                180000,
                "456 Beach Road",
                2,
                1500,
                8000));

        // Add vehicles
        myAssets.add(new Vehicle(
                "Tom's Truck",
                "2019-03-10",
                35000,
                "Ford F-150",
                2019,
                120000));

        myAssets.add(new Vehicle(
                "Family Car",
                "2022-01-05",
                28000,
                "Toyota Camry",
                2022,
                50000));

        // Loop through assets
        for (Asset asset : myAssets) {

            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Detect specific asset type
            if (asset instanceof House) {

                House house = (House) asset;

                System.out.println("House Address: "
                        + house.getAddress());

            } else if (asset instanceof Vehicle) {

                Vehicle vehicle = (Vehicle) asset;

                System.out.println("Vehicle: "
                        + vehicle.getYear()
                        + " "
                        + vehicle.getMakeModel());
            }

            System.out.println();
        }
    }
}