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
import net.minecraftforge.fml.common.IWorldGenerator;
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
        canBeDeactivated = false) // true - upon deactivation, clean up circuits? archive dimensions?
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

        // http://www.wuppy29.com/minecraft/modding-tutorials/wuppys-minecraft-forge-modding-tutorials-for-1-6-2-dimensions-part-1-registry-and-worldprovider/#sthash.HopPoXC6.dpbs
        IWorldGenerator gen = null;
        GameRegistry.registerWorldGenerator(gen, 0);

        // TODO dynamically assign dimensionId, see WorldSavedData http://www.minecraftforge.net/forum/index.php?topic=5722.0
        // TODO or WorldAccessContainer (core mod?)
        int innerSpaceDimensionId = DimensionManager.getNextFreeDimId();

        registerDimensionId(innerSpaceDimensionId);
    }

    public void registerDimensionId(int id) {
//        DimensionManager.registerProviderType(innerSpaceDimensionId, WorldProviderCircuits.class, true);
        DimensionManager.registerDimension(id, 0); // overworld provider (surface)

        // TODO expose dimension id
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

    // TODO for ClientSide 3rd person perspective wouldn't it be great to cull all surfaces coplanar with the roof over the player
}
