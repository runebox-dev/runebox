import io.runebox.ObfInfo;

@ObfInfo(name = "lt")
public final class Class306 {
	@ObfInfo(name = "an", desc = "Z")
	public boolean field3129;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1168172891)
	public int field3131;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 716391559)
	public int field3132;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -233451403)
	public int field3133;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1673746339)
	public int field3134;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -448594561)
	public int field3135;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -860148807)
	public int field3136;

	public Class306(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.field3129 = true;
		this.field3134 = var1;
		this.field3136 = var2;
		this.field3131 = var3;
		this.field3132 = var4;
		this.field3133 = var5;
		this.field3135 = var6;
		this.field3129 = var7;
	}

	@ObfInfo(name = "ln", desc = "(Lde;IIII)V", opaque = "2005672797")
	public static void method5852(Class83 var0, int var1, int var2, int var3) {
		Class408 var5 = var0.field1032[var1][var2][var3];
		if (var5 == null) {
			var0.field1014.method5273(var1, var2, var3);
		} else {
			long var6 = -99999999L;
			Class119 var8 = null;

			Class119 var9;
			for (var9 = (Class119)var5.method7526(); var9 != null; var9 = (Class119)var5.method7511()) {
				Class187 var10 = Class187.method3421(var9.field1439);
				long var11 = (long)var10.field2026;
				if (var10.field2025 == 1) {
					var11 *= var9.field1443 < Integer.MAX_VALUE ? (long)(var9.field1443 + 1) : (long)var9.field1443;
				}

				if (var11 > var6) {
					var6 = var11;
					var8 = var9;
				}
			}

			if (var8 == null) {
				var0.field1014.method5273(var1, var2, var3);
			} else {
				var5.method7505(var8);
				Class119 var14 = null;
				Class119 var15 = null;

				for (var9 = (Class119)var5.method7526(); var9 != null; var9 = (Class119)var5.method7511()) {
					if (var8.field1439 != var9.field1439) {
						if (var14 == null) {
							var14 = var9;
						}

						if (var9.field1439 != var14.field1439 && var15 == null) {
							var15 = var9;
						}
					}
				}

				long var12 = Class296.method4129(var2, var3, 3, false, 0, var0.field1026);
				var0.field1014.method5259(var1, var2, var3, Client.method3531(var0, Class371.method7108(var2), Class371.method7108(var3), var1), var8, var12, var14, var15);
			}
		}
	}
}
