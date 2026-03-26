
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dewkins.init;

import net.mcreator.dewkins.block.AltarStoneBrickBlock;
import net.mcreator.dewkins.block.AltarSlabBlock;
import net.mcreator.dewkins.block.AltarMagmaBlock;
import net.mcreator.dewkins.DewkinsMod;

public class DewkinsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DewkinsMod.MODID);
	public static final RegistryObject<Block> ALTAR_STONE_BRICK = REGISTRY.register("altar_stone_brick", () -> new AltarStoneBrickBlock());
	public static final RegistryObject<Block> ALTAR_SLAB = REGISTRY.register("altar_slab", () -> new AltarSlabBlock());
	public static final RegistryObject<Block> ALTAR_MAGMA = REGISTRY.register("altar_magma", () -> new AltarMagmaBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
