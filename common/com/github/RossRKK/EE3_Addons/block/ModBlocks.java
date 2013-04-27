package com.github.RossRKK.EE3_Addons.block;

import com.github.RossRKK.EE3_Addons.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    //Block instances
    public static Block orb;
    
    public static void init(){
        orb = new BlockOrb(3000);
        
        GameRegistry.registerBlock(orb, Strings.ORB_NAME);
    }
}
