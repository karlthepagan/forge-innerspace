package karl.codes.minecraft.block;

import karl.codes.minecraft.tileentity.TileEntityCircuit;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;

/**
 * Created by karl on 11/8/15.
 *
 * TODO Milestone 0
 */
public class BlockCircuit extends BlockRedstoneDiode implements ITileEntityProvider {
    // communicate neighbor state changes from many blocks:
    BlockRedstoneWire wire;
    BlockRedstoneComparator comparator;
    // next milestone?
    BlockFluidBase fluid;

    int dimensionId;
    Teleporter teleporter;

    public BlockCircuit() {
        super(false);

        setCreativeTab(CreativeTabs.tabRedstone);

    }

    @Override
    protected int getDelay(IBlockState iBlockState) {
        return 0;
    }

    @Override
    protected IBlockState getPoweredState(IBlockState iBlockState) {
        return null;
    }

    @Override
    protected IBlockState getUnpoweredState(IBlockState iBlockState) {
        return null;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityCircuit(i);
    }

    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        // TODO look up player equipment and determine if they trigger innerspace teleport
        super.onBlockClicked(worldIn, pos, playerIn);

        // http://www.wuppy29.com/minecraft/modding-tutorials/wuppys-minecraft-forge-modding-tutorials-for-1-6-2-dimensions-part-3-portal-block/#sthash.8B48cXtr.dpbs
        EntityPlayerMP playerMP = (EntityPlayerMP)playerIn;
        playerMP.mcServer.getConfigurationManager()
                .transferPlayerToDimension(playerMP,0,teleporter);

    }

    @Override
    public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock) {
        // TODO get state of neighborBlock and translocate that (with tileentity and metadata) into circuit world
        // if the block was newly placed
        // if the block metadata updated
        // then finally notify the circuit world block(s) of the change
    }

}
