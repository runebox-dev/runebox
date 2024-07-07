import io.runebox.ObfInfo;

@ObfInfo(name = "lx")
public final class Class310 {
	@ObfInfo(name = "ap", desc = "Llg;")
	public Class293 field3254;
	@ObfInfo(name = "ak", desc = "Lpt;")
	public Class410 field3255;
	@ObfInfo(name = "ag", desc = "Lth;")
	public Class502 field3252;
	@ObfInfo(name = "ad", desc = "I")
	public int field3253;
	@ObfInfo(name = "aq", desc = "I")
	public int field3256;

	public Class310(int var1) {
		this(var1, var1);
	}

	public Class310(int var1, int var2) {
		this.field3255 = new Class410();
		this.field3256 = var1;
		this.field3253 = var1;

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}

		this.field3252 = new Class502(var3);
	}

	@ObfInfo(name = "aq", desc = "(J)Ljava/lang/Object;")
	public Object method5997(long var1) {
		Class338 var3 = (Class338)this.field3252.method8901(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method5698();
			if (var4 == null) {
				var3.method9267();
				var3.method9044();
				this.field3253 += var3.field3668;
				return null;
			} else {
				if (var3.method5700()) {
					Class330 var5 = new Class330(var4, var3.field3668);
					this.field3252.method8902(var5, var3.field5234);
					this.field3255.method7558(var5);
					var5.field5157 = 0L;
					var3.method9267();
					var3.method9044();
				} else {
					this.field3255.method7558(var3);
					var3.field5157 = 0L;
				}

				return var4;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(J)V")
	public void method5999(long var1) {
		Class338 var3 = (Class338)this.field3252.method8901(var1);
		this.method5994(var3);
	}

	@ObfInfo(name = "ag", desc = "(Lmz;)V")
	public void method5994(Class338 var1) {
		if (var1 != null) {
			var1.method9267();
			var1.method9044();
			this.field3253 += var1.field3668;
		}

	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/Object;J)V")
	public void method5995(Object var1, long var2) {
		this.method6008(var1, var2, 1);
	}

	@ObfInfo(name = "ap", desc = "(Ljava/lang/Object;JI)V")
	public void method6008(Object var1, long var2, int var4) {
		if (var4 > this.field3256) {
			throw new IllegalStateException();
		} else {
			this.method5999(var2);
			this.field3253 -= var4;

			while (this.field3253 < 0) {
				Class338 var5 = (Class338)this.field3255.method7570();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.method5700()) {
				}

				this.method5994(var5);
				if (this.field3254 != null) {
					this.field3254.method5737(var5.method5698());
				}
			}

			Class330 var6 = new Class330(var1, var4);
			this.field3252.method8902(var6, var2);
			this.field3255.method7558(var6);
			var6.field5157 = 0L;
		}
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public void method5991(int var1) {
		for (Class338 var2 = (Class338)this.field3255.method7560(); var2 != null; var2 = (Class338)this.field3255.method7557()) {
			if (var2.method5700()) {
				if (var2.method5698() == null) {
					var2.method9267();
					var2.method9044();
					this.field3253 += var2.field3668;
				}
			} else if (++var2.field5157 > (long)var1) {
				Class289 var3 = new Class289(var2.method5698(), var2.field3668);
				this.field3252.method8902(var3, var2.field5234);
				Class410.method7559(var3, var2);
				var2.method9267();
				var2.method9044();
			}
		}

	}

	@ObfInfo(name = "aj", desc = "()V")
	public void method5992() {
		this.field3255.method7562();
		this.field3252.method8903();
		this.field3253 = this.field3256;
	}
}
