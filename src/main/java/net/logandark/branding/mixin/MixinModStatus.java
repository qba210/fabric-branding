package net.logandark.branding.mixin;

import net.minecraft.util.ModStatus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.function.Supplier;

@Mixin(ModStatus.class)
public class MixinModStatus {
	/**
	 * @author qba21
	 * @reason
	 */
	@Overwrite
	public boolean isModded() {
		return false;
	}

	/**
	 * @author qba21
	 * @reason
	 */
	@Overwrite
	public ModStatus.Confidence confidence() {
		return ModStatus.Confidence.PROBABLY_NOT;
	}

	/**
	 * @author qba210
	 * @reason
	 */
	@Overwrite
	public static ModStatus check(String vanillaBrand, Supplier<String> brandSupplier, String environment, Class<?> clazz) {
		return new ModStatus(ModStatus.Confidence.PROBABLY_NOT, environment + " jar signature and brand is untouched");
	}
}
