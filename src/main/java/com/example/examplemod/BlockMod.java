package com.example.examplemod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

public class BlockMod extends Block {

	protected BlockMod() {
		super(Material.wood);
		
		
		this.setCreativeTab(CreativeTabs.tabRedstone);
		GameRegistry.registerBlock(this, "test");
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		int a = 11;
		while (a>0){
			a = a-1;
			int b = 10;
			while(b>0){
				b = b-1;
				world.setBlock(x-5+a, y+b, z-5, Blocks.stonebrick);
			}
			
		}
		
		a = 11;
		while (a>0){
			a = a-1;
			int b = 10;
			while(b>0){
				b = b-1;
				world.setBlock(x-5+a, y+b, z+5, Blocks.stonebrick);
			}
			
		}
		
		a = 11;
		while (a>0){
			a = a-1;
			int b = 10;
			while(b>0){
				b = b-1;
				world.setBlock(x-5, y+b, z-5+a, Blocks.stonebrick);
			}
			
		}
		
		a = 11;
		while (a>0){
			a = a-1;
			int b = 10;
			while(b>0){
				b = b-1;
				world.setBlock(x+5, y+b, z-5+a, Blocks.stonebrick);
			}
			
		}
		
		a=9;
		while (a>0){
			a = a-1;
			int b = 9;
			while(b>0){
				b = b-1;
				world.setBlock(x+a-4, 9+y, z-4+b, Blocks.glass);
				
			}
			
		}
		
		
		
		ItemDoor.placeDoorBlock(world, x-5, y, z, 7, Blocks.wooden_door);
		world.setBlock(x+4, y, z-4, Blocks.chest);
		world.setBlock(x+3, y, z-4, Blocks.chest);
		TileEntity tile=world.getTileEntity(x+4, y, z-4);
		
		try{
			TileEntityChest tchest = (TileEntityChest) tile;
			tchest.setInventorySlotContents(5, new ItemStack(Items.diamond,64));
		}catch(Exception e){
			
		}
		
        return true;
    }

}
