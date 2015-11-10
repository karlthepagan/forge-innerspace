package karl.codes.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Created by karl on 11/9/15.
 */
public class ItemCircuit extends ItemBlock {

    public ItemCircuit(Block block) {
        super(block);

        setMaxStackSize(64);
        setHasSubtypes(true);
        setUnlocalizedName("redstone_circuit");
    }
}
