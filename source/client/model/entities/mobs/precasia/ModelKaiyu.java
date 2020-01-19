package net.tslat.aoa3.client.model.entities.mobs.precasia;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelKaiyu extends ModelBase {
	private ModelRenderer head1;
	private ModelRenderer leg1;
	private ModelRenderer leg2;
	private ModelRenderer leg3;
	private ModelRenderer leg4;
	private ModelRenderer head2;
	private ModelRenderer head3;
	private ModelRenderer head4;
	private ModelRenderer head5;
	private ModelRenderer head6;
	private ModelRenderer head7;
	private ModelRenderer head8;
	private ModelRenderer head9;
	private ModelRenderer head10;
	private ModelRenderer head11;
	private ModelRenderer body1;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer body5;
	private ModelRenderer body6;
	private ModelRenderer body7;
	private ModelRenderer body8;
	private ModelRenderer body9;

	public ModelKaiyu() {
		textureWidth = 128;
		textureHeight = 32;
		(head1 = new ModelRenderer(this, 32, 12)).addBox(3.0f, 1.0f, -3.0f, 1, 1, 1);
		head1.setRotationPoint(0.0f, 9.0f, -11.0f);
		head1.setTextureSize(128, 32);
		head1.mirror = true;
		setRotation(head1, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 19, 20)).addBox(-3.0f, 0.0f, -2.0f, 4, 8, 4);
		leg1.setRotationPoint(-3.0f, 16.0f, 7.0f);
		leg1.setTextureSize(128, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 19, 20)).addBox(-1.0f, 0.0f, -2.0f, 4, 8, 4);
		leg2.setRotationPoint(3.0f, 16.0f, 7.0f);
		leg2.setTextureSize(128, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 12, 4);
		leg3.setRotationPoint(-3.0f, 12.0f, -7.0f);
		leg3.setTextureSize(128, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 12, 4);
		leg4.setRotationPoint(3.0f, 12.0f, -7.0f);
		leg4.setTextureSize(128, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 13)).addBox(-4.0f, 1.0f, -1.0f, 8, 1, 1);
		head2.setRotationPoint(0.0f, 9.0f, -11.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 47, 11)).addBox(1.0f, -5.0f, -7.0f, 1, 2, 6);
		head3.setRotationPoint(0.0f, 9.0f, -11.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -8.0f, 6, 4, 8);
		head4.setRotationPoint(0.0f, 9.0f, -11.0f);
		head4.setTextureSize(128, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 47, 11)).addBox(-2.0f, -5.0f, -7.0f, 1, 2, 6);
		head5.setRotationPoint(0.0f, 9.0f, -11.0f);
		head5.setTextureSize(128, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 30, 0)).addBox(-4.0f, 2.0f, -8.0f, 8, 2, 8);
		head6.setRotationPoint(0.0f, 9.0f, -11.0f);
		head6.setTextureSize(128, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 32, 12)).addBox(3.0f, 1.0f, -7.0f, 1, 1, 1);
		head7.setRotationPoint(0.0f, 9.0f, -11.0f);
		head7.setTextureSize(128, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 32, 12)).addBox(3.0f, 1.0f, -5.0f, 1, 1, 1);
		head8.setRotationPoint(0.0f, 9.0f, -11.0f);
		head8.setTextureSize(128, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 32, 12)).addBox(-4.0f, 1.0f, -5.0f, 1, 1, 1);
		head9.setRotationPoint(0.0f, 9.0f, -11.0f);
		head9.setTextureSize(128, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 32, 12)).addBox(-4.0f, 1.0f, -7.0f, 1, 1, 1);
		head10.setRotationPoint(0.0f, 9.0f, -11.0f);
		head10.setTextureSize(128, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 32, 12)).addBox(-4.0f, 1.0f, -3.0f, 1, 1, 1);
		head11.setRotationPoint(0.0f, 9.0f, -11.0f);
		head11.setTextureSize(128, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(body1 = new ModelRenderer(this, 45, 20)).addBox(-6.0f, -16.0f, -4.0f, 12, 6, 6);
		body1.setRotationPoint(0.0f, 8.0f, 5.0f);
		body1.setTextureSize(128, 32);
		body1.mirror = true;
		setRotation(body1, 1.570796f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 83, 8)).addBox(-6.0f, -10.0f, -7.0f, 12, 14, 10);
		body2.setRotationPoint(0.0f, 9.0f, 5.0f);
		body2.setTextureSize(128, 32);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 64, 1)).addBox(1.5f, -8.0f, -7.0f, 3, 12, 4);
		body3.setRotationPoint(-3.0f, 10.0f, -3.0f);
		body3.setTextureSize(128, 32);
		body3.mirror = true;
		setRotation(body3, -1.047198f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 64, 1)).addBox(-6.0f, -8.0f, -7.0f, 3, 12, 4);
		body4.setRotationPoint(1.0f, 10.0f, 3.0f);
		body4.setTextureSize(128, 32);
		body4.mirror = true;
		setRotation(body4, -1.047198f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 64, 1)).addBox(1.0f, -8.0f, -7.0f, 3, 12, 4);
		body5.setRotationPoint(6.0f, 14.0f, 10.0f);
		body5.setTextureSize(128, 32);
		body5.mirror = true;
		setRotation(body5, 0.7853982f, 0.0f, -1.570796f);
		(body6 = new ModelRenderer(this, 64, 1)).addBox(1.0f, -8.0f, -7.0f, 3, 12, 4);
		body6.setRotationPoint(1.0f, 10.0f, 3.0f);
		body6.setTextureSize(128, 32);
		body6.mirror = true;
		setRotation(body6, -1.047198f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 64, 1)).addBox(1.0f, -8.0f, -7.0f, 3, 12, 4);
		body7.setRotationPoint(6.0f, 11.0f, 2.0f);
		body7.setTextureSize(128, 32);
		body7.mirror = true;
		setRotation(body7, 0.7853982f, 0.0f, -1.570796f);
		(body8 = new ModelRenderer(this, 64, 1)).addBox(1.0f, -8.0f, -7.0f, 3, 12, 4);
		body8.setRotationPoint(-3.0f, 11.0f, -1.0f);
		body8.setTextureSize(128, 32);
		body8.mirror = true;
		setRotation(body8, -0.7853982f, 0.0f, -1.570796f);
		(body9 = new ModelRenderer(this, 64, 1)).addBox(1.0f, -8.0f, -7.0f, 3, 12, 4);
		body9.setRotationPoint(-3.0f, 14.0f, 7.0f);
		body9.setTextureSize(128, 32);
		body9.mirror = true;
		setRotation(body9, -0.7853982f, 0.0f, -1.570796f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head1.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		head8.render(par7);
		head9.render(par7);
		head10.render(par7);
		head11.render(par7);
		body1.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
	}
}
