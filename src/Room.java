import java.lang.String;
public abstract class Room {
    String roomId;
    String roomName;
    String roomType;
    int roomCapacity;

    public abstract String getRoomId();

    public abstract void setRoomId(String roomId) ;

    public abstract String getRoomName() ;

    public abstract void setRoomName(String roomName);

    public abstract String getRoomType() ;

    public abstract void setRoomType(String roomType);

    public abstract int getRoomCapacity();

    public abstract void setRoomCapacity(int roomCapacity);
}
