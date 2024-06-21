import io.runebox.ObfInfo;

@ObfInfo(name = "fq")
public class Class147 extends Class149 {
	@ObfInfo(name = "al", desc = "B")
	public byte field1668;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 302747029)
	public int field1666;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfu;")
	public final Class151 this$0;

	public Class147(Class151 var1) {
		this.this$0 = var1;
		this.field1666 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1666 = var1.method9407();
		this.field1668 = var1.method9406();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3344(this.field1666, this.field1668);
	}

	@ObfInfo(name = "ak", desc = "(B)V", opaque = "33")
	public static void method3246() {
		for (Class77 var1 = (Class77)Class77.field976.method7482(); var1 != null; var1 = (Class77)Class77.field976.method7490()) {
			if (var1.field958 != null) {
				Client.field3984.method755(var1.field958);
				var1.field958 = null;
			}

			if (var1.field972 != null) {
				Client.field3984.method755(var1.field972);
				var1.field972 = null;
			}
		}

		Class77.field976.method7476();
	}
}
