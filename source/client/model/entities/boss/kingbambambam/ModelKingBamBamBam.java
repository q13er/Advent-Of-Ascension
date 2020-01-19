package net.tslat.aoa3.client.model.entities.boss.kingbambambam;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelKingBamBamBam extends ModelBase {
	private ModelRenderer head;
	private ModelRenderer body;
	private ModelRenderer rightArm;
	private ModelRenderer leftArm;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer staff1;
	private ModelRenderer staff2;
	private ModelRenderer staff3;

	public ModelKingBamBamBam() {
		textureWidth = 128;
		textureHeight = 32;
		(head = new ModelRenderer(this, 0, 0)).addBox(-5.0f, -10.0f, -5.0f, 10, 10, 10);
		head.setRotationPoint(0.0f, 2.0f, 0.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 72, 0)).addBox(-9.0f, 0.0f, -5.0f, 18, 16, 10);
		body.setRotationPoint(0.0f, 2.0f, 0.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 40, 13)).addBox(-5.0f, -2.0f, -3.0f, 6, 12, 6);
		rightArm.setRotationPoint(-10.0f, 4.0f, 0.0f);
		rightArm.setTextureSize(128, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 40, 13)).addBox(1.0f, -2.0f, -3.0f, 6, 12, 6);
		leftArm.setRotationPoint(8.0f, 4.0f, 0.0f);
		leftArm.setTextureSize(128, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 47, 1)).addBox(-3.0f, 0.0f, -3.0f, 6, 6, 6);
		rightLeg.setRotationPoint(-5.0f, 18.0f, 0.0f);
		rightLeg.setTextureSize(128, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 47, 1)).addBox(-3.0f, 0.0f, -3.0f, 6, 6, 6);
		leftLeg.setRotationPoint(5.0f, 18.0f, 0.0f);
		leftLeg.setTextureSize(128, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(staff3 = new ModelRenderer(this, 98, 11)).addBox(-4.0f, 4.0f, -17.0f, 4, 4, 3);
		staff3.setRotationPoint(-10.0f, 4.0f, 0.0f);
		staff3.setTextureSize(128, 32);
		staff3.mirror = true;
		setRotation(staff3, -0.7853982f, 0.0f, 0.0f);
		(staff1 = new ModelRenderer(this, 98, 11)).addBox(-3.0f, 5.0f, -3.0f, 2, 2, 12);
		staff1.setRotationPoint(-10.0f, 4.0f, 0.0f);
		staff1.setTextureSize(128, 32);
		staff1.mirror = true;
		setRotation(staff1, -0.7853982f, 0.0f, 0.0f);
		(staff2 = new ModelRenderer(this, 98, 11)).addBox(-3.0f, 5.0f, -15.0f, 2, 2, 12);
		staff2.setRotationPoint(-10.0f, 4.0f, 0.0f);
		staff2.setTextureSize(128, 32);
		staff2.mirror = true;
		setRotation(staff2, -0.7853982f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightArm.render(par7);
		leftArm.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		staff1.render(par7);
		staff2.render(par7);
		staff3.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		staff1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f - 0.43633f;
		staff1.rotateAngleZ = 0.0f;
		staff2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f - 0.43633f;
		staff2.rotateAngleZ = 0.0f;
		staff3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f - 0.43633f;
		staff3.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
