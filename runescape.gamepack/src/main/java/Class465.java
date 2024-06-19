public class Class465 extends Class479 {
	public final Class544 field4898;

	public Class465(Class544 var1) {
		super(400);
		this.field4898 = var1;
	}

	public Class475 method8483() {
		return new Class478();
	}

	public Class475[] method8457(int var1) {
		return new Class478[var1];
	}

	public void method8556(Class521 var1, int var2) {
		while (var1.field5219 < var2) {
			int var4 = var1.method9405();
			if (var4 == 4) {
				Class567 var10 = new Class567(var1.method9415(), this.field4898);
				if (!var10.method10262()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				Client.field274.method1884(var10.method10260(), var11);
			} else {
				boolean var5 = (var4 & 1) != 0;
				Class567 var6 = new Class567(var1.method9415(), this.field4898);
				Class567 var7 = new Class567(var1.method9415(), this.field4898);
				var1.method9415();
				if (!var6.method10262()) {
					throw new IllegalStateException();
				}

				Class478 var8 = (Class478)this.method8735(var6);
				if (var5) {
					Class478 var9 = (Class478)this.method8735(var7);
					if (var9 != null && var9 != var8) {
						if (var8 != null) {
							this.method8801(var9);
						} else {
							var8 = var9;
						}
					}
				}

				if (var8 != null) {
					this.method8743(var8, var6, var7);
				} else if (this.method8761() < 400) {
					int var12 = this.method8761();
					var8 = (Class478)this.method8762(var6, var7);
					var8.field4948 = var12;
				}
			}
		}

	}
}
