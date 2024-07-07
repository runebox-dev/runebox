import io.runebox.ObfInfo;

@ObfInfo(name = "um")
public class Class533 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field5287;
	@ObfInfo(name = "aq", desc = "Lok;")
	public static Class375 field5286;
	@ObfInfo(name = "ag", desc = "[[I")
	public int[][] field5288;
	@ObfInfo(name = "ak", desc = "[[Ljava/lang/Object;")
	public Object[][] field5289;

	static {
		field5287 = new Class327(64);
	}

	@ObfInfo(name = "ag", desc = "(Lvp;I)V", opaque = "-917332238")
	public void method9411(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method9418(var1, var3);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;II)V", opaque = "2034609691")
	public void method9418(Class562 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method9902();
			if (this.field5288 == null) {
				this.field5288 = new int[var4][];
			}

			for (int var5 = var1.method9902(); var5 != 255; var5 = var1.method9902()) {
				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.method9902()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method9842();
				}

				this.field5288[var6] = var8;
				if (var7) {
					if (this.field5289 == null) {
						this.field5289 = new Object[this.field5288.length][];
					}

					Object[][] var18 = this.field5289;
					int var12 = var1.method9842();
					Object[] var13 = new Object[var12 * var8.length];

					for (int var14 = 0; var14 < var12; ++var14) {
						for (int var15 = 0; var15 < var8.length; ++var15) {
							int var16 = var15 + var14 * var8.length;
							Class525 var17 = Class522.method2912(var8[var15]);
							var13[var16] = var17.method9298(var1);
						}
					}

					var18[var6] = var13;
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(B)V")
	public void method9412() {
	}

	@ObfInfo(owner = "dp", name = "aq", desc = "(Lok;B)V")
	public static void method2458(Class375 var0) {
		field5286 = var0;
	}

	@ObfInfo(owner = "hk", name = "ad", desc = "(IB)Lum;", opaque = "30")
	public static Class533 method3885(int var0) {
		Class533 var2 = (Class533)field5287.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field5286.method7132(39, var0);
			var2 = new Class533();
			if (var3 != null) {
				var2.method9411(new Class562(var3));
			}

			var2.method9412();
			field5287.method6330(var2, (long)var0);
			return var2;
		}
	}
}
