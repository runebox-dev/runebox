import io.runebox.ObfInfo;

@ObfInfo(name = "dg")
public class Class85 extends Class516 {
	@ObfInfo(name = "aq", desc = "Lmo;")
	public static Class327 field1075;
	@ObfInfo(name = "ai", desc = "[Lth;")
	public Class502[] field1078;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1287810367)
	public int field1070;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1746577925)
	public int field1074;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 63573081)
	public int field1076;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1982128447)
	public int field1077;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field1071;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field1072;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field1079;
	@ObfInfo(name = "ap", desc = "[Ljava/lang/String;")
	public String[] field1073;

	static {
		field1075 = new Class327(128);
	}

	@ObfInfo(name = "ap", desc = "(II)[Lth;")
	public Class502[] method2347(int var1) {
		return new Class502[var1];
	}

	@ObfInfo(owner = "hn", name = "aq", desc = "(II)Ldg;", opaque = "1876391771")
	public static Class85 method3896(int var0) {
		Class85 var2 = (Class85)field1075.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field5007.method7132(var0, 0);
			if (var3 == null) {
				return null;
			} else {
				var2 = method3320(var3);
				field1075.method6330(var2, (long)var0);
				return var2;
			}
		}
	}

	@ObfInfo(owner = "ix", name = "ad", desc = "(IIIB)Ldg;", opaque = "74")
	public static Class85 method4435(int var0, int var1, int var2) {
		int var4 = Class379.method4070(var1, var0);
		Class85 var5 = Class156.method3341(var4, var0);
		if (var5 != null) {
			return var5;
		} else {
			int var6 = (-3 - var2 << 8) + var0;
			var5 = Class156.method3341(var6, var0);
			if (var5 != null) {
				return var5;
			} else {
				var4 = Class172.method3550(var0);
				var5 = Class156.method3341(var4, var0);
				return var5 != null ? var5 : null;
			}
		}
	}

	@ObfInfo(owner = "fx", name = "ak", desc = "([BI)Ldg;", opaque = "-1425019729")
	public static Class85 method3320(byte[] var0) {
		Class85 var2 = new Class85();
		Class562 var3 = new Class562(var0);
		var3.field5471 = var3.field5472.length - 2;
		int var4 = var3.method9997();
		int var5 = var3.field5472.length - 2 - var4 - 12;
		var3.field5471 = var5;
		int var6 = var3.method9832();
		var2.field1074 = var3.method9997();
		var2.field1070 = var3.method9997();
		var2.field1076 = var3.method9997();
		var2.field1077 = var3.method9997();
		int var7 = var3.method9902();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field1078 = var2.method2347(var7);

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.method9997();
				Class502 var10 = new Class502(var9 > 0 ? Class337.method7475(var9) : 1);
				var2.field1078[var8] = var10;

				while (var9-- > 0) {
					int var11 = var3.method9832();
					int var12 = var3.method9832();
					var10.method8902(new Class508(var12), (long)var11);
				}
			}
		}

		var3.field5471 = 0;
		var2.field1079 = var3.method9836();
		var2.field1071 = new int[var6];
		var2.field1072 = new int[var6];
		var2.field1073 = new String[var6];

		for (var8 = 0; var3.field5471 < var5; var2.field1071[var8++] = var9) {
			var9 = var3.method9997();
			if (var9 == 3) {
				var2.field1073[var8] = var3.method9837();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field1072[var8] = var3.method9832();
			} else {
				var2.field1072[var8] = var3.method9902();
			}
		}

		return var2;
	}
}
