package net.mcreator.dewkins.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.dewkins.network.DewkinsModVariables;
import net.mcreator.dewkins.init.DewkinsModBlocks;

@Mod.EventBusSubscriber
public class AltarSecondLvlProcedure {
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
		if (DewkinsModVariables.MapVariables.get(world).AltarLvl == 1) {
			DewkinsModVariables.MapVariables.get(world).ox = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if (!((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.MAGMA_BLOCK)) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_MAGMA.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if (!((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.MAGMA_BLOCK)) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_MAGMA.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if (!((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.MAGMA_BLOCK)) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_MAGMA.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if (!((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.MAGMA_BLOCK)) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), DewkinsModBlocks.ALTAR_MAGMA.get().defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).oy = 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).ox = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.CAULDRON.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.CAULDRON.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = 2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.CAULDRON.defaultBlockState(), 3);
			}
			DewkinsModVariables.MapVariables.get(world).ox = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -2;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
					DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + DewkinsModVariables.MapVariables.get(world).ox, DewkinsModVariables.MapVariables.get(world).y + DewkinsModVariables.MapVariables.get(world).oy,
						DewkinsModVariables.MapVariables.get(world).z + DewkinsModVariables.MapVariables.get(world).oz), Blocks.CAULDRON.defaultBlockState(), 3);
			}
		}
	}
}
