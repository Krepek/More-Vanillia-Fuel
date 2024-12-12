package net.krepek.morefuel;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.Items;

public final class FuelRegistry {
    // For versions since 1.21.2
    public static void registerFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(Items.ARROW, 150);
            builder.add(Items.SPECTRAL_ARROW, 150);
            builder.add(Items.BRUSH, 150);
            builder.add(Items.ITEM_FRAME, 150);
            builder.add(Items.GLOW_ITEM_FRAME, 150);
            builder.add(Items.BEEHIVE, 300);
            builder.add(Items.FIRE_CHARGE, 3000);
            builder.add(Items.ARMOR_STAND, 900); //+300
            builder.add(Items.PAINTING, 150);
            builder.add(Items.LEAD, 150);
            builder.add(Items.WARPED_FUNGUS_ON_A_STICK, 300);
            builder.add(Items.CARROT_ON_A_STICK, 300);
            builder.add(Items.BLACK_BED, 300);
            builder.add(Items.BLUE_BED, 300);
            builder.add(Items.BROWN_BED, 300);
            builder.add(Items.CYAN_BED, 300);
            builder.add(Items.GRAY_BED, 300);
            builder.add(Items.GREEN_BED, 300);
            builder.add(Items.LIGHT_BLUE_BED, 300);
            builder.add(Items.LIGHT_GRAY_BED, 300);
            builder.add(Items.LIME_BED, 300);
            builder.add(Items.MAGENTA_BED, 300);
            builder.add(Items.ORANGE_BED, 300);
            builder.add(Items.PINK_BED, 300);
            builder.add(Items.PURPLE_BED, 300);
            builder.add(Items.RED_BED, 300);
            builder.add(Items.WHITE_BED, 300);
            builder.add(Items.YELLOW_BED, 300);
            builder.add(Items.SHIELD, 300);
            builder.add(Items.SWEET_BERRIES, 50);
            builder.add(Items.TORCH, 300);
            builder.add(Items.PAPER, 150);
            builder.add(Items.MAP, 150);
            builder.add(Items.LEVER, 150);
            builder.add(Items.TRIPWIRE_HOOK, 150);
            builder.add(Items.SOUL_TORCH, 300);
            builder.add(Items.REDSTONE_TORCH, 150);
            builder.add(Items.RAIL, 300);
            builder.add(Items.REDSTONE_LAMP, 600);
            builder.add(Items.TARGET, 300);
            builder.add(Items.AZALEA, 300);
            builder.add(Items.FLOWERING_AZALEA, 300);
            builder.add(Items.GLOW_BERRIES, 50);
            builder.add(Items.OAK_LEAVES, 150);
            builder.add(Items.DARK_OAK_LEAVES, 150);
            builder.add(Items.SPRUCE_LEAVES, 150);
            builder.add(Items.BIRCH_LEAVES, 150);
            builder.add(Items.JUNGLE_LEAVES, 150);
            builder.add(Items.ACACIA_LEAVES, 150);
            builder.add(Items.MANGROVE_LEAVES, 150);
            builder.add(Items.CHERRY_LEAVES, 150);
            builder.add(Items.AZALEA_LEAVES, 150);
            builder.add(Items.FLOWERING_AZALEA_LEAVES, 150);
            builder.add(Items.WRITABLE_BOOK, 300); //+150
            builder.add(Items.BOOK, 300); //+150
            builder.add(Items.CHEST_MINECART, 300);
            builder.add(Items.POWERED_RAIL, 300);
            builder.add(Items.ACTIVATOR_RAIL, 300);
            builder.add(Items.DETECTOR_RAIL, 300);
            builder.add(Items.CREEPER_BANNER_PATTERN, 300);
            builder.add(Items.FLOWER_BANNER_PATTERN, 300);
            builder.add(Items.GLOBE_BANNER_PATTERN, 300);
            builder.add(Items.PIGLIN_BANNER_PATTERN, 300);
            builder.add(Items.MOJANG_BANNER_PATTERN, 300);
            builder.add(Items.SKULL_BANNER_PATTERN, 300);
            builder.add(Items.PISTON, 300);
            builder.add(Items.STICKY_PISTON, 300);
            builder.add(Items.FLOW_BANNER_PATTERN, 300);
            builder.add(Items.GUSTER_BANNER_PATTERN, 300);
            builder.add(Items.BORDURE_INDENTED_BANNER_PATTERN, 300);
            builder.add(Items.FIELD_MASONED_BANNER_PATTERN, 300);
            builder.add(Items.PALE_OAK_LEAVES, 150);
        });
    }
}
