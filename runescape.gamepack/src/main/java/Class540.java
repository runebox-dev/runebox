import io.runebox.ObfInfo;

@ObfInfo(name = "ut")
public class Class540 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field5307;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -258897133)
	public int field5308;
	@ObfInfo(name = "ak", desc = "[[I")
	public int[][] field5310;
	@ObfInfo(name = "ag", desc = "[[Ljava/lang/Object;")
	public Object[][] field5311;

	static {
		field5307 = new Class327(64);
	}

	public Class540() {
		this.field5308 = -1;
	}

	@ObfInfo(name = "ad", desc = "(Lvp;I)V", opaque = "-2023984015")
	public void method9503(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method9505(var1, var3);
		}
	}

	@ObfInfo(name = "ag", desc = "(II)[Ljava/lang/Object;")
	public Object[] method9504(int var1) {
		return this.field5311 == null ? null : this.field5311[var1];
	}

	@ObfInfo(name = "ak", desc = "(Lvp;IB)V", opaque = "6")
	public void method9505(Class562 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method9902();
			if (this.field5311 == null) {
				this.field5311 = new Object[var4][];
				this.field5310 = new int[var4][];
			}

			for (int var5 = var1.method9902(); var5 != 255; var5 = var1.method9902()) {
				int var6 = var1.method9902();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method9842();
				}

				Object[][] var17 = this.field5311;
				int var11 = var1.method9842();
				Object[] var12 = new Object[var11 * var7.length];

				for (int var13 = 0; var13 < var11; ++var13) {
					for (int var14 = 0; var14 < var7.length; ++var14) {
						int var15 = var13 * var7.length + var14;
						Class525 var16 = Class522.method2912(var7[var14]);
						var12[var15] = var16.method9298(var1);
					}
				}

				var17[var5] = var12;
				this.field5310[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field5308 = var1.method9848();
		}

	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public void method9502() {
	}

	@ObfInfo(owner = "jt", name = "aq", desc = "(II)Lut;", opaque = "-408274121")
	public static Class540 method4943(int var0) {
		Class540 var2 = (Class540)field5307.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field5309.method7132(38, var0);
			var2 = new Class540();
			if (var3 != null) {
				var2.method9503(new Class562(var3));
			}

			var2.method9502();
			field5307.method6330(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "lp", name = "an", desc = "(I)V")
	public static void method5844() {
		field5307.method6332();
	}
}
