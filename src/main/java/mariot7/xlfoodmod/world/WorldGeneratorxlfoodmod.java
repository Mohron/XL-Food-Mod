package mariot7.xlfoodmod.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorxlfoodmod implements IWorldGenerator{

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		
		switch(world.provider.getDimension())
		{
		case -1: generateNether(world, random, blockX, blockZ);
		break;
		case 0: generateOverworld(world, random, blockX, blockZ);
		break;
		case 1: generateEnd(world, random, blockX, blockZ);
		break;
		}

	}

	private void generateNether(World world, Random rand, int blockX, int blockZ) 
	{
			
	}

	private void generateOverworld(World world, Random rand, int blockX, int blockZ) 
	{
		WorldGenerator genCookieBushes = new WorldGenxlfoodmod();
		Biome biome = world.getBiomeGenForCoords(new BlockPos(blockX, 64, blockZ));		
		{
			int MIN = 0;
			int MAX = 8;
			int numBushes = MIN + rand.nextInt(MAX - MIN);
			for(int i = 0; i < numBushes; i++)
			{
				int randX = blockX + rand.nextInt(16);
				int randZ = blockZ + rand.nextInt(16);
				genCookieBushes.generate(world, rand, new BlockPos(randX, 24, randZ));
			}
		}
	}

	private void generateEnd(World world, Random rand, int blockX, int blockZ) 
	{

	}

	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 0)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = blockAt == Blocks.DIRT || blockAt == Blocks.GRASS;
		}

		return y;
	}

}
