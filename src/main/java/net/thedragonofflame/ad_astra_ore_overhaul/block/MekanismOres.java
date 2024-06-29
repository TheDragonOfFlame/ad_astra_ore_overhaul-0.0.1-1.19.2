package net.thedragonofflame.ad_astra_ore_overhaul.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thedragonofflame.ad_astra_ore_overhaul.AdAstraOreOverhaul;
import net.thedragonofflame.ad_astra_ore_overhaul.item.ModCreativeModeTab;
import net.thedragonofflame.ad_astra_ore_overhaul.item.ModItems;

import java.util.function.Supplier;

public class MekanismOres {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdAstraOreOverhaul.MOD_ID);

    // Osmium
    public static final RegistryObject<Block> GLACIO_OSMIUM_ORE = ModBlocks.registerBlock("glacio_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_OSMIUM_ORE = ModBlocks.registerBlock("mars_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_OSMIUM_ORE = ModBlocks.registerBlock("mercury_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_OSMIUM_ORE = ModBlocks.registerBlock("moon_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_OSMIUM_ORE = ModBlocks.registerBlock("venus_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    // Tin
    public static final RegistryObject<Block> GLACIO_TIN_ORE = ModBlocks.registerBlock("glacio_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_TIN_ORE = ModBlocks.registerBlock("mars_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_TIN_ORE = ModBlocks.registerBlock("mercury_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_TIN_ORE = ModBlocks.registerBlock("moon_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_TIN_ORE = ModBlocks.registerBlock("venus_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
