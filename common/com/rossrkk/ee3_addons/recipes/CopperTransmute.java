package com.rossrkk.ee3_addons.recipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pahimar.ee3.core.helper.RecipeHelper;
import com.pahimar.ee3.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CopperTransmute
{
    private static ItemStack philStone = new ItemStack(ModItems.philStone, 1, OreDictionary.WILDCARD_VALUE);
    private static ItemStack miniumStone = new ItemStack(ModItems.miniumStone, 1, OreDictionary.WILDCARD_VALUE);
    
    public static List<ItemStack> transmutationStones = Arrays.asList(miniumStone, philStone);
    
    public static void init()
    {
        for (ItemStack stone : transmutationStones) 
        {
            copper(stone);
        }
    }
    
    public static void copper(ItemStack transmutationStone)
    {   
        try
        {
        ArrayList<ItemStack > copperOres = OreDictionary.getOres("ingotCopper");
        ItemStack copperItem = copperOres.get(0);
        RecipeHelper.addRecipe(copperItem, transmutationStone , Item.ingotIron, Item.ingotIron);
        } catch (Exception e){}
    }
}