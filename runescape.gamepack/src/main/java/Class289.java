public class Class289 extends Class305 {
	public final Class294 field3150;
	public final int field3149;
	public final int field3151;
	public final int field3155;

	public Class289(Class348 var1, Class348 var2, int var3, Class294 var4) {
		super(var1, var2);
		this.field3155 = var3;
		this.field3150 = var4;
		Class200 var5 = Class200.method3917(this.method5728());
		Class549 var6 = var5.method3893(false);
		if (var6 != null) {
			this.field3151 = var6.field5353;
			this.field3149 = var6.field5354;
		} else {
			this.field3151 = 0;
			this.field3149 = 0;
		}

	}

	public int method5728() {
		return this.field3155;
	}

	public Class294 method5744() {
		return this.field3150;
	}

	public int method5732() {
		return this.field3151;
	}

	public int method5731() {
		return this.field3149;
	}
}
