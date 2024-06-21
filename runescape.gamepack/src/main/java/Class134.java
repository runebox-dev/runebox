import io.runebox.ObfInfo;

@ObfInfo(name = "fd")
public class Class134 extends Class149 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1260301427)
	public int field1559;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 764459969)
	public int field1560;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -867688869)
	public int field1561;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1645465563)
	public int field1562;
	// $FF: synthetic field
	@ObfInfo(desc = "Lfu;")
	public final Class151 this$0;

	public Class134(Class151 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1562 = var1.method9410();
		this.field1560 = var1.method9410();
		this.field1561 = var1.method9405();
		this.field1559 = var1.method9405();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3360(this.field1562, this.field1560, this.field1561, this.field1559);
	}
}
