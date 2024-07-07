import io.runebox.ObfInfo;

@ObfInfo(name = "eo")
public final class Class119 extends Class280 {
	@ObfInfo(name = "an", desc = "Z")
	public boolean field1444;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -2050678185)
	public int field1439;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 587627049)
	public int field1440;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1382347441)
	public int field1441;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -104143091)
	public int field1442;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 203441303)
	public int field1443;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1829546599)
	public int field1446;

	public Class119() {
		this.field1446 = 31;
	}

	@ObfInfo(name = "aq", desc = "(II)V")
	public void method2960(int var1) {
		this.field1446 = var1;
	}

	@ObfInfo(name = "ad", desc = "(IB)Z", opaque = "49")
	public boolean method2965(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1446 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "ah", desc = "(I)Llv;")
	public final Class308 method1140() {
		return Class187.method3421(this.field1439).method3777(this.field1443);
	}
}
