package karl.codes.minecraft.innerspace;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by karl on 11/5/15.
 *
 * 800 254 9874
 */
@Mod(
        useMetadata = true,
        modid = InnerSpace.MODID,
        acceptedMinecraftVersions = "[1.8,1.9)",
        canBeDeactivated = false)
@SideOnly(Side.SERVER)
public class InnerSpace {
    public static final String MODID = "innerspace";

    public static Item redstone_circuit;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        redstone_circuit = new Item()
                .setMaxStackSize(64)
                .setHasSubtypes(true)
                .setCreativeTab(CreativeTabs.tabRedstone)
                .setUnlocalizedName("redstone_circuit");
        GameRegistry.registerItem(redstone_circuit,"redstone_circuit",MODID);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // smelted redstone block
        GameRegistry.addSmelting(Blocks.redstone_block,new ItemStack(Blocks.redstone_block),0);

        // TODO detect fuel used?
        GameRegistry.registerFuelHandler(new KeyedSmelting());
    }

    static class KeyedSmelting implements IFuelHandler {
        @Override
        public int getBurnTime(ItemStack itemStack) {
            return 0;
        }
    }
}
