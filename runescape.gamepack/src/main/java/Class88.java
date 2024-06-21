import io.runebox.ObfInfo;

public final class Class88 extends Class255 {
	@ObfInfo(name = "bs", desc = "Lic;")
	public Class211 field1163;
	@ObfInfo(name = "ax", desc = "Z")
	public boolean field1170;
	@ObfInfo(name = "ay", desc = "D")
	public double field1171;
	@ObfInfo(name = "au", desc = "D")
	public double field1172;
	@ObfInfo(name = "as", desc = "D")
	public double field1173;
	@ObfInfo(name = "aw", desc = "D")
	public double field1174;
	@ObfInfo(name = "ad", desc = "D")
	public double field1175;
	@ObfInfo(name = "ai", desc = "D")
	public double field1176;
	@ObfInfo(name = "an", desc = "D")
	public double field1177;
	@ObfInfo(name = "am", desc = "D")
	public double field1178;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = 1555345695)
	public int field1155;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 467035077)
	public int field1156;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 941170019)
	public int field1157;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 124441865)
	public int field1158;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 165646981)
	public int field1159;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -64205639)
	public int field1160;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1583318851)
	public int field1161;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 707359503)
	public int field1162;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 1073677969)
	public int field1164;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -884521431)
	public int field1165;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1413510113)
	public int field1166;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1959902371)
	public int field1167;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 197772491)
	public int field1168;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -954339723)
	public int field1169;
	@ObfInfo(name = "bf", desc = "I", intMultiplier = 624670785)
	public int field1179;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1125042955)
	public int field1180;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 494262325)
	public int field1181;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1373726165)
	public int field1182;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1534471891)
	public int field1183;

	public Class88(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field1170 = false;
		this.field1179 = 0;
		this.field1155 = 0;
		this.field1168 = var1;
		this.field1183 = var2;
		this.field1157 = var3;
		this.field1180 = var4;
		this.field1159 = var5;
		this.field1156 = var6;
		this.field1165 = var7;
		this.field1166 = var8;
		this.field1167 = var9;
		this.field1169 = var10;
		this.field1181 = var11;
		this.field1170 = false;
		int var12 = Class224.method4163(this.field1168).field2301;
		if (var12 != -1) {
			this.field1163 = Class211.method4637(var12);
		} else {
			this.field1163 = null;
		}

	}

	public Class88(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field1182 = var10;
	}

	@ObfInfo(name = "ak", desc = "(IIIII)V", opaque = "1805307849")
	public final void method2387(int var1, int var2, int var3, int var4) {
		this.field1161 = var1;
		this.field1162 = var2;
		this.field1158 = var3;
		double var6;
		if (!this.field1170) {
			var6 = (double)(this.field1161 - this.field1157);
			double var8 = (double)(this.field1162 - this.field1180);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field1171 = (double)this.field1157 + (double)this.field1167 * var6 / var10;
			this.field1172 = (double)this.field1180 + (double)this.field1167 * var8 / var10;
			this.field1173 = (double)this.field1159;
		}

		var6 = (double)(this.field1165 + 1 - var4);
		this.field1174 = ((double)this.field1161 - this.field1171) / var6;
		this.field1175 = ((double)this.field1162 - this.field1172) / var6;
		this.field1176 = Math.sqrt(this.field1174 * this.field1174 + this.field1175 * this.field1175);
		if (!this.field1170) {
			this.field1177 = -this.field1176 * Math.tan((double)this.field1166 * 0.02454369D);
		}

		this.field1178 = ((double)this.field1158 - this.field1173 - var6 * this.field1177) * 2.0D / (var6 * var6);
	}

	@ObfInfo(name = "al", desc = "(II)V", opaque = "-1693952401")
	public final void method2393(int var1) {
		this.field1170 = true;
		this.field1171 += (double)var1 * this.field1174;
		this.field1172 += (double)var1 * this.field1175;
		this.field1173 += this.field1178 * 0.5D * (double)var1 * (double)var1 + this.field1177 * (double)var1;
		this.field1177 += (double)var1 * this.field1178;
		this.field1164 = (int)(Math.atan2(this.field1174, this.field1175) * 325.949D) + 1024 & 2047;
		this.field1160 = (int)(Math.atan2(this.field1177, this.field1176) * 325.949D) & 2047;
		if (this.field1163 != null) {
			if (!this.field1163.method4038()) {
				this.field1155 += var1;

				while (true) {
					do {
						do {
							if (this.field1155 <= this.field1163.field2139[this.field1179]) {
								return;
							}

							this.field1155 -= this.field1163.field2139[this.field1179];
							++this.field1179;
						} while(this.field1179 < this.field1163.field2142.length);

						this.field1179 -= this.field1163.field2143;
					} while(this.field1179 >= 0 && this.field1179 < this.field1163.field2142.length);

					this.field1179 = 0;
				}
			} else {
				this.field1179 += var1;
				int var3 = this.field1163.method4005();
				if (this.field1179 >= var3) {
					this.field1179 = var3 - this.field1163.field2143;
				}
			}
		}

	}

	@ObfInfo(name = "ah", desc = "(I)Lkb;", opaque = "102285859")
	public final Class262 method1092() {
		Class224 var2 = Class224.method4163(this.field1168);
		Class262 var3 = var2.method4227(this.field1179);
		if (var3 == null) {
			return null;
		} else {
			var3.method5251(this.field1160);
			return var3;
		}
	}
}
