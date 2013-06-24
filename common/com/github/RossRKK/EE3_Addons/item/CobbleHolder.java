package com.github.RossRKK.EE3_Addons.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.github.RossRKK.EE3_Addons.lib.Strings;
import com.pahimar.ee3.EquivalentExchange3;


public class CobbleHolder extends ItemAddon {

    public CobbleHolder(int id) {
        super(id);
        maxStackSize = 1;
        this.setUnlocalizedName(Strings.COBBLE_HOLDER_NAME);
        this.setCreativeTab(EquivalentExchange3.tabsEE3);
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        
        
        int cobbleHeld = 0;
        boolean cobbleAbsorbed = false;
        if (cobbleAbsorbed) {
            for (int i = 0; i < 36; i++) {
                if (par3EntityPlayer.inventory.getStackInSlot(i).itemID == 4) {
                cobbleHeld= cobbleHeld + par3EntityPlayer.inventory.getStackInSlot(i).stackSize;
                }
            }
            par3EntityPlayer.inventory.clearInventory(4, -1);
        } else {
            
        }
        return par1ItemStack;
        
    }

}
