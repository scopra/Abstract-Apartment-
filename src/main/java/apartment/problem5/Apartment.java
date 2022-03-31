package apartment.problem5;

import java.util.ArrayList;

enum ApartmentType{
    STUDIO
}
public class Apartment {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ApartmentType t;
    private int numberOfBathrooms = 0, numberOfLivingRooms = 0, 
            numberOfBedrooms = 0, numberOfCorridors = 0, numberOfDiningRooms = 0, 
            numberOfKitchens = 0;
    
    /**
     * Creates a pre-made studio apartment.
     * Makes studio apartment with one all purpose room and bathroom.
     * Living room/all-purpose room is furnished, has a window, exterior and 
     * interior door. 2/4 walls are furnished.
     * Bathroom is furnished, has blue tiles, interior door and a window. 
     * 2/4 walls are furnished.
     */
    public Apartment(ApartmentType type){
        rooms.add(new Room(RoomType.LIVING_ROOM, new Wall(Color.RED, 
                InteriorDoorType.TWO_PANEL, true),
                new Wall(Color.WHITE, ExteriorDoorType.STEEL, false),
                new Wall(Color.WHITE, WindowType.COTTAGE, true), new Wall(), 
                FloorType.HARDWOOD, true));
            numberOfLivingRooms++;
            rooms.add(new Room(RoomType.BATHROOM, 
                    new Wall(WallType.CERAMIC_TILE, Color.BLUE, null, 
                            InteriorDoorType.TWO_PANEL, true, null), 
                    new Wall(WallType.CERAMIC_TILE, Color.BLUE, null, null, 
                            true, WindowType.CASEMENT), 
                    new Wall(WallType.CERAMIC_TILE, Color.BLUE, null, null, 
                            false, null), 
                    new Wall(WallType.CERAMIC_TILE, Color.BLUE, null, null, 
                            false, null), FloorType.CERAMIC, true));
            numberOfBathrooms++;
            t = type;

    }
    
    /**
     * Creates a new apartment and adds an unfurnished room to it with a 
     * specified type, default walls and cork floor.
     * @param r room type
     */
    public Apartment(RoomType r){
        rooms.add(new Room(r, new Wall(), new Wall(), new Wall(), 
                new Wall(), FloorType.CORK, false));
        switch(r.toString()){
            case "BEDROOM":
                numberOfBedrooms++;
                System.out.println("Bedroom added.");
                break;
            case "LIVING_ROOM":
                numberOfLivingRooms++;
                System.out.println("Living room added.");
                break;
            case "BATHROOM":
                numberOfBathrooms++;
                System.out.println("Bathroom added.");
                break;
            case "CORRIDOR":
                numberOfCorridors++;
                System.out.println("Corridor added.");
                break;
            case "DINING_ROOM":
                numberOfDiningRooms++;
                System.out.println("Dining room added.");
                break;
            case "KITCHEN":
                numberOfKitchens++;
                System.out.println("Kitchen added.");
                break;
        }
    }
    
    /**
     * Adds a bedroom to an apartment unless the addition results in more than 
     * 4 bedrooms or is a studio apartment.
     */
    public void addBedroom(){
        if (numberOfBedrooms < 4){
            rooms.add(new Room(RoomType.BEDROOM, new Wall(), new Wall(), 
                    new Wall(), new Wall(), FloorType.HARDWOOD, false));
            System.out.println("Bedroom added.");
            numberOfBedrooms++;
        } 
        else if (t == ApartmentType.STUDIO){
            System.out.println("Unable to add room; studio apartment can "
                    + "only have 2 rooms: living room and bathroom.");
        } else{
            System.out.println("You cannot have more than 4 bedrooms.");
        }
        
    }
    
    /**
     * Adds a bathroom to an apartment unless the addition results in more than 
     * 4 bathrooms.
     */
    public void addBathroom(){
        if (numberOfBathrooms < 4){
            rooms.add(new Room(RoomType.BATHROOM, new Wall(), new Wall(), 
                    new Wall(), new Wall(), FloorType.CERAMIC, false));
            System.out.println("Bathroom addded.");
            numberOfBathrooms++;
        } 
        else if (t == ApartmentType.STUDIO){
            System.out.println("Unable to add room; studio apartment can "
                    + "only have 2 rooms: living room and bathroom.");
        }else{
            System.out.println("You cannot have more than 4 bathrooms.");
        }
        
    }
    
    /**
     * Adds a living room to an apartment unless the addition results in more 
     * than 4 living rooms.
     */
    public void addLivingRoom(){
        if (numberOfLivingRooms < 4){
            rooms.add(new Room(RoomType.LIVING_ROOM, new Wall(), new Wall(), 
                    new Wall(), new Wall(), FloorType.HARDWOOD, false));
            System.out.println("Living room addded.");
            numberOfLivingRooms++;
        } 
        else if (t == ApartmentType.STUDIO){
            System.out.println("Unable to add room; studio apartment can "
                    + "only have 2 rooms: living room and bathroom.");
        } else{
            System.out.println("You cannot have more than 4 living rooms.");
        }
        
    }
    
    /**
     * Adds a kitchen to an apartment unless the addition results in more than 
     * 4 kitchens.
     */
    public void addKitchen(){
        if (numberOfKitchens < 4){
            rooms.add(new Room(RoomType.KITCHEN, new Wall(), new Wall(), 
                    new Wall(), new Wall(), FloorType.CERAMIC, false));
            System.out.println("Kitchen addded.");
            numberOfKitchens++;
        }
        else if (t == ApartmentType.STUDIO){
            System.out.println("Unable to add room; studio apartment can "
                    + "only have 2 rooms: living room and bathroom.");
        } else{
            System.out.println("You cannot have more than 4 kitchens.");
        }
    }
    
    /**
     * Adds a corridor to an apartment unless the addition results in more than 
     * 4 corridors.
     */
    public void addCorridor(){
        if (numberOfCorridors < 4){
            rooms.add(new Room(RoomType.CORRIDOR, new Wall(), new Wall(), 
                    new Wall(), new Wall(), FloorType.HARDWOOD, false));
            System.out.println("Corridor addded.");
            numberOfCorridors++;
        }
        else if (t == ApartmentType.STUDIO){
            System.out.println("Unable to add room; studio apartment can "
                    + "only have 2 rooms: living room and bathroom.");
        } else{
            System.out.println("You cannot have more than 4 corridors.");
        }
        
    }
    
    /**
     * Adds a dining room to an apartment unless the addition results in more 
     * than 4 dining rooms.
     */
    public void addDiningRoom(){
        if (numberOfDiningRooms < 4){
            rooms.add(new Room(RoomType.DINING_ROOM, new Wall(), new Wall(), 
                    new Wall(), new Wall(), FloorType.HARDWOOD, false));
            System.out.println("Dining room addded.");
            numberOfDiningRooms++;
        }
        else if (t == ApartmentType.STUDIO){
            System.out.println("Unable to add room; studio apartment can only "
                    + "have 2 rooms: living room and bathroom.");
        } else{
            System.out.println("You cannot have more than 4 dining rooms.");
        }
    }
    
    /**
     * Demolishes a room and removes it from the apartment, decrementing 
     * the number of specified rooms.
     * @param r
     * @param nthRoom 
     */
    public void demolishRoom(RoomType r, int nthRoom){
        int counter = 0;
        if ((nthRoom > 0) && (nthRoom < 5)){
            for(int i=0; i<rooms.size(); i++){
                if(rooms.get(i).getRoomType().equals(r.toString())){
                    counter++;
                    if (counter == nthRoom){
                        rooms.remove(i);
                        rooms.get(i).demolishRoom();
                        switch(r.toString()){
                            case "BEDROOM":
                            numberOfBedrooms--;
                            System.out.println("Bedroom demolished.");
                            break;
                            case "LIVING_ROOM":
                                numberOfLivingRooms--;
                                System.out.println("Living room demolished.");
                                break;
                            case "BATHROOM":
                                numberOfBathrooms--;
                                System.out.println("Bathroom demolished.");
                                break;
                            case "CORRIDOR":
                                numberOfCorridors--;
                                System.out.println("Corridor demolished.");
                                break;
                            case "DINING_ROOM":
                                numberOfDiningRooms--;
                                System.out.println("Dining room demolished.");
                                break;
                            case "KITCHEN":
                                numberOfKitchens--;
                                System.out.println("Kitchen demolished.");
                                break;
                        }
                    }
                    else if (counter > nthRoom){
                        break;
                    }
                }
            }
        }
    }
    /**
     * Returns room details.
     * @param r
     * @param nthRoom
     * @return 
     */
    public String getRoomDetails(RoomType r, int nthRoom){
        int counter = 0;
        if ((nthRoom > 0) && (nthRoom < 5)){
            for(int i=0; i<rooms.size(); i++){
                if(rooms.get(i).getRoomType().equals(r.toString())){
                    counter++;
                    if (counter == nthRoom){
                        return (rooms.get(i).roomDetails());
                    }
                    else if (counter > nthRoom){
                        break;
                    }
                }
            }
        }
        return ("This room doesn't exist.");
    }
    
    /**
     * Gets room specified by number.
     * Returns null if room wasn't found.
     * @param r
     * @param nthRoom
     * @return
     * @throws NullPointerException 
     */
    public Room getRoom(RoomType r, int nthRoom) throws NullPointerException{
        int counter = 0;
        if ((nthRoom > 0) && (nthRoom < 5)){
            for(int i=0; i<rooms.size(); i++){
            if(rooms.get(i).getRoomType().equals(r.toString())){
                counter++;
                if(counter == nthRoom){
                    return rooms.get(i);
                }
            }
        }
        System.out.println("This room doesn't exist.");
        return null;
        } else{
            System.out.println("Invalid numeric input for " + r.toString() + 
                    ". Please enter number in range 1-4.");
            return null;
        }
    }
    
    /**
     * Returns details about apartment.
     * @return 
     */
    public String apartmentDetails(){
        return("Your apartment consists of:\n" + numberOfLivingRooms + 
                " living room(s);\n" + numberOfBathrooms + " bathroom(s);\n"
                + numberOfBedrooms + " bedroom(s);\n" + numberOfDiningRooms + 
                " dining room(s);\n"
                + numberOfKitchens + " kitchen(s);\n" + numberOfCorridors) + 
                " corridor(s).";
    }
    
}
