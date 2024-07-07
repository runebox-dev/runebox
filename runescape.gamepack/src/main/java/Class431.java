import io.runebox.ObfInfo;

@ObfInfo(name = "qo")
public class Class431 {
	@ObfInfo(name = "ad", desc = "F")
	public float field4743;
	@ObfInfo(name = "ag", desc = "F")
	public float field4744;
	@ObfInfo(name = "aq", desc = "F")
	public float field4746;

	static {
		new Class431(0.0F, 0.0F, 0.0F);
		new Class431(1.0F, 1.0F, 1.0F);
		new Class431(1.0F, 0.0F, 0.0F);
		new Class431(0.0F, 1.0F, 0.0F);
		new Class431(0.0F, 0.0F, 1.0F);
	}

	public Class431() {
	}

	public Class431(float var1, float var2, float var3) {
		this.field4746 = var1;
		this.field4743 = var2;
		this.field4744 = var3;
	}

	@ObfInfo(name = "aq", desc = "(Lqo;I)Z", opaque = "-1487373129")
	public boolean method8027(Class431 var1) {
		return this.field4746 == var1.field4746 && this.field4743 == var1.field4743 && var1.field4744 == this.field4744;
	}

	@ObfInfo(name = "ad", desc = "(I)F")
	public final float method8026() {
		return (float)Math.sqrt((double)(this.field4744 * this.field4744 + this.field4746 * this.field4746 + this.field4743 * this.field4743));
	}

	public String toString() {
		return this.field4746 + ", " + this.field4743 + ", " + this.field4744;
	}
}
