package net.thedragonofflame.ad_astra_ore_overhaul.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thedragonofflame.ad_astra_ore_overhaul.AdAstraOreOverhaul;
import net.thedragonofflame.ad_astra_ore_overhaul.item.ModCreativeModeTab;

public class CreateOres {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdAstraOreOverhaul.MOD_ID);

    // Zinc
    public static final RegistryObject<Block> GLACIO_ZINC_ORE = ModBlocks.registerBlock("glacio_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_ZINC_ORE = ModBlocks.registerBlock("mars_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_ZINC_ORE = ModBlocks.registerBlock("mercury_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_ZINC_ORE = ModBlocks.registerBlock("moon_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_ZINC_ORE = ModBlocks.registerBlock("venus_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
