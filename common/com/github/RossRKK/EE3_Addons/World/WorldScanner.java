package com.github.RossRKK.EE3_Addons.World;

import com.github.RossRKK.EE3_Addons.DataTypes.Coordinates;
import com.github.RossRKK.EE3_Addons.lib.Numbers;

import net.minecraft.world.World;

public class WorldScanner {

    @SuppressWarnings("static-access")
    public static Coordinates WorldScan(World world, int x, int y, int z){
        
        //calculate search box bounds
        int searchStartX = x - Numbers.SEARCH_RADIUS;
        int searchStartY = y - Numbers.SEARCH_RADIUS;
        int searchStartZ = z - Numbers.SEARCH_RADIUS;
        
        int searchEndX = x + Numbers.SEARCH_RADIUS;
        int searchEndY = y + Numbers.SEARCH_RADIUS;
        int searchEndZ = z + Numbers.SEARCH_RADIUS;
        
        Coordinates location = null;
        //search for the world
        for (int a = searchStartX; a < searchEndX; a ++){
            for (int b = searchStartY; b < searchEndY; b++){
                for (int c = searchStartZ; c < searchEndZ; c++){
                    int id = world.getBlockId(a,  b, c);
                    if (id == Numbers.ORB_ID && !(a == x) && !(b == y) && !(c == z)){
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
