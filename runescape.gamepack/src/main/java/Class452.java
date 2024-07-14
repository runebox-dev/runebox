import io.runebox.ObfInfo;

@ObfInfo(name = "rj")
public class Class452 extends Class457 {
	@ObfInfo(name = "aq", desc = "Lnm;")
	public Class351 field4867;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 900520389)
	public int field4865;

	public Class452(Class457 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4867 = null;
		this.field4865 = 0;
		super.field4890 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < Class323.field3467.size()) {
				this.field4867 = (Class351)Class323.field3467.get(var2);
			} else if (!var3 && var2 < Class323.field3464.size()) {
				this.field4867 = (Class351)Class323.field3464.get(var2);
			}

			this.field4865 = var4;
		}
	}

	@ObfInfo(name = "aq", desc = "(S)Z", opaque = "254")
	public boolean method7710() {
		if (this.field4867 != null && this.field4867.field3761 != null) {
			this.field4867.field3763 = true;

			try {
				if (this.field4867.field3752 > 0.0F && this.field4867.field3761.method6097()) {
					float var2 = this.field4865 == 0 ? (float)this.field4865 : (float)this.field4867.field3754 / (float)this.field4865;
					Class351 var10000 = this.field4867;
					var10000.field3752 -= var2 == 0.0F ? (float)this.field4867.field3754 : var2;
					if (this.field4867.field3752 < 0.0F) {
						this.field4867.field3752 = 0.0F;
					}

					this.field4867.field3761.method6090((int)this.field4867.field3752);
					return false;
				}
			} catch (Exception var3) {
				this.method8406(var3.getMessage());
				return true;
			}

			this.field4867.field3763 = false;
			return true;
		} else {
			return true;
		}
	}
}
