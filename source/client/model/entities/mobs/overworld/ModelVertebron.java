package net.tslat.aoa3.client.model.entities.mobs.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelVertebron extends ModelBase {
	private ModelRenderer head;
	private ModelRenderer body;
	private ModelRenderer rightArm;
	private ModelRenderer leftArm;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer body5;
	private ModelRenderer body6;
	private ModelRenderer body7;
	private ModelRenderer body8;
	private ModelRenderer body9;
	private ModelRenderer body10;
	private ModelRenderer leftLeg2;
	private ModelRenderer rightLeg2;

	public ModelVertebron() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, -3.0f, 3.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body.setRotationPoint(9.0f, 9.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.5235988f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightArm.setRotationPoint(-6.0f, 2.0f, 0.0f);
		rightArm.setTextureSize(64, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftArm.setRotationPoint(6.0f, 2.0f, 0.0f);
		leftArm.setTextureSize(64, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 50)).addBox(-2.0f, 5.0f, 0.0f, 4, 7, 4);
		rightLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightLeg.setTextureSize(64, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 50)).addBox(-2.0f, 5.0f, 0.0f, 4, 7, 4);
		leftLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftLeg.setTextureSize(64, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 16, 33)).addBox(-4.0f, 0.0f, -2.0f, 8, 3, 6);
		body2.setRotationPoint(0.0f, -3.0f, 0.0f);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body3.setRotationPoint(9.0f, 1.0f, 0.0f);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 2.356194f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body4.setRotationPoint(9.0f, 4.0f, 0.0f);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 1.919862f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body5.setRotationPoint(9.0f, 6.0f, 0.0f);
		body5.setTextureSize(64, 32);
		body5.mirror = true;
		setRotation(body5, 1.22173f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body6.setRotationPoint(0.0f, 9.0f, 0.0f);
		body6.setTextureSize(64, 32);
		body6.mirror = true;
		setRotation(body6, 0.5235988f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body7.setRotationPoint(0.0f, 6.0f, 0.0f);
		body7.setTextureSize(64, 32);
		body7.mirror = true;
		setRotation(body7, 1.22173f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body8.setRotationPoint(0.0f, 4.0f, 0.0f);
		body8.setTextureSize(64, 32);
		body8.mirror = true;
		setRotation(body8, 1.919862f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body9.setRotationPoint(0.0f, 1.0f, 0.0f);
		body9.setTextureSize(64, 32);
		body9.mirror = true;
		setRotation(body9, 2.356194f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body10.setRotationPoint(0.0f, 0.0f, 0.0f);
		body10.setTextureSize(64, 32);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(leftLeg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 5, 4);
		leftLeg2.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftLeg2.setTextureSize(64, 32);
		leftLeg2.mirror = true;
		setRotation(leftLeg2, 0.0f, 0.0f, 0.0f);
		(rightLeg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 5, 4);
		rightLeg2.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightLeg2.setTextureSize(64, 32);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightArm.render(par7);
		leftArm.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
		body10.render(par7);
		leftLeg2.render(par7);
		rightLeg2.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / (float)(180f / Math.PI);
		rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg.rotateAngleY = 0.0f;
		rightLeg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg2.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftLeg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
