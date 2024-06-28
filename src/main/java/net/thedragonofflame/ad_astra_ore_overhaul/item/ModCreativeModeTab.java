package net.thedragonofflame.ad_astra_ore_overhaul.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AAOO = new CreativeModeTab("aaoo_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOONROCK.get());
        }
    };
}
