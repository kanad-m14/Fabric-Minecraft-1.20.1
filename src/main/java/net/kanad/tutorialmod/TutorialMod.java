package net.kanad.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.kanad.tutorialmod.block.ModBlocks;
import net.kanad.tutorialmod.entity.ModEntities;
import net.kanad.tutorialmod.entity.custom.PorcupineEntity;
import net.kanad.tutorialmod.item.ModItemGroups;
import net.kanad.tutorialmod.item.ModItems;
import net.kanad.tutorialmod.util.ModCustomTrades;
import net.kanad.tutorialmod.util.ModRegistries;
import net.kanad.tutorialmod.villager.ModVillagers;
import net.kanad.tutorialmod.world.gen.ModWorldGeneration;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();

		ModRegistries.registerModStuff();

		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
		ModEntities.registerModEntities();

		ModWorldGeneration.generateModWorldGen();

		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LEAVES, 30, 60);

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.END_STONE_RUBY_ORE)
				.lightWithItem(ModItems.RUBY_STAFF)
				.destDimID(new Identifier(TutorialMod.MOD_ID, "kanaddim"))
				.tintColor(85,85,255)
				.registerPortal();
	}
}