package net.miztli.techcraft.event;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.miztli.techcraft.TechCraft;
import net.miztli.techcraft.entity.ModEntities;
import net.miztli.techcraft.entity.custom.RhinoEntity;

@Mod.EventBusSubscriber(modid = TechCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
    }

}
