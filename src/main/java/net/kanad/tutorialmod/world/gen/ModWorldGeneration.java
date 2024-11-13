package net.kanad.tutorialmod.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOre();

        ModTreeGeneration.generateTrees();
    }
}
