package net.quix.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.quix.tutorialmod.TutorialMod;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().hardness(5)), ItemGroup.MISC);

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool().luminance(7)), ItemGroup.MISC);

    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool().luminance(5)), ItemGroup.MISC);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        TutorialMod.LOGGER.debug("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
