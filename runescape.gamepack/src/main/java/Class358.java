import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "nt")
public class Class358 {
	@ObfInfo(name = "au", desc = "Llm;")
	public static Class299 field3956;
	@ObfInfo(name = "as", desc = "Lry;")
	public static Class467 field3949;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 565502609)
	public static int field3957;
	@ObfInfo(name = "ae", desc = "[I")
	public static final int[] field3955;
	@ObfInfo(name = "ac", desc = "[Lha;")
	public Class183[] field3958;
	@ObfInfo(name = "ao", desc = "Z")
	public boolean field3945;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 340358925)
	public int field3946;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1894865247)
	public int field3948;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1800504253)
	public int field3954;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field3947;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field3950;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field3953;
	@ObfInfo(name = "at", desc = "J", longMultiplier = -1246912684082648107L)
	public long field3951;
	@ObfInfo(name = "ab", desc = "J", longMultiplier = 8795388253495121875L)
	public long field3952;

	static {
		field3955 = new int[]{Class229.field2408.field2414, Class229.field2411.field2414, Class229.field2412.field2414, Class229.field2406.field2414, Class229.field2409.field2414, Class229.field2407.field2414, Class229.field2410.field2414};
		field3956 = new Class299(260);
		field3949 = new Class467(16, Class459.field4870);
		field3957 = 0;
	}

	public Class358() {
		this.field3948 = -1;
		this.field3946 = 0;
		this.field3945 = false;
	}

	public Class358(Class358 var1) {
		this.field3948 = -1;
		this.field3946 = 0;
		this.field3945 = false;
		int[] var2 = Arrays.copyOf(var1.field3950, var1.field3950.length);
		int[] var3 = Arrays.copyOf(var1.field3953, var1.field3953.length);
		Class183[] var4 = (Class183[])(var1.field3958 != null ? (Class183[])Arrays.copyOf(var1.field3958, var1.field3958.length) : null);
		int[] var5 = Arrays.copyOf(var1.field3947, var1.field3947.length);
		this.method7076(var3, var2, var4, false, var5, var1.field3946, var1.field3954, var1.field3948);
	}

	@ObfInfo(name = "ak", desc = "([I[I[Lha;Z[IIIII)V")
	public void method7076(int[] var1, int[] var2, Class183[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3958 = var3;
		this.field3945 = var4;
		this.field3948 = var8;
		this.method7045(var1, var2, var5, var6, var7);
	}

	@ObfInfo(name = "al", desc = "([I[I[IIII)V", opaque = "-1648659338")
	public void method7045(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method7046(var4);
		}

		if (var2 == null) {
			var2 = this.method7046(var4);
		}

		this.field3953 = var1;
		this.field3950 = var2;
		this.field3947 = var3;
		this.field3946 = var4;
		this.field3954 = var5;
		this.method7072();
	}

	@ObfInfo(name = "aj", desc = "(II)[I", opaque = "969571369")
	public int[] method7046(int var1) {
		int[] var3 = new int[12];

		for (int var4 = 0; var4 < 7; ++var4) {
			for (int var5 = 0; var5 < Client.field4711; ++var5) {
				Class197 var6 = Class197.method3060(var5);
				if (var6 != null && !var6.field2014 && var6.field2023 == (var1 == 1 ? 7 : 0) + var4) {
					var3[field3955[var4]] = var5 + 256;
					break;
				}
			}
		}

		return var3;
	}

	@ObfInfo(name = "az", desc = "(IZI)V", opaque = "174395092")
	public void method7077(int var1, boolean var2) {
		int var4 = this.field3950[field3955[var1]];
		if (var4 != 0) {
			var4 -= 256;

			Class197 var5;
			do {
				if (!var2) {
					--var4;
					if (var4 < 0) {
						var4 = Client.field4711 - 1;
					}
				} else {
					++var4;
					if (var4 >= Client.field4711) {
						var4 = 0;
					}
				}

				var5 = Class197.method3060(var4);
			} while(var5 == null || var5.field2014 || (this.field3946 == 1 ? 7 : 0) + var1 != var5.field2023);

			this.field3950[field3955[var1]] = var4 + 256;
			this.method7072();
		}
	}

	@ObfInfo(name = "af", desc = "(IZI)V", opaque = "867227834")
	public void method7048(int var1, boolean var2) {
		int var4 = this.field3947[var1];
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = Client.field4687[var1].length - 1;
				}
			} while(!Class346.method162(var1, var4));
		} else {
			do {
				++var4;
				if (var4 >= Client.field4687[var1].length) {
					var4 = 0;
				}
			} while(!Class346.method162(var1, var4));
		}

		this.field3947[var1] = var4;
		this.method7072();
	}

	@ObfInfo(name = "aa", desc = "(IB)V")
	public void method7049(int var1) {
		if (this.field3946 != var1) {
			this.method7045((int[])null, (int[])null, this.field3947, var1, -1);
		}
	}

	@ObfInfo(name = "at", desc = "(Lua;B)V", opaque = "1")
	public void method7050(Class521 var1) {
		var1.method9388(this.field3946);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field3950[field3955[var3]];
			if (var4 == 0) {
				var1.method9388(-1);
			} else {
				var1.method9388(var4 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.method9388(this.field3947[var3]);
		}

	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "-1734415086")
	public void method7072() {
		long var2 = this.field3951;
		int var4 = this.field3950[5];
		int var5 = this.field3950[9];
		this.field3950[5] = var5;
		this.field3950[9] = var4;
		this.field3951 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field3951 <<= 4;
			if (this.field3950[var6] >= 256) {
				this.field3951 += (long)(this.field3950[var6] - 256);
			}
		}

		if (this.field3950[0] >= 256) {
			this.field3951 += (long)(this.field3950[0] - 256 >> 4);
		}

		if (this.field3950[1] >= 256) {
			this.field3951 += (long)(this.field3950[1] - 256 >> 8);
		}

		for (var6 = 0; var6 < 5; ++var6) {
			this.field3951 <<= 3;
			this.field3951 += (long)this.field3947[var6];
		}

		this.field3951 <<= 1;
		this.field3951 += (long)this.field3946;
		this.field3950[5] = var4;
		this.field3950[9] = var5;
		if (0L != var2 && this.field3951 != var2 || this.field3945) {
			field3956.method5979(var2);
		}

	}

	@ObfInfo(name = "ac", desc = "(Lic;ILic;IB)Lkb;", opaque = "2")
	public Class262 method7086(Class211 var1, int var2, Class211 var3, int var4) {
		if (-1 != this.field3954) {
			return Class225.method3256(this.field3954).method4246(var1, var2, var3, var4, (Class223)null);
		} else {
			long var6 = this.field3951;
			int[] var8 = this.field3950;
			if (var1 != null && (var1.field2146 >= 0 || var1.field2147 >= 0)) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field3950[var9];
				}

				if (var1.field2146 >= 0) {
					var6 += (long)(var1.field2146 - this.field3950[5] << 40);
					var8[5] = var1.field2146;
				}

				if (var1.field2147 >= 0) {
					var6 += (long)(var1.field2147 - this.field3950[3] << 48);
					var8[3] = var1.field2147;
				}
			}

			Class262 var19 = (Class262)field3956.method5993(var6);
			if (var19 == null) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512) {
						Class197 var13 = Class197.method3060(var12 - 256);
						if (var13 != null && !var13.method3847()) {
							var10 = true;
						}
					}

					if (var12 >= 512 && !Class232.method109(var12 - 512).method4439(this.field3946)) {
						var10 = true;
					}
				}

				if (var10) {
					if (-1L != this.field3952) {
						var19 = (Class262)field3956.method5993(this.field3952);
					}

					if (var19 == null) {
						return null;
					}
				}

				if (var19 == null) {
					Class236[] var21 = new Class236[12];
					var12 = 0;

					int var14;
					for (int var22 = 0; var22 < 12; ++var22) {
						var14 = var8[var22];
						Class236 var16;
						if (var14 >= 256 && var14 < 512) {
							Class197 var15 = Class197.method3060(var14 - 256);
							var16 = null;
							if (var15 != null) {
								var16 = var15.method3848();
							}

							if (var16 != null) {
								var21[var12++] = var16;
							}
						}

						if (var14 >= 512) {
							Class232 var24 = Class232.method109(var14 - 512);
							var16 = var24.method4476(this.field3946);
							if (var16 != null) {
								if (this.field3958 != null) {
									Class183 var17 = this.field3958[var22];
									if (var17 != null) {
										int var18;
										if (var17.field1911 != null && var24.field2451 != null && var24.field2476.length == var17.field1911.length) {
											for (var18 = 0; var18 < var24.field2451.length; ++var18) {
												var16.method4573(var24.field2476[var18], var17.field1911[var18]);
											}
										}

										if (var17.field1909 != null && var24.field2494 != null && var17.field1909.length == var24.field2470.length) {
											for (var18 = 0; var18 < var24.field2494.length; ++var18) {
												var16.method4600(var24.field2470[var18], var17.field1909[var18]);
											}
										}
									}
								}

								var21[var12++] = var16;
							}
						}
					}

					Class236 var23 = new Class236(var21, var12);

					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field3947[var14] < Client.field4687[var14].length) {
							var23.method4573(Client.field170[var14], Client.field4687[var14][this.field3947[var14]]);
						}

						if (this.field3947[var14] < Client.field2374[var14].length) {
							var23.method4573(Client.field423[var14], Client.field2374[var14][this.field3947[var14]]);
						}
					}

					var19 = var23.method4572(64, 850, -30, -50, -30);
					field3956.method5987(var19, var6);
					this.field3952 = var6;
				}
			}

			Class262 var20;
			if (var1 == null && var3 == null) {
				var20 = var19.method5214(true);
			} else if (var1 != null && var3 != null) {
				var20 = var1.method4002(var19, var2, var3, var4);
			} else if (var1 != null) {
				var20 = var1.method3999(var19, var2);
			} else {
				var20 = var3.method3999(var19, var4);
			}

			return var20;
		}
	}

	@ObfInfo(name = "ao", desc = "(I)Ljb;", opaque = "-503255243")
	public Class236 method7053() {
		if (-1 != this.field3954) {
			return Class225.method3256(this.field3954).method4247((Class223)null);
		} else {
			boolean var2 = false;

			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field3950[var3];
				if (var4 >= 256 && var4 < 512) {
					Class197 var5 = Class197.method3060(var4 - 256);
					if (var5 != null && !var5.method3846()) {
						var2 = true;
					}
				}

				if (var4 >= 512 && !Class232.method109(var4 - 512).method4422(this.field3946)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				Class236[] var9 = new Class236[12];
				var4 = 0;

				int var6;
				for (int var10 = 0; var10 < 12; ++var10) {
					var6 = this.field3950[var10];
					if (var6 >= 256 && var6 < 512) {
						Class197 var7 = Class197.method3060(var6 - 256);
						Class236 var8 = null;
						if (var7 != null) {
							var8 = var7.method3850();
						}

						if (var8 != null) {
							var9[var4++] = var8;
						}
					}

					if (var6 >= 512) {
						Class236 var12 = Class232.method109(var6 - 512).method4423(this.field3946);
						if (var12 != null) {
							var9[var4++] = var12;
						}
					}
				}

				Class236 var11 = new Class236(var9, var4);

				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field3947[var6] < Client.field4687[var6].length) {
						var11.method4573(Client.field170[var6], Client.field4687[var6][this.field3947[var6]]);
					}

					if (this.field3947[var6] < Client.field2374[var6].length) {
						var11.method4573(Client.field423[var6], Client.field2374[var6][this.field3947[var6]]);
					}
				}

				return var11;
			}
		}
	}

	@ObfInfo(name = "ah", desc = "(I)I", opaque = "2001122653")
	public int method7054() {
		long var2 = this.field3951;
		if (this.field3954 != -1) {
			var2 = -65536L | (long)this.field3954;
		}

		Integer var4 = (Integer)field3949.method8583(var2);
		if (var4 == null) {
			var4 = ++field3957 - 1;
			field3949.method8588(var2, var4);
			field3957 %= 65535;
		}

		return var4;
	}

	@ObfInfo(name = "av", desc = "(I)V")
	public void method7055() {
		this.method7045(this.field3953, this.field3950, this.field3947, this.field3946, this.field3954);
	}

	@ObfInfo(name = "jb", desc = "(Ldt;Ldh;I)V", opaque = "137682114")
	public static void method7092(Class98 var0, Class86 var1) {
		int var4;
		int var5;
		int var6;
		if (-1 != var1.field1070) {
			Object var3 = null;
			var4 = 65536;
			if (var1.field1070 < var4) {
				var3 = var0.field1295[var1.field1070];
			} else {
				var3 = var0.field1293[var1.field1070 - var4];
			}

			if (var3 != null) {
				var5 = var1.field1065 - ((Class86)var3).field1065;
				var6 = var1.field1126 - ((Class86)var3).field1126;
				if (var5 != 0 || var6 != 0) {
					var1.field1133 = Class432.method3839(var5, var6);
				}
			} else if (var1.field1091) {
				var1.field1070 = -1;
				var1.field1091 = false;
			}
		}

		int var9;
		if (var1.field1125 == 0 || var1.field1129 > 0) {
			var9 = -1;
			if (-1 != var1.field1093 && var1.field1094 != -1) {
				var4 = 64 + (var1.field1093 * 128 - Client.field3857.field1289 * 128);
				var5 = 64 + (var1.field1094 * 128 - Client.field3857.field1285 * 128);
				var6 = var1.field1065 - var4;
				int var7 = var1.field1126 - var5;
				if (var6 != 0 || var7 != 0) {
					var9 = Class432.method3839(var6, var7);
				}
			} else if (var1.field1055 != -1) {
				var9 = var1.field1055;
			}

			if (var9 != -1) {
				var1.field1133 = var9;
				if (var1.field1095) {
					var1.field1060 = var1.field1133;
				}
			}

			var1.method2334();
		}

		var9 = var1.field1133 - var1.field1060 & 2047;
		if (var9 != 0) {
			boolean var10 = true;
			boolean var11 = true;
			++var1.field1123;
			var6 = var9 > 1024 ? -1 : 1;
			var1.field1060 += var6 * var1.field1089;
			boolean var12 = true;
			if (var9 < var1.field1089 || var9 > 2048 - var1.field1089) {
				var1.field1060 = var1.field1133;
				var12 = false;
			}

			if (var1.field1089 > 0 && var1.field1061 == var1.field1096 && (var1.field1123 > 25 || var12)) {
				if (var6 == -1 && -1 != var1.field1092) {
					var1.field1096 = var1.field1092;
				} else if (var6 == 1 && -1 != var1.field1063) {
					var1.field1096 = var1.field1063;
				} else {
					var1.field1096 = var1.field1064;
				}
			}

			var1.field1060 &= 2047;
		} else {
			if (var1.field1091) {
				var1.field1070 = -1;
				var1.field1091 = false;
			}

			var1.field1123 = 0;
		}

	}
}
