package myron.daggers;

import myron.daggers.item.DaggerItemGroup;
import myron.daggers.item.DaggerItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Daggers implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("daggers");
	public static final String MOD_ID = "daggers";

	@Override
	public void onInitialize() {
		LOGGER.info("Daggers has loaded!");
		//DaggerItemGroup.registerDaggerItemGroup();

		DaggerItems.registerModItems();
	}

}