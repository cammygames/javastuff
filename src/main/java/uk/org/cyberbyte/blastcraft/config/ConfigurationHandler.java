package uk.org.cyberbyte.blastcraft.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try {
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            configuration.save();
        }
    }
}
