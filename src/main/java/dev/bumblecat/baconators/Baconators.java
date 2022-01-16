package dev.bumblecat.baconators;

import dev.bumblecat.baconators.common.objects.items.Baconator;
import dev.bumblecat.bumblecore.common.objects.items.Variables;
import dev.bumblecat.bumblecore.common.register.Registry;
import dev.bumblecat.foodsicles.Foodsicles;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod(Baconators.MOD)
public class Baconators {
    public static final String MOD = "baconators";

    @ObjectHolder("baconator")
    public static final Baconator
            BACONATOR = null;

    public Baconators() {
        Registry.register("baconator", ()
                -> new Baconator(new Variables()
                .setStackSize(1)
                .setCreativeTab(Foodsicles.creativeTab))
        );
    }
}
