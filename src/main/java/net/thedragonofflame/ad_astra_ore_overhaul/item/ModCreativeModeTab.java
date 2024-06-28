package net.thedragonofflame.ad_astra_ore_overhaul.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.thedragonofflame.ad_astra_ore_overhaul.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab AAOO = new CreativeModeTab("aaoo_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MOON_QUARTZ_ORE.get());
        }
    };
}
