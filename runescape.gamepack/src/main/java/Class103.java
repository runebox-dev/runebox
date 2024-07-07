import io.runebox.ObfInfo;

@ObfInfo(name = "dy")
public final class Class103 extends Class520 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1583811915)
	public int field1316;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1480623259)
	public int field1317;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1826390675)
	public int field1318;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 2086259071)
	public int field1319;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1138524769)
	public int field1320;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 868871769)
	public int field1321;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1220919723)
	public int field1322;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 336431343)
	public int field1323;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -617367559)
	public int field1324;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 555173951)
	public int field1325;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -2057818687)
	public int field1327;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 434863111)
	public int field1328;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -541310443)
	public int field1329;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -544154603)
	public int field1330;

	public Class103() {
		this.field1327 = 31;
		this.field1328 = 0;
		this.field1317 = -1;
	}

	@ObfInfo(name = "aq", desc = "(II)V")
	public void method2774(int var1) {
		this.field1327 = var1;
	}

	@ObfInfo(name = "ad", desc = "(IB)Z", opaque = "0")
	public boolean method2769(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return 0 != (this.field1327 & 1 << var1);
		} else {
			return true;
		}
	}
}
