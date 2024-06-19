public class Class94 extends Class506 {
	public Class194 field1253;
	public Class409 field1254;

	public Class94(Class194 var1) {
		this.field1254 = new Class409();
		this.field1253 = var1;
	}

	public void method2474(int var1, int var2, int var3, int var4) {
		Class103 var6 = null;
		int var7 = 0;

		for (Class103 var8 = (Class103)this.field1254.method7600(); var8 != null; var8 = (Class103)this.field1254.method7637()) {
			++var7;
			if (var1 == var8.field1360) {
				var8.method2736(var1, var2, var3, var4);
				return;
			}

			if (var8.field1360 <= var1) {
				var6 = var8;
			}
		}

		if (var6 == null) {
			if (var7 < 4) {
				this.field1254.method7609(new Class103(var1, var2, var3, var4));
			}

		} else {
			Class409.method7599(new Class103(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field1254.method7600().method9277();
			}

		}
	}

	public Class103 method2475(int var1) {
		Class103 var3 = (Class103)this.field1254.method7600();
		if (var3 != null && var3.field1360 <= var1) {
			for (Class103 var4 = (Class103)this.field1254.method7637(); var4 != null && var4.field1360 <= var1; var4 = (Class103)this.field1254.method7637()) {
				var3.method9277();
				var3 = var4;
			}

			if (var3.field1362 + var3.field1360 + this.field1253.field1991 > var1) {
				return var3;
			} else {
				var3.method9277();
				return null;
			}
		} else {
			return null;
		}
	}

	public boolean method2473() {
		return this.field1254.method7625();
	}

	public static Class145 method2478(int var0) {
		Class145 var2 = (Class145)Class211.field2132.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = Class337.method6486(Client.field2123, Client.field2131, var0, false);
			if (var2 != null) {
				Class211.field2132.method5987(var2, (long)var0);
			}

			return var2;
		}
	}
}
