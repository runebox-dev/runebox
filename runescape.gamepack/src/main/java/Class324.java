public class Class324 extends Class27 {
	public Class335 field3414;
	public Class37 field3412;
	public Class401 field3413;

	public Class324(Class335 var1) {
		this.field3413 = new Class401();
		this.field3412 = new Class37();
		this.field3414 = var1;
	}

	public Class27 method384() {
		Class343 var1 = (Class343)this.field3413.method7482();
		if (var1 == null) {
			return null;
		} else {
			return (Class27)(var1.field3845 != null ? var1.field3845 : this.method379());
		}
	}

	public Class27 method379() {
		Class343 var1;
		do {
			var1 = (Class343)this.field3413.method7490();
			if (var1 == null) {
				return null;
			}
		} while(var1.field3845 == null);

		return var1.field3845;
	}

	public int method380() {
		return 0;
	}

	public void method381(int[] var1, int var2, int var3) {
		this.field3412.method381(var1, var2, var3);

		for (Class343 var6 = (Class343)this.field3413.method7482(); var6 != null; var6 = (Class343)this.field3413.method7490()) {
			if (!this.field3414.method6347(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3836) {
						this.method6232(var6, var1, var4, var5, var5 + var4);
						var6.field3836 -= var5;
						break;
					}

					this.method6232(var6, var1, var4, var6.field3836, var5 + var4);
					var4 += var6.field3836;
					var5 -= var6.field3836;
				} while(!this.field3414.method6388(var6, var1, var4, var5));
			}
		}

	}

	public void method395(int var1) {
		this.field3412.method395(var1);

		for (Class343 var3 = (Class343)this.field3413.method7482(); var3 != null; var3 = (Class343)this.field3413.method7490()) {
			if (!this.field3414.method6347(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3836) {
						this.method6235(var3, var2);
						var3.field3836 -= var2;
						break;
					}

					this.method6235(var3, var3.field3836);
					var2 -= var3.field3836;
				} while(!this.field3414.method6388(var3, (int[])null, 0, var2));
			}
		}

	}

	public void method6232(Class343 var1, int[] var2, int var3, int var4, int var5) {
		if ((this.field3414.field3490[var1.field3840] & 4) != 0 && var1.field3850 < 0) {
			int var7 = this.field3414.field3476[var1.field3840] / Client.field1382;

			while (true) {
				int var8 = (var7 + 1048575 - var1.field3856) / var7;
				if (var8 > var4) {
					var1.field3856 += var7 * var4;
					break;
				}

				var1.field3845.method381(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field3856 += var8 * var7 - 1048576;
				int var9 = Client.field1382 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				Class52 var11 = var1.field3845;
				if (0 == this.field3414.field3493[var1.field3840]) {
					var1.field3845 = Class52.method919(var1.field3847, var11.method934(), var11.method995(), var11.method916());
				} else {
					var1.field3845 = Class52.method919(var1.field3847, var11.method934(), 0, var11.method916());
					this.field3414.method6356(var1, var1.field3837.field3467[var1.field3842] < 0);
					var1.field3845.method930(var9, var11.method995());
				}

				if (var1.field3837.field3467[var1.field3842] < 0) {
					var1.field3845.method921(-1);
				}

				var11.method932(var9);
				var11.method381(var2, var3, var5 - var3);
				if (var11.method936()) {
					this.field3412.method743(var11);
				}
			}
		}

		var1.field3845.method381(var2, var3, var4);
	}

	public void method6235(Class343 var1, int var2) {
		if ((this.field3414.field3490[var1.field3840] & 4) != 0 && var1.field3850 < 0) {
			int var4 = this.field3414.field3476[var1.field3840] / Client.field1382;
			int var5 = (var4 + 1048575 - var1.field3856) / var4;
			var1.field3856 = var4 * var2 + var1.field3856 & 1048575;
			if (var5 <= var2) {
				if (this.field3414.field3493[var1.field3840] == 0) {
					var1.field3845 = Class52.method919(var1.field3847, var1.field3845.method934(), var1.field3845.method995(), var1.field3845.method916());
				} else {
					var1.field3845 = Class52.method919(var1.field3847, var1.field3845.method934(), 0, var1.field3845.method916());
					this.field3414.method6356(var1, var1.field3837.field3467[var1.field3842] < 0);
				}

				if (var1.field3837.field3467[var1.field3842] < 0) {
					var1.field3845.method921(-1);
				}

				var2 = var1.field3856 / var4;
			}
		}

		var1.field3845.method395(var2);
	}
}
