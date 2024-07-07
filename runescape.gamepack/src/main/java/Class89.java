import io.runebox.ObfInfo;

@ObfInfo(name = "dk")
public class Class89 extends Class520 {
	@ObfInfo(name = "aq", desc = "Lup;")
	public static Class536 field1120;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field1118;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field1119;

	static {
		field1120 = new Class536(32);
	}

	public Class89() {
		this.field1119 = new int[]{-1};
		this.field1118 = new int[]{0};
	}

	@ObfInfo(owner = "hm", name = "aq", desc = "(IIB)I", opaque = "0")
	public static int method3894(int var0, int var1) {
		Class89 var3 = (Class89)field1120.method9439((long)var0);
		if (var3 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field1119.length ? var3.field1119[var1] : -1;
		}
	}

	@ObfInfo(owner = "bi", name = "ad", desc = "(III)I", opaque = "-457800641")
	public static int method476(int var0, int var1) {
		Class89 var3 = (Class89)field1120.method9439((long)var0);
		if (var3 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field1118.length ? var3.field1118[var1] : 0;
		}
	}

	@ObfInfo(owner = "ik", name = "ak", desc = "(IIIII)V", opaque = "271071564")
	public static void method4234(int var0, int var1, int var2, int var3) {
		Class89 var5 = (Class89)field1120.method9439((long)var0);
		if (var5 == null) {
			var5 = new Class89();
			field1120.method9445(var5, (long)var0);
		}

		if (var5.field1119.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			int var8;
			for (var8 = 0; var8 < var5.field1119.length; ++var8) {
				var6[var8] = var5.field1119[var8];
				var7[var8] = var5.field1118[var8];
			}

			for (var8 = var5.field1119.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field1119 = var6;
			var5.field1118 = var7;
		}

		var5.field1119[var1] = var2;
		var5.field1118[var1] = var3;
	}

	@ObfInfo(owner = "hk", name = "an", desc = "(IB)V")
	public static void method3882(int var0) {
		Class89 var2 = (Class89)field1120.method9439((long)var0);
		if (var2 != null) {
			var2.method9267();
		}
	}
}
