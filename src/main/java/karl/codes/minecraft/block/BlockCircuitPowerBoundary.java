package karl.codes.minecraft.block;

import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.state.IBlockState;

/**
 * Created by karl on 11/8/15.
 *
 * TODO Milestone 1
 */
public class BlockCircuitPowerBoundary extends BlockRedstoneDiode {
    protected BlockCircuitPowerBoundary(boolean powered) {
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
    // this block's metadata is determined by its position in InnerSpace world
}
