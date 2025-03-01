package net.mcreator.betterneon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.CommandEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterneon.init.BetterNeonModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EeeProcedure {
	@SubscribeEvent
	public static void onCommand(CommandEvent event) {
		Entity entity = event.getParseResults().getContext().getSource().getEntity();
		if (entity != null) {
			execute(event, entity.level, entity, event.getParseResults().getReader().getString());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, String command) {
		execute(null, world, entity, command);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, String command) {
		if (entity == null || command == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.NWRSH)) {
			if (entity.getPersistentData().getBoolean("NaiWuRan") && ((command.replace("/", "")).startsWith("untf ") || (command.replace("/", "")).startsWith("untransfur "))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
