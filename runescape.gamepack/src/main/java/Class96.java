import io.runebox.ObfInfo;

@ObfInfo(name = "dr")
public class Class96 extends Class255 {
	@ObfInfo(name = "ab", desc = "Lic;")
	public Class211 field1272;
	@ObfInfo(name = "ak", desc = "Ldt;")
	public Class98 field1273;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -440522477)
	public int field1265;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -221657491)
	public int field1266;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 361896199)
	public int field1267;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -25327393)
	public int field1268;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -415493371)
	public int field1269;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -212623117)
	public int field1270;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 743991919)
	public int field1271;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 2000434069)
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
			this.field1272 = Class211.method4637(var8);
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

	@ObfInfo(name = "ah", desc = "(I)Lkb;", opaque = "102285859")
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
}
