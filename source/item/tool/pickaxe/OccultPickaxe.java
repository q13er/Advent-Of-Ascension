package net.tslat.aoa3.item.tool.pickaxe;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;
import net.tslat.aoa3.common.registration.AoAItemGroups;
import net.tslat.aoa3.entity.misc.OccultBlockEntity;
import net.tslat.aoa3.util.ClientOperations;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;

import javax.annotation.Nullable;
import java.util.List;

public class OccultPickaxe extends BasePickaxe {
	public OccultPickaxe() {
		super(ItemUtil.customItemTier(3000, 11.0f, 6.0f, 6, 10, null),
				new Item.Properties().durability(3000).tab(AoAItemGroups.TOOLS).rarity(Rarity.RARE));
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
		if (world.isClientSide()) {
			for (int i = (int)(player.getX() - 4.0); i < (int)(player.getX() + 4.0); ++i) {
				for (int j = (int)(player.getY() - 4.0); j < (int)(player.getY() + 4.0); ++j) {
					for (int k = (int)(player.getZ() - 4.0); k < (int)(player.getZ() + 4.0); ++k) {
						if (world.getBlockState(new BlockPos(i, j, k)).is(Tags.Blocks.ORES)) {
							OccultBlockEntity entity = new OccultBlockEntity(world, new BlockPos(i, j, k));

							ClientOperations.spawnClientOnlyEntity(entity);
						}
					}
				}
			}
		}

		ActionResult<ItemStack> result = super.use(world, player, hand);

		if (result.getResult() == ActionResultType.FAIL)
			return ActionResult.pass(result.getObject());

		return result;
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
	}
}
