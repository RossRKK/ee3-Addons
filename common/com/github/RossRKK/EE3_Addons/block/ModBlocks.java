package com.github.RossRKK.EE3_Addons.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    //Block instances
    public static Block pedestal;
    
    public static void init(){
        pedestal = new BlockPedestal(3000);
        
        GameRegistry.registerBlock(pedestal, "Pedestal");
    }
}
