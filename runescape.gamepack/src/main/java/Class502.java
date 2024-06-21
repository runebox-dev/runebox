import io.runebox.ObfInfo;

@ObfInfo(name = "th")
public class Class502 {
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
}
