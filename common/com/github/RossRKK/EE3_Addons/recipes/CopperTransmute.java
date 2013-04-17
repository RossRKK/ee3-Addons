package com.github.RossRKK.EE3_Addons.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pahimar.ee3.core.helper.RecipeHelper;
import com.pahimar.ee3.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopperTransmute {
    private static ItemStack philStone = new ItemStack(ModItems.philStone, 1,
            OreDictionary.WILDCARD_VALUE);
    private static ItemStack miniumStone = new ItemStack(ModItems.miniumStone,
            1, OreDictionary.WILDCARD_VALUE);

    public static List<ItemStack> transmutationStones = Arrays.asList(
            miniumStone, philStone);

    public static void init() {
        for (ItemStack stone : transmutationStones) {
            copper(stone);
            tin(stone);
            silver(stone);
        }
    }

    public static void tin(ItemStack transmutationStone){
        try{
            ArrayList<ItemStack> tinOres = OreDictionary.getOres("ingotTin");
            ItemStack tinItemStack = tinOres.get(0);
            tinItemStack.stackSize = 3;
            Item tinItem = tinItemStack.getItem();
            RecipeHelper.addRecipe(tinItemStack, transmutationStone, Item.ingotIron, Item.ingotIron, Item.ingotIron);
            RecipeHelper.addRecipe(new ItemStack(Item.ingotIron, 1), transmutationStone, tinItem);
        }catch (Exception e) {/*Swallowed*/}
    }
    
    public static void silver(ItemStack transmutationStone){
        try{
            ArrayList<ItemStack> silverOres = OreDictionary.getOres("ingotSilver");
            ItemStack silverItemStack = silverOres.get(0);
            silverItemStack.stackSize = 2;
            Item silverItem = silverItemStack.getItem();
            RecipeHelper.addRecipe(silverItemStack, transmutationStone, Item.ingotGold, Item.ingotGold);
            RecipeHelper.addRecipe(new ItemStack(Item.ingotGold, 1), transmutationStone, silverItem);
        }catch (Exception e) {/*Swallowed*/}
    }
    
    public static void copper(ItemStack transmutationStone) {
        try {
            ArrayList<ItemStack> copperOres = OreDictionary.getOres("ingotCopper");
            ItemStack copperItemStack = copperOres.get(0);
            copperItemStack.stackSize = 2;
            Item copperItem = copperItemStack.getItem();
            RecipeHelper.addRecipe(copperItemStack, transmutationStone,Item.ingotIron, Item.ingotIron);
            RecipeHelper.addRecipe(new ItemStack(Item.ingotIron, 1), transmutationStone, copperItem);
        } catch (Exception e) {/* Swallowed */}
    }
}