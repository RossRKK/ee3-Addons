package com.github.RossRKK.EE3_Addons.block;

import com.pahimar.ee3.EquivalentExchange3;
import net.minecraft.block.material.Material;

public class BlockPedestal extends ModBlock{

    public BlockPedestal(int id) {
        super(id, Material.rock);
        this.setUnlocalizedName("pedestal");
        this.setCreativeTab(EquivalentExchange3.tabsEE3);
        this.setHardness(5F);
    }
}