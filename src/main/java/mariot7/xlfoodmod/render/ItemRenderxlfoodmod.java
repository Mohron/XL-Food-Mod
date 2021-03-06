package mariot7.xlfoodmod.render;

import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderxlfoodmod {
	
	public static void registerItemRender () {
		//crops
		regItem(ItemListxlfoodmod.rice_seeds);
		regItem(ItemListxlfoodmod.rice);
		regItem(ItemListxlfoodmod.butter_rice);
		regItem(ItemListxlfoodmod.fried_rice);
		regItem(ItemListxlfoodmod.pepper_seeds);
		regItem(ItemListxlfoodmod.pepper);
		regItem(ItemListxlfoodmod.corn_seeds);
		regItem(ItemListxlfoodmod.raw_corn);
		regItem(ItemListxlfoodmod.corn);
		regItem(ItemListxlfoodmod.cucumber_seeds);
		regItem(ItemListxlfoodmod.cucumber);
		regItem(ItemListxlfoodmod.tomato_seeds);
		regItem(ItemListxlfoodmod.tomato);
		//other foods
		regItem(ItemListxlfoodmod.salt);
		regItem(ItemListxlfoodmod.dough);
		regItem(ItemListxlfoodmod.cooked_dough);
		regItem(ItemListxlfoodmod.butter);
		regItem(ItemListxlfoodmod.cheese);
		regItem(ItemListxlfoodmod.cheese_puff);
		regItem(ItemListxlfoodmod.chips);
		regItem(ItemListxlfoodmod.spicy_chips);
		regItem(ItemListxlfoodmod.cheesy_bread);
		regItem(ItemListxlfoodmod.corn_bread);
		regItem(ItemListxlfoodmod.fried_egg);
		regItem(ItemListxlfoodmod.pancake);
		regItem(ItemListxlfoodmod.waffle);
		//meat
		regItem(ItemListxlfoodmod.flesh);
		regItem(ItemListxlfoodmod.sausage);
		regItem(ItemListxlfoodmod.bacon);
		regItem(ItemListxlfoodmod.ground_beef);
		regItem(ItemListxlfoodmod.raw_chicken_wing);
		regItem(ItemListxlfoodmod.cooked_chicken_wing);
		regItem(ItemListxlfoodmod.spicy_chicken_wing);
		//fast food
		regItem(ItemListxlfoodmod.top_bun);
		regItem(ItemListxlfoodmod.bottom_bun);
		regItem(ItemListxlfoodmod.hamburger);
		regItem(ItemListxlfoodmod.cheeseburger);
		regItem(ItemListxlfoodmod.hot_dog);
		regItem(ItemListxlfoodmod.taco);
		//candy etc.
		regItem(ItemListxlfoodmod.marshmallow);
		regItem(ItemListxlfoodmod.roasted_marshmallow);
		regItem(ItemListxlfoodmod.oreo_cookie);
		regItem(ItemListxlfoodmod.brownie);
		regItem(ItemListxlfoodmod.chocolate_icecream_ball);
		regItem(ItemListxlfoodmod.vanilla_icecream_ball);
		regItem(ItemListxlfoodmod.icecream_cone);
		regItem(ItemListxlfoodmod.chocolate_icecream);
		regItem(ItemListxlfoodmod.vanilla_icecream);
		regItem(ItemListxlfoodmod.crescent_roll);
		regItem(ItemListxlfoodmod.donut);
		regItem(ItemListxlfoodmod.sugar_donut);
		//pies
		regItem(ItemListxlfoodmod.pie_shell);
		regItem(ItemListxlfoodmod.apple_pie);
		regItem(ItemListxlfoodmod.golden_apple_pie);
		regItem(ItemListxlfoodmod.cheese_pie);
		regItem(ItemListxlfoodmod.chicken_pot_pie);
		regItem(ItemListxlfoodmod.chocolate_pie);
		regItem(ItemListxlfoodmod.bacon_pie);
		regItem(ItemListxlfoodmod.fish_pie);
		
		regItem(ItemListxlfoodmod.hot_sauce);
		regItem(ItemListxlfoodmod.chocolate_syrup);
		regItem(ItemListxlfoodmod.vanilla_extract);
		regItem(ItemListxlfoodmod.vanilla_cream);
		//drinks
		regItem(ItemListxlfoodmod.empty_can);
		regItem(ItemListxlfoodmod.speedy_energy_drink);
		regItem(ItemListxlfoodmod.healthy_energy_drink);
		regItem(ItemListxlfoodmod.stealthy_energy_drink);
		regItem(ItemListxlfoodmod.strong_energy_drink);
		regItem(ItemListxlfoodmod.deadly_energy_drink);
		regItem(ItemListxlfoodmod.super_energy_drink);
		regItem(ItemListxlfoodmod.glass_mug);
		regItem(ItemListxlfoodmod.beer);
	}

	public static void regItem(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
		

}
