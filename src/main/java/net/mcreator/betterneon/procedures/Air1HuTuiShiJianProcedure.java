package net.mcreator.betterneon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class Air1HuTuiShiJianProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!entity.isPassenger()) {
			(itemstack).setCount(0);
		}
	}
}
