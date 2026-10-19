package com.cheloviymod.ruby;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    // Создаем регистратор для блоков
    public static final DeferredRegister.Blocks BLOCKS = 
            DeferredRegister.createBlocks(RubyMod.MOD_ID);

    // 1. Рубиновый блок
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock(
            "ruby_block",
            BlockBehaviour.Properties.of()
                    .strength(5.0F, 6.0F) // Прочность (как у железного блока)
                    .requiresCorrectToolForDrops() // Требует кирку для дропа
                    .sound(SoundType.METAL) // Звук металла
                    .mapColor(MapColor.COLOR_RED) // Красный цвет на карте
    );

    // 2. Рубиновая руда
    public static final DeferredBlock<Block> RUBY_ORE = BLOCKS.registerSimpleBlock(
            "ruby_ore",
            BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F) // Прочность (как у каменной руды)
                    .requiresCorrectToolForDrops() // Требует кирку для дропа
                    .sound(SoundType.STONE) // Звук камня
                    .mapColor(MapColor.STONE) // Серый цвет на карте
    );
}