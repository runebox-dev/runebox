import io.runebox.ObfInfo;

@ObfInfo(name = "hf")
public class Class188 extends Class516 {
	@ObfInfo(name = "ag", desc = "Lmo;")
	public static Class327 field2066;
	@ObfInfo(name = "ak", desc = "Lmo;")
	public static Class327 field2067;
	@ObfInfo(name = "ad", desc = "Lok;")
	public static Class375 field2065;
	@ObfInfo(name = "aq", desc = "Lok;")
	public static Class375 field2076;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1858899611)
	public int field2064;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 614834317)
	public int field2068;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1284875027)
	public int field2069;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 352886693)
	public int field2070;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1294875951)
	public int field2075;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1664339371)
	public int field2077;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 136469009)
	public int field2078;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1006190975)
	public int field2079;
	@ObfInfo(name = "av", desc = "[S")
	public short[] field2071;
	@ObfInfo(name = "ab", desc = "[S")
	public short[] field2072;
	@ObfInfo(name = "ai", desc = "[S")
	public short[] field2073;
	@ObfInfo(name = "ae", desc = "[S")
	public short[] field2074;

	static {
		field2066 = new Class327(64);
		field2067 = new Class327(30);
	}

	public Class188() {
		this.field2077 = -1;
		this.field2075 = 128;
		this.field2064 = 128;
		this.field2070 = 0;
		this.field2078 = 0;
		this.field2079 = 0;
	}

	@ObfInfo(name = "ag", desc = "(Lvp;B)V", opaque = "0")
	public void method3824(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3812(var1, var3);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;II)V", opaque = "-1977585494")
	public void method3812(Class562 var1, int var2) {
		if (var2 == 1) {
			this.field2069 = var1.method9997();
		} else if (var2 == 2) {
			this.field2077 = var1.method9997();
		} else if (var2 == 4) {
			this.field2075 = var1.method9997();
		} else if (var2 == 5) {
			this.field2064 = var1.method9997();
		} else if (var2 == 6) {
			this.field2070 = var1.method9997();
		} else if (var2 == 7) {
			this.field2078 = var1.method9902();
		} else if (var2 == 8) {
			this.field2079 = var1.method9902();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method9902();
				this.field2071 = new short[var4];
				this.field2072 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2071[var5] = (short)var1.method9997();
					this.field2072[var5] = (short)var1.method9997();
				}
			} else if (var2 == 41) {
				var4 = var1.method9902();
				this.field2073 = new short[var4];
				this.field2074 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2073[var5] = (short)var1.method9997();
					this.field2074[var5] = (short)var1.method9997();
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(II)Llv;", opaque = "-1645317392")
	public final Class308 method3815(int var1) {
		Class308 var3 = this.method3816();
		if (var3 == null) {
			return null;
		} else {
			Class308 var4;
			if (this.field2077 != -1 && var1 != -1) {
				var4 = Class344.method6474(this.field2077).method4170(var3, var1);
			} else {
				var4 = var3.method5916(true);
			}

			if (this.field2075 != 128 || this.field2064 != 128) {
				var4.method5882(this.field2075, this.field2064, this.field2075);
			}

			if (this.field2070 != 0) {
				if (this.field2070 == 90) {
					var4.method5877();
				}

				if (this.field2070 == 180) {
					var4.method5877();
					var4.method5877();
				}

				if (this.field2070 == 270) {
					var4.method5877();
					var4.method5877();
					var4.method5877();
				}
			}

			return var4;
		}
	}

	@ObfInfo(name = "an", desc = "(B)Llv;", opaque = "0")
	public final Class308 method3816() {
		Class308 var2 = (Class308)field2067.method6327((long)this.field2068);
		if (var2 == null) {
			Class278 var3 = Class278.method5522(field2065, this.field2069, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.field2071 != null) {
				for (var4 = 0; var4 < this.field2071.length; ++var4) {
					var3.method5567(this.field2071[var4], this.field2072[var4]);
				}
			}

			if (this.field2073 != null) {
				for (var4 = 0; var4 < this.field2073.length; ++var4) {
					var3.method5576(this.field2073[var4], this.field2074[var4]);
				}
			}

			var2 = var3.method5517(this.field2078 + 64, this.field2079 + 850, -30, -50, -30);
			field2067.method6330(var2, (long)this.field2068);
		}

		return var2;
	}

	@ObfInfo(owner = "pe", name = "aq", desc = "(Lok;Lok;I)V")
	public static void method7377(Class375 var0, Class375 var1) {
		field2076 = var0;
		field2065 = var1;
	}

	@ObfInfo(owner = "gw", name = "ad", desc = "(II)Lhf;", opaque = "614695336")
	public static Class188 method3600(int var0) {
		Class188 var2 = (Class188)field2066.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2076.method7132(13, var0);
			var2 = new Class188();
			var2.field2068 = var0;
			if (var3 != null) {
				var2.method3824(new Class562(var3));
			}

			field2066.method6330(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(owner = "jq", name = "aj", desc = "(I)V")
	public static void method4891() {
		field2066.method6332();
		field2067.method6332();
	}
}
