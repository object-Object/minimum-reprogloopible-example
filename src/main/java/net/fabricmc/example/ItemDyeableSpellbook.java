package net.fabricmc.example;

import at.petrak.hexcasting.common.items.ItemSpellbook;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;

public class ItemDyeableSpellbook extends ItemSpellbook
    implements DyeableItem // comment this out to stop crashing
{
    public ItemDyeableSpellbook(Settings properties) {
        super(properties);
    }

    @Override
    public int getColor(ItemStack stack){
        return 0;
    }
}
