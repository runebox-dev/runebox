import io.runebox.ObfInfo;

@ObfInfo(name = "jr")
public class Class252 extends Class268 {
	@ObfInfo(name = "ad", desc = "Lkm;")
	public final Class273 field2645;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1276537903)
	public final int field2647;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -903074913)
	public final int field2648;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -946439351)
	public final int field2650;

	public Class252(Class350 var1, Class350 var2, int var3, Class273 var4) {
		super(var1, var2);
		this.field2650 = var3;
		this.field2645 = var4;
		Class163 var5 = Class163.method3540(this.method4659());
		Class553 var6 = var5.method3388(false);
		if (var6 != null) {
			this.field2647 = var6.field5421;
			this.field2648 = var6.field5424;
		} else {
			this.field2647 = 0;
			this.field2648 = 0;
		}

	}

	@ObfInfo(name = "ad", desc = "(B)I")
	public int method4659() {
		return this.field2650;
	}

	@ObfInfo(name = "ag", desc = "(I)Lkm;")
	public Class273 method4660() {
		return this.field2645;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method4661() {
		return this.field2647;
	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method4674() {
		return this.field2648;
	}
}
