package uk.org.cyberbyte.blastcraft.proxy;

import uk.org.cyberbyte.blastcraft.init.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        ModItems.registerRenders();
    }
}
