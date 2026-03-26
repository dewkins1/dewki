package net.mcreator.dewkins.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.dewkins.network.DewkinsModVariables;
import net.mcreator.dewkins.init.DewkinsModBlocks;

import java.util.Map;

@Mod.EventBusSubscriber
public class AltarFirstLvlProcedure {
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
		if (DewkinsModVariables.MapVariables.get(world).lightmatic == true) {
			if (DewkinsModVariables.MapVariables.get(world).AltarLvl == 0) {
				DewkinsModVariables.MapVariables.get(world).ox = 0;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).oy = 0;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).oz = -2;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index0 = 0; index0 < 3; index0++) {
					DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					DewkinsModVariables.MapVariables.get(world).ox = -7;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					for (int index1 = 0; index1 < 13; index1++) {
						DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox + 1;
						DewkinsModVariables.MapVariables.get(world).syncData(world);
						if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
								DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
							{
								BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
										DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
								BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).ox = -2;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index2 = 0; index2 < 3; index2++) {
					DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					DewkinsModVariables.MapVariables.get(world).oz = -7;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					for (int index3 = 0; index3 < 13; index3++) {
						DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
						DewkinsModVariables.MapVariables.get(world).syncData(world);
						if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
								DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
							{
								BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
										DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
								BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).ox = -4;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index4 = 0; index4 < 7; index4++) {
					DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					DewkinsModVariables.MapVariables.get(world).oz = -6;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					for (int index5 = 0; index5 < 11; index5++) {
						DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
						DewkinsModVariables.MapVariables.get(world).syncData(world);
						if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
								DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
							{
								BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
										DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
								BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).oz = -4;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index6 = 0; index6 < 7; index6++) {
					DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					DewkinsModVariables.MapVariables.get(world).ox = -6;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					for (int index7 = 0; index7 < 11; index7++) {
						DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox + 1;
						DewkinsModVariables.MapVariables.get(world).syncData(world);
						if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
								DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
							{
								BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
										DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
								BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).oz = -6;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).ox = -6;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index8 = 0; index8 < 11; index8++) {
					DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
							DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
									DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
							BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).oz = -6;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).ox = 6;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index9 = 0; index9 < 11; index9++) {
					DewkinsModVariables.MapVariables.get(world).ox = DewkinsModVariables.MapVariables.get(world).ox - 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					DewkinsModVariables.MapVariables.get(world).oz = DewkinsModVariables.MapVariables.get(world).oz + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
							DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
									DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
							BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).oy = -1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).oz = -5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).ox = -5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index10 = 0; index10 < 4; index10++) {
					DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
							DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
									DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
							BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).oy = -1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).oz = 5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).ox = -5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index11 = 0; index11 < 4; index11++) {
					DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
							DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
									DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
							BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).oy = -1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).oz = -5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).ox = 5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index12 = 0; index12 < 4; index12++) {
					DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
							DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
									DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
							BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
				DewkinsModVariables.MapVariables.get(world).oy = -1;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).oz = 5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				DewkinsModVariables.MapVariables.get(world).ox = 5;
				DewkinsModVariables.MapVariables.get(world).syncData(world);
				for (int index13 = 0; index13 < 4; index13++) {
					DewkinsModVariables.MapVariables.get(world).oy = DewkinsModVariables.MapVariables.get(world).oy + 1;
					DewkinsModVariables.MapVariables.get(world).syncData(world);
					if (Blocks.AIR == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
							DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z))).getBlock()) {
						{
							BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).ox + DewkinsModVariables.MapVariables.get(world).x,
									DewkinsModVariables.MapVariables.get(world).oy + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).oz + DewkinsModVariables.MapVariables.get(world).z);
							BlockState _bs = DewkinsModBlocks.ALTAR_STONE_BRICK.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
				if (DewkinsModBlocks.ALTAR_STONE_BRICK
						.get() == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z + 2))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z + 2);
						BlockState _bs = Blocks.AIR.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if (DewkinsModBlocks.ALTAR_STONE_BRICK
						.get() == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x - 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z + 2))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x - 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z + 2);
						BlockState _bs = Blocks.AIR.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if (DewkinsModBlocks.ALTAR_STONE_BRICK
						.get() == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z - 2))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x + 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z - 2);
						BlockState _bs = Blocks.AIR.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if (DewkinsModBlocks.ALTAR_STONE_BRICK
						.get() == (world.getBlockState(BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x - 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z - 2))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(DewkinsModVariables.MapVariables.get(world).x - 2, 0 + DewkinsModVariables.MapVariables.get(world).y, DewkinsModVariables.MapVariables.get(world).z - 2);
						BlockState _bs = Blocks.AIR.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		}
	}
}
