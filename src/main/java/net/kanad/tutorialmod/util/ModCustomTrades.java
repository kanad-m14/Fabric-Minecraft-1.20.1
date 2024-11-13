package net.kanad.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.kanad.tutorialmod.block.ModBlocks;
import net.kanad.tutorialmod.item.ModItems;
import net.kanad.tutorialmod.villager.ModVillagers;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                     factories.add((entity, random) -> new TradeOffer(
                             new ItemStack(Items.EMERALD, 2),
                             new ItemStack(ModItems.RUBY_HOE, 1),
                             3,4,0.25f
                     ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.RUBY_SHOVEL, 1),
                            1,3,0.55f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(ModItems.RUBY_PICKAXE, 1),
                            3, 5, 0.45f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(ModItems.RUBY_AXE, 1),
                            2,5,0.45f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 12),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 2),
                            3, 5, 0.45f
                    ));
                });
        
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 16),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            1, 12, 0.075f));
                });
    }
}
