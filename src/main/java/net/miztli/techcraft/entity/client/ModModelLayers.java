package net.miztli.techcraft.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.miztli.techcraft.TechCraft;

public class ModModelLayers {
    public static final ModelLayerLocation RHINO_LAYER =
            new ModelLayerLocation(
                    new ResourceLocation(TechCraft.MOD_ID, "rhino_layer"), "main"
            );
}
