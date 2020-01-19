package net.tslat.aoa3.item.armour;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.item.SkillItem;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ItemUtil;

import java.util.List;

import static net.tslat.aoa3.common.registration.MaterialsRegister.ARMOUR_ENGINEERING;

public class EngineeringArmour extends AdventArmour implements SkillItem {
	public EngineeringArmour(String name, String registryName, EntityEquipmentSlot slot) {
		super(ARMOUR_ENGINEERING, name, registryName, slot);
	}

	@Override
	public Enums.ArmourSets setType() {
		return Enums.ArmourSets.ENGINEERING;
	}

	@Override
	public Enums.Skills getSkill() {
		return Enums.Skills.ENGINEERING;
	}

	@Override
	public int getLevelReq() {
		return 100;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(ItemUtil.getFormattedLevelRestrictedDescriptionText(Enums.Skills.ENGINEERING, 100));
	}
}
