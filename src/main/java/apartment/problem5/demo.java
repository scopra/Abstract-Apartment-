/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.problem5;

/**
 *
 * @author Selma
 */
public class demo {
    public static void main(String[] args){
        /*System.out.println("bhfikuilaebhvjdafeuw2kwbae vgjzgiwubkhmd vjaezgiw2wkdavdezgiwqkhm y");
        Wall bia = new Wall(Color.GRAY, InteriorDoorType.FOUR_PANEL, true);
        System.out.println(bia.getWallInfo());
        bia.demolishWall();
        System.out.println(bia.getWallInfo());
        System.out.println(WindowType.ORIEL.toString());
        Wall fhs = new Wall();
        fhs.insertWindow(WindowType.TWO_PANEL_SLIDER);
        fhs.insertExteriorDoor(ExteriorDoorType.WOOD);
        fhs.insertInteriorDoor(InteriorDoorType.VISION);
        fhs.repaintWall(Color.YELLOW);
        System.out.println(fhs.getWallInfo());*/
//        Wall w1 = new Wall(Color.BLUE, ExteriorDoorType.SLIDER, true);
//        System.out.println(w1.getWallInfo());
//        Room room1 = new Room();
//        System.out.println(room1.roomDetails());
//        room1.changeFloor(FloorType.HARDWOOD);
//        room1.changeChandelier(ChandelierType.MINI);
//        room1.changeCarpet(CarpetType.PATTERN);
//        System.out.println(room1.roomDetails());
//        room1.wall1.insertInteriorDoor(InteriorDoorType.TWO_PANEL);
//        room1.wall1.repaintWall(Color.ORANGE);
//        room1.wall2.insertWindow(WindowType.ROUNDED);
//        room1.wall2.repaintWall(Color.ORANGE);
//        room1.wall3.repaintWall(Color.ORANGE);
//        room1.wall3.insertExteriorDoor(ExteriorDoorType.WOOD);
//        room1.wall4.repaintWall(Color.ORANGE);
//        room1.wall4.furnish();
//        System.out.println(room1.roomDetails());
//        
//        room1.demolishRoom();
//        System.out.println();
//        System.out.println(room1.roomDetails());
//        
//        Room room2 = new Room(new Wall(Color.GRAY, ExteriorDoorType.FIBERGLASS, true),
//        new Wall(Color.BLUE, InteriorDoorType.HALF_GLASS, false), 
//        new Wall(Color.BLACK, ExteriorDoorType.SLIDER, InteriorDoorType.HALF_GLASS, true, WindowType.GLASS_BLOCK), 
//        new Wall());
//        
//        System.out.println(room2.roomDetails());
//        
//        Wall w2 = new Wall(Color.BLACK, ExteriorDoorType.SLIDER, InteriorDoorType.HALF_GLASS, true, WindowType.GLASS_BLOCK);
//        System.out.println(w2.getWallInfo());
//        Wall wall1 = new Wall();
//        wall1.editWallType(WallType.WALLPAPER);
//        wall1.furnish();
//        wall1.repaintWall(Color.GREEN);
//        wall1.insertExteriorDoor(ExteriorDoorType.STORM);
//        wall1.insertInteriorDoor(InteriorDoorType.VISION);
//        wall1.insertWindow(WindowType.ROUNDED);
//        
//        Wall wall2 = new Wall();
//        wall2.editWallType(WallType.WALLPAPER);
//        wall2.furnish();
//        wall2.repaintWall(Color.GREEN);
//        wall2.insertExteriorDoor(ExteriorDoorType.STORM);
//        wall2.insertInteriorDoor(InteriorDoorType.VISION);
//        wall2.insertWindow(WindowType.ROUNDED);
//        
//        System.out.println(wall1.sameWall(wall2));
//        wall2.demolishWall();
//        System.out.println(wall1.sameWall(wall2));
//        
//        wall2.editWallType(WallType.WALLPAPER);
//        wall2.furnish();
//        wall2.repaintWall(Color.GREEN);
//        wall2.insertExteriorDoor(ExteriorDoorType.STORM);
//        wall2.insertInteriorDoor(InteriorDoorType.VISION);
//        wall2.insertWindow(WindowType.ROUNDED);
//        
//        wall2 = new Wall();
//        System.out.println(wall2.getWallInfo());
//        wall2.removeWindow();
        
        Apartment a = new Apartment(RoomType.BEDROOM);
        a.addBedroom();
        a.addCorridor();
        a.addKitchen();
        a.addBathroom();
        a.addLivingRoom();
        
        a.getRoom(RoomType.BEDROOM, 2).changeFloor(FloorType.VINYL);
        a.getRoom(RoomType.BEDROOM, 2).getWall(1).insertInteriorDoor(InteriorDoorType.VISION);
        a.getRoom(RoomType.BEDROOM, 2).getWall(3).furnish();
        a.getRoom(RoomType.BEDROOM, 2).getWall(2).repaintWall(Color.BLUE);
        a.getRoom(RoomType.BEDROOM, 2).getWall(2).editWallType(WallType.WALLPAPER);
        a.getRoom(RoomType.BEDROOM, 2).getWall(4).insertWindow(WindowType.ROUNDED);
        a.getRoom(RoomType.BEDROOM, 2).furnishRoom();
        
        System.out.println(a.getRoom(RoomType.BEDROOM, 2).roomDetails());
        
        a.getRoom(RoomType.BEDROOM, 1).getWall(2).editWallType(WallType.WALLPAPER);
        a.getRoom(RoomType.BEDROOM, 1).furnishRoom();
        a.getRoom(RoomType.BEDROOM, 1).changeFloor(FloorType.HARDWOOD);
        
        System.out.println(a.getRoom(RoomType.BEDROOM, 1).roomDetails());
        
        a.getRoom(RoomType.KITCHEN, 1).getWall(1).insertInteriorDoor(InteriorDoorType.VISION);
        a.getRoom(RoomType.KITCHEN, 1).getWall(2).insertWindow(WindowType.GLASS_BLOCK);
        a.getRoom(RoomType.KITCHEN, 1).getWall(3).insertInteriorDoor(InteriorDoorType.VISION);
        a.getRoom(RoomType.KITCHEN, 1).getWall(1).editWallType(WallType.CERAMIC_TILE);
        a.getRoom(RoomType.KITCHEN, 1).getWall(2).editWallType(WallType.CERAMIC_TILE);
        a.getRoom(RoomType.KITCHEN, 1).getWall(3).editWallType(WallType.CERAMIC_TILE);
        a.getRoom(RoomType.KITCHEN, 1).getWall(4).editWallType(WallType.CERAMIC_TILE);
        a.getRoom(RoomType.KITCHEN, 1).changeFloor(FloorType.CERAMIC);
        a.getRoom(RoomType.KITCHEN, 1).furnishRoom();
        
   
        System.out.println(a.getRoom(RoomType.KITCHEN, 1).roomDetails());
        
        System.out.println();
        System.out.println(a.apartmentDetails());
        
        Wall w = new Wall();
        w.insertWindow(WindowType.ROUNDED);
                
        //System.out.println();
        //System.out.println(w.getWallInfo());
        
        
        
    
    }
    
}
