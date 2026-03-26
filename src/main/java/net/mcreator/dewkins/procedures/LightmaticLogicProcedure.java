package net.mcreator.dewkins.procedures;

import net.mcreator.dewkins.network.DewkinsModVariables;

public class LightmaticLogicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DewkinsModVariables.MapVariables.get(world).x = x;
		DewkinsModVariables.MapVariables.get(world).syncData(world);
		DewkinsModVariables.MapVariables.get(world).y = y;
		DewkinsModVariables.MapVariables.get(world).syncData(world);
		DewkinsModVariables.MapVariables.get(world).z = z;
		DewkinsModVariables.MapVariables.get(world).syncData(world);
		DewkinsModVariables.MapVariables.get(world).AltarLvl = 0;
		DewkinsModVariables.MapVariables.get(world).syncData(world);
		DewkinsModVariables.MapVariables.get(world).lightmatic = true;
		DewkinsModVariables.MapVariables.get(world).syncData(world);
	}
}
