import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.lang.String;

public class Main {
    HashMap<String, Price> data=new HashMap<>();
    public static InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    public  static BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    public static void main(String[] args) throws  IOException{
        Main main=new Main();
        System.out.print("Enter the no of records to be inserted : ");
        int count=1;
        try{
             count=Integer.parseInt(bufferedReader.readLine());
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace()+", Invalid Details");
            System.out.print("Please Enter Valid Input : ");
            count=Integer.parseInt(bufferedReader.readLine());
        }finally {
            System.out.println("Great !! you have Entered Valid input");
        }
        main.insertRoomDetails(count);
        System.out.println("\n");
        main.displayRoomDetails();
        System.out.print("\n\n Search Data From List By Entering ID : ");
        String Id=bufferedReader.readLine();
        main.getRoomDetailsById(Id);
    }
    public void insertRoomDetails(int count) throws IOException {
        for (int i=0;i<count;i++) {
            Price room = new Price();
            StringBuilder builder=new StringBuilder("HRI");
            StringBuilder priceId=new StringBuilder("HRP");
            System.out.println((i + 1) + ". Enter the Room Detail : ");
            System.out.print("Enter The Room Id                     : ");
            builder.append(bufferedReader.readLine());
            room.setRoomId(builder.toString());
            System.out.print("Enter The Room Name                   : ");
            room.setRoomName(bufferedReader.readLine());
            System.out.print("Enter The Room Type                   : ");
            room.setRoomType(bufferedReader.readLine());
            System.out.print("Enter The Room Capacity               : ");
            try{
            room.setRoomCapacity(Integer.parseInt(bufferedReader.readLine()));
            }catch (NumberFormatException ex){
                System.out.println("Invalid Input");
                System.out.print("Please Enter valid Input : ");
                room.setRoomCapacity(Integer.parseInt(bufferedReader.readLine()));
            }finally {
                System.out.println("Great !! you have Entered Valid input");
            }
            System.out.println("\nEnter the Price Details           : ");
            System.out.print("Enter The Price Id                    : ");
            priceId.append(bufferedReader.readLine());
            room.setPriceId(priceId.toString());
            System.out.print("Enter The Currency                    : ");
            room.setCurrency(bufferedReader.readLine());
            System.out.print("Enter The Total Amount                : ");
            try{
                room.setTotalAmount(Double.parseDouble(bufferedReader.readLine()));
            }catch (NumberFormatException ex){
                System.out.println("Invalid Input");
                System.out.print("Please Enter valid Total Amount : ");
                room.setTotalAmount(Double.parseDouble(bufferedReader.readLine()));
            }finally {
                System.out.println("Great !! you have Entered Valid input");
            }

            data.put(room.getRoomId(),room);
        }
    }
    public void displayRoomDetails(){
        System.out.println("\n");
        try{
        for(Price room: data.values()) {
            System.out.println("Room Id    : "+room.getRoomId());
            System.out.println("Room Name  : "+room.getRoomName());
            System.out.println("Room Type  : "+room.getRoomType());
            System.out.println("Room Capacity  : "+room.getRoomCapacity());
            System.out.println("\n");
            System.out.println("Price Id  : "+room.getPriceId());
            System.out.println("Price Currency  : "+room.getCurrency());
            System.out.println("Price Total Amount  : "+room.getTotalAmount());
        }
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace());
        }finally{
            System.out.println("Found All Details.");
        }
    }
    public void getRoomDetailsById(String roomId){
        Price rooms= data.get(roomId);
        if (rooms!=null)
        {
            System.out.println("Room Id    : "+rooms.getRoomId());
            System.out.println("Room Name  : "+rooms.getRoomName());
            System.out.println("Room Type  : "+rooms.getRoomType());
            System.out.println("Room Capacity  : "+rooms.getRoomCapacity());
            System.out.println("\n");
            System.out.println("Price Id  : "+rooms.getPriceId());
            System.out.println("Price Currency  : "+rooms.getCurrency());
            System.out.println("Price Total Amount  : "+rooms.getTotalAmount());
        }else{
            System.out.println("No Room Details Found, Please Enter Valid RoomId");
        }
    }
}