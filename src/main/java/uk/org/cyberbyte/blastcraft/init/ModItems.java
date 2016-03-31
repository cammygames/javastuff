package uk.org.cyberbyte.blastcraft.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.org.cyberbyte.blastcraft.item.ItemBC;
import uk.org.cyberbyte.blastcraft.item.ItemRebar;
import uk.org.cyberbyte.blastcraft.reference.Reference;

public class ModItems {

    public static Item rebar;

    public static void init() {
        rebar = new Item().setUnlocalizedName("rebar");
    }

    public static void register() {

        GameRegistry.registerItem(rebar, rebar.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        registerRender(rebar);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
