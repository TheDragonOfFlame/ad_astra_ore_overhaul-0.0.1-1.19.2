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

    // Fluorite
    public static final RegistryObject<Block> GLACIO_FLUORITE_ORE = ModBlocks.registerBlock("glacio_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_FLUORITE_ORE = ModBlocks.registerBlock("mars_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_FLUORITE_ORE = ModBlocks.registerBlock("mercury_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_FLUORITE_ORE = ModBlocks.registerBlock("moon_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_FLUORITE_ORE = ModBlocks.registerBlock("venus_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    // Lead
    public static final RegistryObject<Block> GLACIO_LEAD_ORE = ModBlocks.registerBlock("glacio_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_LEAD_ORE = ModBlocks.registerBlock("mars_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_LEAD_ORE = ModBlocks.registerBlock("mercury_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_LEAD_ORE = ModBlocks.registerBlock("moon_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_LEAD_ORE = ModBlocks.registerBlock("venus_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

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

    // Uranium
    public static final RegistryObject<Block> GLACIO_URANIUM_ORE = ModBlocks.registerBlock("glacio_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MARS_URANIUM_ORE = ModBlocks.registerBlock("mars_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MERCURY_URANIUM_ORE = ModBlocks.registerBlock("mercury_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> MOON_URANIUM_ORE = ModBlocks.registerBlock("moon_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);
    public static final RegistryObject<Block> VENUS_URANIUM_ORE = ModBlocks.registerBlock("venus_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f, 6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AAOO);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
