package net.mcreator.betterneon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class NeonF1DangZhiWuBeiYouJianDianJiShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(20);
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(20);
	}
}
