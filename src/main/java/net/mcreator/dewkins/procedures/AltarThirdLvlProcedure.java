package net.mcreator.dewkins.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.dewkins.network.DewkinsModVariables;
import net.mcreator.dewkins.init.DewkinsModBlocks;

@Mod.EventBusSubscriber
public class AltarThirdLvlProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (DewkinsModVariables.MapVariables.get(world).AltarLvl == 2) {
			DewkinsModVariables.MapVariables.get(world).oy = 4;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).ox = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.LIGHTNING_ROD.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.LIGHTNING_ROD.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.LIGHTNING_ROD.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.LIGHTNING_ROD.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 3;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index0 = 0; index0 < 3; index0++) {
				DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox,
						DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy, DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
							DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState(), 3);
				}
			}
			DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_SLAB.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz - 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_SLAB.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz - 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -3;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index1 = 0; index1 < 3; index1++) {
				DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox,
						DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy, DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
							DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState(), 3);
				}
			}
			DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_SLAB.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_SLAB.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = 4;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.CHAIN.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oy = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState(), 3);
			}
		}
	}
}
