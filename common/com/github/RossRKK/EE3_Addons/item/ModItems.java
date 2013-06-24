package com.github.RossRKK.EE3_Addons.item;

import com.github.RossRKK.EE3_Addons.lib.Numbers;

import net.minecraft.item.Item;

public class ModItems {
    
    public static Item cobbleHolder;
    
    public static void init () {
        cobbleHolder = new CobbleHolder(Numbers.COBBLE_HOLDER_ID);
    }
}
