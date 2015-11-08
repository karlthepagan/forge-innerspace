package karl.codes.minecraft.innerspace.block;

import karl.codes.minecraft.innerspace.tileentity.TileEntityInnerSpace;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;

/**
 * Created by karl on 11/8/15.
 *
 * TODO Milestone 0
 */
public class BlockInnerSpace extends BlockRedstoneDiode implements ITileEntityProvider {
    // communicate neighbor state changes from many blocks:
    BlockRedstoneWire wire;
    BlockRedstoneComparator comparator;
    // next milestone?
    BlockFluidBase fluid;

    protected BlockInnerSpace(boolean powered) {
        super(powered);
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
        return new TileEntityInnerSpace(i);
    }

    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        // TODO look up player equipment and determine if they trigger innerspace teleport
        super.onBlockClicked(worldIn, pos, playerIn);
    }
}
