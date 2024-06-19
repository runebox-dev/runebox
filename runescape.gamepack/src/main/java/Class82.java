public class Class82 {
	public int field999;
	public final Class384 field1000;
	public final int field1001;

	public Class82(Class384 var1, String var2) {
		this.field999 = 0;
		this.field1000 = var1;
		this.field1001 = var1.method7228();
	}

	public boolean method2245() {
		this.field999 = 0;

		for (int var2 = 0; var2 < this.field1001; ++var2) {
			if (!this.field1000.method7318(var2) || this.field1000.method7329(var2)) {
				++this.field999;
			}
		}

		return this.field999 >= this.field1001;
	}

	public static double[] method2248(double var0, double var2, int var4) {
		int var6 = 1 + var4 * 2;
		double[] var7 = new double[var6];
		int var8 = -var4;

		for (int var9 = 0; var8 <= var4; ++var9) {
			var7[var9] = Class417.method5879((double)var8, var0, var2);
			++var8;
		}

		return var7;
	}

	public static char method2247(char var0, Class402 var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && Class402.field4609 != var1) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && Class402.field4609 != var1) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}
}
