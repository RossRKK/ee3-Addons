package com.rossrkk.ee3_addons;
import com.rossrkk.ee3_addons.recipes.CopperTransmute;
import com.rossrkk.ee3_addons.lib.Reference;

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
    }
}
