package karl.codes.minecraft.block;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidBlock;

/**
 * TODO is is possible to in-place replace the blocks or change them to the overworld value by proxy?
 */
public class BlockCircuitBoundaryDelegate implements IFluidBlock {
    // TODO also look at BlockRedstoneDiode.isAssociated(Block other)

    @Override
    public Fluid getFluid() {
        return null;
    }

    @Override
    public FluidStack drain(World world, BlockPos blockPos, boolean b) {
        return null;
    }

    @Override
    public boolean canDrain(World world, BlockPos blockPos) {
        return false;
    }

    @Override
    public float getFilledPercentage(World world, BlockPos blockPos) {
        return 0;
    }
}
