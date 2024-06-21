import io.runebox.ObfInfo;

public abstract class Class27 extends Class506 {
	@ObfInfo(name = "ax", desc = "Lba;")
	public Class27 field139;
	@ObfInfo(name = "au", desc = "Lcb;")
	public Class54 field138;
	@ObfInfo(name = "ay", desc = "I")
	public int field137;
	@ObfInfo(name = "as", desc = "Z")
	public volatile boolean field136;

	public Class27() {
		this.field136 = true;
	}

	@ObfInfo(name = "at", desc = "()Lba;")
	public abstract Class27 method379();

	@ObfInfo(name = "aa", desc = "()Lba;")
	public abstract Class27 method384();

	@ObfInfo(name = "ab", desc = "()I")
	public abstract int method380();

	@ObfInfo(name = "ac", desc = "([III)V")
	public abstract void method381(int[] var1, int var2, int var3);

	@ObfInfo(name = "ah", desc = "(I)V")
	public abstract void method395(int var1);

	@ObfInfo(name = "bp", desc = "()I")
	public int method377() {
		return 255;
	}

	@ObfInfo(name = "fa", desc = "([III)V")
	public final void method392(int[] var1, int var2, int var3) {
		if (this.field136) {
			this.method381(var1, var2, var3);
		} else {
			this.method395(var3);
		}

	}
}
