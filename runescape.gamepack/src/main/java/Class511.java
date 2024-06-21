import io.runebox.ObfInfo;

public class Class511 {
	@ObfInfo(name = "af", desc = "Ltq;")
	public Class511 field5184;
	@ObfInfo(name = "az", desc = "Ltq;")
	public Class511 field5185;

	@ObfInfo(name = "ak", desc = "()V")
	public void method9301() {
		if (this.field5184 != null) {
			this.field5184.field5185 = this.field5185;
			this.field5185.field5184 = this.field5184;
			this.field5185 = null;
			this.field5184 = null;
		}
	}
}
