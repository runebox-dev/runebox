public final class Class518 {
	public Class506 field5202;
	public Class506 field5205;
	public Class506[] field5203;
	public int field5204;
	public int field5206;

	public Class518(int var1) {
		this.field5206 = 0;
		this.field5204 = var1;
		this.field5203 = new Class506[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			Class506 var3 = this.field5203[var2] = new Class506();
			var3.field5169 = var3;
			var3.field5171 = var3;
		}

	}

	public Class506 method9361(long var1) {
		Class506 var3 = this.field5203[(int)(var1 & (long)(this.field5204 - 1))];

		for (this.field5202 = var3.field5169; this.field5202 != var3; this.field5202 = this.field5202.field5169) {
			if (this.field5202.field5170 == var1) {
				Class506 var4 = this.field5202;
				this.field5202 = this.field5202.field5169;
				return var4;
			}
		}

		this.field5202 = null;
		return null;
	}

	public int method9362() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.field5204; ++var2) {
			Class506 var3 = this.field5203[var2];

			for (Class506 var4 = var3.field5169; var4 != var3; var4 = var4.field5169) {
				++var1;
			}
		}

		return var1;
	}

	public void method9360(Class506 var1, long var2) {
		if (var1.field5171 != null) {
			var1.method9277();
		}

		Class506 var4 = this.field5203[(int)(var2 & (long)(this.field5204 - 1))];
		var1.field5171 = var4.field5171;
		var1.field5169 = var4;
		var1.field5171.field5169 = var1;
		var1.field5169.field5171 = var1;
		var1.field5170 = var2;
	}

	public Class506 method9363() {
		this.field5206 = 0;
		return this.method9364();
	}

	public Class506 method9364() {
		Class506 var1;
		if (this.field5206 > 0 && this.field5205 != this.field5203[this.field5206 - 1]) {
			var1 = this.field5205;
			this.field5205 = var1.field5169;
			return var1;
		} else {
			do {
				if (this.field5206 >= this.field5204) {
					return null;
				}

				var1 = this.field5203[this.field5206++].field5169;
			} while(var1 == this.field5203[this.field5206 - 1]);

			this.field5205 = var1.field5169;
			return var1;
		}
	}
}
