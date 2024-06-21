import io.runebox.ObfInfo;

@ObfInfo(name = "qx")
public class Class440 {
	@ObfInfo(name = "aj", desc = "F")
	public float field4770;
	@ObfInfo(name = "av", desc = "F")
	public float field4771;
	@ObfInfo(name = "az", desc = "F")
	public float field4772;
	@ObfInfo(name = "ak", desc = "F")
	public float field4773;
	@ObfInfo(name = "af", desc = "F")
	public float field4774;
	@ObfInfo(name = "aa", desc = "F")
	public float field4775;
	@ObfInfo(name = "at", desc = "F")
	public float field4776;
	@ObfInfo(name = "ab", desc = "F")
	public float field4777;
	@ObfInfo(name = "ac", desc = "F")
	public float field4778;
	@ObfInfo(name = "ao", desc = "F")
	public float field4779;
	@ObfInfo(name = "ah", desc = "F")
	public float field4780;
	@ObfInfo(name = "al", desc = "F")
	public float field4781;

	static {
		new Class440();
	}

	public Class440() {
		this.method8251();
	}

	@ObfInfo(name = "ak", desc = "(I)V")
	public void method8251() {
		this.field4771 = 0.0F;
		this.field4780 = 0.0F;
		this.field4779 = 0.0F;
		this.field4777 = 0.0F;
		this.field4776 = 0.0F;
		this.field4775 = 0.0F;
		this.field4772 = 0.0F;
		this.field4770 = 0.0F;
		this.field4781 = 0.0F;
		this.field4778 = 1.0F;
		this.field4774 = 1.0F;
		this.field4773 = 1.0F;
	}

	@ObfInfo(name = "al", desc = "(FB)V")
	public void method8252(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4781;
		float var6 = this.field4774;
		float var7 = this.field4777;
		float var8 = this.field4780;
		this.field4781 = var3 * var5 - var4 * this.field4770;
		this.field4770 = var3 * this.field4770 + var5 * var4;
		this.field4774 = var3 * var6 - this.field4775 * var4;
		this.field4775 = this.field4775 * var3 + var4 * var6;
		this.field4777 = var3 * var7 - this.field4778 * var4;
		this.field4778 = this.field4778 * var3 + var7 * var4;
		this.field4780 = var8 * var3 - var4 * this.field4771;
		this.field4771 = var4 * var8 + var3 * this.field4771;
	}

	@ObfInfo(name = "aj", desc = "(FS)V")
	public void method8253(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4773;
		float var6 = this.field4772;
		float var7 = this.field4776;
		float var8 = this.field4779;
		this.field4773 = var4 * this.field4770 + var5 * var3;
		this.field4770 = this.field4770 * var3 - var4 * var5;
		this.field4772 = this.field4775 * var4 + var6 * var3;
		this.field4775 = this.field4775 * var3 - var4 * var6;
		this.field4776 = var4 * this.field4778 + var3 * var7;
		this.field4778 = this.field4778 * var3 - var7 * var4;
		this.field4779 = var4 * this.field4771 + var3 * var8;
		this.field4771 = this.field4771 * var3 - var8 * var4;
	}

	@ObfInfo(name = "az", desc = "(FI)V")
	public void method8254(float var1) {
		float var3 = (float)Math.cos((double)var1);
		float var4 = (float)Math.sin((double)var1);
		float var5 = this.field4773;
		float var6 = this.field4772;
		float var7 = this.field4776;
		float var8 = this.field4779;
		this.field4773 = var3 * var5 - this.field4781 * var4;
		this.field4781 = var4 * var5 + this.field4781 * var3;
		this.field4772 = var3 * var6 - this.field4774 * var4;
		this.field4774 = var3 * this.field4774 + var6 * var4;
		this.field4776 = var7 * var3 - var4 * this.field4777;
		this.field4777 = var4 * var7 + this.field4777 * var3;
		this.field4779 = var8 * var3 - this.field4780 * var4;
		this.field4780 = var4 * var8 + this.field4780 * var3;
	}

	@ObfInfo(name = "af", desc = "(FFFI)V")
	public void method8255(float var1, float var2, float var3) {
		this.field4779 += var1;
		this.field4780 += var2;
		this.field4771 += var3;
	}

	@ObfInfo(desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field4773 + "," + this.field4772 + "," + this.field4776 + "," + this.field4779 + "\n" + this.field4781 + "," + this.field4774 + "," + this.field4777 + "," + this.field4780 + "\n" + this.field4770 + "," + this.field4775 + "," + this.field4778 + "," + this.field4771;
	}
}
