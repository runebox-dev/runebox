public class Class96 extends Class255 {
	public Class211 field1272;
	public Class98 field1273;
	public int field1265;
	public int field1266;
	public int field1267;
	public int field1268;
	public int field1269;
	public int field1270;
	public int field1271;
	public int field1274;

	public Class96(Class98 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Class255 var10) {
		this.field1273 = var1;
		this.field1266 = var2;
		this.field1267 = var3;
		this.field1274 = var4;
		this.field1269 = var5;
		this.field1268 = var6;
		this.field1271 = var7;
		if (var8 != -1) {
			this.field1272 = Class237.method4637(var8);
			this.field1265 = 0;
			this.field1270 = Client.field778 - 1;
			if (0 == this.field1272.field2152 && var10 != null && var10 instanceof Class96) {
				Class96 var11 = (Class96)var10;
				if (this.field1272 == var11.field1272) {
					this.field1265 = var11.field1265;
					this.field1270 = var11.field1270;
					return;
				}
			}

			if (var9 && this.field1272.field2143 != -1) {
				if (!this.field1272.method4038()) {
					this.field1265 = (int)(Math.random() * (double)this.field1272.field2142.length);
					this.field1270 -= (int)(Math.random() * (double)this.field1272.field2139[this.field1265]);
				} else {
					this.field1265 = (int)(Math.random() * (double)this.field1272.method4005());
				}
			}
		}

	}

	public final Class262 method1092() {
		int var3;
		if (this.field1272 != null) {
			int var2 = Client.field778 - this.field1270;
			if (var2 > 100 && this.field1272.field2143 > 0) {
				var2 = 100;
			}

			if (this.field1272.method4038()) {
				var3 = this.field1272.method4005();
				this.field1265 += var2;
				var2 = 0;
				if (this.field1265 >= var3) {
					this.field1265 = var3 - this.field1272.field2143;
					if (this.field1265 < 0 || this.field1265 > var3) {
						this.field1272 = null;
					}
				}
			} else {
				label75: {
					do {
						do {
							if (var2 <= this.field1272.field2139[this.field1265]) {
								break label75;
							}

							var2 -= this.field1272.field2139[this.field1265];
							++this.field1265;
						} while(this.field1265 < this.field1272.field2142.length);

						this.field1265 -= this.field1272.field2143;
					} while(this.field1265 >= 0 && this.field1265 < this.field1272.field2142.length);

					this.field1272 = null;
				}
			}

			this.field1270 = Client.field778 - var2;
		}

		Class222 var13 = Class222.method4161(this.field1266);
		if (var13.field2278 != null) {
			var13 = var13.method4181();
		}

		if (var13 == null) {
			return null;
		} else {
			int var4;
			if (1 != this.field1274 && this.field1274 != 3) {
				var3 = var13.field2252;
				var4 = var13.field2253;
			} else {
				var3 = var13.field2253;
				var4 = var13.field2252;
			}

			int var5 = (var3 >> 1) + this.field1268;
			int var6 = (var3 + 1 >> 1) + this.field1268;
			int var7 = this.field1271 + (var4 >> 1);
			int var8 = (var4 + 1 >> 1) + this.field1271;
			int[][] var9 = this.field1273.field1291[this.field1269];
			int var10 = var9[var5][var8] + var9[var6][var7] + var9[var5][var7] + var9[var6][var8] >> 2;
			int var11 = (var3 << 6) + (this.field1268 << 7);
			int var12 = (var4 << 6) + (this.field1271 << 7);
			return var13.method4205(this.field1267, this.field1274, var9, var11, var10, var12, this.field1272, this.field1265);
		}
	}

	public static void method2494(int var0, int var1) {
		Class228 var3 = Class33.method714(var0);
		int var4 = var3.field2394;
		int var5 = var3.field2395;
		int var6 = var3.field2396;
		int var7 = Class351.field3891[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Class351.field3889[var4] = Class351.field3889[var4] & ~var7 | var1 << var5 & var7;
	}

	public static void method2493(Class340 var0, int var1) {
		if (var0.field3753 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3684 == null) {
				var0.field3684 = new int[var0.field3753.length];
			}

			var0.field3684[var1] = Integer.MAX_VALUE;
		}
	}
}