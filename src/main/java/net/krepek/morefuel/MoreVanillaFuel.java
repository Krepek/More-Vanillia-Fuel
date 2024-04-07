package net.krepek.morefuel;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreVanillaFuel implements ModInitializer {
	public static final String MOD_ID = "more-vanilla-fuel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	//Fuel Items
		FuelRegistry.INSTANCE.add(Items.ARROW, 150);
		FuelRegistry.INSTANCE.add(Items.SPECTRAL_ARROW, 150);
		FuelRegistry.INSTANCE.add(Items.BRUSH, 150);
		FuelRegistry.INSTANCE.add(Items.ITEM_FRAME, 150);
		FuelRegistry.INSTANCE.add(Items.GLOW_ITEM_FRAME, 150);
		FuelRegistry.INSTANCE.add(Items.BEEHIVE, 300);
		FuelRegistry.INSTANCE.add(Items.FIRE_CHARGE, 3000);
		FuelRegistry.INSTANCE.add(Items.ARMOR_STAND, 600);
		FuelRegistry.INSTANCE.add(Items.PAINTING, 150);
		FuelRegistry.INSTANCE.add(Items.LEAD, 150);
		FuelRegistry.INSTANCE.add(Items.WARPED_FUNGUS_ON_A_STICK, 300);
		FuelRegistry.INSTANCE.add(Items.CARROT_ON_A_STICK, 300);
		FuelRegistry.INSTANCE.add(Items.BLACK_BED, 300);
		FuelRegistry.INSTANCE.add(Items.BLUE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.BROWN_BED, 300);
		FuelRegistry.INSTANCE.add(Items.CYAN_BED, 300);
		FuelRegistry.INSTANCE.add(Items.GRAY_BED, 300);
		FuelRegistry.INSTANCE.add(Items.GREEN_BED, 300);
		FuelRegistry.INSTANCE.add(Items.LIGHT_BLUE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.LIGHT_GRAY_BED, 300);
		FuelRegistry.INSTANCE.add(Items.LIME_BED, 300);
		FuelRegistry.INSTANCE.add(Items.MAGENTA_BED, 300);
		FuelRegistry.INSTANCE.add(Items.ORANGE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.PINK_BED, 300);
		FuelRegistry.INSTANCE.add(Items.PURPLE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.RED_BED, 300);
		FuelRegistry.INSTANCE.add(Items.WHITE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.YELLOW_BED, 300);
		FuelRegistry.INSTANCE.add(Items.SHIELD, 300);
		FuelRegistry.INSTANCE.add(Items.SWEET_BERRIES, 50);
		FuelRegistry.INSTANCE.add(Items.TORCH, 300);
		FuelRegistry.INSTANCE.add(Items.PAPER, 150);
		FuelRegistry.INSTANCE.add(Items.MAP, 150);
		FuelRegistry.INSTANCE.add(Items.LEVER, 150);
		FuelRegistry.INSTANCE.add(Items.TRIPWIRE_HOOK, 150);
		FuelRegistry.INSTANCE.add(Items.SOUL_TORCH, 300);
		FuelRegistry.INSTANCE.add(Items.REDSTONE_TORCH, 150);
		FuelRegistry.INSTANCE.add(Items.RAIL, 300);
		FuelRegistry.INSTANCE.add(Items.REDSTONE_LAMP, 600);
		FuelRegistry.INSTANCE.add(Items.TARGET, 300);
		FuelRegistry.INSTANCE.add(Items.AZALEA, 300);
		FuelRegistry.INSTANCE.add(Items.FLOWERING_AZALEA, 300);
		FuelRegistry.INSTANCE.add(Items.GLOW_BERRIES, 50);
		FuelRegistry.INSTANCE.add(Items.OAK_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.DARK_OAK_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.SPRUCE_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.BIRCH_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.JUNGLE_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.ACACIA_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.MANGROVE_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.CHERRY_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.AZALEA_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.FLOWERING_AZALEA_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.WRITABLE_BOOK, 150);
		FuelRegistry.INSTANCE.add(Items.BOOK, 150);
		FuelRegistry.INSTANCE.add(Items.CHEST_MINECART, 300);
		FuelRegistry.INSTANCE.add(Items.POWERED_RAIL, 300);
		FuelRegistry.INSTANCE.add(Items.ACTIVATOR_RAIL, 300);
		FuelRegistry.INSTANCE.add(Items.DETECTOR_RAIL, 300);
		FuelRegistry.INSTANCE.add(Items.CREEPER_BANNER_PATTERN, 300);
		FuelRegistry.INSTANCE.add(Items.FLOWER_BANNER_PATTERN, 300);
		FuelRegistry.INSTANCE.add(Items.GLOBE_BANNER_PATTERN, 300);
		FuelRegistry.INSTANCE.add(Items.PIGLIN_BANNER_PATTERN, 300);
		FuelRegistry.INSTANCE.add(Items.MOJANG_BANNER_PATTERN, 300);
		FuelRegistry.INSTANCE.add(Items.SKULL_BANNER_PATTERN, 300);
		FuelRegistry.INSTANCE.add(Items.PISTON, 300);
		FuelRegistry.INSTANCE.add(Items.STICKY_PISTON, 300);
	}
}