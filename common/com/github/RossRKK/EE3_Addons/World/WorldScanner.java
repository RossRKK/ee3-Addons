package com.github.RossRKK.EE3_Addons.World;

import com.github.RossRKK.EE3_Addons.lib.Numbers;

import net.minecraft.world.World;

public abstract class WorldScanner {
    
    static World world;
    
    public static void WorldScan(int x, int y, int z){
        //calculate search box bounds
        int searchStartX = x - Numbers.SEARCH_RADIUS;
        int searchStartY = y - Numbers.SEARCH_RADIUS;
        int searchStartZ = z - Numbers.SEARCH_RADIUS;
        
        int searchEndX = x + Numbers.SEARCH_RADIUS;
        int searchEndY = y + Numbers.SEARCH_RADIUS;
        int searchEndZ = z + Numbers.SEARCH_RADIUS;
        
        //search for the world
        for (int a = searchStartX; a < searchEndX; a ++){
            for (int b = searchStartY; b < searchEndY; b++){
                for (int c = searchStartZ; c < searchEndZ; c++){
                    world.getBlockId(a, b, c);
                }
            }
        }
    }
}
