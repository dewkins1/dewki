package net.mcreator.dewkins.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.dewkins.network.DewkinsModVariables;

@Mod.EventBusSubscriber
public class FirstLogicProcedure {
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
		if (DewkinsModVariables.MapVariables.get(world).lightmatic) {
			DewkinsModVariables.MapVariables.get(world).firstLogic = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).ox = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index0 = 0; index0 < 9; index0++) {
				DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox - 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).oz = 5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index1 = 0; index1 < 9; index1++) {
					DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz - 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
							DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
							.getBlock() == Blocks.STONE_BRICKS) {
						DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
						DewkinsModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = -1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index2 = 0; index2 < 4; index2++) {
				DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = -1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index3 = 0; index3 < 4; index3++) {
				DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = -1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index4 = 0; index4 < 4; index4++) {
				DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oy = -1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index5 = 0; index5 < 4; index5++) {
				DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).oy = 0;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).ox = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 4;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index6 = 0; index6 < 7; index6++) {
				DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz - 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = 4;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index7 = 0; index7 < 7; index7++) {
				DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox - 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -4;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index8 = 0; index8 < 7; index8++) {
				DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = -4;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -5;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index9 = 0; index9 < 7; index9++) {
				DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 6;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index10 = 0; index10 < 3; index10++) {
				DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox - 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = 6;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = 1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index11 = 0; index11 < 3; index11++) {
				DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz - 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = -1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -6;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index12 = 0; index12 < 3; index12++) {
				DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			DewkinsModVariables.MapVariables.get(world).ox = -6;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			DewkinsModVariables.MapVariables.get(world).oz = -1;
			DewkinsModVariables.MapVariables.get(world).syncData(world);
			for (int index13 = 0; index13 < 3; index13++) {
				DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				if ((world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
						DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z)))
						.getBlock() == Blocks.STONE_BRICKS) {
					DewkinsModVariables.MapVariables.get(world).firstLogic = DewkinsModVariables.MapVariables.get(world).firstLogic + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (129 == DewkinsModVariables.MapVariables.get(world).firstLogic || 133 == DewkinsModVariables.MapVariables.get(world).firstLogic) {
				if (DewkinsModVariables.MapVariables.get(world).AltarLvl == 0) {
					DewkinsModVariables.MapVariables.get(world).AltarLvl = 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				DewkinsModVariables.MapVariables.get(world).AltarLvl = 0;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
