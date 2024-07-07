import io.runebox.ObfInfo;

@ObfInfo(name = "bk")
public abstract class Class37 extends Class520 {
	@ObfInfo(name = "ac", desc = "Lbk;")
	public Class37 field196;
	@ObfInfo(name = "ay", desc = "Lct;")
	public Class72 field197;
	@ObfInfo(name = "al", desc = "I")
	public int field195;
	@ObfInfo(name = "ao", desc = "Z")
	public volatile boolean field194;

	public Class37() {
		this.field194 = true;
	}

	@ObfInfo(name = "aj", desc = "()Lbk;")
	public abstract Class37 method525();

	@ObfInfo(name = "an", desc = "()Lbk;")
	public abstract Class37 method546();

	@ObfInfo(name = "av", desc = "()I")
	public abstract int method529();

	@ObfInfo(name = "ab", desc = "([III)V")
	public abstract void method531(int[] var1, int var2, int var3);

	@ObfInfo(name = "ae", desc = "(I)V")
	public abstract void method542(int var1);

	@ObfInfo(name = "bv", desc = "()I")
	public int method526() {
		return 255;
	}

	@ObfInfo(name = "fs", desc = "([III)V")
	public final void method530(int[] var1, int var2, int var3) {
		if (this.field194) {
			this.method531(var1, var2, var3);
		} else {
			this.method542(var3);
		}

	}
}
