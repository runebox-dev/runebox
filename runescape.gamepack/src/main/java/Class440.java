public class Class440 {
	public float field4770;
	public float field4771;
	public float field4772;
	public float field4773;
	public float field4774;
	public float field4775;
	public float field4776;
	public float field4777;
	public float field4778;
	public float field4779;
	public float field4780;
	public float field4781;

	static {
		new Class440();
	}

	public Class440() {
		this.method8251();
	}

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

	public void method8255(float var1, float var2, float var3) {
		this.field4779 += var1;
		this.field4780 += var2;
		this.field4771 += var3;
	}

	public String toString() {
		return this.field4773 + "," + this.field4772 + "," + this.field4776 + "," + this.field4779 + "\n" + this.field4781 + "," + this.field4774 + "," + this.field4777 + "," + this.field4780 + "\n" + this.field4770 + "," + this.field4775 + "," + this.field4778 + "," + this.field4771;
	}
}
