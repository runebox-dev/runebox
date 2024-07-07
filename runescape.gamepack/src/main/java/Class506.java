import io.runebox.ObfInfo;

@ObfInfo(name = "tl")
public class Class506 {
	@ObfInfo(name = "hj", desc = "Ltl;")
	public Class506 field5169;
	@ObfInfo(name = "hg", desc = "Ltl;")
	public Class506 field5171;
	@ObfInfo(name = "he", desc = "J")
	public long field5170;

	@ObfInfo(name = "jg", desc = "()V")
	public void method9277() {
		if (this.field5171 != null) {
			this.field5171.field5169 = this.field5169;
			this.field5169.field5171 = this.field5171;
			this.field5169 = null;
			this.field5171 = null;
		}
	}

	@ObfInfo(name = "je", desc = "()Z")
	public boolean method9275() {
		return this.field5171 != null;
	}
}
