
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dewkins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.DefaultAttributes;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;

import net.mcreator.dewkins.DewkinsMod;

import java.util.stream.Collectors;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DewkinsModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, DewkinsMod.MODID);
	public static final RegistryObject<Attribute> RE = REGISTRY.register("re", () -> new RangedAttribute("attribute.dewkins.re", 0, 0, 1).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		List.of(EntityType.ARMOR_STAND).stream().filter(DefaultAttributes::hasSupplier).map(entityType -> (EntityType<? extends LivingEntity>) entityType).collect(Collectors.toList()).forEach(entity -> event.add(entity, RE.get()));
	}
}
