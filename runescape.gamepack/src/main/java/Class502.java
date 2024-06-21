import io.runebox.ObfInfo;

public class Class502 {
	@ObfInfo(owner = "lv", name = "ab", desc = "Z")
	public static boolean field3252;
	@ObfInfo(name = "aa", desc = "Lor;")
	public Class382 field5143;
	@ObfInfo(name = "ab", desc = "Z")
	public boolean field5144;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 795081315)
	public int field5142;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public String field5140;

	public Class502(Class382 var1) {
		this.field5142 = 0;
		this.field5144 = false;
		this.field5143 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;I)V", opaque = "-1841669823")
	public void method9236(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (this.field5140 != var1) {
				this.field5140 = var1;
				this.field5142 = 0;
				this.field5144 = false;
				this.method9237();
			}
		}
	}

	@ObfInfo(name = "al", desc = "(I)I", opaque = "-379504320")
	public int method9237() {
		if (this.field5140 == null) {
			this.field5142 = 100;
			this.field5144 = true;
		} else {
			if (this.field5142 < 33) {
				if (!this.field5143.method7253(Class308.field3246.field3251, this.field5140)) {
					return this.field5142;
				}

				this.field5142 = 33;
			}

			if (33 == this.field5142) {
				if (this.field5143.method7235(Class308.field3247.field3251, this.field5140) && !this.field5143.method7253(Class308.field3247.field3251, this.field5140)) {
					return this.field5142;
				}

				this.field5142 = 66;
			}

			if (this.field5142 == 66) {
				if (!this.field5143.method7253(this.field5140, Class308.field3245.field3251)) {
					return this.field5142;
				}

				this.field5142 = 100;
				this.field5144 = true;
			}
		}

		return this.field5142;
	}

	@ObfInfo(name = "aj", desc = "(I)Z")
	public boolean method9239() {
		return this.field5144;
	}

	@ObfInfo(name = "az", desc = "(B)I")
	public int method9240() {
		return this.field5142;
	}

	@ObfInfo(name = "aw", desc = "(Lcl;I)V", opaque = "1763588078")
	public static void method9252(Class64 var0) {
		if (var0.method1175() != Client.field528) {
			Client.field528 = var0.method1175();
			boolean var2 = var0.method1175();
			if (field3252 != var2) {
				Class232.field2454.method5995();
				Class232.field2445.method5995();
				Class232.field2440.method5995();
				field3252 = var2;
			}
		}

		if (Client.field675 != var0.field480) {
			Class106.method2771(Client.field1793, var0.field480);
		}

		Client.field119 = var0.field476;
		Client.field557 = var0.field473;
		Client.field675 = var0.field480;
		Client.field4509 = var0.field467;
		Client.field429 = 0 == Client.field532 ? 43594 : 40000 + var0.field473;
		Client.field3167 = 0 == Client.field532 ? 443 : 50000 + var0.field473;
		Client.field3071 = Client.field429;
	}
}
