import io.runebox.ObfInfo;

@ObfInfo(name = "es")
public class Class123 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 712505425)
	public int field1463;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 480813799)
	public int field1464;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1154260291)
	public int field1465;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1216371257)
	public int field1469;

	public Class123(int var1, int var2, int var3, int var4) {
		this.field1464 = var1;
		this.field1463 = var2;
		this.field1469 = var3;
		this.field1465 = var4;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method2993() {
		return this.field1464;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method2998() {
		return this.field1463;
	}

	@ObfInfo(name = "ag", desc = "(S)I")
	public int method3000() {
		return this.field1469;
	}

	@ObfInfo(name = "ak", desc = "(B)I")
	public int method2997() {
		return this.field1465;
	}
}
