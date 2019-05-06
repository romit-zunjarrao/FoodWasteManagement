package com.example.dontwastefood;

public class FoodItemInfoPojo {

    String foodItemName, foodItemQuantity, foodItemPrice, contactNo, addressPoint;

    @Override
    public String toString() {
        return "FoodItemInfoPojo{" +
                "foodItemName='" + foodItemName + '\'' +
                ", foodItemQuantity='" + foodItemQuantity + '\'' +
                ", foodItemPrice='" + foodItemPrice + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", addressPoint='" + addressPoint + '\'' +
                '}';
    }

    public FoodItemInfoPojo(String foodItemName, String foodItemQuantity, String foodItemPrice, String contactNo, String addressPoint) {
        this.foodItemName = foodItemName;
        this.foodItemQuantity = foodItemQuantity;
        this.foodItemPrice = foodItemPrice;
        this.contactNo = contactNo;
        this.addressPoint = addressPoint;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public void setFoodItemQuantity(String foodItemQuantity) {
        this.foodItemQuantity = foodItemQuantity;
    }

    public void setFoodItemPrice(String foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddressPoint(String addressPoint) {
        this.addressPoint = addressPoint;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public String getFoodItemQuantity() {
        return foodItemQuantity;
    }

    public String getFoodItemPrice() {
        return foodItemPrice;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddressPoint() {
        return addressPoint;
    }
}
