package com.github.RossRKK.EE3_Addons.block;

import com.github.RossRKK.EE3_Addons.DataTypes.Coordinates;
import com.github.RossRKK.EE3_Addons.World.WorldScanner;
import com.pahimar.ee3.EquivalentExchange3;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockOrb extends ModBlock{
    
    public static boolean isActive;

    public BlockOrb(int id) {
        super(id, Material.anvil);
        this.setUnlocalizedName("orb");
        this.setCreativeTab(EquivalentExchange3.tabsEE3);
        this.setHardness(5F);
        isActive = false;
    }

    public static void activate(World world, int x, int y, int z){
        Coordinates orbLocate = WorldScanner.WorldScan(world, x, y, z);
        isActive = true;
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {

        activate(world, x, y, z);
        return true;
    }
}