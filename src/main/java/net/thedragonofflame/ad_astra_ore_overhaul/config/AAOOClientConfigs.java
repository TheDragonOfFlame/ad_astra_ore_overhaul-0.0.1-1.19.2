package net.thedragonofflame.ad_astra_ore_overhaul.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class AAOOClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for Ad Astra Ore Overhaul");

        // HERE DEFINE YOUR CONFIGS

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}