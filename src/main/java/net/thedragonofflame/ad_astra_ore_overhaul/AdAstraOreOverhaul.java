package net.thedragonofflame.ad_astra_ore_overhaul;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thedragonofflame.ad_astra_ore_overhaul.block.CNewAgeOres;
import net.thedragonofflame.ad_astra_ore_overhaul.block.CreateOres;
import net.thedragonofflame.ad_astra_ore_overhaul.block.MekanismOres;
import net.thedragonofflame.ad_astra_ore_overhaul.block.ModBlocks;
import net.thedragonofflame.ad_astra_ore_overhaul.config.AAOOClientConfigs;
import net.thedragonofflame.ad_astra_ore_overhaul.config.AAOOCommonConfigs;
import net.thedragonofflame.ad_astra_ore_overhaul.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AdAstraOreOverhaul.MOD_ID)
public class AdAstraOreOverhaul
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "aaoo";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "ad_astra_ore_overhaul" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
    public AdAstraOreOverhaul() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AAOOCommonConfigs.SPEC,
                "aaoo-common.toml");

        if (ModList.get().isLoaded("mekanism")){
            MekanismOres.register(modEventBus);
        }

        if (ModList.get().isLoaded("create")){
            CreateOres.register(modEventBus);
        }

        if (ModList.get().isLoaded("create_new_age")){
            CNewAgeOres.register(modEventBus);
        }

        MinecraftForge.EVENT_BUS.register(this);
    }
}