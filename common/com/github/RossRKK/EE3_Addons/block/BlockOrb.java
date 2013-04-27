package com.github.RossRKK.EE3_Addons.block;

import com.github.RossRKK.EE3_Addons.DataTypes.Coordinates;
import com.github.RossRKK.EE3_Addons.World.WorldScanner;
import com.github.RossRKK.EE3_Addons.tileentity.TileOrb;
import com.pahimar.ee3.EquivalentExchange3;
import com.pahimar.ee3.lib.GuiIds;
import com.pahimar.ee3.tileentity.TileAlchemicalChest;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockOrb extends ModBlock{
    
    public static boolean isActive;

    public BlockOrb(int id) {
        super(id, Material.anvil);
        this.setUnlocalizedName("orb");
        this.setCreativeTab(EquivalentExchange3.tabsEE3);
        this.setHardness(5F);
    }

    
    @Override
    public TileEntity createNewTileEntity(World world) {

        return new TileOrb();
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        TileOrb tileOrb = (TileOrb) world.getBlockTileEntity(x, y, z);
        if (tileOrb != null) {
            TileOrb.activate(world, x, y, z);
        }
        return true;
    }
}