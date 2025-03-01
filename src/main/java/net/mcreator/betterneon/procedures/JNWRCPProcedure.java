package net.mcreator.betterneon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class JNWRCPProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "entities")) {
				entityiterator.getPersistentData().putBoolean("NaiWuRan", (BoolArgumentType.getBool(arguments, "NWR")));
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
