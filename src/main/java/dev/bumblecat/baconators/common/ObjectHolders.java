package dev.bumblecat.baconators.common;

import dev.bumblecat.baconators.Baconators;
import dev.bumblecat.baconators.common.objects.items.Baconator;
import dev.bumblecat.bumblecore.common.objects.items.Variables;
import dev.bumblecat.bumblecore.common.register.Registry;
import dev.bumblecat.foodsicles.Foodsicles;

import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Baconators.MOD)
public class ObjectHolders {

    @ObjectHolder("baconator")
    public static final Baconator BACONATOR = null;

    @ObjectHolder("darkosto")
    public static final Baconator DARKOSTO = null;

    @ObjectHolder("matrixis")
    public static final Baconator MATRIXIS = null;

    @ObjectHolder("jason")
    public static final Baconator BASEBALL = null;

    public static void register() {
        Registry.register("baconator", ()
                -> new Baconator(new Variables().setStackSize(1).setCreativeTab(Foodsicles.creativeTab))
        );
        Registry.register("darkosto", ()
                -> new Baconator(new Variables().setStackSize(1).setCreativeTab(Foodsicles.creativeTab))
        );
        Registry.register("matrixis", ()
                -> new Baconator(new Variables().setStackSize(1).setCreativeTab(Foodsicles.creativeTab))
        );
        Registry.register("jason", ()
                -> new Baconator(new Variables().setStackSize(1).setCreativeTab(Foodsicles.creativeTab))
        );
    }

}
