package net.tslat.aoa3.block.generation.misc;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.tslat.aoa3.block.BasicBlock;
import net.tslat.aoa3.utils.WorldUtil;

import javax.annotation.Nullable;
import java.util.Random;

public class DeeplandsTrapExplosion extends BasicBlock {
	public DeeplandsTrapExplosion() {
		super("DeeplandsTrapExplosion", "deeplands_trap_explosion", Material.ROCK);
		setHardness(3f);
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
		setCreativeTab(null);
	}

	@Nullable
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return FULL_BLOCK_AABB;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.AIR;
	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode)
			WorldUtil.createExplosion(null, world, pos.getX(), pos.getY(), pos.getZ(), 2f);
	}
}
