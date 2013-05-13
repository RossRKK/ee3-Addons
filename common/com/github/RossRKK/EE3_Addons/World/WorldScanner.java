package com.github.RossRKK.EE3_Addons.world;

import com.github.RossRKK.EE3_Addons.datatypes.Coordinates;
import com.github.RossRKK.EE3_Addons.lib.Numbers;
import com.github.RossRKK.EE3_Addons.tileentity.TileOrb;

import net.minecraft.world.World;

public class WorldScanner {

    public static Coordinates WorldScan(World world, int x, int y, int z){
        
        //calculate search box bounds
        int searchStartX = x - Numbers.SEARCH_RADIUS;
        int searchStartY = y - Numbers.SEARCH_RADIUS;
        int searchStartZ = z - Numbers.SEARCH_RADIUS;
        
        int searchEndX = x + Numbers.SEARCH_RADIUS;
        int searchEndY = y + Numbers.SEARCH_RADIUS;
        int searchEndZ = z + Numbers.SEARCH_RADIUS;
        
        TileOrb tileOrb = null;
        
        Coordinates location = null;
        //search for the world
        for (int a = searchStartX; a < searchEndX; a ++){
            for (int b = searchStartY; b < searchEndY; b++){
                for (int c = searchStartZ; c < searchEndZ; c++){
                    if (world.blockHasTileEntity(a,  b, c) && world.getBlockTileEntity(a, b, c) == tileOrb){
                            location.x = a;
                            location.y = b;
                            location.z = c;
                            location.active = true;
                    }
                }
            }
        }
        return location;
    }
}
