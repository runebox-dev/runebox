public class Class283 extends Class305 {
	public Class294 field3109;
	public int field3106;
	public int field3108;
	public int field3111;
	public final Class279 field3110;
	public final int field3107;

	public Class283(Class348 var1, Class348 var2, int var3, Class279 var4) {
		super(var1, var2);
		this.field3107 = var3;
		this.field3110 = var4;
		this.method5738();
	}

	public void method5738() {
		this.field3108 = Class222.method4161(this.field3107).method4181().field2272;
		this.field3109 = this.field3110.method5602(Class200.method3917(this.field3108));
		Class200 var2 = Class200.method3917(this.method5728());
		Class549 var3 = var2.method3893(false);
		if (var3 != null) {
			this.field3106 = var3.field5353;
			this.field3111 = var3.field5354;
		} else {
			this.field3106 = 0;
			this.field3111 = 0;
		}

	}

	public int method5728() {
		return this.field3108;
	}

	public Class294 method5744() {
		return this.field3109;
	}

	public int method5732() {
		return this.field3106;
	}

	public int method5731() {
		return this.field3111;
	}
}