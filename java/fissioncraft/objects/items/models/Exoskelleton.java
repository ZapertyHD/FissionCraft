package fissioncraft.objects.items.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCustomArmor - CPU_Zaperty
 * Created using Tabula 7.0.0
 */
public class Exoskelleton extends ModelBiped {
    public ModelRenderer BackStrap;
    public ModelRenderer Strip1;
    public ModelRenderer Strip2;
    public ModelRenderer Strip3;
    public ModelRenderer Strip1a;
    public ModelRenderer Strip1b;
    public ModelRenderer Strip1c;
    public ModelRenderer Strip2a;
    public ModelRenderer Strip2b;
    public ModelRenderer Strip2c;
    public ModelRenderer Strip3a;
    public ModelRenderer Strip3b;
    public ModelRenderer Strip3c;

    public Exoskelleton() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Strip2b = new ModelRenderer(this, 72, 0);
        this.Strip2b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip2b.addBox(5.5F, -0.5F, -5.4F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Strip2b, 0.7853981633974483F, 0.0F, 0.0F);
        this.BackStrap = new ModelRenderer(this, 64, 0);
        this.BackStrap.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.BackStrap.addBox(3.0F, 0.0F, 3.5F, 2, 12, 1, 0.0F);
        this.Strip1a = new ModelRenderer(this, 72, 0);
        this.Strip1a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip1a.addBox(-0.5F, 0.2F, -2.4F, 9, 4, 1, 0.0F);
        this.setRotateAngle(Strip1a, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip2c = new ModelRenderer(this, 72, 0);
        this.Strip2c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip2c.addBox(-0.5F, -0.5F, -5.4F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Strip2c, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip3b = new ModelRenderer(this, 72, 0);
        this.Strip3b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip3b.addBox(5.5F, -0.5F, -8.4F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Strip3b, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip1 = new ModelRenderer(this, 72, 0);
        this.Strip1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip1.addBox(0.0F, 3.7F, 1.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(Strip1, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip3c = new ModelRenderer(this, 72, 0);
        this.Strip3c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip3c.addBox(-0.5F, -0.5F, -8.4F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Strip3c, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip3a = new ModelRenderer(this, 72, 0);
        this.Strip3a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip3a.addBox(-0.6F, 0.1F, -8.4F, 9, 4, 1, 0.0F);
        this.setRotateAngle(Strip3a, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip2 = new ModelRenderer(this, 72, 0);
        this.Strip2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip2.addBox(0.0F, 6.0F, -1.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(Strip2, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip1b = new ModelRenderer(this, 72, 0);
        this.Strip1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip1b.addBox(5.5F, -0.5F, -2.4F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Strip1b, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip1c = new ModelRenderer(this, 72, 0);
        this.Strip1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip1c.addBox(-0.5F, -0.5F, -2.3F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Strip1c, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip3 = new ModelRenderer(this, 72, 0);
        this.Strip3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip3.addBox(0.0F, 8.0F, -3.2F, 8, 1, 1, 0.0F);
        this.setRotateAngle(Strip3, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip2a = new ModelRenderer(this, 72, 0);
        this.Strip2a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Strip2a.addBox(-0.5F, 0.2F, -5.4F, 9, 4, 1, 0.0F);
        this.setRotateAngle(Strip2a, 0.7853981633974483F, 0.0F, 0.0F);
        this.Strip2.addChild(this.Strip2b);
        this.Strip1.addChild(this.Strip1a);
        this.Strip2.addChild(this.Strip2c);
        this.Strip3.addChild(this.Strip3b);
        this.BackStrap.addChild(this.Strip1);
        this.Strip3.addChild(this.Strip3c);
        this.Strip3.addChild(this.Strip3a);
        this.BackStrap.addChild(this.Strip2);
        this.Strip1.addChild(this.Strip1b);
        this.Strip1.addChild(this.Strip1c);
        this.BackStrap.addChild(this.Strip3);
        this.Strip2.addChild(this.Strip2a);
        this.bipedBody.addChild(BackStrap);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    {
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
