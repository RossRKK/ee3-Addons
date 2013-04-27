package com.github.RossRKK.EE3_Addons.tileentity;

import com.github.RossRKK.EE3_Addons.DataTypes.Coordinates;
import com.github.RossRKK.EE3_Addons.World.WorldScanner;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileOrb extends TileEntity{
    
    //Variables
    public static boolean isActive = false;
    
    public static void activate(World world, int x, int y, int z){
        Coordinates orbLocate = WorldScanner.WorldScan(world, x, y, z);
        if (orbLocate.active){
            System.out.println("Activated");
            System.out.println(orbLocate.x + orbLocate.y + orbLocate.z);
            isActive = true;
        }else{
            System.out.println("Activation Failed");
            isActive = false;
        }
    }
    
    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound){
        super.writeToNBT(nbtTagCompound);
        //writes state to nbt
        NBTTagCompound tagCompound = new NBTTagCompound();
        tagCompound.setBoolean("Active", isActive);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound){
        super.readFromNBT(nbtTagCompound);
        //reads state from nbt
        NBTTagCompound tagCompound = new NBTTagCompound();
        boolean isActive = tagCompound.getBoolean("Active");
    }
}
