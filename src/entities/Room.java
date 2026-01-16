package entities;

public class Room {
    private int id;
    private int roomNumber;
    private String type;         // "Standard", "Lux"
    private double pricePerNight;
    private boolean isOccupied;  // true = busy, false = free

    // 1. Empty Constructor (Good practice)
    public Room() {
    }

    // 2. Full Constructor (Used when reading from DB)
    public Room(int id, int roomNumber, String type, double pricePerNight, boolean isOccupied) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.isOccupied = isOccupied;
    }

    // 3. Constructor without ID (Used when creating a new room to insert into DB)
    public Room(int roomNumber, String type, double pricePerNight, boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.isOccupied = isOccupied;
    }

    // 4. Getters and Setters (REQUIRED for encapsulation)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    // 5. toString (To print nicely in the console)
    @Override
    public String toString() {
        return "Room #" + roomNumber + " [" + type + "] - Price: " + pricePerNight +
                " | Status: " + (isOccupied ? "Occupied" : "Free");
    }
}
