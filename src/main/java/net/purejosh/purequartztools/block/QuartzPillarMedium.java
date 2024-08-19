package net.purejosh.purequartztools.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class QuartzPillarMedium extends ChainBlock {

    public QuartzPillarMedium(Settings settings) {
        super(settings);
    }

    protected static final VoxelShape Y_SHAPE = Block.createCuboidShape(
            2, 0, 2, 14, 16, 14);
    protected static final VoxelShape Z_SHAPE = Block.createCuboidShape(
            2, 2, 0, 14, 14, 16);
    protected static final VoxelShape X_SHAPE = Block.createCuboidShape(
            0, 2, 2, 16, 14, 14);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch ((Direction.Axis) state.get(AXIS)) {
            default -> X_SHAPE;
            case Z -> Z_SHAPE;
            case Y -> Y_SHAPE;
        };
    }
}