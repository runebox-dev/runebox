import io.runebox.ObfInfo;

@ObfInfo(name = "tf")
public class Class500 {
	@ObfInfo(name = "ap", desc = "Ltf;")
	public Class500 field5061;
	@ObfInfo(name = "ak", desc = "Ltf;")
	public Class500 field5062;

	@ObfInfo(name = "aq", desc = "()V")
	public void method8885() {
		if (this.field5061 != null) {
			this.field5061.field5062 = this.field5062;
			this.field5062.field5061 = this.field5061;
			this.field5062 = null;
			this.field5061 = null;
		}
	}
}
