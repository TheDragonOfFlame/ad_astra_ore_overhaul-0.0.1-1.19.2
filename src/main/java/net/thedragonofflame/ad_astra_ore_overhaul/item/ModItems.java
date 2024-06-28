package net.thedragonofflame.ad_astra_ore_overhaul.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thedragonofflame.ad_astra_ore_overhaul.Ad_Astra_Ore_Overhaul;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ad_Astra_Ore_Overhaul.MOD_ID);

    public static final RegistryObject<Item> MOONROCK = ITEMS.register("moon_rock",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AAOO)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
