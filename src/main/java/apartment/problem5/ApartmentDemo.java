package apartment.problem5;

/**
 *
 * @author Selma
 */
public class ApartmentDemo {
    public static void main(String [] args){
        
        Apartment studio = new Apartment(ApartmentType.STUDIO);        
        System.out.println(studio.apartmentDetails());        
        System.out.println(studio.getRoom(RoomType.BEDROOM, 1)); //NULL, THIS ROOM DOESN'T EXIST
        
        System.out.println(studio.getRoom(RoomType.LIVING_ROOM, 1).roomDetails());
        System.out.println(studio.getRoom(RoomType.BATHROOM, 1).roomDetails());
        
        studio.getRoom(RoomType.LIVING_ROOM, 1).changeFloor(FloorType.HARDWOOD);
        studio.getRoom(RoomType.LIVING_ROOM, 1).furnishRoom();
        studio.getRoom(RoomType.LIVING_ROOM, 1).getWall(1).editWallType(WallType.WALLPAPER);
        studio.getRoom(RoomType.LIVING_ROOM, 1).getWall(2).insertExteriorDoor(ExteriorDoorType.STEEL);
        studio.getRoom(RoomType.LIVING_ROOM, 1).getWall(3).insertWindow(WindowType.ROUNDED);
        studio.getRoom(RoomType.LIVING_ROOM, 1).getWall(4).demolishWall();
        System.out.println(studio.getRoom(RoomType.LIVING_ROOM, 1).getWall(4).getInteriorDoorInfo()); //try to see info on door on demolished wall
        studio.getRoom(RoomType.LIVING_ROOM, 1).rearrangeFurniture();
        
        studio.getRoom(RoomType.BATHROOM, 1).furnishRoom();
        studio.getRoom(RoomType.BATHROOM, 1).getWall(2).furnish();
        studio.getRoom(RoomType.BATHROOM, 1).getWall(1).insertWindow(WindowType.HOPPER);
        System.out.println(studio.getRoom(RoomType.BATHROOM, 1).roomDetails());
        
        Apartment custom = new Apartment(RoomType.LIVING_ROOM);
        custom.addBathroom();
        custom.addKitchen();
        custom.addBedroom();
        custom.addBedroom();
        custom.addCorridor();
        custom.getRoom(RoomType.BEDROOM, 1).colorAllWalls(Color.RED);
        custom.getRoom(RoomType.BEDROOM, 2).colorAllWalls(Color.BLUE);
        custom.getRoom(RoomType.LIVING_ROOM, 1).furnishRoom();
        custom.getRoom(RoomType.LIVING_ROOM, 1).getWall(1).insertInteriorDoor(InteriorDoorType.VISION);
        custom.getRoom(RoomType.LIVING_ROOM, 1).getWall(2).insertWindow(WindowType.ROUNDED);
        custom.getRoom(RoomType.CORRIDOR, 1).getWall(3).insertExteriorDoor(ExteriorDoorType.STEEL);
        custom.getRoom(RoomType.BATHROOM, 1).furnishRoom();
        custom.getRoom(RoomType.BATHROOM, 1).getWall(4).insertInteriorDoor(InteriorDoorType.VISION);
        System.out.println("*****");
        System.out.println(custom.getRoomDetails(RoomType.BEDROOM, 1));
        System.out.println("*****");        
        System.out.println(custom.getRoomDetails(RoomType.BEDROOM, 2));
        
        custom.demolishRoom(RoomType.BEDROOM, 1);
        System.out.println(custom.getRoomDetails(RoomType.BEDROOM, 1));
        try{
             custom.getRoom(RoomType.BEDROOM, 1).furnishRoom();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("-----------------------------------");
        Wall wall1 = new Wall(WallType.WALLPAPER, Color.RED, null, 
                InteriorDoorType.TWO_PANEL, true, WindowType.TWO_PANEL_SLIDER);
        System.out.println(wall1.getWallInfo());
        
        System.out.println("-----------------------------------");
        Room room1 = new Room(RoomType.BATHROOM, new Wall(WallType.CERAMIC_TILE),
                new Wall(WallType.CERAMIC_TILE), new Wall(WallType.CERAMIC_TILE),
                new Wall(WallType.CERAMIC_TILE), FloorType.CERAMIC, true);
        System.out.println(room1.roomDetails());
        room1.colorAllWalls(Color.GREEN);
        room1.getWall(1).insertWindow(WindowType.ROUNDED);
        room1.getWall(2).insertInteriorDoor(InteriorDoorType.TWO_PANEL);
        room1.getWall(3).furnish();
        room1.getWall(4).demolishWall();
        room1.getWall(4).insertWindow(WindowType.ROUNDED);
        System.out.println(room1.roomDetails());
        
    }
}
