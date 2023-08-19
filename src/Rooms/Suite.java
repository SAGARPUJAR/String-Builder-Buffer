package Rooms;

public class Suite extends Room {
    String facilityDescription;
    boolean isBreakFastIncluded;

    public String getFacilityDescription() {
        return facilityDescription;
    }

    public void setFacilityDescription(String facilityDescription) {
        this.facilityDescription = facilityDescription;
    }

    public boolean isBreakFastIncluded() {
        return isBreakFastIncluded;
    }

    public void setBreakFastIncluded(boolean breakFastIncluded) {
        isBreakFastIncluded = breakFastIncluded;
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
