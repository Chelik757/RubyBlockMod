package com.cheloviymod.ruby;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(RubyMod.MOD_ID)
public class RubyMod {
    public static final String MOD_ID = "cheloviymod";

    public RubyMod(IEventBus modEventBus) {
        // 1. Регистрируем блоки и предметы
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        // 2. ВАЖНО: Подписываем метод addCreative на Mod Bus (modEventBus), а не на NeoForge.EVENT_BUS
        modEventBus.addListener(this::addCreative);
    }

    // 3. Метод для добавления в креатив. Убираем @SubscribeEvent, так как подписываемся вручную выше
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.RUBY_BLOCK_ITEM);
            event.accept(ModItems.RUBY_ORE_ITEM);
        }
    }
}
