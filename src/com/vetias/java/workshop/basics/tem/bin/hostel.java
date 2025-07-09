package tem.bin;

public class Hostel extends Building {
    private boolean isMessAvailable;
    private int numberOfRooms;
    private Building building; 
    private Room room;

   
    public void setRoom(Room room) {
        this.room = room;
    }

    public void setIsMessAvailable(boolean isMessAvailable) {
        this.isMessAvailable = isMessAvailable;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    // Getter methods
    public Building getBuilding() {
        return building;
    }

    public boolean isMessAvailable() {
        return isMessAvailable;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public Room getRoom() {
        return room;
    }
}
