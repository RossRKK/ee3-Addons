package com.github.RossRKK.EE3_Addons.recipes;

import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pahimar.ee3.core.util.RecipeHelper;
import com.pahimar.ee3.item.ModItems;

public class TransmutationStone {
    private static ItemStack philStone = new ItemStack(ModItems.philStone, 1, OreDictionary.WILDCARD_VALUE);
    private static ItemStack miniumStone = new ItemStack(ModItems.miniumStone, 1, OreDictionary.WILDCARD_VALUE);

    public static List<ItemStack> transmutationStones = Arrays.asList(miniumStone, philStone);
    
    public static void init(){
        for (ItemStack stone : transmutationStones){
            transmutationRecipes(stone);
        }
    }
    
    public static void transmutationRecipes(ItemStack transmutationStone){
        //gravel into flint
        RecipeHelper.addRecipe(new ItemStack(Item.flint, 3), transmutationStone, Block.gravel, Block.gravel, Block.gravel);
    }
    
}
