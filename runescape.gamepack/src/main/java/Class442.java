import io.runebox.ObfInfo;

@ObfInfo(name = "qz")
public final class Class442 {
	@ObfInfo(name = "ak", desc = "[Lqz;")
	public static Class442[] field4791;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1803012423)
	public static int field4787;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1358396733)
	public static int field4789;
	@ObfInfo(name = "af", desc = "F")
	public float field4785;
	@ObfInfo(name = "at", desc = "F")
	public float field4786;
	@ObfInfo(name = "az", desc = "F")
	public float field4788;
	@ObfInfo(name = "aa", desc = "F")
	public float field4790;

	static {
		field4791 = new Class442[0];
		Class326.method6262(100);
		new Class442();
	}

	public Class442() {
		this.method8281();
	}

	public Class442(float var1, float var2, float var3) {
		this.method8278(var1, var2, var3);
	}

	@ObfInfo(name = "aj", desc = "(S)V", opaque = "325")
	public void method8300() {
		synchronized(field4791) {
			if (field4787 < field4789 - 1) {
				field4791[++field4787 - 1] = this;
			}

		}
	}

	@ObfInfo(name = "az", desc = "(FFFFS)V")
	public void method8280(float var1, float var2, float var3, float var4) {
		this.field4788 = var1;
		this.field4785 = var2;
		this.field4790 = var3;
		this.field4786 = var4;
	}

	@ObfInfo(name = "af", desc = "(FFFFB)V")
	public void method8279(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin((double)(0.5F * var4));
		float var7 = (float)Math.cos((double)(0.5F * var4));
		this.field4788 = var1 * var6;
		this.field4785 = var2 * var6;
		this.field4790 = var3 * var6;
		this.field4786 = var7;
	}

	@ObfInfo(name = "aa", desc = "(FFFI)V")
	public void method8278(float var1, float var2, float var3) {
		this.method8279(0.0F, 1.0F, 0.0F, var1);
		Class442 var5 = method2775();
		var5.method8279(1.0F, 0.0F, 0.0F, var2);
		this.method8282(var5);
		var5.method8279(0.0F, 0.0F, 1.0F, var3);
		this.method8282(var5);
		var5.method8300();
	}

	@ObfInfo(name = "at", desc = "(I)V")
	public final void method8281() {
		this.field4790 = 0.0F;
		this.field4785 = 0.0F;
		this.field4788 = 0.0F;
		this.field4786 = 1.0F;
	}

	@ObfInfo(name = "ab", desc = "(Lqz;B)V")
	public final void method8282(Class442 var1) {
		this.method8280(this.field4786 * var1.field4788 + this.field4788 * var1.field4786 + var1.field4785 * this.field4790 - var1.field4790 * this.field4785, this.field4786 * var1.field4785 + (this.field4785 * var1.field4786 - var1.field4788 * this.field4790) + this.field4788 * var1.field4790, this.field4786 * var1.field4790 + (var1.field4788 * this.field4785 + this.field4790 * var1.field4786 - var1.field4785 * this.field4788), var1.field4786 * this.field4786 - var1.field4788 * this.field4788 - this.field4785 * var1.field4785 - this.field4790 * var1.field4790);
	}

	@ObfInfo(desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (!(var1 instanceof Class442)) {
			return false;
		} else {
			Class442 var2 = (Class442)var1;
			return this.field4788 == var2.field4788 && this.field4785 == var2.field4785 && this.field4790 == var2.field4790 && this.field4786 == var2.field4786;
		}
	}

	@ObfInfo(desc = "()I")
	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4788;
		var2 = this.field4785 + var2 * 31.0F;
		var2 = this.field4790 + var2 * 31.0F;
		var2 = this.field4786 + var2 * 31.0F;
		return (int)var2;
	}

	@ObfInfo(desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field4788 + "," + this.field4785 + "," + this.field4790 + "," + this.field4786;
	}

	@ObfInfo(desc = "()LClass442;")
	public static Class442 method2775() {
		synchronized(field4791) {
			if (field4787 == 0) {
				return new Class442();
			} else {
				field4791[--field4787].method8281();
				return field4791[field4787];
			}
		}
	}
}
