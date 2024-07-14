import io.runebox.ObfInfo;

@ObfInfo(name = "qi")
public final class Class425 {
	@ObfInfo(name = "aq", desc = "[Lqi;")
	public static Class425[] field4709;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 585310265)
	public static int field4705;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1088343129)
	public static int field4706;
	@ObfInfo(name = "an", desc = "F")
	public float field4704;
	@ObfInfo(name = "ak", desc = "F")
	public float field4707;
	@ObfInfo(name = "ap", desc = "F")
	public float field4708;
	@ObfInfo(name = "aj", desc = "F")
	public float field4710;

	static {
		field4709 = new Class425[0];
		method218(100);
		new Class425();
	}

	public Class425() {
		this.method7848();
	}

	public Class425(float var1, float var2, float var3) {
		this.method7847(var1, var2, var3);
	}

	@ObfInfo(name = "ag", desc = "(I)V", opaque = "-552255586")
	public void method7850() {
		synchronized(field4709) {
			if (field4706 < field4705 - 1) {
				field4709[++field4706 - 1] = this;
			}

		}
	}

	@ObfInfo(name = "ak", desc = "(FFFFI)V")
	public void method7846(float var1, float var2, float var3, float var4) {
		this.field4707 = var1;
		this.field4708 = var2;
		this.field4704 = var3;
		this.field4710 = var4;
	}

	@ObfInfo(name = "ap", desc = "(FFFFI)V")
	public void method7820(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin((double)(var4 * 0.5F));
		float var7 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4707 = var1 * var6;
		this.field4708 = var2 * var6;
		this.field4704 = var3 * var6;
		this.field4710 = var7;
	}

	@ObfInfo(name = "an", desc = "(FFFI)V")
	public void method7847(float var1, float var2, float var3) {
		this.method7820(0.0F, 1.0F, 0.0F, var1);
		Class425 var5 = method2569();
		var5.method7820(1.0F, 0.0F, 0.0F, var2);
		this.method7823(var5);
		var5.method7820(0.0F, 0.0F, 1.0F, var3);
		this.method7823(var5);
		var5.method7850();
	}

	@ObfInfo(name = "aj", desc = "(B)V")
	public final void method7848() {
		this.field4704 = 0.0F;
		this.field4708 = 0.0F;
		this.field4707 = 0.0F;
		this.field4710 = 1.0F;
	}

	@ObfInfo(name = "av", desc = "(Lqi;B)V")
	public final void method7823(Class425 var1) {
		this.method7846(this.field4704 * var1.field4708 + this.field4710 * var1.field4707 + this.field4707 * var1.field4710 - this.field4708 * var1.field4704, this.field4707 * var1.field4704 + this.field4710 * var1.field4708 + (this.field4708 * var1.field4710 - this.field4704 * var1.field4707), this.field4710 * var1.field4704 + (this.field4708 * var1.field4707 + this.field4704 * var1.field4710 - this.field4707 * var1.field4708), this.field4710 * var1.field4710 - this.field4707 * var1.field4707 - this.field4708 * var1.field4708 - this.field4704 * var1.field4704);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class425)) {
			return false;
		} else {
			Class425 var2 = (Class425)var1;
			return this.field4707 == var2.field4707 && this.field4708 == var2.field4708 && this.field4704 == var2.field4704 && this.field4710 == var2.field4710;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4707;
		var2 = var2 * 31.0F + this.field4708;
		var2 = var2 * 31.0F + this.field4704;
		var2 = var2 * 31.0F + this.field4710;
		return (int)var2;
	}

	public String toString() {
		return this.field4707 + "," + this.field4708 + "," + this.field4704 + "," + this.field4710;
	}

	@ObfInfo(owner = "ap", name = "aq", desc = "(II)V")
	public static void method218(int var0) {
		field4705 = var0;
		field4709 = new Class425[var0];
		field4706 = 0;
	}

	@ObfInfo(owner = "dr", name = "ad", desc = "(B)Lqi;", opaque = "-1")
	public static Class425 method2569() {
		synchronized(field4709) {
			if (field4706 == 0) {
				return new Class425();
			} else {
				field4709[--field4706].method7848();
				return field4709[field4706];
			}
		}
	}
}
