package com.cheloviymod.ruby;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(RubyMod.MOD_ID)
public class RubyMod {
    public static final String MOD_ID = "cheloviymod";

    public RubyMod(IEventBus modEventBus) {
        // Регистрируем наши блоки и предметы
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}