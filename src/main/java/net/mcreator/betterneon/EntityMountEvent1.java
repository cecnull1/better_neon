package net.mcreator.betterneon;

import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EntityMountEvent1 {
    @SubscribeEvent
    public static void EntityMountEvent(EntityMountEvent event) {
        if (event.isDismounting() && event.getEntityBeingMounted().getPersistentData().getBoolean("WFXC") && event.getEntityMounting().isAlive() && event.getEntityBeingMounted().isAlive()) {
            event.setCanceled(true);
        }
    }
}
