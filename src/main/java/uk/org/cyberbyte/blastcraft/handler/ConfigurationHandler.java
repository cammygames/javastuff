package uk.org.cyberbyte.blastcraft.handler;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import uk.org.cyberbyte.blastcraft.reference.Reference;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }
    }

    public static void loadConfiguration() {
        testValue = configuration.get(Configuration.CATEGORY_GENERAL, "testValue", true, "This is an example config value").getBoolean(true);

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
