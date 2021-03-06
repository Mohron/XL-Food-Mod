package mariot7.xlfoodmod.proxy;

import mariot7.xlfoodmod.config.Configurationxlfoodmod;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import mariot7.xlfoodmod.render.BlockRenderxlfoodmod;
import mariot7.xlfoodmod.render.ItemRenderxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorxlfoodmod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy{
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		
		super.preInit(preEvent);
		
	}
	
	public void init(FMLInitializationEvent event) {
		ItemRenderxlfoodmod.registerItemRender();
		BlockRenderxlfoodmod.registerBlockRender();
		if(!Configurationxlfoodmod.GrassGen){
		GameRegistry.registerWorldGenerator(new WorldGeneratorxlfoodmod(), 10);
		}
	}
	
    public void postInit(FMLPostInitializationEvent postEvent) {
		
		super.postInit(postEvent);
	
	}

}
