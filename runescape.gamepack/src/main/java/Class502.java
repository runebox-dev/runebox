public class Class502 {
	public Class382 field5143;
	public boolean field5144;
	public int field5142;
	public String field5140;

	public Class502(Class382 var1) {
		this.field5142 = 0;
		this.field5144 = false;
		this.field5143 = var1;
	}

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

	public boolean method9239() {
		return this.field5144;
	}

	public int method9240() {
		return this.field5142;
	}
}
