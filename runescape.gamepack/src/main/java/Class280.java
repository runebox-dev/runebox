import io.runebox.ObfInfo;

@ObfInfo(name = "kt")
public abstract class Class280 extends Class516 {
	@ObfInfo(name = "ej", desc = "I", intMultiplier = 776464435)
	public int field2960;

	public Class280() {
		this.field2960 = 1000;
	}

	@ObfInfo(name = "eh", desc = "(IIIIIIIIIJ)V")
	public void method5297(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		Class308 var12 = this.method1140();
		if (var12 != null) {
			this.field2960 = var12.field2960;
			int var13 = Class274.field2804[var2];
			int var14 = Class274.field2805[var2];
			int var15 = Class274.field2804[var3];
			int var16 = Class274.field2805[var3];
			var12.method5886(var1, var13, var14, var15, var16, var4 - var7, var5 - var8, var6 - var9, var10);
		}

	}

	@ObfInfo(name = "js", desc = "(ILqg;IIIJ)V")
	public void method5590(int var1, Class423 var2, int var3, int var4, int var5, long var6) {
		Class308 var8 = this.method1140();
		if (var8 != null) {
			this.field2960 = var8.field2960;
			var8.method5590(var1, var2, var3, var4, var5, var6);
		}

	}

	@ObfInfo(name = "ah", desc = "(I)Llv;")
	public Class308 method1140() {
		return null;
	}
}
