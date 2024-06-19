public abstract class Class27 extends Class506 {
	public Class27 field139;
	public Class54 field138;
	public int field137;
	public volatile boolean field136;

	public Class27() {
		this.field136 = true;
	}

	public abstract Class27 method379();

	public abstract Class27 method384();

	public abstract int method380();

	public abstract void method381(int[] var1, int var2, int var3);

	public abstract void method395(int var1);

	public int method377() {
		return 255;
	}

	public final void method392(int[] var1, int var2, int var3) {
		if (this.field136) {
			this.method381(var1, var2, var3);
		} else {
			this.method395(var3);
		}

	}
}
