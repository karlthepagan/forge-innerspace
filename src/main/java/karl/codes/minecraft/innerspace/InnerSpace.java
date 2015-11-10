package karl.codes.minecraft.innerspace;

import karl.codes.minecraft.block.BlockCircuit;
import karl.codes.minecraft.item.ItemCircuit;
import karl.codes.minecraft.world.WorldProviderCircuits;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;
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

    private Item redstone_circuit;
    private BlockCircuit redstone_circuit_block;
    private Block redstone_circuit_power_tap;
    private Block redstone_circuit_fluid_tap;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        redstone_circuit_block = new BlockCircuit();

        GameRegistry.registerBlock(redstone_circuit_block,ItemCircuit.class,"redstone_circuit");

        redstone_circuit = new ItemCircuit(redstone_circuit_block);

        GameRegistry.registerItem(redstone_circuit, "redstone_circuit", MODID);

        int innerSpaceDimensionId = DimensionManager.getNextFreeDimId();

        DimensionManager.registerProviderType(innerSpaceDimensionId, WorldProviderCircuits.class, true);
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
