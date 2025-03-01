package net.mcreator.betterneon.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class SetZSGNeonLT1Procedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "entities")) {
				entityiterator.getPersistentData().putBoolean("ZSGNeonLT1", (BoolArgumentType.getBool(arguments, "Bool")));
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
