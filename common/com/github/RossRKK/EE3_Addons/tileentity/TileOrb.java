package com.github.RossRKK.EE3_Addons.tileentity;

import com.github.RossRKK.EE3_Addons.datatypes.Coordinates;
import com.github.RossRKK.EE3_Addons.world.WorldScanner;
import com.pahimar.ee3.tileentity.TileEE;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class TileOrb extends TileEE{
    
    //Variables
    public static boolean isActive = false;
    
    public void activate(World world, int x, int y, int z){
        Coordinates orbLocate = WorldScanner.WorldScan(world, xCoord, yCoord, zCoord);
        if (orbLocate.active){
            System.out.println("Activated");
            System.out.println(orbLocate.x + orbLocate.y + orbLocate.z);
            isActive = true;
        }else{
            System.out.println("Activation Failed");
            isActive = false;
        }
    }
    //coordinates of the tile entity
    
    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound){
        //writes state to nbt
        NBTTagCompound tagCompound = new NBTTagCompound();
        tagCompound.setBoolean("Active", isActive);
        tagCompound.setShort("x", (short) xCoord);
        tagCompound.setShort("y", (short) yCoord);
        tagCompound.setShort("z", (short) zCoord);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound){
        super.readFromNBT(nbtTagCompound);
        //reads state from nbt
        NBTTagCompound tagCompound = new NBTTagCompound();
        isActive = tagCompound.getBoolean("Active");
    }
}
