package net.miztli.techcraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.miztli.techcraft.TechCraft;
import net.miztli.techcraft.item.ModItems;
import net.miztli.techcraft.loot.AddItemModifier;
import net.miztli.techcraft.loot.AddSusSandItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, TechCraft.MOD_ID);
    }

    @Override
    protected void start() {

        add("onyx_from_grass" , new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance( 0.35f).build()},ModItems.ONYX.get()));

        add("sapphire_from_zombie" , new AddItemModifier(new LootItemCondition[] {
                new  LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build()}, ModItems.SAPPHIRE.get()));

        add("onyx_from_creeper" , new AddItemModifier(new LootItemCondition[] {
                new  LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build()}, ModItems.ONYX.get()));

        add("metal_detector_from_jungle_temples" , new AddItemModifier(new LootItemCondition[] {
                new  LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build()}, ModItems.PROSPECTOR_PICK.get()));

        add("metal_detector_from_suspicious_sand" , new AddSusSandItemModifier(new LootItemCondition[] {
                new  LootTableIdCondition.Builder(new ResourceLocation("archeology/desert_pyramid")).build()}, ModItems.PROSPECTOR_PICK.get()));

    }
}
