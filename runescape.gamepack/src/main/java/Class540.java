import io.runebox.ObfInfo;

@ObfInfo(name = "ut")
public class Class540 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field5314;
	@ObfInfo(name = "ak", desc = "Lor;")
	public static Class382 field5316;
	@ObfInfo(name = "aj", desc = "[[I")
	public int[][] field5315;
	@ObfInfo(name = "az", desc = "[[Ljava/lang/Object;")
	public Object[][] field5313;

	static {
		field5314 = new Class299(64);
	}

	@ObfInfo(name = "aj", desc = "(Lua;I)V", opaque = "209942218")
	public void method9849(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method9854(var1, var3);
		}
	}

	@ObfInfo(name = "az", desc = "(Lua;II)V", opaque = "1779160877")
	public void method9854(Class521 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method9405();
			if (this.field5315 == null) {
				this.field5315 = new int[var4][];
			}

			for (int var5 = var1.method9405(); var5 != 255; var5 = var1.method9405()) {
				int var6 = var5 & 127;
				boolean var7 = 0 != (var5 & 128);
				int[] var8 = new int[var1.method9405()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method9419();
				}

				this.field5315[var6] = var8;
				if (var7) {
					if (this.field5313 == null) {
						this.field5313 = new Object[this.field5315.length][];
					}

					Object[][] var18 = this.field5313;
					int var12 = var1.method9419();
					Object[] var13 = new Object[var8.length * var12];

					for (int var14 = 0; var14 < var12; ++var14) {
						for (int var15 = 0; var15 < var8.length; ++var15) {
							int var16 = var14 * var8.length + var15;
							Class545 var17 = Class283.method5727(var8[var15]);
							var13[var16] = var17.method9893(var1);
						}
					}

					var18[var6] = var13;
				}
			}
		}

	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method9851() {
	}

	@ObfInfo(owner = "lr", name = "ak", desc = "(Lor;B)V")
	public static void method6072(Class382 var0) {
		field5316 = var0;
	}

	@ObfInfo(owner = "hi", name = "al", desc = "(II)Lut;", opaque = "-1367335013")
	public static Class540 method3721(int var0) {
		Class540 var2 = (Class540)field5314.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field5316.method7216(39, var0);
			var2 = new Class540();
			if (var3 != null) {
				var2.method9849(new Class521(var3));
			}

			var2.method9851();
			field5314.method5987(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "ge", name = "aa", desc = "(B)V")
	public static void method3407() {
		field5314.method5995();
	}
}
