package net.fabricmc.example;

import at.petrak.hexcasting.common.lib.HexItems;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.item.ItemStack;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HexItems.FOCUS.getColor(ItemStack.EMPTY);
	}
}
