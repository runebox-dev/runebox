public class Class44 extends Class54 {
	public boolean field315;
	public byte[] field314;
	public int field311;
	public int field312;
	public int field313;

	public Class44(int var1, byte[] var2, int var3, int var4) {
		this.field312 = var1;
		this.field314 = var2;
		this.field311 = var3;
		this.field313 = var4;
	}

	public Class44(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field312 = var1;
		this.field314 = var2;
		this.field311 = var3;
		this.field313 = var4;
		this.field315 = var5;
	}

	public Class44 method849(Class56 var1) {
		this.field314 = var1.method1068(this.field314);
		this.field312 = var1.method1063(this.field312);
		if (this.field311 == this.field313) {
			this.field311 = this.field313 = var1.method1067(this.field311);
		} else {
			this.field311 = var1.method1067(this.field311);
			this.field313 = var1.method1067(this.field313);
			if (this.field311 == this.field313) {
				--this.field311;
			}
		}

		return this;
	}
}
