package net.purejosh.purequartztools.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SporeBlossomBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class QuartzBlossom extends SporeBlossomBlock {

    public QuartzBlossom(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double d = (double)pos.getX() + random.nextDouble();
        double e = (double)pos.getY() + 0.7;
        double f = (double)pos.getZ() + random.nextDouble();
        world.addParticle(ParticleTypes.END_ROD, d, e, f, 0.0, -0.1, 0.0);
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for(int l = 0; l < 21; ++l) {
            mutable.set(pos.getX() + MathHelper.nextInt(random, -10, 10), pos.getY() - random.nextInt(10), pos.getZ() + MathHelper.nextInt(random, -10, 10));
            BlockState blockState = world.getBlockState(mutable);
            if (!blockState.isFullCube(world, mutable)) {
                world.addParticle(ParticleTypes.END_ROD, (double)mutable.getX() + random.nextDouble(), (double)mutable.getY() + random.nextDouble(), (double)mutable.getZ() + random.nextDouble(), 0.0, -0.04, 0.0);
            }
        }
    }
}
