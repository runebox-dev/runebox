import io.runebox.ObfInfo;

public final class Class270 {
	@ObfInfo(name = "ab", desc = "Lju;")
	public Class255 field3011;
	@ObfInfo(name = "ac", desc = "Lju;")
	public Class255 field3012;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 881866845)
	public int field3004;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1330599413)
	public int field3005;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -386929949)
	public int field3006;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -2133935761)
	public int field3007;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 644960727)
	public int field3008;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1494323445)
	public int field3010;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1756144545)
	public int field3014;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 416997813)
	public int field3016;
	@ObfInfo(name = "ao", desc = "J", longMultiplier = 5421932838209317377L)
	public long field3009;

	public Class270() {
		this.field3009 = 0L;
		this.field3014 = 0;
	}

	@ObfInfo(name = "aj", desc = "([Lcl;II[I[II)V", opaque = "2014877642")
	public static void method5396(Class64[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var2 + var1) / 2;
			Class64 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var7].field478;
							var13 = var9.field478;
						} else if (var3[var11] == 1) {
							var12 = var0[var7].field475;
							var13 = var9.field475;
							if (var12 == -1 && 1 == var4[var11]) {
								var12 = 2001;
							}

							if (var13 == -1 && 1 == var4[var11]) {
								var13 = 2001;
							}
						} else if (3 == var3[var11]) {
							var12 = var0[var7].method1175() ? 1 : 0;
							var13 = var9.method1175() ? 1 : 0;
						} else {
							var12 = var0[var7].field473;
							var13 = var9.field473;
						}

						if (var13 != var12) {
							if ((var4[var11] != 1 || var12 <= var13) && (0 != var4[var11] || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var6].field478;
							var13 = var9.field478;
						} else if (1 == var3[var11]) {
							var12 = var0[var6].field475;
							var13 = var9.field475;
							if (var12 == -1 && 1 == var4[var11]) {
								var12 = 2001;
							}

							if (var13 == -1 && 1 == var4[var11]) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var6].method1175() ? 1 : 0;
							var13 = var9.method1175() ? 1 : 0;
						} else {
							var12 = var0[var6].field473;
							var13 = var9.field473;
						}

						if (var13 != var12) {
							if ((1 != var4[var11] || var12 >= var13) && (0 != var4[var11] || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					Class64 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method5396(var0, var1, var7, var3, var4);
			method5396(var0, var7 + 1, var2, var3, var4);
		}

	}
}
