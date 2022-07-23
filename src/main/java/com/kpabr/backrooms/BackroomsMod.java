package com.kpabr.backrooms;

import java.util.Map;

import com.kpabr.backrooms.init.*;
import net.fabricmc.api.ModInitializer;
import com.kpabr.backrooms.world.Level0;
import com.kpabr.backrooms.world.chunk.MazeChunkGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BackroomsMod implements ModInitializer {

	static public String ModId = "backrooms";

	@Override
	public void onInitialize() {
		Registry.register(Registry.CHUNK_GENERATOR, id("maze_chunk"), MazeChunkGenerator.CODEC);
		BackroomsLoomPatterns.init();
		BackroomsFeatures.init();
		BackroomsItems.init();
		BackroomsBiomes.init();
		BackroomsBlocks.init();
		BackroomsGroups.init();
		BackroomsFlammableBlocks.init();
<<<<<<< Updated upstream
=======
		LOGGER.info("loaded FIRE");
		BackroomsEntities.init();
		LOGGER.info("loaded your nightmares");
		Registry.register(LimlibRegistries.LIMINAL_SHADER_APPLIER, id("stong_simple_shader"), StrongLiminalShader.CODEC);
		LOGGER.info("Everything is loaded !");

>>>>>>> Stashed changes
	}

	/*@Override
	public void registerModDimensions(Map<Identifier, ExtraDimension> registry) {
		registry.put(Level0.LEVEL_0_ID, new Level0());
	}*/

	public static Identifier id(String id) {
		return new Identifier("backrooms", id);
	}

}
