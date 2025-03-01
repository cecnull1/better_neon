
package net.mcreator.betterneon.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.betterneon.procedures.SetZSGNeonLT1Procedure;
import net.mcreator.betterneon.procedures.JNWRCPProcedure;

import com.mojang.brigadier.arguments.BoolArgumentType;

@Mod.EventBusSubscriber
public class JieNeonWuRanCommandCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("betterneon")

				.then(Commands.literal("NeonWuRan").then(Commands.argument("entities", EntityArgument.entities()).then(Commands.argument("NWR", BoolArgumentType.bool()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					JNWRCPProcedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("ZSGNeonLT1").then(Commands.argument("entities", EntityArgument.entities()).then(Commands.argument("Bool", BoolArgumentType.bool()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetZSGNeonLT1Procedure.execute(arguments);
					return 0;
				})))));
	}
}
