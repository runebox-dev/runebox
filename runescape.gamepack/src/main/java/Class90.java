import io.runebox.ObfInfo;

@ObfInfo(name = "dl")
public class Class90 extends Class520 {
	@ObfInfo(owner = "ns", name = "ap", desc = "[Lcw;")
	public static Class75[] field3782;
	@ObfInfo(name = "ag", desc = "Lhy;")
	public Class207 field1125;
	@ObfInfo(name = "ak", desc = "Lpi;")
	public Class399 field1124;

	public Class90(Class207 var1) {
		this.field1124 = new Class399();
		this.field1125 = var1;
	}

	@ObfInfo(name = "aq", desc = "(IIIIB)V", opaque = "7")
	public void method2419(int var1, int var2, int var3, int var4) {
		Class86 var6 = null;
		int var7 = 0;

		for (Class86 var8 = (Class86)this.field1124.method7401(); var8 != null; var8 = (Class86)this.field1124.method7403()) {
			++var7;
			if (var8.field1088 == var1) {
				var8.method2365(var1, var2, var3, var4);
				return;
			}

			if (var8.field1088 <= var1) {
				var6 = var8;
			}
		}

		if (var6 == null) {
			if (var7 < 4) {
				this.field1124.method7399(new Class86(var1, var2, var3, var4));
			}

		} else {
			Class399.method7428(new Class86(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field1124.method7401().method9267();
			}

		}
	}

	@ObfInfo(name = "ad", desc = "(II)Ldh;", opaque = "1890281243")
	public Class86 method2420(int var1) {
		Class86 var3 = (Class86)this.field1124.method7401();
		if (var3 != null && var3.field1088 <= var1) {
			for (Class86 var4 = (Class86)this.field1124.method7403(); var4 != null && var4.field1088 <= var1; var4 = (Class86)this.field1124.method7403()) {
				var3.method9267();
				var3 = var4;
			}

			if (var3.field1088 + var3.field1083 + this.field1125.field2257 > var1) {
				return var3;
			} else {
				var3.method9267();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfInfo(name = "ag", desc = "(B)Z")
	public boolean method2421() {
		return this.field1124.method7398();
	}

	@ObfInfo(name = "ad", desc = "(III)V", opaque = "1841741429")
	public static void method2423(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (Class75.field901[var6] != var0) {
				var3[var5] = Class75.field901[var6];
				var4[var5] = Class75.field900[var6];
				++var5;
			}
		}

		Class75.field901 = var3;
		Class75.field900 = var4;
		Class245.method4724(field3782, 0, field3782.length - 1, Class75.field901, Class75.field900);
	}
}
