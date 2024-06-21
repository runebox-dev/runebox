import io.runebox.ObfInfo;

@ObfInfo(name = "ip")
public class Class224 extends Class507 {
	@ObfInfo(name = "aj", desc = "Llm;")
	public static Class299 field2297;
	@ObfInfo(name = "az", desc = "Llm;")
	public static Class299 field2298;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 831089047)
	public int field2300;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 107112977)
	public int field2301;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1931691159)
	public int field2304;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -2123612661)
	public int field2306;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 800719853)
	public int field2308;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -2134366815)
	public int field2309;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -880763715)
	public int field2311;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 2139694611)
	public int field2312;
	@ObfInfo(name = "ao", desc = "[S")
	public short[] field2296;
	@ObfInfo(name = "ab", desc = "[S")
	public short[] field2302;
	@ObfInfo(name = "ac", desc = "[S")
	public short[] field2303;
	@ObfInfo(name = "ah", desc = "[S")
	public short[] field2305;

	static {
		field2297 = new Class299(64);
		field2298 = new Class299(30);
	}

	public Class224() {
		this.field2301 = -1;
		this.field2306 = 128;
		this.field2312 = 128;
		this.field2308 = 0;
		this.field2309 = 0;
		this.field2304 = 0;
	}

	@ObfInfo(name = "al", desc = "(Lua;B)V", opaque = "-1")
	public void method4224(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method4226(var1, var3);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lua;IB)V", opaque = "4")
	public void method4226(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2300 = var1.method9407();
		} else if (var2 == 2) {
			this.field2301 = var1.method9407();
		} else if (var2 == 4) {
			this.field2306 = var1.method9407();
		} else if (var2 == 5) {
			this.field2312 = var1.method9407();
		} else if (var2 == 6) {
			this.field2308 = var1.method9407();
		} else if (var2 == 7) {
			this.field2309 = var1.method9405();
		} else if (var2 == 8) {
			this.field2304 = var1.method9405();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method9405();
				this.field2302 = new short[var4];
				this.field2303 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2302[var5] = (short)var1.method9407();
					this.field2303[var5] = (short)var1.method9407();
				}
			} else if (var2 == 41) {
				var4 = var1.method9405();
				this.field2296 = new short[var4];
				this.field2305 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2296[var5] = (short)var1.method9407();
					this.field2305[var5] = (short)var1.method9407();
				}
			}
		}

	}

	@ObfInfo(name = "az", desc = "(IS)Lkb;", opaque = "1208")
	public final Class262 method4227(int var1) {
		Class262 var3 = this.method4228();
		if (var3 == null) {
			return null;
		} else {
			Class262 var4;
			if (-1 != this.field2301 && var1 != -1) {
				var4 = Class237.method4637(this.field2301).method4001(var3, var1);
			} else {
				var4 = var3.method5170(true);
			}

			if (128 != this.field2306 || 128 != this.field2312) {
				var4.method5190(this.field2306, this.field2312, this.field2306);
			}

			if (this.field2308 != 0) {
				if (90 == this.field2308) {
					var4.method5243();
				}

				if (this.field2308 == 180) {
					var4.method5243();
					var4.method5243();
				}

				if (this.field2308 == 270) {
					var4.method5243();
					var4.method5243();
					var4.method5243();
				}
			}

			return var4;
		}
	}

	@ObfInfo(name = "af", desc = "(I)Lkb;", opaque = "310369198")
	public final Class262 method4228() {
		Class262 var2 = (Class262)field2298.method5993((long)this.field2311);
		if (var2 == null) {
			Class236 var3 = Class236.method4594(Client.field2313, this.field2300, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.field2302 != null) {
				for (var4 = 0; var4 < this.field2302.length; ++var4) {
					var3.method4573(this.field2302[var4], this.field2303[var4]);
				}
			}

			if (this.field2296 != null) {
				for (var4 = 0; var4 < this.field2296.length; ++var4) {
					var3.method4600(this.field2296[var4], this.field2305[var4]);
				}
			}

			var2 = var3.method4572(64 + this.field2309, this.field2304 + 850, -30, -50, -30);
			field2298.method5987(var2, (long)this.field2311);
		}

		return var2;
	}

	@ObfInfo(desc = "(I)LClass224;")
	public static Class224 method4163(int var0) {
		Class224 var2 = (Class224)field2297.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field1937.method7216(13, var0);
			var2 = new Class224();
			var2.field2311 = var0;
			if (var3 != null) {
				var2.method4224(new Class521(var3));
			}

			field2297.method5987(var2, (long)var0);
			return var2;
		}
	}
}
