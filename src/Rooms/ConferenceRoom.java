package Rooms;

public class ConferenceRoom extends Room {
    int roomCapacity;
    String resourcesDescription;

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getResourcesDescription() {
        return resourcesDescription;
    }

    public void setResourcesDescription(String resourcesDescription) {
        this.resourcesDescription = resourcesDescription;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void setRoomNumber(String roomNumber) {
        this.roomNumber=roomNumber;
    }

    @Override
    public String getBillingType() {
        return billingType;
    }

    @Override
    public void setBillingType(String billingType) {
        this.billingType=billingType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }
}
