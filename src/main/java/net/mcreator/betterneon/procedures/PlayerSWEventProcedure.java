package net.mcreator.betterneon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerSWEventProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(double x, double y, double z, Entity entity) {
		execute(null, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity Entity_1 = null;
		Entity_1 = entity.getVehicle();
		if (!(Entity_1 == null)) {
			if (Entity_1.getPersistentData().getBoolean("WFXC")) {
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("WFXC_2");
					if (_so == null)
						_so = _sc.addObjective("WFXC_2", ObjectiveCriteria.DUMMY, new TextComponent("WFXC_2"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("WFXC_X");
					if (_so == null)
						_so = _sc.addObjective("WFXC_X", ObjectiveCriteria.DUMMY, new TextComponent("WFXC_X"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) x);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("WFXC_Y");
					if (_so == null)
						_so = _sc.addObjective("WFXC_Y", ObjectiveCriteria.DUMMY, new TextComponent("WFXC_Y"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) y);
				}
				{
					Entity _ent = entity;
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective("WFXC_Z");
					if (_so == null)
						_so = _sc.addObjective("WFXC_Z", ObjectiveCriteria.DUMMY, new TextComponent("WFXC_Z"), ObjectiveCriteria.RenderType.INTEGER);
					_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) z);
				}
			}
		}
		if (entity.getPersistentData().getBoolean("NaiWuRan")) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("NaiWuRanG");
				if (_so == null)
					_so = _sc.addObjective("NaiWuRanG", ObjectiveCriteria.DUMMY, new TextComponent("NaiWuRanG"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
		}
		if (entity.getPersistentData().getBoolean("ZSGNeonLT1")) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("ZSGNeonLT1G");
				if (_so == null)
					_so = _sc.addObjective("ZSGNeonLT1G", ObjectiveCriteria.DUMMY, new TextComponent("ZSGNeonLT1G"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
		}
	}
}
