package com.cheloviymod.ruby;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(RubyMod.MOD_ID)
public class RubyMod {
    public static final String MOD_ID = "cheloviymod";

    public RubyMod(IEventBus modEventBus) {
        // 1. Регистрируем наши блоки и предметы
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        // 2. Подписываем этот класс на события игры (нужно для вкладки креатива)
        NeoForge.EVENT_BUS.register(this);
    }

    // 3. Этот метод добавляет блоки в творческую вкладку "Строительные блоки"
    @SubscribeEvent
    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            // ВАЖНО: Здесь мы обращаемся к предметам (BlockItem), которые мы сейчас добавим в ModItems
            event.accept(ModItems.RUBY_BLOCK_ITEM);
            event.accept(ModItems.RUBY_ORE_ITEM);
        }
    }
}
