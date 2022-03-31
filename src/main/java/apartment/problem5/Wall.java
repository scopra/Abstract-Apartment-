package apartment.problem5;

enum InteriorDoorType{
        FLUSH, HALF_GLASS, FULL_GLASS, TWO_PANEL, FOUR_PANEL, VISION, POCKET
}

enum Color{
        RED, BLUE, GREEN, PINK, YELLOW, WHITE, BLACK, GRAY, ORANGE, PURPLE, BROWN 
}

enum ExteriorDoorType{
        FIBERGLASS, FRENCH, STEEL, WOOD, SLIDER, STORM
}

enum WindowType{
        COTTAGE, TWO_PANEL_SLIDER, HOPPER, ROUNDED, PICTURE, GLASS_BLOCK, CASEMENT, ORIEL
}

enum WallType{
    MATTE, SEMI_GLOSS, EGGSHELL, SATIN, HIGH_GLOSS, CERAMIC_TILE, WALLPAPER 
}

public class Wall {
       
    private InteriorDoorType interior;
    private ExteriorDoorType exterior;
    private WindowType window;
    private Color wallColor;
    private WallType type;
    
    private boolean furnished; //Pictures, lighting, shelves or any other decorations present on wall
    private boolean demolished = false;
        
    /**
     * Makes a new wall of specified color, interior door type and default wall type (MATTE).
     * @param color 
     * @param doorType 
     * @param isFurnished 
     */
    public Wall(Color color, InteriorDoorType doorType, boolean isFurnished){
        this.wallColor = color;
        this.interior = doorType;
        this.furnished = isFurnished;
        this.type = WallType.MATTE;
    }
    
    /**
     * Makes a new wall of specified color, exterior door type and default wall type (MATTE).
     * @param color 
     * @param doorType 
     * @param isFurnished 
     */
    public Wall(Color color, ExteriorDoorType doorType, boolean isFurnished){
        this.wallColor = color;
        this.exterior = doorType;
        this.furnished = isFurnished;
        this.type = WallType.MATTE;
    }
    
    /**
     * Makes a new wall of specified type, color, window, door types and furnishing status.
     * @param color
     * @param exter
     * @param inter
     * @param isFurnished 
     * @param window 
     */
    public Wall(WallType type, Color color, ExteriorDoorType exter, InteriorDoorType inter, boolean isFurnished, WindowType window){
        this.type = type;
        this.wallColor = color;
        this.exterior = exter;
        this.interior = inter;
        this.furnished = isFurnished;
        this.window = window;
    }
    
    /**
     * Makes a new wall of specified color, window and furnishing status.
     * @param color
     * @param window
     * @param furnished 
     */
    public Wall(Color color, WindowType window, boolean furnished){
        this.wallColor = color;
        this.window = window;
        this.furnished = furnished;
        this.type = WallType.MATTE;
    }
    
    /**
     * Makes wall of specified type.
     * @param w 
     */
    public Wall(WallType w){
        this.wallColor = Color.WHITE;
        this.type = w;
    }
    /**
     * Makes a default wall.
     * Default color is matte white, no doors or windows are on wall and it is unfurnished.
     */
    public Wall(){
        this.wallColor = Color.WHITE;
        this.type = WallType.MATTE;
    }
    
    /**
     * Makes copy of given wall.
     * @param other 
     */
    public Wall(Wall other){
        if (this.demolished == false){
            this.type = other.type;
            this.wallColor = other.wallColor;
            this.interior = other.interior;
            this.exterior = other.exterior;
            this.window = other.window;
            this.furnished = other.furnished;
        } else{
            System.out.println("Unable to make copy of demolished wall.");
        }
        
    }
    /**
     * Adds or changes interior door if wall wasn't demolished.
     * Limit of 1 interior door per wall.
     * @param newDoor 
     */
    public void insertInteriorDoor(InteriorDoorType newDoor){
        if (demolished == false){
            this.interior = newDoor; 
        } else{
            System.out.println("Cannot place door on a wall that doesn't exist.");
        }
    }
    
    /**
     * Removes interior door from wall if it wasn't demolished.
     */
    public void removeInteriorDoor(){
        if (demolished == false){
            this.interior = null; 
        } 
        else if (this.interior == null){
            System.out.println("This door already doesn't exist.");
        } else{
            System.out.println("Cannot remove a door from a wall that doesn't exist.");
        }
    }
    
    /**
     * Adds or changes exterior door if wall wasn't demolished.
     * Limit of 1 exterior door per wall.
     * @param newDoor 
     */
    public void insertExteriorDoor(ExteriorDoorType newDoor){
        if (demolished == false){
            this.exterior = newDoor;
        } else{
            System.out.println("Can't place door on a wall that doesn't exist.");
        }
    }
    
    /**
     * Removes exterior door from a wall if it wasn't demolished.
     */
    public void removeExteriorDoor(){
        if (demolished == false){
            this.exterior = null; 
        } 
        else if (this.exterior == null){
            System.out.println("This door already doesn't exist.");
        }
        else{
            System.out.println("Can't remove a door from a wall that doesn't exist.");
        }
    }
    
    /**
     * Adds or replaces window if wall wasn't demolished.
     * Limit of 1 window per wall.
     * @param window 
     */
    public void insertWindow(WindowType window){
        if (demolished == false)
            this.window = window;
        else
            System.out.println("Can't place window on a wall that doesn't exist.");
    }
    
    /**
     * Removes a window from a wall if it wasn't demolished.
     */
    public void removeWindow(){
        if (demolished == false){
            this.window = null; 
        } 
        else if (this.window == null){
            System.out.println("This window already doesn't exist.");
        }
        else{
            System.out.println("Can't remove a window from a wall that doesn't exist.");
        }
    }
    
    /**
     * Repaints the wall if it wasn't demolished.
     * @param newColor 
     */
    public void repaintWall(Color newColor){
        if (demolished == false)
            this.wallColor = newColor;
        else
            System.out.println("Can't paint wall that doesn't exist.");
    }
    
    /**
     * Furnishes a wall if it wasn't demolished.
     * Furnishing means adding paintings, shelves, lighting, curtains or any other type of decor.
     */
    public void furnish(){
        if (demolished == false)
            furnished = true;
        else
            System.out.println("Cannot place any decorations on wall that doesn't exist.");
    }
    
    /**
     * Deletes all decor from wall if it wasn't demolished.
     */
    public void unfurnish(){
        if (demolished == false)
            furnished = false;
        else
            System.out.println("Cannot delete any decorations from wall that doesn't exist.");
    }
    
    /**
     * Edits wall type if it wasn't demolished.
     * @param newT 
     */
    public void editWallType(WallType newT){
        if (demolished == false)
            this.type = newT;
        else
            System.out.println("Cannot change wall type if it doesn't exist.");
    }
    
    /**
     * Demolishes selected wall if it wasn't demolished.
     */
    public void demolishWall(){
        if (demolished == false)
            demolished = true;
        else
            System.out.println("You cannot demolish a wall that doesn't exist.");
    }
    
    /**
     * Indicated whether wall was demolished.
     * @return 
     */
    public boolean isDemolished(){
        return demolished;
    }
    
    /**
     * Retrieve information about wall color if it wasn't demolished.
     * @return 
     */
    public String getWallColor(){
        if (demolished == false)
            return wallColor.toString();
        else
            return("This wall was demolished and doesn't exist anymore.");
    }
    
    /**
     * Retrieve information about exterior door on selected wall if it exists.
     * @return exterior, otherwise "NONE"
     */
    public String getExteriorDoorInfo(){
        if (exterior == null){
            return("NONE");
        }
        else if (demolished == true)
            return("This wall was demolished and doesn't exist anymore.");
        return exterior.toString();
    }
    
    /**
     * Retrieve information about interior door on selected wall if it exists.
     * @return interior, otherwise "NONE"
     */
    public String getInteriorDoorInfo(){
        if (interior == null){
            return("NONE");
        }
        else if (demolished == true){
            return("This wall was demolished and doesn't exist anymore.");
        }
        return interior.toString();
    }
    
    /**
     * Retrieve information about wall's furnishing status.
     * @return 
     */
    public String getFurnishingStatus(){
        if (furnished == true){
            return("YES");
        }
        else if (demolished == true){
            return("This wall was demolished and doesn't exist anymore.");
        }
        return("NO");
    }
    
    /**
     * Retrieve information about window on selected wall.
     * @return window, otherwise "NONE"
     */
    public String getWindowInfo(){
        if (window == null){
            return("NONE");
        }
        else if (demolished == true){
            return("This wall was demolished and doesn't exist anymore.");
        }
        return window.toString();
    }
    
    public String getWallType(){
        if (demolished == false)
            return type.toString();
        return ("This wall was demolished and doesn't exist anymore.");
    }
    
    /**
     * Retrieve information about selected wall.
     * @return 
     */
    public String getWallInfo(){
        if (demolished == true)
            return("This wall was demolished and doesn't exist anymore.");
        return("Type: " + getWallType() + "\nColor: " + getWallColor()
                + "\nExterior door: " + getExteriorDoorInfo() + 
                "\nInterior door: " + getInteriorDoorInfo() + 
                "\nFurnished: " + getFurnishingStatus() +
                "\nWindow: " + getWindowInfo());
    }
    
    /**
     * Checks whether two walls have the same attributes.
     * @param otherWall
     * @return
     */
    public boolean sameWall(Wall otherWall){
        if (this.demolished != otherWall.demolished){
            return false;
        }
        return(this.type == otherWall.type && this.wallColor == otherWall.wallColor &&
                this.exterior == otherWall.exterior && this.interior == otherWall.interior &&
                this.window == otherWall.window && this.furnished == otherWall.furnished);
    }
}
