import io.runebox.ObfInfo;

public abstract class Class569 {
	@ObfInfo(name = "aa", desc = "[F")
	public float[] field5483;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1871416401)
	public int field5482;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -463747397)
	public int field5484;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field5480;

	@ObfInfo(name = "aj", desc = "(IIIII)V")
	public abstract void method875(int var1, int var2, int var3, int var4);

	@ObfInfo(name = "al", desc = "(III)V")
	public abstract void method877(int var1, int var2);

	@ObfInfo(name = "aw", desc = "(I)V")
	public final void method10286() {
		Class561.method10142(this.field5480, this.field5484, this.field5482, this.field5483);
	}

	@ObfInfo(name = "ad", desc = "(ZB)V")
	public final void method10289(boolean var1) {
		this.field5483 = var1 ? new float[1 + this.field5484 * this.field5482] : null;
	}
}
