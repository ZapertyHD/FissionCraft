package fissioncraft.objects.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCustomArmor - CPU_Zaperty
 * Created using Tabula 7.0.0
 */
public class PowerArmorB34 extends ModelBiped {
    public ModelRenderer Top;
    public ModelRenderer Mid;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer LArm;
    public ModelRenderer RArm;
    public ModelRenderer Front;
    public ModelRenderer Left;
    public ModelRenderer Right;
    public ModelRenderer Back;
    public ModelRenderer Bot;
    public ModelRenderer Lamp;
    public ModelRenderer Deco;
    public ModelRenderer Deco2;
    public ModelRenderer Deco3;
    public ModelRenderer Deco4;
    public ModelRenderer Deco_1;
    public ModelRenderer Deco2_1;
    public ModelRenderer Deco3_1;
    public ModelRenderer Deco4_1;
    public ModelRenderer Deco_2;
    public ModelRenderer Deco2_2;
    public ModelRenderer Deco3_2;
    public ModelRenderer Deco4_2;
    public ModelRenderer Deco_3;
    public ModelRenderer Deco_4;
    public ModelRenderer Housing;
    public ModelRenderer FrontShield;
    public ModelRenderer BackShield;
    public ModelRenderer LowB;
    public ModelRenderer Lowa;
    public ModelRenderer Low;
    public ModelRenderer Low_1;

    public PowerArmorB34() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Deco2_2 = new ModelRenderer(this, 108, 16);
        this.Deco2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco2_2.addBox(-1.0F, 6.8F, 0.0F, 1, 1, 3, 0.0F);
        this.RLeg = new ModelRenderer(this, 30, 68);
        this.RLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RLeg.addBox(-2.7F, 0.1F, -2.4F, 5, 8, 5, -0.2F);
        this.Lowa = new ModelRenderer(this, 31, 84);
        this.Lowa.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lowa.addBox(-2.7F, 7.3F, -2.4F, 5, 5, 5, 0.0F);
        this.Right = new ModelRenderer(this, 83, 0);
        this.Right.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Right.addBox(7.2F, 0.0F, 0.0F, 1, 9, 8, 0.0F);
        this.Deco4_1 = new ModelRenderer(this, 108, 16);
        this.Deco4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco4_1.addBox(7.0F, 4.8F, 5.0F, 1, 1, 4, 0.0F);
        this.FrontShield = new ModelRenderer(this, 0, 82);
        this.FrontShield.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontShield.addBox(-3.0F, 1.6F, -3.2F, 6, 5, 1, 0.0F);
        this.Deco_3 = new ModelRenderer(this, 65, 27);
        this.Deco_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco_3.addBox(1.0F, 3.6F, 8.1F, 6, 4, 1, 0.0F);
        this.Top = new ModelRenderer(this, 83, 0);
        this.Top.setRotationPoint(-4.0F, -8.0F, -4.0F);
        this.Top.addBox(0.0F, -0.2F, 0.0F, 8, 1, 8, 0.0F);
        this.Deco_2 = new ModelRenderer(this, 108, 16);
        this.Deco_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco_2.addBox(-1.0F, 6.8F, -1.0F, 3, 1, 1, 0.0F);
        this.LLeg = new ModelRenderer(this, 30, 68);
        this.LLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LLeg.addBox(-2.3F, 0.1F, -2.4F, 5, 8, 5, -0.2F);
        this.Lamp = new ModelRenderer(this, 31, 118);
        this.Lamp.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lamp.addBox(-1.0F, 0.2F, -0.9F, 1, 1, 6, 0.0F);
        this.Deco_1 = new ModelRenderer(this, 108, 16);
        this.Deco_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco_1.addBox(5.0F, 6.8F, -1.0F, 3, 1, 1, 0.0F);
        this.LowB = new ModelRenderer(this, 31, 84);
        this.LowB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowB.addBox(-2.3F, 7.3F, -2.4F, 5, 5, 5, 0.0F);
        this.Mid = new ModelRenderer(this, 0, 64);
        this.Mid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mid.addBox(-4.0F, 0.0F, -2.5F, 8, 12, 5, 0.3F);
        this.Deco3_2 = new ModelRenderer(this, 108, 16);
        this.Deco3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco3_2.addBox(-1.0F, 5.8F, 2.0F, 1, 1, 4, 0.0F);
        this.Back = new ModelRenderer(this, 64, 32);
        this.Back.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Back.addBox(0.0F, 0.0F, 7.2F, 8, 9, 1, 0.0F);
        this.Deco2_1 = new ModelRenderer(this, 108, 16);
        this.Deco2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco2_1.addBox(7.0F, 6.8F, 0.0F, 1, 1, 3, 0.0F);
        this.Left = new ModelRenderer(this, 83, 0);
        this.Left.setRotationPoint(0.8F, 0.0F, 0.0F);
        this.Left.addBox(-1.0F, 0.0F, 0.0F, 1, 9, 8, 0.0F);
        this.Deco_4 = new ModelRenderer(this, 70, 19);
        this.Deco_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco_4.addBox(-1.0F, 4.8F, 8.0F, 10, 1, 1, 0.0F);
        this.LArm = new ModelRenderer(this, 0, 101);
        this.LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LArm.addBox(-1.1F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.Bot = new ModelRenderer(this, 83, 0);
        this.Bot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bot.addBox(0.0F, 8.2F, 0.0F, 8, 1, 8, 0.0F);
        this.Deco4 = new ModelRenderer(this, 64, 16);
        this.Deco4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco4.addBox(2.0F, 8.0F, -1.0F, 4, 1, 1, 0.0F);
        this.Front = new ModelRenderer(this, 64, 0);
        this.Front.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Front.addBox(0.0F, 0.0F, -0.2F, 8, 9, 1, 0.0F);
        this.Low_1 = new ModelRenderer(this, 0, 113);
        this.Low_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Low_1.addBox(-3.9F, 1.3F, -2.5F, 5, 9, 5, 0.0F);
        this.RArm = new ModelRenderer(this, 0, 101);
        this.RArm.setRotationPoint(-5.0F, 2.0F, 0.1F);
        this.RArm.addBox(-4.8F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.Deco2 = new ModelRenderer(this, 64, 16);
        this.Deco2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco2.addBox(2.0F, 5.0F, -1.0F, 1, 4, 1, 0.0F);
        this.BackShield = new ModelRenderer(this, 0, 89);
        this.BackShield.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackShield.addBox(-3.0F, 1.3F, 2.3F, 6, 10, 1, 0.0F);
        this.Low = new ModelRenderer(this, 0, 113);
        this.Low.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Low.addBox(-1.1F, 1.3F, -2.5F, 5, 9, 5, 0.0F);
        this.Housing = new ModelRenderer(this, 30, 103);
        this.Housing.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.Housing.addBox(-1.0F, 0.0F, -1.5F, 2, 2, 1, 0.0F);
        this.Deco3 = new ModelRenderer(this, 64, 16);
        this.Deco3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco3.addBox(5.0F, 5.0F, -1.0F, 1, 4, 1, 0.0F);
        this.Deco4_2 = new ModelRenderer(this, 108, 16);
        this.Deco4_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco4_2.addBox(-1.0F, 4.8F, 5.0F, 1, 1, 4, 0.0F);
        this.Deco3_1 = new ModelRenderer(this, 108, 16);
        this.Deco3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco3_1.addBox(7.0F, 5.8F, 2.0F, 1, 1, 4, 0.0F);
        this.Deco = new ModelRenderer(this, 64, 16);
        this.Deco.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deco.addBox(2.0F, 5.0F, -1.0F, 4, 1, 1, 0.0F);
        this.Right.addChild(this.Deco2_2);
        this.RLeg.addChild(this.Lowa);
        this.Top.addChild(this.Right);
        this.Left.addChild(this.Deco4_1);
        this.Mid.addChild(this.FrontShield);
        this.Back.addChild(this.Deco_3);
        this.Right.addChild(this.Deco_2);
        this.Top.addChild(this.Lamp);
        this.Left.addChild(this.Deco_1);
        this.LLeg.addChild(this.LowB);
        this.Right.addChild(this.Deco3_2);
        this.Top.addChild(this.Back);
        this.Left.addChild(this.Deco2_1);
        this.Top.addChild(this.Left);
        this.Back.addChild(this.Deco_4);
        this.Top.addChild(this.Bot);
        this.Front.addChild(this.Deco4);
        this.Top.addChild(this.Front);
        this.RArm.addChild(this.Low_1);
        this.Front.addChild(this.Deco2);
        this.Mid.addChild(this.BackShield);
        this.LArm.addChild(this.Low);
        this.Lamp.addChild(this.Housing);
        this.Front.addChild(this.Deco3);
        this.Right.addChild(this.Deco4_2);
        this.Left.addChild(this.Deco3_1);
        this.Front.addChild(this.Deco);
        this.bipedBody.addChild(this.Mid);
        this.bipedHead.addChild(this.Top);
        this.bipedLeftArm.addChild(this.LArm);
        this.bipedLeftLeg.addChild(this.LLeg);
        this.bipedRightArm.addChild(this.RArm);
        this.bipedRightLeg.addChild(this.RLeg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
