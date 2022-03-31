package apartment.problem5;

enum FloorType{
    HARDWOOD, LAMINATE, CERAMIC, VINYL, BAMBOO, CORK, TILE
}

enum RoomType{
    LIVING_ROOM, BEDROOM, BATHROOM, CORRIDOR, DINING_ROOM, KITCHEN,
}

public class Room {
    private Wall wall1, wall2, wall3, wall4;
    private FloorType floor;
    private RoomType type;
    
    private boolean furnished = false; //if room is furnished it has furniture
    private boolean demolished = false;
    
    /**
     * Creates living room with default matte white walls, cork floor.
     */
    public Room(){
        wall1 = new Wall();
        wall2 = new Wall();
        wall3 = new Wall();
        wall4 = new Wall();
        this.floor = FloorType.CORK;
        this.type = RoomType.LIVING_ROOM;
    }
    
    /**
     * Creates room with specific type.
     * @param r 
     */
    public Room(RoomType r){
        if (r.toString().equals("BATHROOM")){
            wall1 = new Wall(WallType.CERAMIC_TILE);
            wall2 = new Wall(WallType.CERAMIC_TILE);
            wall3 = new Wall(WallType.CERAMIC_TILE);
            wall4 = new Wall(WallType.CERAMIC_TILE); 
            floor = FloorType.CERAMIC;
            type = r;
        } else{
            wall1 = new Wall(); 
            wall2 = new Wall(); 
            wall3 = new Wall(); 
            wall4 = new Wall();
            floor = FloorType.CORK;
            type = r;
                
        }
        
    }
    
    /**
     * Creates room with custom walls, floor and type.
     * @param type
     * @param w1
     * @param w2
     * @param w3
     * @param w4
     * @param ft 
     */
    public Room(RoomType type, Wall w1, Wall w2, Wall w3, Wall w4, FloorType ft, boolean isF){
        this.type = type;
        this.wall1 = new Wall(w1);
        this.wall2 = new Wall(w2);
        this.wall3 = new Wall(w3);
        this.wall4 = new Wall(w4);
        this.floor = ft;
        this.furnished = isF;
    }
    
    /**
     * Creates room with custom walls.
     * @param w1
     * @param w2
     * @param w3
     * @param w4 
     */
    public Room(Wall w1, Wall w2, Wall w3, Wall w4){
        this.wall1 = new Wall(w1);
        this.wall2 = new Wall(w2);
        this.wall3 = new Wall(w3);
        this.wall4 = new Wall(w4);
        this.floor = FloorType.CORK;        
        this.type = RoomType.LIVING_ROOM;    
    }
    
    /**
     * Creates copy of selected room.
     * @param r 
     */
    public Room(Room r){
        if (demolished == true)
            System.out.println("Cannot copy demolished room.");
        else{
            this.wall1 = new Wall(r.wall1);
            this.wall2 = new Wall(r.wall2);
            this.wall3 = new Wall(r.wall3);
            this.wall4 = new Wall(r.wall4);
            this.floor = r.floor;
            this.type = r.type;
            this.furnished = r.furnished;
        }
    }
    
    /**
     * Demolishes room.
     * After demolishing room (and walls) cannot be edited or demolished again.
     */
    public void demolishRoom(){
        if (demolished == false){
            demolished = true;
            wall1.demolishWall();
            wall2.demolishWall();
            wall3.demolishWall();
            wall4.demolishWall();
        }
        else{
            System.out.println("Room was already demolished.");
        }
    }
    
    /**
     * Repaints all walls in the room if it wasn't demolished.
     * @param c 
     */
    public void colorAllWalls(Color c){
        if (demolished == false){
            this.wall1.repaintWall(c);
            this.wall2.repaintWall(c);
            this.wall3.repaintWall(c);
            this.wall4.repaintWall(c);
        } else{
            System.out.println("Can't make any changes. Room was demolished.");
        }
    }
    
    /**
     * Changes type of all 4 walls in the room (if they are not demolished).
     * @param t 
     */
    public void changeAllWallTypes(WallType t){
        this.wall1.editWallType(t);
        this.wall2.editWallType(t);
        this.wall3.editWallType(t);
        this.wall4.editWallType(t);
    }
    
    /**
     * Furnishes all 4 walls (if they are not demolished).
     */
    public void furnishAllWalls(){
        this.wall1.furnish();
        this.wall2.furnish();
        this.wall3.furnish();
        this.wall4.furnish();
    }
    
    /**
     * Changes floor type if room wasn't demolished.
     * @param floor 
     */
    public void changeFloor(FloorType floor){
        if(demolished == false)
            this.floor = floor;
        else
            System.out.println("Can't make any changes. Room was demolished.");
    }
    
    /**
     * Changes type of room if it wasn't demolished.
     * @param newT 
     */
    public void changeRoomType(RoomType newT){
        if (demolished == false){
            this.type = newT;
        } else{
            System.out.println("This room doesn't exist.");
        }       
    }
    
    /**
     * Adds furniture to room if it wasn't demolished.
     */
    public void furnishRoom(){
        if (demolished == false){
            this.furnished = true;
        } else{
            System.out.println("Demolished room cannot be furnished.");
        }
    }
    
    /**
     * Removes all furniture from a room if it wasn't demolished.
     **/
    public void unfurnishRoom(){
        if (demolished == false){
            this.furnished = false;
        } else{
            System.out.println("Demolished room cannot be unfurnished.");
        }
    }
    
    /**
     * Rearranges furniture in selected room.
     */
    public void rearrangeFurniture(){
        if (demolished == true){
            System.out.println("This room doesn't have any furniture because it was demolished.");
        }
        else if(furnished == false){
            System.out.println("Please furnish the room beforre rearranging furniture.");
        } else{
            System.out.println("Furniture rearranged.");
        }
    }
    /**
     * Returns floor type if room wasn't demolished.
     * @return 
     */
    public String getFloor(){
        if(demolished == true)
            return("NONE");
        return floor.toString();
    }
    
    public FloorType floor(){
        return floor;
    }
    
    /**
     * Returns 1 out of 4 walls.
     * 1 = wall1, 2 = wall2, 3 = wall3, 4 = wall4
     * @param x
     * @return 
     */
    public Wall getWall(int x){
        if(x == 1){
            return wall1;
        }
        else if(x == 2){
            return wall2;
        }
        else if(x == 3){
            return wall3;
        }
        else if(x == 4){
            return wall4;
        } else{
            System.out.println("Wall number invalid or wall was demolished.");
            return null;
        }
    }

    /**
     * Returns room type if it wasn't demolished.
     * @return 
     */
    public String getRoomType(){
        if (demolished == false)
            return type.toString();
        else
            return("This room doesn't exist.");
    }
    
    /**
     * Gives information on room's furnishing status.
     * @return 
     */
    public String getFurnishingStatus(){
        if ((demolished == true) || (furnished == false)){
            return("NO");
        } else{
            return("YES");
        }
    }
    
    private boolean furnished(){
        if(furnished == true){
            return true;
        }
        return false;
    }
    
    /**
     * Specifies whether given room was demolished.
     * @return 
     */
    public boolean isDemolished(){
        return demolished;
    }
    
    /**
     * Retrieve information about selected room.
     * @return 
     */
    public String roomDetails(){
        if(demolished == true)
            return("This room was demolished.");
        return("\nRoom type: " + getRoomType() + "\nWall 1 info:\n" + wall1.getWallInfo() + "\n\nWall 2 info:\n" + wall2.getWallInfo() +
                "\n\nWall 3 info:\n" + wall3.getWallInfo() + "\n\nWall 4 info:\n" + wall4.getWallInfo() +
                 "\n\nFloor: " + getFloor() + "\nFurnished: " + getFurnishingStatus() + "\n------------");
    }
    
    public boolean sameRoom(Room other){
        if (this.demolished != other.demolished){
            return false;
        }
        return(this.type == other.type && this.wall1.equals(other.wall1) &&
                this.wall2.equals(other.wall2) && this.wall3.equals(other.wall3)
                && this.wall4.equals(other.wall4) && this.floor == other.floor
                && this.furnished == other.furnished);        
    }
}
