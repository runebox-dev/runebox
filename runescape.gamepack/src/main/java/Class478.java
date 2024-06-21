import io.runebox.ObfInfo;

@ObfInfo(name = "sj")
public class Class478 extends Class475 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1307489943)
	public int field4948;

	@ObfInfo(name = "ak", desc = "(Lsj;I)I")
	public int method8725(Class478 var1) {
		return this.field4948 - var1.field4948;
	}

	@ObfInfo(name = "al", desc = "(Lsg;I)I")
	public int method8409(Class475 var1) {
		return this.method8725((Class478)var1);
	}

	@ObfInfo(name = "compareTo", desc = "(Ljava/lang/Object;)I")
	public int compareTo(Object var1) {
		return this.method8725((Class478)var1);
	}
}
