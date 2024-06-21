import io.runebox.ObfInfo;

public class Class283 extends Class305 {
	@ObfInfo(name = "az", desc = "Llh;")
	public Class294 field3109;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1038049103)
	public int field3106;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1836164871)
	public int field3108;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 91279571)
	public int field3111;
	@ObfInfo(name = "al", desc = "Lks;")
	public final Class279 field3110;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1428899307)
	public final int field3107;

	public Class283(Class348 var1, Class348 var2, int var3, Class279 var4) {
		super(var1, var2);
		this.field3107 = var3;
		this.field3110 = var4;
		this.method5738();
	}

	@ObfInfo(name = "ak", desc = "(S)V", opaque = "202")
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

	@ObfInfo(name = "al", desc = "(I)I")
	public int method5728() {
		return this.field3108;
	}

	@ObfInfo(name = "aj", desc = "(B)Llh;")
	public Class294 method5744() {
		return this.field3109;
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method5732() {
		return this.field3106;
	}

	@ObfInfo(name = "af", desc = "(I)I")
	public int method5731() {
		return this.field3111;
	}

	@ObfInfo(name = "al", desc = "(II)Luy;", opaque = "-339552668")
	public static Class545 method5727(int var0) {
		int var2 = Class539.field5312[var0];
		if (var2 == 1) {
			return Class545.field5333;
		} else if (var2 == 2) {
			return Class545.field5337;
		} else {
			return var2 == 3 ? Class545.field5336 : null;
		}
	}
}
