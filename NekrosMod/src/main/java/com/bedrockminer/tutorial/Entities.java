package com.bedrockminer.tutorial;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entities {

	public static void preinit() {
		// Mobs

		/*
		 * Add mod in game with this command : /summon Scorpioid
		 */

		EntityRegistry.registerGlobalEntityID(EntityScorpioid.class,
				"Scorpioid", EntityRegistry.findGlobalUniqueEntityId(),
				0xFF361C, 0x880007);

	}

	public static void init() {
	}
}
