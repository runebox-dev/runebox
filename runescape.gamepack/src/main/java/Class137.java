import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fg")
public class Class137 implements Callable {
	@ObfInfo(name = "ag", desc = "Lfb;")
	public final Class132 field1601;
	@ObfInfo(name = "aq", desc = "Lfd;")
	public final Class134 field1602;
	@ObfInfo(name = "ad", desc = "Lfi;")
	public final Class139 field1605;
	// $FF: synthetic field
	public final Class150 this$0;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -13995373)
	public final int field1600;

	public Class137(Class150 var1, Class134 var2, Class139 var3, Class132 var4, int var5) {
		this.this$0 = var1;
		this.field1602 = var2;
		this.field1605 = var3;
		this.field1601 = var4;
		this.field1600 = var5;
	}

	public Object call() {
		this.field1602.method3090();
		Class134[][] var1;
		if (Class139.field1617 == this.field1605) {
			var1 = this.this$0.field1687;
		} else {
			var1 = this.this$0.field1691;
		}

		var1[this.field1600][this.field1601.method3066()] = this.field1602;
		return null;
	}
}
