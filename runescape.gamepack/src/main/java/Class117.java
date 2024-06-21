import io.runebox.ObfInfo;

@ObfInfo(name = "em")
public final class Class117 extends Class255 {
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field1460;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1911170797)
	public int field1458;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 419336507)
	public int field1459;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1547995727)
	public int field1461;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 238010175)
	public int field1463;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 359021447)
	public int field1464;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -2113245633)
	public int field1465;

	public Class117() {
		this.field1463 = 31;
	}

	@ObfInfo(name = "ak", desc = "(II)V")
	public void method2919(int var1) {
		this.field1463 = var1;
	}

	@ObfInfo(name = "al", desc = "(IB)Z", opaque = "2")
	public boolean method2921(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1463 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "ah", desc = "(I)Lkb;")
	public final Class262 method1092() {
		return Class232.method109(this.field1465).method4418(this.field1458);
	}
}
