import io.runebox.ObfInfo;

@ObfInfo(name = "sh")
public class Class476 extends Class479 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -430063719)
	public int field4969;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1329967099)
	public int field4970;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -608742771)
	public int field4971;

	public Class476() {
		this.field4971 = -1;
	}

	@ObfInfo(name = "bl", desc = "(III)V")
	public void method8677(int var1, int var2) {
		this.field4971 = var1;
		this.field4970 = var2;
	}

	@ObfInfo(name = "bc", desc = "(I)I")
	public int method8682() {
		return this.field4971;
	}

	@ObfInfo(name = "bv", desc = "(I)Z", opaque = "723509877")
	public boolean method8678() {
		return this.field4971 > 0;
	}
}
