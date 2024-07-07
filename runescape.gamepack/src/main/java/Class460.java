import io.runebox.ObfInfo;

@ObfInfo(name = "rr")
public class Class460 extends Class447 {
	@ObfInfo(name = "ak", desc = "Lns;")
	public Class357 field4871;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -482428221)
	public int field4872;

	public Class460(Class447 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4871 = null;
		this.field4872 = 0;
		super.field4807 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < Class332.field3453.size()) {
				this.field4871 = (Class357)Class332.field3453.get(var2);
			} else if (!var3 && var2 < Class332.field3455.size()) {
				this.field4871 = (Class357)Class332.field3455.get(var2);
			}

			this.field4872 = var4;
		}
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		if (this.field4871 != null && this.field4871.field3940 != null) {
			this.field4871.field3943 = true;

			try {
				if (this.field4871.field3935 < (float)this.field4871.field3931 && this.field4871.field3940.method6320()) {
					float var2 = this.field4872 == 0 ? (float)this.field4872 : (float)this.field4871.field3931 / (float)this.field4872;
					Class357 var10000 = this.field4871;
					var10000.field3935 += 0.0F == var2 ? (float)this.field4871.field3931 : var2;
					if (this.field4871.field3935 > (float)this.field4871.field3931) {
						this.field4871.field3935 = (float)this.field4871.field3931;
					}

					this.field4871.field3940.method6400((int)this.field4871.field3935);
					return false;
				}
			} catch (Exception var3) {
				this.method8379(var3.getMessage());
				return true;
			}

			this.field4871.field3943 = false;
			return true;
		} else {
			return true;
		}
	}
}
