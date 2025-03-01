package net.mcreator.betterneon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.betterneon.init.BetterNeonModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerFHEventProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("WFXC_2", entity) != 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("WFXC_2");
				if (_so == null)
					_so = _sc.addObjective("WFXC_2", ObjectiveCriteria.DUMMY, new TextComponent("WFXC_2"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			{
				Entity _ent = entity;
				_ent.teleportTo((new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("WFXC_X", entity)), (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("WFXC_Y", entity)), (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("WFXC_Z", entity)));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((new Object() {
						public int getScore(String score, Entity _ent) {
							Scoreboard _sc = _ent.getLevel().getScoreboard();
							Objective _so = _sc.getObjective(score);
							if (_so != null)
								return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
							return 0;
						}
					}.getScore("WFXC_X", entity)), (new Object() {
						public int getScore(String score, Entity _ent) {
							Scoreboard _sc = _ent.getLevel().getScoreboard();
							Objective _so = _sc.getObjective(score);
							if (_so != null)
								return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
							return 0;
						}
					}.getScore("WFXC_Y", entity)), (new Object() {
						public int getScore(String score, Entity _ent) {
							Scoreboard _sc = _ent.getLevel().getScoreboard();
							Objective _so = _sc.getObjective(score);
							if (_so != null)
								return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
							return 0;
						}
					}.getScore("WFXC_Z", entity)), _ent.getYRot(), _ent.getXRot());
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("NaiWuRanG", entity) != 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("NaiWuRanG");
				if (_so == null)
					_so = _sc.addObjective("NaiWuRanG", ObjectiveCriteria.DUMMY, new TextComponent("NaiWuRanG"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
			if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.BCNWR)) {
				NaIWuRanChuFaProcedure.execute(entity);
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("ZSGNeonLT1G", entity) != 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("ZSGNeonLT1G");
				if (_so == null)
					_so = _sc.addObjective("ZSGNeonLT1G", ObjectiveCriteria.DUMMY, new TextComponent("ZSGNeonLT1G"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.BCNWR)) {
				CFZSGNeonLT1Procedure.execute(entity);
			}
		}
	}
}
