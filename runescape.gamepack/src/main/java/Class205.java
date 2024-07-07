import io.runebox.ObfInfo;

@ObfInfo(name = "hw")
public class Class205 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field2232;
	@ObfInfo(name = "ag", desc = "C")
	public char field2228;
	@ObfInfo(name = "ak", desc = "C")
	public char field2229;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1142953375)
	public int field2231;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1660847733)
	public int field2233;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field2226;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field2227;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field2230;
	@ObfInfo(name = "ai", desc = "[Ljava/lang/String;")
	public String[] field2235;

	static {
		field2232 = new Class327(64);
	}

	public Class205() {
		this.field2230 = Class367.field4306;
		this.field2233 = 0;
	}

	@ObfInfo(name = "ad", desc = "(Lvp;I)V", opaque = "-369750776")
	public void method4007(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method4008(var1, var3);
		}
	}

	@ObfInfo(name = "ag", desc = "(Lvp;II)V", opaque = "646484743")
	public void method4008(Class562 var1, int var2) {
		if (var2 == 1) {
			this.field2228 = (char)var1.method9902();
		} else if (var2 == 2) {
			this.field2229 = (char)var1.method9902();
		} else if (var2 == 3) {
			this.field2230 = var1.method9837();
		} else if (var2 == 4) {
			this.field2231 = var1.method9832();
		} else {
			int var4;
			if (var2 == 5) {
				this.field2233 = var1.method9997();
				this.field2227 = new int[this.field2233];
				this.field2235 = new String[this.field2233];

				for (var4 = 0; var4 < this.field2233; ++var4) {
					this.field2227[var4] = var1.method9832();
					this.field2235[var4] = var1.method9837();
				}
			} else if (var2 == 6) {
				this.field2233 = var1.method9997();
				this.field2227 = new int[this.field2233];
				this.field2226 = new int[this.field2233];

				for (var4 = 0; var4 < this.field2233; ++var4) {
					this.field2227[var4] = var1.method9832();
					this.field2226[var4] = var1.method9832();
				}
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method4009() {
		return this.field2233;
	}

	@ObfInfo(owner = "qa", name = "aq", desc = "(II)Lhw;", opaque = "6677594")
	public static Class205 method7698(int var0) {
		Class205 var2 = (Class205)field2232.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2234.method7132(8, var0);
			var2 = new Class205();
			if (var3 != null) {
				var2.method4007(new Class562(var3));
			}

			field2232.method6330(var2, (long)var0);
			return var2;
		}
	}
}
