import io.runebox.ObfInfo;

@ObfInfo(name = "ff")
public class Class136 {
	@ObfInfo(name = "aj", desc = "Lff;")
	public Class136 field1596;
	@ObfInfo(name = "ad", desc = "F")
	public float field1591;
	@ObfInfo(name = "ag", desc = "F")
	public float field1592;
	@ObfInfo(name = "ak", desc = "F")
	public float field1593;
	@ObfInfo(name = "an", desc = "F")
	public float field1595;
	@ObfInfo(name = "ap", desc = "F")
	public float field1599;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -345198087)
	public int field1590;

	public Class136() {
		this.field1592 = Float.MAX_VALUE;
		this.field1593 = Float.MAX_VALUE;
		this.field1599 = Float.MAX_VALUE;
		this.field1595 = Float.MAX_VALUE;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;II)V")
	public void method3123(Class562 var1, int var2) {
		this.field1590 = var1.method9829();
		this.field1591 = var1.method9834();
		this.field1592 = var1.method9834();
		this.field1593 = var1.method9834();
		this.field1599 = var1.method9834();
		this.field1595 = var1.method9834();
	}
}
