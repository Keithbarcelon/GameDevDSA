package object;

import java.io.IOException;
import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;
import main.UtilityTool; // Ensure to import the UtilityTool class

public class OBJ_Key extends Entity {



    public OBJ_Key(GamePanel gp) {
    	super(gp);
    	
        name = "Key";
        down1 = setup("/objects/key", gp.tileSize, gp.tileSize);


    }
}