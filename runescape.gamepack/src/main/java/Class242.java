import io.runebox.ObfInfo;

@ObfInfo(name = "jh")
public class Class242 extends Class268 {
	@ObfInfo(name = "ak", desc = "Lkm;")
	public Class273 field2552;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -229828633)
	public int field2550;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -448614677)
	public int field2551;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1283382419)
	public int field2554;
	@ObfInfo(name = "ad", desc = "Ljc;")
	public final Class237 field2553;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1450931479)
	public final int field2549;

	public Class242(Class350 var1, Class350 var2, int var3, Class237 var4) {
		super(var1, var2);
		this.field2549 = var3;
		this.field2553 = var4;
		this.method4658();
	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "100842159")
	public void method4658() {
		this.field2551 = Class197.method61(this.field2549).method3905().field2153;
		this.field2552 = this.field2553.method4525(Class163.method3540(this.field2551));
		Class163 var2 = Class163.method3540(this.method4659());
		Class553 var3 = var2.method3388(false);
		if (var3 != null) {
			this.field2550 = var3.field5421;
			this.field2554 = var3.field5424;
		} else {
			this.field2550 = 0;
			this.field2554 = 0;
		}

	}

	@ObfInfo(name = "ad", desc = "(B)I")
	public int method4659() {
		return this.field2551;
	}

	@ObfInfo(name = "ag", desc = "(I)Lkm;")
	public Class273 method4660() {
		return this.field2552;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method4661() {
		return this.field2550;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method4674() {
		return this.field2554;
	}
}
