package net.mcreator.betterneon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import java.util.Random;

public class JieNeonWuRanDangShiTiHuiDongWuPinShiProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("NaiWuRan", false);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
