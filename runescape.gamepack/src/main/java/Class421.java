public class Class421 {
	public float field4677;
	public float field4678;
	public float field4680;

	static {
		new Class421(0.0F, 0.0F, 0.0F);
		new Class421(1.0F, 1.0F, 1.0F);
		new Class421(1.0F, 0.0F, 0.0F);
		new Class421(0.0F, 1.0F, 0.0F);
		new Class421(0.0F, 0.0F, 1.0F);
	}

	public Class421() {
	}

	public Class421(float var1, float var2, float var3) {
		this.field4680 = var1;
		this.field4677 = var2;
		this.field4678 = var3;
	}

	public boolean method7812(Class421 var1) {
		return var1.field4680 == this.field4680 && var1.field4677 == this.field4677 && this.field4678 == var1.field4678;
	}

	public final float method7813() {
		return (float)Math.sqrt((double)(this.field4678 * this.field4678 + this.field4680 * this.field4680 + this.field4677 * this.field4677));
	}

	public String toString() {
		return this.field4680 + ", " + this.field4677 + ", " + this.field4678;
	}
}