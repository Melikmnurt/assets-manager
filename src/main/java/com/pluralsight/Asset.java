package com.pluralsight;

// Parent class for all assets
public class Asset {

    // Description of the asset
    private String description;

    // Date the asset was acquired
    private String dateAcquired;

    // Original purchase cost
    private double originalCost;

    // Constructor
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for date acquired
    public String getDateAcquired() {
        return dateAcquired;
    }

    // Setter for date acquired
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    // Getter for original cost
    public double getOriginalCost() {
        return originalCost;
    }

    // Setter for original cost
    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    // Returns the current value of the asset
    public double getValue() {
        return originalCost;
    }
}