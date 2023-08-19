package Rooms;

public abstract class Room {
    String roomNumber;
    String billingType;
    double price;

    public abstract   String getRoomNumber();

    public abstract void setRoomNumber(String roomNumber);

    public abstract String getBillingType();
    public abstract void setBillingType(String billingType);

    public abstract double getPrice();

    public abstract void setPrice(double price);
}
