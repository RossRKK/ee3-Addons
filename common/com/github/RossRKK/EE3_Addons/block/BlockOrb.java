package com.github.RossRKK.EE3_Addons.block;

import com.pahimar.ee3.EquivalentExchange3;
import net.minecraft.block.material.Material;

public class BlockOrb extends ModBlock{
    
    public static boolean isActive;

    public BlockOrb(int id) {
        super(id, Material.anvil);
        this.setUnlocalizedName("pedestal");
        this.setCreativeTab(EquivalentExchange3.tabsEE3);
        this.setHardness(5F);
        isActive = false;
    }

    public static void activate(){
        isActive = true;
    }
}