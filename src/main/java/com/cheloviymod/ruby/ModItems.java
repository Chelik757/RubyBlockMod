package com.cheloviymod.ruby;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = 
            DeferredRegister.createItems(RubyMod.MOD_ID);

    // Твой рубин (он уже работает)
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem(
            "ruby",
            new Item.Properties()
    );

    // РЕГИСТРАЦИЯ ПРЕДМЕТОВ ДЛЯ БЛОКОВ (BlockItem)
    // Названия должны совпадать с названиями блоков в ModBlocks!
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "ruby_block", 
            ModBlocks.RUBY_BLOCK
    );

    public static final DeferredItem<BlockItem> RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "ruby_ore", 
            ModBlocks.RUBY_ORE
    );
}
