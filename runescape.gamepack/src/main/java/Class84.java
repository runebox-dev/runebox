import io.runebox.ObfInfo;

@ObfInfo(name = "df")
public final class Class84 extends Class280 {
	@ObfInfo(name = "bt", desc = "Lii;")
	public Class217 field1042;
	@ObfInfo(name = "ac", desc = "Z")
	public boolean field1067;
	@ObfInfo(name = "af", desc = "D")
	public double field1038;
	@ObfInfo(name = "al", desc = "D")
	public double field1053;
	@ObfInfo(name = "ay", desc = "D")
	public double field1054;
	@ObfInfo(name = "ao", desc = "D")
	public double field1055;
	@ObfInfo(name = "aa", desc = "D")
	public double field1056;
	@ObfInfo(name = "as", desc = "D")
	public double field1057;
	@ObfInfo(name = "aw", desc = "D")
	public double field1059;
	@ObfInfo(name = "at", desc = "D")
	public double field1062;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1766816905)
	public int field1037;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1772430645)
	public int field1039;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1782025733)
	public int field1040;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1045611613)
	public int field1041;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -935780375)
	public int field1043;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -135221413)
	public int field1044;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 429044921)
	public int field1045;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -504466887)
	public int field1046;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1039953437)
	public int field1047;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 563603713)
	public int field1048;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 864895171)
	public int field1049;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1613876837)
	public int field1050;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1690959867)
	public int field1051;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -1052283447)
	public int field1058;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1926569083)
	public int field1060;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -418607101)
	public int field1061;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1863287717)
	public int field1063;
	@ObfInfo(name = "bj", desc = "I", intMultiplier = 1315368611)
	public int field1064;
	@ObfInfo(name = "be", desc = "I", intMultiplier = -232988127)
	public int field1065;

	public Class84(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field1067 = false;
		this.field1064 = 0;
		this.field1065 = 0;
		this.field1046 = var1;
		this.field1037 = var2;
		this.field1039 = var3;
		this.field1040 = var4;
		this.field1041 = var5;
		this.field1044 = var6;
		this.field1047 = var7;
		this.field1048 = var8;
		this.field1049 = var9;
		this.field1063 = var10;
		this.field1051 = var11;
		this.field1067 = false;
		int var12 = Class188.method3600(this.field1046).field2077;
		if (var12 != -1) {
			this.field1042 = Class344.method6474(var12);
		} else {
			this.field1042 = null;
		}

	}

	public Class84(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field1050 = var10;
	}

	@ObfInfo(name = "aq", desc = "(IIIII)V", opaque = "-1354303074")
	public final void method2329(int var1, int var2, int var3, int var4) {
		this.field1043 = var1;
		this.field1060 = var2;
		this.field1045 = var3;
		double var6;
		if (!this.field1067) {
			var6 = (double)(this.field1043 - this.field1039);
			double var8 = (double)(this.field1060 - this.field1040);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field1053 = (double)this.field1049 * var6 / var10 + (double)this.field1039;
			this.field1054 = var8 * (double)this.field1049 / var10 + (double)this.field1040;
			this.field1055 = (double)this.field1041;
		}

		var6 = (double)(1 + this.field1047 - var4);
		this.field1056 = ((double)this.field1043 - this.field1053) / var6;
		this.field1057 = ((double)this.field1060 - this.field1054) / var6;
		this.field1059 = Math.sqrt(this.field1057 * this.field1057 + this.field1056 * this.field1056);
		if (!this.field1067) {
			this.field1062 = -this.field1059 * Math.tan((double)this.field1048 * 0.02454369D);
		}

		this.field1038 = 2.0D * ((double)this.field1045 - this.field1055 - this.field1062 * var6) / (var6 * var6);
	}

	@ObfInfo(name = "ad", desc = "(II)V", opaque = "-1976950767")
	public final void method2330(int var1) {
		this.field1067 = true;
		this.field1053 += this.field1056 * (double)var1;
		this.field1054 += (double)var1 * this.field1057;
		this.field1055 += (double)var1 * this.field1062 + (double)var1 * 0.5D * this.field1038 * (double)var1;
		this.field1062 += (double)var1 * this.field1038;
		this.field1061 = (int)(Math.atan2(this.field1056, this.field1057) * 325.949D) + 1024 & 2047;
		this.field1058 = (int)(Math.atan2(this.field1062, this.field1059) * 325.949D) & 2047;
		if (this.field1042 != null) {
			if (!this.field1042.method4132()) {
				this.field1065 += var1;

				while (true) {
					do {
						do {
							if (this.field1065 <= this.field1042.field2349[this.field1064]) {
								return;
							}

							this.field1065 -= this.field1042.field2349[this.field1064];
							++this.field1064;
						} while(this.field1064 < this.field1042.field2355.length);

						this.field1064 -= this.field1042.field2359;
					} while(this.field1064 >= 0 && this.field1064 < this.field1042.field2355.length);

					this.field1064 = 0;
				}
			} else {
				this.field1064 += var1;
				int var3 = this.field1042.method4141();
				if (this.field1064 >= var3) {
					this.field1064 = var3 - this.field1042.field2359;
				}
			}
		}

	}

	@ObfInfo(name = "ah", desc = "(I)Llv;", opaque = "-1073372180")
	public final Class308 method1140() {
		Class188 var2 = Class188.method3600(this.field1046);
		Class308 var3 = var2.method3815(this.field1064);
		if (var3 == null) {
			return null;
		} else {
			var3.method5909(this.field1058);
			return var3;
		}
	}
}
