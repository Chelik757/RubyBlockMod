package com.cheloviymod.ruby;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Создаем регистратор для предметов
    public static final DeferredRegister.Items ITEMS = 
            DeferredRegister.createItems(RubyMod.MOD_ID);

    // Сам предмет "Рубин"
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem(
            "ruby",
            new Item.Properties() // Базовые свойства предмета
    );
}