package Rooms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    HashMap<String, Suite> data=new HashMap<>();
    public static InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    public  static BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    public static void main(String[] args) throws IOException {
        Main main=new Main();
        int count=-1;
        do {
            try{
                System.out.print("Enter the no of records to be inserted : ");
                count=Integer.parseInt(bufferedReader.readLine());
            }catch (Exception ex){
                System.out.println(ex.fillInStackTrace()+", Invalid Details");
            }finally {
                if (count==-1){
                    System.out.println("Sorry !! you have Entered Invalid Valid input");
                }else{
                    System.out.println("Great !! you have Entered Valid input");
                }
            }
        }while (count==-1);
        main.insertRoomDetails(count);
        System.out.println("\n");
        main.displayRoomDetails();
        System.out.println("\n\n Search Data From List By Entering ID : ");
        String Id=bufferedReader.readLine();
        main.getRoomDetailsById(Id);
    }
    public void insertRoomDetails(int count) throws IOException {
        for (int i=0;i<count;i++) {
            Suite room = new Suite();
            StringBuilder builder=new StringBuilder("HRI");
            StringBuilder priceId=new StringBuilder("HRP");
            System.out.println((i + 1) + ". Enter the Room Detail : ");
            System.out.print("Enter The Room Number                 : ");
            builder.append(bufferedReader.readLine());
            room.setRoomNumber(builder.toString());
            System.out.print("Enter The Billing Type                : ");
            room.setBillingType(bufferedReader.readLine());
            do{
                try{
                    System.out.print("Enter The Total Amount                : ");
                    room.setPrice(Double.parseDouble(bufferedReader.readLine()));
                }catch (NumberFormatException ex){
                    System.out.println(ex.fillInStackTrace());
                }finally {
                    System.out.println("Great !! you have Entered Valid input");
                }
            }while (room.getPrice()<=0.0);
            System.out.println("\nEnter the Suit Room Details           : ");
            System.out.print("Enter The Description                    : ");
            room.setFacilityDescription(bufferedReader.readLine());
            System.out.print("Enter IsBreakfastIncluded (true or false) : ");
            room.setBreakFastIncluded(Boolean.parseBoolean(bufferedReader.readLine()));
            data.put(room.getRoomNumber(),room);
        }
    }
    public void displayRoomDetails(){
        System.out.println("\n");
        try{
        for(Suite room: data.values()) {
            System.out.println("Room Number    : "+room.getRoomNumber());
            System.out.println("Room Billing Type  : "+room.getBillingType());
            System.out.println("Room Price  : "+room.getPrice());
            System.out.println("\n");
            System.out.println("Suit Description  : "+room.getFacilityDescription());
            System.out.println("isBreakfastIncluded  : "+room.isBreakFastIncluded());
        }
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace());
        }finally{
            System.out.println("Found All Details.");
        }
    }
    public void getRoomDetailsById(String roomId){
        Suite rooms= data.get(roomId);
        if (rooms!=null)
        {
            System.out.println("Room Number    : "+rooms.getRoomNumber());
            System.out.println("Room Billing Type  : "+rooms.getBillingType());
            System.out.println("Room Price  : "+rooms.getPrice());
            System.out.println("\n");
            System.out.println("Suit Description  : "+rooms.getFacilityDescription());
            System.out.println("isBreakfastIncluded  : "+rooms.isBreakFastIncluded());
        }else{
            System.out.println("No Room Details Found, Please Enter Valid RoomId");
        }
    }
}
