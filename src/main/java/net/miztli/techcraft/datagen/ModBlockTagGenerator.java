package net.miztli.techcraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.miztli.techcraft.TechCraft;
import net.miztli.techcraft.block.ModBlocks;
import net.miztli.techcraft.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TechCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.PROSPECTOR_PICK_VALUABLES)
                .add(ModBlocks.NETHER_FIRE_ORE.get()).addTag(Tags.Blocks.ORES);


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.FIRE_BLOCK.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHER_FIRE_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.SOUND_BLOCK.get()
                );

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);


        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.OBSIDIAN_BRICKSTONE.get());


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.NETHER_FIRE_ORE.get(),
                        ModBlocks.FIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.OBSIDIAN_BRICKSTONE.get(),
                        ModBlocks.SOUND_BLOCK.get()

                        );
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());

    }
}
