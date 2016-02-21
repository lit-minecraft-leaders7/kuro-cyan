package com.example.examplemod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelSnowMan;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.util.ResourceLocation;

/**
 * Created by ev40044 on 16/02/21.
 */

@SideOnly(Side.CLIENT)
public class RenderBB8 extends RenderLiving {
    private static final ResourceLocation bb8Texture = new ResourceLocation(ExampleMod.MODID + ":----textures/entity/steve.png");
    /**
     * A reference to the BB8 model in BB8.
     */
    private ModelBB8 BB8Model;
    private static final String __OBFID = "CL_00001025";

    public RenderBB8() {
        super(new ModelBB8(), 0.5F);
        //this.BB8Model = (ModelBB8) super.mainModel;
        //this.setRenderPassModel(this.BB8Model);
    }

    @Override
    public void doRender(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return bb8Texture;
    }
}

