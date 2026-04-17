package net.miztli.techcraft.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.miztli.techcraft.TechCraft;

public class ModTags {
    public static  class Blocks {

        public static final TagKey<Block> PROSPECTOR_PICK_VALUABLES = tag("prospector_pick_valuables");
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TechCraft.MOD_ID, name));
        }

    }

    public static class Items {

    }
}
