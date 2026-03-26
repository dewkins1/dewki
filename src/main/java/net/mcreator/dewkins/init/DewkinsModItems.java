
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dewkins.init;

import net.mcreator.dewkins.DewkinsMod;

public class DewkinsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DewkinsMod.MODID);
	public static final RegistryObject<Item> ALTAR_STONE_BRICK = block(DewkinsModBlocks.ALTAR_STONE_BRICK);
	public static final RegistryObject<Item> ALTAR_SLAB = block(DewkinsModBlocks.ALTAR_SLAB);
	public static final RegistryObject<Item> ALTAR_MAGMA = block(DewkinsModBlocks.ALTAR_MAGMA);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
