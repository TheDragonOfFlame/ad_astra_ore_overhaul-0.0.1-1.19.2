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

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdAstraOreOverhaul.MOD_ID);

    // Coal
    public static final RegistryObject<Block> MARS_COAL_ORE = ModBlocks.registerBlock("mars_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_COAL_ORE = ModBlocks.registerBlock("mercury_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_COAL_ORE = ModBlocks.registerBlock("moon_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    // Copper
    public static final RegistryObject<Block> MARS_COPPER_ORE = ModBlocks.registerBlock("mars_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_COPPER_ORE = ModBlocks.registerBlock("mercury_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_COPPER_ORE = ModBlocks.registerBlock("moon_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_COPPER_ORE = ModBlocks.registerBlock("venus_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    // Diamond
    public static final RegistryObject<Block> GLACIO_DIAMOND_ORE = ModBlocks.registerBlock("glacio_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_DIAMOND_ORE = ModBlocks.registerBlock("mercury_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_DIAMOND_ORE = ModBlocks.registerBlock("moon_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    // Gold
    public static final RegistryObject<Block> GLACIO_GOLD_ORE = ModBlocks.registerBlock("glacio_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_GOLD_ORE = ModBlocks.registerBlock("mars_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_GOLD_ORE = ModBlocks.registerBlock("mercury_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_GOLD_ORE = ModBlocks.registerBlock("moon_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    // Lapis
    public static final RegistryObject<Block> MARS_LAPIS_ORE = ModBlocks.registerBlock("mars_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_LAPIS_ORE = ModBlocks.registerBlock("mercury_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_LAPIS_ORE = ModBlocks.registerBlock("moon_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_LAPIS_ORE = ModBlocks.registerBlock("venus_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    public static <T extends Block> RegistryObject<T>
        registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item>
        registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
