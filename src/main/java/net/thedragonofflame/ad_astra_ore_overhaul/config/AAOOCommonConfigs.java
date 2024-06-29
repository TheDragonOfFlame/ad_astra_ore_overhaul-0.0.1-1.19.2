package net.thedragonofflame.ad_astra_ore_overhaul.config;
import net.minecraftforge.common.ForgeConfigSpec;

public class AAOOCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> MOON_OSMIUM_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOON_OSMIUM_VEIN_SIZE;

    static {
        BUILDER.push("Configs for Ad Astra Ore Overhaul");

        MOON_OSMIUM_VEINS_PER_CHUNK = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        MOON_OSMIUM_VEIN_SIZE = BUILDER.comment("How many Citrine Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}