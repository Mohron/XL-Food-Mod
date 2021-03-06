package mariot7.xlfoodmod.render;

import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderxlfoodmod {
	
	public static void registerBlockRender() {
		regBlock(BlockListxlfoodmod.rock_salt);
		regBlock(BlockListxlfoodmod.grass);
		regBlock(BlockListxlfoodmod.vanilla_flower);
		regBlock(BlockListxlfoodmod.rice_plant);
		regBlock(BlockListxlfoodmod.pepper_plant);
		regBlock(BlockListxlfoodmod.corn_plant);
		regBlock(BlockListxlfoodmod.cucumber_plant);
		regBlock(BlockListxlfoodmod.tomato_plant);
	}

	public static void regBlock(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
		

}
