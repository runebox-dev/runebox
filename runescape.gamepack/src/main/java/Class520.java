import io.runebox.ObfInfo;

@ObfInfo(name = "tz")
public class Class520 {
	@ObfInfo(name = "hz", desc = "Ltz;")
	public Class520 field5233;
	@ObfInfo(name = "hy", desc = "Ltz;")
	public Class520 field5235;
	@ObfInfo(name = "hq", desc = "J")
	public long field5234;

	@ObfInfo(name = "kh", desc = "()V")
	public void method9267() {
		if (this.field5233 != null) {
			this.field5233.field5235 = this.field5235;
			this.field5235.field5233 = this.field5233;
			this.field5235 = null;
			this.field5233 = null;
		}
	}

	@ObfInfo(name = "kf", desc = "()Z")
	public boolean method9268() {
		return this.field5233 != null;
	}
}
