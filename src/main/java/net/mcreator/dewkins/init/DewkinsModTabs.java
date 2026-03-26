
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dewkins.init;

import net.mcreator.dewkins.DewkinsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DewkinsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DewkinsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DewkinsModBlocks.ALTAR_STONE_BRICK.get().asItem());
			tabData.accept(DewkinsModBlocks.ALTAR_SLAB.get().asItem());
			tabData.accept(DewkinsModBlocks.ALTAR_MAGMA.get().asItem());
		}
	}
}
