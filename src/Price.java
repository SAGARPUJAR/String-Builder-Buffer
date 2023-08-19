import java.lang.String;
public class Price extends Room {
    String priceId;
    String currency;
    double totalAmount;

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String getRoomId() {
        return roomId;
    }

    @Override
    public void setRoomId(String roomId) {
        this.roomId=roomId;
    }

    @Override
    public String getRoomName() {
        return roomName;
    }

    @Override
    public void setRoomName(String roomName) {
        this.roomName=roomName;
    }

    @Override
    public String getRoomType() {
        return roomType;
    }

    @Override
    public void setRoomType(String roomType) {
        this.roomType=roomType;
    }

    @Override
    public int getRoomCapacity() {
        return roomCapacity;
    }

    @Override
    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity=roomCapacity;
    }

    @Override
    public int hashCode() {
        return roomId.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return ((Room) obj).roomId ==(roomId);
    }
}