public final class Class290 {
	public Class302 field3160;
	public Class392 field3156;
	public Class515 field3158;
	public int field3157;
	public int field3159;

	public Class290(int var1) {
		this(var1, var1);
	}

	public Class290(int var1, int var2) {
		this.field3156 = new Class392();
		this.field3159 = var1;
		this.field3157 = var1;

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}

		this.field3158 = new Class515(var3);
	}

	public Object method5885(long var1) {
		Class320 var3 = (Class320)this.field3158.method9326(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method5946();
			if (var4 == null) {
				var3.method9277();
				var3.method9280();
				this.field3157 += var3.field3394;
				return null;
			} else {
				if (var3.method5947()) {
					Class314 var5 = new Class314(var4, var3.field3394);
					this.field3158.method9333(var5, var3.field5170);
					this.field3156.method7389(var5);
					var5.field5173 = 0L;
					var3.method9277();
					var3.method9280();
				} else {
					this.field3156.method7389(var3);
					var3.field5173 = 0L;
				}

				return var4;
			}
		}
	}

	public void method5887(long var1) {
		Class320 var3 = (Class320)this.field3158.method9326(var1);
		this.method5896(var3);
	}

	public void method5896(Class320 var1) {
		if (var1 != null) {
			var1.method9277();
			var1.method9280();
			this.field3157 += var1.field3394;
		}

	}

	public void method5888(Object var1, long var2) {
		this.method5891(var1, var2, 1);
	}

	public void method5891(Object var1, long var2, int var4) {
		if (var4 > this.field3159) {
			throw new IllegalStateException();
		} else {
			this.method5887(var2);
			this.field3157 -= var4;

			while (this.field3157 < 0) {
				Class320 var5 = (Class320)this.field3156.method7401();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.method5947()) {
				}

				this.method5896(var5);
				if (this.field3160 != null) {
					this.field3160.method6034(var5.method5946());
				}
			}

			Class314 var6 = new Class314(var1, var4);
			this.field3158.method9333(var6, var2);
			this.field3156.method7389(var6);
			var6.field5173 = 0L;
		}
	}

	public void method5890(int var1) {
		for (Class320 var2 = (Class320)this.field3156.method7392(); var2 != null; var2 = (Class320)this.field3156.method7394()) {
			if (var2.method5947()) {
				if (var2.method5946() == null) {
					var2.method9277();
					var2.method9280();
					this.field3157 += var2.field3394;
				}
			} else if (++var2.field5173 > (long)var1) {
				Class296 var3 = new Class296(var2.method5946(), var2.field3394);
				this.field3158.method9333(var3, var2.field5170);
				Class392.method7390(var3, var2);
				var2.method9277();
				var2.method9280();
			}
		}

	}

	public void method5894() {
		this.field3156.method7388();
		this.field3158.method9328();
		this.field3157 = this.field3159;
	}
}
