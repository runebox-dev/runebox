import io.runebox.ObfInfo;

@ObfInfo(name = "vx")
public abstract class Class570 {
	@ObfInfo(name = "an", desc = "[F")
	public float[] field5510;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -609996575)
	public int field5512;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -278390989)
	public int field5513;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field5511;

	@ObfInfo(name = "ag", desc = "(IIIII)V")
	public abstract void method389(int var1, int var2, int var3, int var4);

	@ObfInfo(name = "ad", desc = "(III)V")
	public abstract void method391(int var1, int var2);

	@ObfInfo(name = "az", desc = "(I)V")
	public final void method10205() {
		Class569.method10146(this.field5511, this.field5513, this.field5512, this.field5510);
	}

	@ObfInfo(name = "ax", desc = "(ZI)V")
	public final void method10207(boolean var1) {
		this.field5510 = var1 ? new float[this.field5512 * this.field5513 + 1] : null;
	}
}
