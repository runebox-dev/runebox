public final class Class299 {
	public Class392 field3195;
	public Class507 field3198;
	public Class515 field3197;
	public int field3196;
	public int field3199;

	public Class299(int var1) {
		this.field3198 = new Class507();
		this.field3195 = new Class392();
		this.field3196 = var1;
		this.field3199 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.field3197 = new Class515(var2);
	}

	public Class507 method5993(long var1) {
		Class507 var3 = (Class507)this.field3197.method9326(var1);
		if (var3 != null) {
			this.field3195.method7389(var3);
		}

		return var3;
	}

	public void method5979(long var1) {
		Class507 var3 = (Class507)this.field3197.method9326(var1);
		if (var3 != null) {
			var3.method9277();
			var3.method9280();
			++this.field3199;
		}

	}

	public void method5987(Class507 var1, long var2) {
		if (this.field3199 == 0) {
			Class507 var4 = this.field3195.method7401();
			var4.method9277();
			var4.method9280();
			if (this.field3198 == var4) {
				var4 = this.field3195.method7401();
				var4.method9277();
				var4.method9280();
			}
		} else {
			--this.field3199;
		}

		this.field3197.method9333(var1, var2);
		this.field3195.method7389(var1);
	}

	public void method5995() {
		this.field3195.method7388();
		this.field3197.method9328();
		this.field3198 = new Class507();
		this.field3199 = this.field3196;
	}
}
