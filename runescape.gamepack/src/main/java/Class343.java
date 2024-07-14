import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "ne")
public class Class343 {
	@ObfInfo(name = "ay", desc = "Lmo;")
	public static Class327 field3727;
	@ObfInfo(name = "ao", desc = "Lrb;")
	public static Class444 field3726;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -317003185)
	public static int field3729;
	@ObfInfo(name = "ax", desc = "[I")
	public static final int[] field3722;
	@ObfInfo(name = "ab", desc = "[Lgz;")
	public Class182[] field3719;
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field3725;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1570243249)
	public int field3720;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 984502449)
	public int field3721;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -140367159)
	public int field3728;
	@ObfInfo(name = "aq", desc = "[I")
	public int[] field3716;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field3717;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field3718;
	@ObfInfo(name = "av", desc = "J", longMultiplier = 7978463832893938461L)
	public long field3723;
	@ObfInfo(name = "aj", desc = "J", longMultiplier = -3664344773530448641L)
	public long field3724;

	static {
		field3722 = new int[]{Class212.field2299.field2296, Class212.field2292.field2296, Class212.field2302.field2296, Class212.field2297.field2296, Class212.field2300.field2296, Class212.field2305.field2296, Class212.field2295.field2296};
		field3727 = new Class327(260);
		field3726 = new Class444(16, Class446.field4834);
		field3729 = 0;
	}

	public Class343() {
		this.field3728 = -1;
		this.field3720 = 0;
		this.field3725 = false;
	}

	public Class343(Class343 var1) {
		this.field3728 = -1;
		this.field3720 = 0;
		this.field3725 = false;
		int[] var2 = Arrays.copyOf(var1.field3717, var1.field3717.length);
		int[] var3 = Arrays.copyOf(var1.field3716, var1.field3716.length);
		Class182[] var4 = (Class182[])(var1.field3719 != null ? (Class182[])Arrays.copyOf(var1.field3719, var1.field3719.length) : null);
		int[] var5 = Arrays.copyOf(var1.field3718, var1.field3718.length);
		this.method6459(var3, var2, var4, false, var5, var1.field3720, var1.field3721, var1.field3728);
	}

	@ObfInfo(name = "aq", desc = "([I[I[Lgz;Z[IIIIB)V")
	public void method6459(int[] var1, int[] var2, Class182[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3719 = var3;
		this.field3725 = var4;
		this.field3728 = var8;
		this.method6428(var1, var2, var5, var6, var7);
	}

	@ObfInfo(name = "ad", desc = "([I[I[IIII)V", opaque = "-1254763021")
	public void method6428(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6436(var4);
		}

		if (var2 == null) {
			var2 = this.method6436(var4);
		}

		this.field3716 = var1;
		this.field3717 = var2;
		this.field3718 = var3;
		this.field3720 = var4;
		this.field3721 = var5;
		this.method6433();
	}

	@ObfInfo(name = "ag", desc = "(II)[I", opaque = "-1178318332")
	public int[] method6436(int var1) {
		int[] var3 = new int[12];

		for (int var4 = 0; var4 < 7; ++var4) {
			method6282(var1, var3, var4);
		}

		return var3;
	}

	@ObfInfo(name = "ap", desc = "(IZI)V", opaque = "1685912193")
	public void method6426(int var1, boolean var2) {
		int var4 = this.field3717[field3722[var1]];
		if (var4 != 0) {
			var4 -= 256;

			Class199 var5;
			do {
				if (!var2) {
					--var4;
					if (var4 < 0) {
						var4 = Client.field3659 - 1;
					}
				} else {
					++var4;
					if (var4 >= Client.field3659) {
						var4 = 0;
					}
				}

				var5 = Class199.method866(var4);
			} while(var5 == null || var5.field2198 || var5.field2191 != var1 + (this.field3720 == 1 ? 7 : 0));

			this.field3717[field3722[var1]] = var4 + 256;
			this.method6433();
		}
	}

	@ObfInfo(name = "an", desc = "(IZI)V", opaque = "87429786")
	public void method6445(int var1, boolean var2) {
		int var4 = this.field3718[var1];
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = Client.field1467[var1].length - 1;
				}
			} while(!Class16.method216(var1, var4));
		} else {
			do {
				++var4;
				if (var4 >= Client.field1467[var1].length) {
					var4 = 0;
				}
			} while(!Class16.method216(var1, var4));
		}

		this.field3718[var1] = var4;
		this.method6433();
	}

	@ObfInfo(name = "aj", desc = "(II)V", opaque = "-771169671")
	public void method6431(int var1) {
		if (this.field3720 != var1) {
			this.method6428((int[])null, (int[])null, this.field3718, var1, -1);
		}
	}

	@ObfInfo(name = "av", desc = "(Lvp;I)V", opaque = "-770802939")
	public void method6432(Class562 var1) {
		var1.method9809(this.field3720);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field3717[field3722[var3]];
			if (var4 == 0) {
				var1.method9809(-1);
			} else {
				var1.method9809(var4 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.method9809(this.field3718[var3]);
		}

	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "-1857990006")
	public void method6433() {
		long var2 = this.field3724;
		int var4 = this.field3717[5];
		int var5 = this.field3717[9];
		this.field3717[5] = var5;
		this.field3717[9] = var4;
		this.field3724 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field3724 <<= 4;
			if (this.field3717[var6] >= 256) {
				this.field3724 += (long)(this.field3717[var6] - 256);
			}
		}

		if (this.field3717[0] >= 256) {
			this.field3724 += (long)(this.field3717[0] - 256 >> 4);
		}

		if (this.field3717[1] >= 256) {
			this.field3724 += (long)(this.field3717[1] - 256 >> 8);
		}

		for (var6 = 0; var6 < 5; ++var6) {
			this.field3724 <<= 3;
			this.field3724 += (long)this.field3718[var6];
		}

		this.field3724 <<= 1;
		this.field3724 += (long)this.field3720;
		this.field3717[5] = var4;
		this.field3717[9] = var5;
		if (var2 != 0L && this.field3724 != var2 || this.field3725) {
			field3727.method6335(var2);
		}

	}

	@ObfInfo(name = "ai", desc = "(Lii;ILii;II)Llv;", opaque = "626505664")
	public Class308 method6434(Class217 var1, int var2, Class217 var3, int var4) {
		if (this.field3721 != -1) {
			return Class184.method2222(this.field3721).method3703(var1, var2, var3, var4, (Class190)null);
		} else {
			long var6 = this.field3724;
			int[] var8 = this.field3717;
			if (var1 != null && (var1.field2366 >= 0 || var1.field2365 >= 0)) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field3717[var9];
				}

				if (var1.field2366 >= 0) {
					var6 += (long)(var1.field2366 - this.field3717[5] << 40);
					var8[5] = var1.field2366;
				}

				if (var1.field2365 >= 0) {
					var6 += (long)(var1.field2365 - this.field3717[3] << 48);
					var8[3] = var1.field2365;
				}
			}

			Class308 var19 = (Class308)field3727.method6327(var6);
			if (var19 == null) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512) {
						Class199 var13 = Class199.method866(var12 - 256);
						if (var13 != null && !var13.method3956()) {
							var10 = true;
						}
					}

					if (var12 >= 512 && !Class187.method3421(var12 - 512).method3748(this.field3720)) {
						var10 = true;
					}
				}

				if (var10) {
					if (this.field3723 != -1L) {
						var19 = (Class308)field3727.method6327(this.field3723);
					}

					if (var19 == null) {
						return null;
					}
				}

				if (var19 == null) {
					Class278[] var21 = new Class278[12];
					var12 = 0;

					int var14;
					for (int var22 = 0; var22 < 12; ++var22) {
						var14 = var8[var22];
						Class278 var16;
						if (var14 >= 256 && var14 < 512) {
							Class199 var15 = Class199.method866(var14 - 256);
							var16 = null;
							if (var15 != null) {
								var16 = var15.method3957();
							}

							if (var16 != null) {
								var21[var12++] = var16;
							}
						}

						if (var14 >= 512) {
							Class187 var24 = Class187.method3421(var14 - 512);
							var16 = var24.method3753(this.field3720);
							if (var16 != null) {
								if (this.field3719 != null) {
									Class182 var17 = this.field3719[var22];
									if (var17 != null) {
										int var18;
										if (var17.field1909 != null && var24.field2015 != null && var24.field2033.length == var17.field1909.length) {
											for (var18 = 0; var18 < var24.field2015.length; ++var18) {
												var16.method5567(var24.field2033[var18], var17.field1909[var18]);
											}
										}

										if (var17.field1910 != null && var24.field2017 != null && var24.field2018.length == var17.field1910.length) {
											for (var18 = 0; var18 < var24.field2017.length; ++var18) {
												var16.method5576(var24.field2018[var18], var17.field1910[var18]);
											}
										}
									}
								}

								var21[var12++] = var16;
							}
						}
					}

					Class278 var23 = new Class278(var21, var12);

					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field3718[var14] < Client.field1467[var14].length) {
							var23.method5567(Client.field4920[var14], Client.field1467[var14][this.field3718[var14]]);
						}

						if (this.field3718[var14] < Client.field1095[var14].length) {
							var23.method5567(Client.field458[var14], Client.field1095[var14][this.field3718[var14]]);
						}
					}

					var19 = var23.method5517(64, 850, -30, -50, -30);
					field3727.method6330(var19, var6);
					this.field3723 = var6;
				}
			}

			Class308 var20;
			if (var1 == null && var3 == null) {
				var20 = var19.method5933(true);
			} else if (var1 != null && var3 != null) {
				var20 = var1.method4138(var19, var2, var3, var4);
			} else if (var1 != null) {
				var20 = var1.method4135(var19, var2);
			} else {
				var20 = var3.method4135(var19, var4);
			}

			return var20;
		}
	}

	@ObfInfo(name = "ae", desc = "(B)Lkr;", opaque = "1")
	public Class278 method6435() {
		if (this.field3721 != -1) {
			return Class184.method2222(this.field3721).method3659((Class190)null);
		} else {
			boolean var2 = false;

			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field3717[var3];
				if (var4 >= 256 && var4 < 512) {
					Class199 var5 = Class199.method866(var4 - 256);
					if (var5 != null && !var5.method3954()) {
						var2 = true;
					}
				}

				if (var4 >= 512 && !Class187.method3421(var4 - 512).method3764(this.field3720)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				Class278[] var9 = new Class278[12];
				var4 = 0;

				int var6;
				for (int var10 = 0; var10 < 12; ++var10) {
					var6 = this.field3717[var10];
					if (var6 >= 256 && var6 < 512) {
						Class199 var7 = Class199.method866(var6 - 256);
						Class278 var8 = null;
						if (var7 != null) {
							var8 = var7.method3953();
						}

						if (var8 != null) {
							var9[var4++] = var8;
						}
					}

					if (var6 >= 512) {
						Class278 var12 = Class187.method3421(var6 - 512).method3795(this.field3720);
						if (var12 != null) {
							var9[var4++] = var12;
						}
					}
				}

				Class278 var11 = new Class278(var9, var4);

				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field3718[var6] < Client.field1467[var6].length) {
						var11.method5567(Client.field4920[var6], Client.field1467[var6][this.field3718[var6]]);
					}

					if (this.field3718[var6] < Client.field1095[var6].length) {
						var11.method5567(Client.field458[var6], Client.field1095[var6][this.field3718[var6]]);
					}
				}

				return var11;
			}
		}
	}

	@ObfInfo(name = "au", desc = "(B)I", opaque = "-1")
	public int method6437() {
		long var2 = this.field3724;
		if (this.field3721 != -1) {
			var2 = -65536L | (long)this.field3721;
		}

		Integer var4 = (Integer)field3726.method8261(var2);
		if (var4 == null) {
			var4 = ++field3729 - 1;
			field3726.method8262(var2, var4);
			field3729 %= 65535;
		}

		return var4;
	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public void method6425() {
		this.method6428(this.field3716, this.field3717, this.field3718, this.field3720, this.field3721);
	}

	@ObfInfo(owner = "mh", name = "ak", desc = "(I[III)V", opaque = "940712843")
	public static void method6282(int var0, int[] var1, int var2) {
		for (int var4 = 0; var4 < Client.field3659; ++var4) {
			Class199 var5 = Class199.method866(var4);
			if (var5 != null && !var5.field2198 && var5.field2191 == (var0 == 1 ? 7 : 0) + var2) {
				var1[field3722[var2]] = var4 + 256;
				break;
			}
		}

	}

	@ObfInfo(owner = "cb", name = "az", desc = "(B)V")
	public static void method1147() {
		field3727.method6332();
		field3726.method8264();
		field3729 = 0;
	}
}
