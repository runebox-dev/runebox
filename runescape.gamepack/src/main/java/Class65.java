import io.runebox.ObfInfo;

public class Class65 {
	@ObfInfo(name = "ak", desc = "Lbx;")
	public Class50 field795;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field793;
	@ObfInfo(name = "af", desc = "[Z")
	public boolean[] field791;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field792;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field794;

	public Class65(Class50 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field795 = var1;
		this.field793 = var2;
		this.field792 = var3;
		this.field794 = var4;
		this.field791 = var5;
	}

	@ObfInfo(name = "ak", desc = "([FIB)V", opaque = "-5")
	public void method1796(float[] var1, int var2) {
		int var4 = this.field795.field339.length;
		Class50 var10000 = this.field795;
		int var5 = Class50.field344[this.field795.field341 - 1];
		boolean[] var6 = this.field791;
		this.field791[1] = true;
		var6[0] = true;

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var7 = 2; var7 < var4; ++var7) {
			var8 = this.field795.method904(this.field792, var7);
			var9 = this.field795.method898(this.field792, var7);
			var10 = this.field795.method896(this.field792[var8], this.field794[var8], this.field792[var9], this.field794[var9], this.field792[var7]);
			var11 = this.field794[var7];
			int var12 = var5 - var10;
			int var14 = (var12 < var10 ? var12 : var10) << 1;
			if (var11 != 0) {
				boolean[] var15 = this.field791;
				this.field791[var9] = true;
				var15[var8] = true;
				this.field791[var7] = true;
				if (var11 >= var14) {
					this.field794[var7] = var12 > var10 ? var11 - var10 + var10 : var10 - var11 + var12 - 1;
				} else {
					this.field794[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
				}
			} else {
				this.field791[var7] = false;
				this.field794[var7] = var10;
			}
		}

		this.method1798(0, var4 - 1);
		var7 = 0;
		var8 = this.field795.field341 * this.field794[0];

		for (var9 = 1; var9 < var4; ++var9) {
			if (this.field791[var9]) {
				var10 = this.field792[var9];
				var11 = this.field794[var9] * this.field795.field341;
				this.field795.method897(var7, var8, var10, var11, var1, var2);
				if (var10 >= var2) {
					return;
				}

				var7 = var10;
				var8 = var11;
			}
		}

		var10000 = this.field795;
		float var17 = Class50.field340[var8];

		for (var10 = var7; var10 < var2; ++var10) {
			var1[var10] *= var17;
		}

	}

	@ObfInfo(name = "al", desc = "(B)Z")
	public boolean method1797() {
		return this.field793;
	}

	@ObfInfo(name = "aj", desc = "(III)V", opaque = "-1259464255")
	public void method1798(int var1, int var2) {
		if (var1 < var2) {
			int var4 = var1;
			int var5 = this.field792[var1];
			int var6 = this.field794[var1];
			boolean var7 = this.field791[var1];

			for (int var8 = var1 + 1; var8 <= var2; ++var8) {
				int var9 = this.field792[var8];
				if (var9 < var5) {
					this.field792[var4] = var9;
					this.field794[var4] = this.field794[var8];
					this.field791[var4] = this.field791[var8];
					++var4;
					this.field792[var8] = this.field792[var4];
					this.field794[var8] = this.field794[var4];
					this.field791[var8] = this.field791[var4];
				}
			}

			this.field792[var4] = var5;
			this.field794[var4] = var6;
			this.field791[var4] = var7;
			this.method1798(var1, var4 - 1);
			this.method1798(var4 + 1, var2);
		}
	}

	@ObfInfo(name = "lc", desc = "(IIIIIIII)Z", opaque = "-944551946")
	public static boolean method1805(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Class259 var8 = Client.field4582.field1283;
		int var10;
		if (var5 == Class368.field4005.field4008) {
			Class280 var9 = var8.method4947(var0, var1, var2);
			if (var9 != null) {
				var10 = Class274.method2942(var9.field3096);
				if (var3 == Class373.field4047.field4068) {
					var9.field3098 = new Class96(Client.field4582, var10, 2, var4 + 4, var0, var1, var2, var6, false, var9.field3098);
					var9.field3097 = new Class96(Client.field4582, var10, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var9.field3097);
				} else {
					var9.field3098 = new Class96(Client.field4582, var10, var3, var4, var0, var1, var2, var6, false, var9.field3098);
				}

				return true;
			}
		} else if (var5 == Class368.field4004.field4008) {
			Class270 var11 = var8.method4948(var0, var1, var2);
			if (var11 != null) {
				var10 = Class274.method2942(var11.field3009);
				if (var3 != Class373.field4056.field4068 && Class373.field4054.field4068 != var3) {
					if (var3 == Class373.field4052.field4068) {
						var11.field3011 = new Class96(Client.field4582, var10, 4, var4 + 4, var0, var1, var2, var6, false, var11.field3011);
					} else if (var3 == Class373.field4050.field4068) {
						var11.field3011 = new Class96(Client.field4582, var10, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var11.field3011);
					} else if (var3 == Class373.field4048.field4068) {
						var11.field3011 = new Class96(Client.field4582, var10, 4, var4 + 4, var0, var1, var2, var6, false, var11.field3011);
						var11.field3012 = new Class96(Client.field4582, var10, 4, 4 + (var4 + 2 & 3), var0, var1, var2, var6, false, var11.field3012);
					}
				} else {
					var11.field3011 = new Class96(Client.field4582, var10, 4, var4, var0, var1, var2, var6, false, var11.field3011);
				}

				return true;
			}
		} else if (Class368.field4006.field4008 == var5) {
			Class266 var12 = var8.method4949(var0, var1, var2);
			if (Class373.field4066.field4068 == var3) {
				var3 = Class373.field4065.field4068;
			}

			if (var12 != null) {
				var12.field2950 = new Class96(Client.field4582, Class274.method2942(var12.field2958), var3, var4, var0, var1, var2, var6, false, var12.field2950);
				return true;
			}
		} else if (var5 == Class368.field4007.field4008) {
			Class247 var13 = var8.method4950(var0, var1, var2);
			if (var13 != null) {
				var13.field2651 = new Class96(Client.field4582, Class274.method2942(var13.field2652), 22, var4, var0, var1, var2, var6, false, var13.field2651);
				return true;
			}
		}

		return false;
	}

	@ObfInfo(name = "lf", desc = "(Ldt;Luk;B)V", opaque = "-2")
	public static void method1806(Class98 var0, Class531 var1) {
		int var3 = var1.method9405();
		if (var3 < var0.field1286) {
			throw new RuntimeException("dang");
		} else if (var3 > var0.field1286) {
			throw new RuntimeException("dang!");
		} else {
			var0.field1286 = 0;

			int var4;
			int var5;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var0.field1302[var4];
				Class488 var6 = var0.field1299[var5];
				boolean var7 = var1.method9405() == 1;
				if (!var7) {
					var0.field1299[var5] = null;
				} else {
					var0.field1302[++var0.field1286 - 1] = var5;
					byte var8 = var1.method9406();
					byte var9 = var1.method9406();
					var6.field4988 = var1.method9407();
					Class256 var10 = Class256.method5753((byte)var1.method9405());
					int var12 = var6.field4988;
					int var13 = var6.field4987;
					int var14 = var12 - var13 & 2047;
					Class252 var15 = Class252.field2678;
					if (var14 > 1024) {
						var14 = 2048 - var14;
						var15 = Class252.field2679;
					}

					Class212 var11 = new Class212(var15, var14);
					int var22 = Math.min(var11.method4054(), 128);
					var6.field4989 = var22 / Client.field714;
					var6.field4992 = var22 % Client.field714;
					if (var8 != 0 || var9 != 0) {
						var6.method8912(var6.field4990[0] + var8, var9 + var6.field4998[0], var10);
					}
				}
			}

			while (var1.method9769(Client.field548.field1444) >= 10) {
				var4 = var1.method9407();
				var0.field1302[++var0.field1286 - 1] = var4;
				var5 = var1.method9405();
				int var16 = var1.method9405();
				int var17 = var5 * 8;
				int var18 = var16 * 8;
				Class488 var19 = new Class488(var4, var17, var18, Client.field4851.method2679());
				var0.field1299[var4] = var19;
				int var20 = var1.method9405();
				int var21 = var1.method9405();
				var19.method8913(var20, var21);
				var19.field4987 = var1.method9407();
				var1.method9407();
			}

		}
	}
}
