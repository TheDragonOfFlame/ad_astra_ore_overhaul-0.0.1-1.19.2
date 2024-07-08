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

public class TConstructOres {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdAstraOreOverhaul.MOD_ID);

    // Cobalt
    public static final RegistryObject<Block> GLACIO_COBALT_ORE = ModBlocks.registerBlock("glacio_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_COBALT_ORE = ModBlocks.registerBlock("mars_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_COBALT_ORE = ModBlocks.registerBlock("mercury_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_COBALT_ORE = ModBlocks.registerBlock("moon_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_COBALT_ORE = ModBlocks.registerBlock("venus_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> STONE_COBALT_ORE = ModBlocks.registerBlock("stone_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = ModBlocks.registerBlock("deepslate_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
