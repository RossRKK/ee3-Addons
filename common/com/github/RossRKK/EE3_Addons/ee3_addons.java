package com.github.RossRKK.EE3_Addons;
import com.github.RossRKK.EE3_Addons.block.ModBlocks;
import com.github.RossRKK.EE3_Addons.lib.Reference;
import com.github.RossRKK.EE3_Addons.recipes.CopperTransmute;
import com.github.RossRKK.EE3_Addons.recipes.TransmutationStone;
import com.pahimar.ee3.item.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ee3_addons
{
    @PreInit
    public void ModsToLoad(FMLPreInitializationEvent event){
        ModBlocks.init();
        ModItems.init();
    }
    
    @Init
    public void load(FMLInitializationEvent event)
    {
        TransmutationStone.init();
    }
    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event){
        CopperTransmute.init();
    }
}
