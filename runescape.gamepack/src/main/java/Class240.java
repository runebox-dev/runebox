import io.runebox.ObfInfo;

@ObfInfo(name = "jf")
public class Class240 {
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1097173409)
	public int field2535;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -2089582897)
	public int field2537;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1089320565)
	public final int field2534;
	@ObfInfo(name = "ap", desc = "[I")
	public final int[] field2538;
	@ObfInfo(name = "an", desc = "[I")
	public final int[] field2539;
	@ObfInfo(name = "aq", desc = "[[I")
	public final int[][] field2540;
	@ObfInfo(name = "ad", desc = "[[I")
	public final int[][] field2541;

	public Class240(int var1, int var2) {
		this.field2540 = new int[var1][var2];
		this.field2541 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = Class337.method7475(var3 / 4);
		this.field2538 = new int[var4];
		this.field2539 = new int[var4];
		this.field2534 = var4 - 1;
	}

	@ObfInfo(name = "aq", desc = "(B)V", opaque = "1")
	public void method4611() {
		for (int var2 = 0; var2 < this.field2540.length; ++var2) {
			for (int var3 = 0; var3 < this.field2540[var2].length; ++var3) {
				this.field2540[var2][var3] = 0;
				this.field2541[var2][var3] = 99999999;
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(III)V")
	public void method4636(int var1, int var2) {
		this.field2535 = var1;
		this.field2537 = var2;
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method4647() {
		return this.field2535;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method4614() {
		return this.field2537;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method4615() {
		return this.field2540.length;
	}

	@ObfInfo(name = "an", desc = "(I)I")
	public int method4616() {
		return this.field2540[0].length;
	}

	@ObfInfo(name = "aj", desc = "(I)[[I")
	public int[][] method4617() {
		return this.field2540;
	}

	@ObfInfo(name = "av", desc = "(I)[[I")
	public int[][] method4618() {
		return this.field2541;
	}

	@ObfInfo(name = "ab", desc = "(B)[I")
	public int[] method4619() {
		return this.field2538;
	}

	@ObfInfo(name = "ai", desc = "(B)[I")
	public int[] method4620() {
		return this.field2539;
	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method4621() {
		return this.field2534;
	}

	@ObfInfo(name = "aq", desc = "(J)Ljava/lang/String;")
	public static String method4650(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = Class426.field4711[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfInfo(name = "ph", desc = "(B)V", opaque = "1")
	public static void method4635() {
		if (Client.field4980 != null) {
			Client.field825 = Client.field541;
			Client.field4980.method7325();

			for (int var1 = 0; var1 < Client.field5093.field1024.length; ++var1) {
				if (null != Client.field5093.field1024[var1]) {
					Client.field4980.method7328((Client.field5093.field1024[var1].field1266 >> 7) + Client.field5093.field1019, (Client.field5093.field1024[var1].field1229 >> 7) + Client.field5093.field1021);
				}
			}
		}

	}
}
