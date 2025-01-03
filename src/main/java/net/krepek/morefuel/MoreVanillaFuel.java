package net.krepek.morefuel;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreVanillaFuel implements ModInitializer {
	public static final String MOD_ID = "more-vanilla-fuel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FuelRegistry.registerFuels();
		LOGGER.info("Mod loaded correctly!");
	}
}