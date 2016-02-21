package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by ev40044 on 16/02/09.
 */
public class RainbowBlock extends Block {

    public IIcon[] icons = new IIcon[7];

    public RainbowBlock(){
        super(Material.tnt);
        setCreativeTab(CreativeTabs.tabBlock);

        setBlockName(ExampleMod.MODID + "RainbowBlock");
        setBlockTextureName(ExampleMod.MODID + ":" + "rainbow");

        setHardness(100F);

    }

    @Override
    public void registerBlockIcons(IIconRegister register){
        for(int i = 0; i < 7; i++){
            this.icons[i] = register.registerIcon(textureName + "_" + i);
        }
    }

    @Override
    public IIcon getIcon(int side, int metadata){
        return icons[metadata];
    }


    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
        int meta = world.getBlockMetadata(x, y, z);
        meta = meta + 1;
        if(meta >= 7) {
            meta = 0;
        }
        world.setBlockMetadataWithNotify(x, y, z, meta, 2);
    }
}
