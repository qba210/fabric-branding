package net.logandark.branding.mixin;

import net.minecraft.obfuscate.DontObfuscate;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MinecraftServer.class)
public abstract class MixinMinecraftServer {
	/**
	 * @author LoganDark
	 * @reason
	 */

	@DontObfuscate
	@Overwrite(remap = false)
	public String getServerModName() {
		return "vanilla";
	}
}
