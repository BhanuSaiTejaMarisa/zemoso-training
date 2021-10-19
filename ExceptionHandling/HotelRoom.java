package com.learning.assignments.JAVA.ExceptionHandling;

import java.util.ArrayList;

class HotelRoom {

    private ArrayList<Integer> bookedRooms=new ArrayList<>();
    private ArrayList<Integer> servicedRooms=new ArrayList<>();

    public HotelRoom(int adults,int child) throws RoomLimitException {
        if((adults+child)<=4&&(adults)>0){
            System.out.println("You room is booked!");
            int roomNum=(int) Math.round(Math.random()*1000+1000);
            bookedRooms.add(roomNum);
            System.out.println("Your room number is: "+roomNum);
        }
        else{
            throw new RoomLimitException("Limit for a room is only 4 members");
        }
    }
    public void getRoomCleaning(int roomNumber) throws ServiceAlreadyDoneException, WrongRoomServiceException {
        if(bookedRooms.contains(roomNumber)){
            if(!servicedRooms.contains(roomNumber)){
                System.out.println("We'll provide with best room service shortly");
                servicedRooms.add(roomNumber);

            }
            else{
                throw new ServiceAlreadyDoneException("Room already serviced this day, please contact tomorrow for new service");
            }
        }
        else{
            throw new WrongRoomServiceException("Sorry, requested service for a wrong room number");
        }
    }
}
