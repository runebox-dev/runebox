import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fy")
public class Class155 implements Callable {
	@ObfInfo(name = "ak", desc = "Lfm;")
	public final Class143 field1728;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfo;")
	public final Class145 this$0;
	@ObfInfo(name = "al", desc = "Lfr;")
	public final Class148 field1725;
	@ObfInfo(name = "aj", desc = "Lfz;")
	public final Class156 field1726;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 106186067)
	public final int field1727;

	public Class155(Class145 var1, Class143 var2, Class148 var3, Class156 var4, int var5) {
		this.this$0 = var1;
		this.field1728 = var2;
		this.field1725 = var3;
		this.field1726 = var4;
		this.field1727 = var5;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		this.field1728.method3168();
		Class143[][] var1;
		if (Class148.field1673 == this.field1725) {
			var1 = this.this$0.field1651;
		} else {
			var1 = this.this$0.field1657;
		}

		var1[this.field1727][this.field1726.method3313()] = this.field1728;
		return null;
	}
}
