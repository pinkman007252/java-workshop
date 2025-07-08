package tem.bin;

import tem.bin.Building;

public class hostel extends Building {
    private boolean isMessAvailable;
    private int numberOfRooms;
    private Building building;
    private Room room;

    public void setBuilding(Building building) {
        this.building = building;
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
