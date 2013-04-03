package com.github.RossRKK.EE3_Addons;
import com.github.RossRKK.EE3_Addons.lib.Reference;
import com.github.RossRKK.EE3_Addons.recipes.CopperTransmute;
import com.github.RossRKK.EE3_Addons.recipes.TransmutationStone;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ee3_addons
{
    @Init
    public void load(FMLInitializationEvent event)
    {
        CopperTransmute.init();
        TransmutationStone.init();
    }
}
