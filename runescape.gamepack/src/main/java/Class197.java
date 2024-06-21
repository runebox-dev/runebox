import io.runebox.ObfInfo;

@ObfInfo(name = "ho")
public class Class197 extends Class507 {
	@ObfInfo(name = "az", desc = "Llm;")
	public static Class299 field2013;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field2014;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1514514101)
	public int field2023;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field2015;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field2022;
	@ObfInfo(name = "at", desc = "[S")
	public short[] field2016;
	@ObfInfo(name = "ab", desc = "[S")
	public short[] field2017;
	@ObfInfo(name = "ac", desc = "[S")
	public short[] field2018;
	@ObfInfo(name = "ao", desc = "[S")
	public short[] field2019;

	static {
		field2013 = new Class299(64);
	}

	public Class197() {
		this.field2023 = -1;
		this.field2022 = new int[]{-1, -1, -1, -1, -1};
		this.field2014 = false;
	}

	@ObfInfo(name = "al", desc = "(Lua;I)V")
	public void method3845(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3855(var1, var3);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lua;II)V", opaque = "-266758959")
	public void method3855(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2023 = var1.method9405();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method9405();
				this.field2015 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2015[var5] = var1.method9407();
				}
			} else if (var2 == 3) {
				this.field2014 = true;
			} else if (var2 == 40) {
				var4 = var1.method9405();
				this.field2016 = new short[var4];
				this.field2017 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2016[var5] = (short)var1.method9407();
					this.field2017[var5] = (short)var1.method9407();
				}
			} else if (var2 == 41) {
				var4 = var1.method9405();
				this.field2018 = new short[var4];
				this.field2019 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2018[var5] = (short)var1.method9407();
					this.field2019[var5] = (short)var1.method9407();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field2022[var2 - 60] = var1.method9407();
			}
		}

	}

	@ObfInfo(name = "az", desc = "(B)Z", opaque = "3")
	public boolean method3847() {
		if (this.field2015 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2015.length; ++var3) {
				if (!Client.field1802.method7232(this.field2015[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	@ObfInfo(name = "af", desc = "(I)Ljb;", opaque = "1605515774")
	public Class236 method3848() {
		if (this.field2015 == null) {
			return null;
		} else {
			Class236[] var2 = new Class236[this.field2015.length];

			for (int var3 = 0; var3 < this.field2015.length; ++var3) {
				var2[var3] = Class236.method4594(Client.field1802, this.field2015[var3], 0);
			}

			Class236 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new Class236(var2, var2.length);
			}

			int var4;
			if (this.field2016 != null) {
				for (var4 = 0; var4 < this.field2016.length; ++var4) {
					var5.method4573(this.field2016[var4], this.field2017[var4]);
				}
			}

			if (this.field2018 != null) {
				for (var4 = 0; var4 < this.field2018.length; ++var4) {
					var5.method4600(this.field2018[var4], this.field2019[var4]);
				}
			}

			return var5;
		}
	}

	@ObfInfo(name = "aa", desc = "(I)Z", opaque = "2026407683")
	public boolean method3846() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field2022[var3] != -1 && !Client.field1802.method7232(this.field2022[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	@ObfInfo(name = "at", desc = "(I)Ljb;", opaque = "-938751037")
	public Class236 method3850() {
		Class236[] var2 = new Class236[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field2022[var4] != -1) {
				var2[var3++] = Class236.method4594(Client.field1802, this.field2022[var4], 0);
			}
		}

		Class236 var6 = new Class236(var2, var3);
		int var5;
		if (this.field2016 != null) {
			for (var5 = 0; var5 < this.field2016.length; ++var5) {
				var6.method4573(this.field2016[var5], this.field2017[var5]);
			}
		}

		if (this.field2018 != null) {
			for (var5 = 0; var5 < this.field2018.length; ++var5) {
				var6.method4600(this.field2018[var5], this.field2019[var5]);
			}
		}

		return var6;
	}

	@ObfInfo(desc = "(I)LClass197;")
	public static Class197 method3060(int var0) {
		Class197 var2 = (Class197)field2013.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else if (Client.field2012 == null) {
			return null;
		} else {
			byte[] var3 = Client.field2012.method7216(3, var0);
			var2 = new Class197();
			if (var3 != null) {
				var2.method3845(new Class521(var3));
			}

			field2013.method5987(var2, (long)var0);
			return var2;
		}
	}
}
