package net.tslat.aoa3.item.armour;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.library.misc.AoAAttributes;
import net.tslat.aoa3.utils.EntityUtil;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.player.PlayerDataManager;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;

import static net.tslat.aoa3.common.registration.MaterialsRegister.ARMOUR_SUBTERRANEAN;

public class SubterraneanArmour extends AdventArmour {
	public SubterraneanArmour(String name, String registryName, EntityEquipmentSlot slot) {
		super(ARMOUR_SUBTERRANEAN, name, registryName, slot);
	}

	@Override
	public Enums.ArmourSets setType() {
		return Enums.ArmourSets.SUBTERRANEAN;
	}

	@Override
	public void onEquip(PlayerDataManager plData, @Nullable EntityEquipmentSlot slot) {
		if (slot == null)
			EntityUtil.applyAttributeModifierSafely(plData.player(), SharedMonsterAttributes.ATTACK_SPEED, AoAAttributes.SUBTERRANEAN_ARMOUR_ATTACK_SPEED_DEBUFF);
	}

	@Override
	public void onUnequip(PlayerDataManager plData, @Nullable EntityEquipmentSlot slot) {
		if (slot == null)
			EntityUtil.removeAttributeModifier(plData.player(), SharedMonsterAttributes.ATTACK_SPEED, AoAAttributes.SUBTERRANEAN_ARMOUR_ATTACK_SPEED_DEBUFF);
	}

	@Override
	public void onEffectTick(PlayerDataManager plData, @Nullable HashSet<EntityEquipmentSlot> slots) {
		if (slots == null)
			plData.player().addPotionEffect(new PotionEffect(MobEffects.HASTE, -1, 1, true, false));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(setEffectHeader());
		tooltip.add(ItemUtil.getFormattedDescriptionText("item.SubterraneanArmour.desc.1", Enums.ItemDescriptionType.POSITIVE));
	}
}
