public class Class218 extends Class507 {
	public static Class299 field2192;
	public static Class299 field2194;
	public static Class299 field2196;
	public int field2190;
	public int field2195;
	public int field2198;
	public int field2201;
	public int field2202;
	public int field2203;
	public int field2204;
	public int field2205;
	public int field2206;
	public int field2207;
	public int field2209;
	public int field2210;
	public int field2212;
	public int field2213;
	public int[] field2211;
	public String field2208;

	static {
		field2192 = new Class299(64);
		field2194 = new Class299(64);
		field2196 = new Class299(20);
	}

	public Class218() {
		this.field2198 = -1;
		this.field2212 = 16777215;
		this.field2206 = 70;
		this.field2201 = -1;
		this.field2202 = -1;
		this.field2203 = -1;
		this.field2195 = -1;
		this.field2205 = 0;
		this.field2190 = 0;
		this.field2204 = -1;
		this.field2208 = "";
		this.field2209 = -1;
		this.field2210 = 0;
		this.field2207 = -1;
		this.field2213 = -1;
	}

	public void method4122(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4123(var1, var3);
		}
	}

	public void method4123(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2198 = var1.method9423();
		} else if (var2 == 2) {
			this.field2212 = var1.method9399();
		} else if (var2 == 3) {
			this.field2201 = var1.method9423();
		} else if (var2 == 4) {
			this.field2203 = var1.method9423();
		} else if (var2 == 5) {
			this.field2202 = var1.method9423();
		} else if (var2 == 6) {
			this.field2195 = var1.method9423();
		} else if (var2 == 7) {
			this.field2205 = var1.method9535();
		} else if (var2 == 8) {
			this.field2208 = var1.method9577();
		} else if (var2 == 9) {
			this.field2206 = var1.method9407();
		} else if (var2 == 10) {
			this.field2190 = var1.method9535();
		} else if (var2 == 11) {
			this.field2204 = 0;
		} else if (var2 == 12) {
			this.field2209 = var1.method9405();
		} else if (var2 == 13) {
			this.field2210 = var1.method9535();
		} else if (var2 == 14) {
			this.field2204 = var1.method9407();
		} else if (var2 == 17 || var2 == 18) {
			this.field2207 = var1.method9407();
			if (65535 == this.field2207) {
				this.field2207 = -1;
			}

			this.field2213 = var1.method9407();
			if (65535 == this.field2213) {
				this.field2213 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				var4 = var1.method9407();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			int var5 = var1.method9405();
			this.field2211 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2211[var6] = var1.method9407();
				if (65535 == this.field2211[var6]) {
					this.field2211[var6] = -1;
				}
			}

			this.field2211[var5 + 1] = var4;
		}

	}

	public final Class218 method4152() {
		int var2 = -1;
		if (-1 != this.field2207) {
			var2 = Class351.method6175(this.field2207);
		} else if (this.field2213 != -1) {
			var2 = Class351.field3889[this.field2213];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2211.length - 1) {
			var3 = this.field2211[var2];
		} else {
			var3 = this.field2211[this.field2211.length - 1];
		}

		return var3 != -1 ? method287(var3) : null;
	}

	public String method4151(int var1) {
		String var3 = this.field2208;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + Class412.method2887(var1, false) + var3.substring(var4 + 2);
		}
	}

	public Class549 method4125() {
		if (this.field2201 < 0) {
			return null;
		} else {
			Class549 var2 = (Class549)field2194.method5993((long)this.field2201);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method9868(Client.field3267, this.field2201, 0);
				if (var2 != null) {
					field2194.method5987(var2, (long)this.field2201);
				}

				return var2;
			}
		}
	}

	public Class549 method4124() {
		if (this.field2202 < 0) {
			return null;
		} else {
			Class549 var2 = (Class549)field2194.method5993((long)this.field2202);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method9868(Client.field3267, this.field2202, 0);
				if (var2 != null) {
					field2194.method5987(var2, (long)this.field2202);
				}

				return var2;
			}
		}
	}

	public Class549 method4127() {
		if (this.field2203 < 0) {
			return null;
		} else {
			Class549 var2 = (Class549)field2194.method5993((long)this.field2203);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method9868(Client.field3267, this.field2203, 0);
				if (var2 != null) {
					field2194.method5987(var2, (long)this.field2203);
				}

				return var2;
			}
		}
	}

	public Class549 method4128() {
		if (this.field2195 < 0) {
			return null;
		} else {
			Class549 var2 = (Class549)field2194.method5993((long)this.field2195);
			if (var2 != null) {
				return var2;
			} else {
				var2 = Class554.method9868(Client.field3267, this.field2195, 0);
				if (var2 != null) {
					field2194.method5987(var2, (long)this.field2195);
				}

				return var2;
			}
		}
	}

	public Class418 method4135() {
		if (this.field2198 == -1) {
			return null;
		} else {
			Class418 var2 = (Class418)field2196.method5993((long)this.field2198);
			if (var2 != null) {
				return var2;
			} else {
				Class382 var4 = Client.field3267;
				Class382 var5 = Client.field2191;
				int var6 = this.field2198;
				Class418 var3;
				if (!Class554.method2876(var4, var6, 0)) {
					var3 = null;
				} else {
					byte[] var8 = var5.method7216(var6, 0);
					Class418 var7;
					if (var8 == null) {
						var7 = null;
					} else {
						Class418 var9 = new Class418(var8, Class81.field5374, Class81.field5377, Class81.field5376, Class81.field5379, Class81.field1371, Class81.field1910);
						Class81.field5374 = null;
						Class81.field5377 = null;
						Class81.field5376 = null;
						Class81.field5379 = null;
						Class81.field1371 = null;
						Class81.field1910 = (byte[][])null;
						var7 = var9;
					}

					var3 = var7;
				}

				if (var3 != null) {
					field2196.method5987(var3, (long)this.field2198);
				}

				return var3;
			}
		}
	}

	public static Class218 method287(int var0) {
		Class218 var2 = (Class218)field2192.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2200.method7216(32, var0);
			var2 = new Class218();
			if (var3 != null) {
				var2.method4122(new Class521(var3));
			}

			field2192.method5987(var2, (long)var0);
			return var2;
		}
	}

	public static void method3403() {
		field2192.method5995();
		field2194.method5995();
		field2196.method5995();
	}
}
