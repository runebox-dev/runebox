import io.runebox.ObfInfo;

@ObfInfo(name = "mq")
public final class Class329 {
	@ObfInfo(name = "ad", desc = "J", longMultiplier = -5719883573189299259L)
	public static long field3638;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = -2691792936480656095L)
	public static long field3639;

	@ObfInfo(owner = "jw", name = "aq", desc = "(I)J")
	public static synchronized long method4953() {
		long var1 = System.currentTimeMillis();
		if (var1 < field3639) {
			field3638 += field3639 - var1;
		}

		field3639 = var1;
		return field3638 + var1;
	}
}
