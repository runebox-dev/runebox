import io.runebox.ObfInfo;

@ObfInfo(name = "qn")
public class Class430 extends Class447 {
	@ObfInfo(name = "ak", desc = "Lns;")
	public Class357 field4704;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 122087209)
	public int field4706;

	public Class430(Class447 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4704 = null;
		this.field4706 = 0;
		super.field4807 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < Class332.field3453.size()) {
				this.field4704 = (Class357)Class332.field3453.get(var2);
			} else if (!var3 && var2 < Class332.field3455.size()) {
				this.field4704 = (Class357)Class332.field3455.get(var2);
			}

			this.field4706 = var4;
		}
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		if (this.field4704 != null && this.field4704.field3940 != null) {
			this.field4704.field3943 = true;

			try {
				if (this.field4704.field3935 > 0.0F && this.field4704.field3940.method6320()) {
					float var2 = 0 == this.field4706 ? (float)this.field4706 : (float)this.field4704.field3931 / (float)this.field4706;
					Class357 var10000 = this.field4704;
					var10000.field3935 -= 0.0F == var2 ? (float)this.field4704.field3931 : var2;
					if (this.field4704.field3935 < 0.0F) {
						this.field4704.field3935 = 0.0F;
					}

					this.field4704.field3940.method6400((int)this.field4704.field3935);
					return false;
				}
			} catch (Exception var3) {
				this.method8379(var3.getMessage());
				return true;
			}

			this.field4704.field3943 = false;
			return true;
		} else {
			return true;
		}
	}
}
