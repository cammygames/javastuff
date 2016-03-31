package uk.org.cyberbyte.blastcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.org.cyberbyte.blastcraft.handler.ConfigurationHandler;
import uk.org.cyberbyte.blastcraft.init.ModItems;
import uk.org.cyberbyte.blastcraft.proxy.IProxy;
import uk.org.cyberbyte.blastcraft.reference.Reference;
import uk.org.cyberbyte.blastcraft.util.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class BlastCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static BlastCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.init();
        ModItems.register();
        LogHelper.info("Pre Init Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInt(FMLPostInitializationEvent event) {

    }

}
