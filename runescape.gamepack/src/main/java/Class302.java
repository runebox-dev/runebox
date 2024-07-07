import io.runebox.ObfInfo;

@ObfInfo(name = "lp")
public final class Class302 {
	@ObfInfo(name = "ap", desc = "Lkt;")
	public Class280 field3096;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -763115457)
	public int field3092;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1185086541)
	public int field3093;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1339418813)
	public int field3094;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 340723817)
	public int field3095;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 632661417)
	public int field3097;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -2112751427)
	public int field3098;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1877979663)
	public int field3099;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -567760481)
	public int field3100;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1461270687)
	public int field3101;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 571921967)
	public int field3102;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 437260815)
	public int field3103;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1042137613)
	public int field3105;
	@ObfInfo(name = "ah", desc = "J", longMultiplier = -1569410276734308073L)
	public long field3104;

	public Class302() {
		this.field3104 = 0L;
		this.field3105 = 0;
	}

	@ObfInfo(name = "lw", desc = "(Lde;Lug;B)V", opaque = "0")
	public static void method5842(Class83 var0, Class527 var1) {
		int var3 = var1.method9902();
		if (var3 < var0.field1020) {
			throw new RuntimeException("dang");
		} else if (var3 > var0.field1020) {
			throw new RuntimeException("dang!");
		} else {
			var0.field1020 = 0;

			int var4;
			int var5;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var0.field1031[var4];
				Class483 var6 = var0.field1029[var5];
				boolean var7 = var1.method9902() == 1;
				if (!var7) {
					var0.field1029[var5] = null;
				} else {
					var0.field1031[++var0.field1020 - 1] = var5;
					byte var8 = var1.method9955();
					byte var9 = var1.method9955();
					var6.field4994 = var1.method9997();
					Class236 var10 = Class227.method4395((byte)var1.method9902());
					Class250 var11 = Class144.method3178(var6.field4994, var6.field5000);
					int var12 = Math.min(var11.method4870(), 128);
					var6.field4993 = var12 / Client.field758;
					var6.field4998 = var12 % Client.field758;
					if (var8 != 0 || var9 != 0) {
						var6.method8756(var8 + var6.field5004[0], var9 + var6.field4995[0], var10);
					}
				}
			}

			while (var1.method9350(Client.field678.field1485) >= 10) {
				var4 = var1.method9997();
				var0.field1031[++var0.field1020 - 1] = var4;
				var5 = var1.method9902();
				int var13 = var1.method9902();
				int var14 = var5 * 8;
				int var15 = var13 * 8;
				Class483 var16 = new Class483(var4, var14, var15, Client.field1474.method2459());
				var0.field1029[var4] = var16;
				int var17 = var1.method9902();
				int var18 = var1.method9902();
				var16.method8751(var17, var18);
				var16.field5000 = var1.method9997();
				var1.method9997();
			}

		}
	}
}
