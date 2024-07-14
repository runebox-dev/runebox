import io.runebox.ObfInfo;

@ObfInfo(name = "tp")
public class Class510 {
	@ObfInfo(name = "an", desc = "Lok;")
	public Class375 field5103;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field5099;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -854808799)
	public int field5104;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field5105;

	public Class510(Class375 var1) {
		this.field5104 = 0;
		this.field5099 = false;
		this.field5103 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/String;I)V", opaque = "-222891376")
	public void method8990(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (this.field5105 != var1) {
				this.field5105 = var1;
				this.field5104 = 0;
				this.field5099 = false;
				this.method8985();
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(B)I", opaque = "0")
	public int method8985() {
		if (this.field5105 == null) {
			this.field5104 = 100;
			this.field5099 = true;
		} else {
			if (this.field5104 < 33) {
				if (!this.field5103.method7171(Class266.field2734.field2733, this.field5105)) {
					return this.field5104;
				}

				this.field5104 = 33;
			}

			if (this.field5104 == 33) {
				if (this.field5103.method7137(Class266.field2735.field2733, this.field5105) && !this.field5103.method7171(Class266.field2735.field2733, this.field5105)) {
					return this.field5104;
				}

				this.field5104 = 66;
			}

			if (this.field5104 == 66) {
				if (!this.field5103.method7171(this.field5105, Class266.field2737.field2733)) {
					return this.field5104;
				}

				this.field5104 = 100;
				this.field5099 = true;
			}
		}

		return this.field5104;
	}

	@ObfInfo(name = "ag", desc = "(I)Z")
	public boolean method8994() {
		return this.field5099;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method8999() {
		return this.field5104;
	}

	@ObfInfo(name = "ap", desc = "(Lok;Ljava/lang/String;Ljava/lang/String;I)[Lvv;", opaque = "-639405455")
	public static Class568[] method9001(Class375 var0, String var1, String var2) {
		if (!var0.method7137(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method7150(var1);
			int var5 = var0.method7209(var4, var2);
			Class568[] var6;
			if (!Class554.method3253(var0, var4, var5)) {
				var6 = null;
			} else {
				Class568[] var8 = new Class568[Client.field5437];

				for (int var9 = 0; var9 < Client.field5437; ++var9) {
					Class568 var10 = var8[var9] = new Class568();
					var10.field5499 = Client.field5433;
					var10.field5498 = Client.field5438;
					var10.field5494 = Client.field1454[var9];
					var10.field5493 = Client.field1561[var9];
					var10.field5495 = Client.field5435[var9];
					var10.field5496 = Client.field3491[var9];
					var10.field5500 = Client.field5432;
					var10.field5497 = Client.field5434[var9];
				}

				Class554.method6571();
				var6 = var8;
			}

			return var6;
		}
	}
}
