public class Class506 {
	public Class506 field5169;
	public Class506 field5171;
	public long field5170;

	public void method9277() {
		if (this.field5171 != null) {
			this.field5171.field5169 = this.field5169;
			this.field5169.field5171 = this.field5171;
			this.field5169 = null;
			this.field5171 = null;
		}
	}

	public boolean method9275() {
		return this.field5171 != null;
	}
}
