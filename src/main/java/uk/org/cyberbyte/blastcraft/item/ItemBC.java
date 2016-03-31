package uk.org.cyberbyte.blastcraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import uk.org.cyberbyte.blastcraft.reference.Reference;

public class ItemBC extends Item {

    public ItemBC() {
        super();
        this.maxStackSize = 1;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase(), getUnwarappedUnlocaliszedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase(), getUnwarappedUnlocaliszedName(super.getUnlocalizedName()));
    }

    protected String getUnwarappedUnlocaliszedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
