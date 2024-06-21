import io.runebox.ObfInfo;

@ObfInfo(name = "tm")
public class Class507 extends Class506 {
	@ObfInfo(name = "es", desc = "Ltm;")
	public Class507 field5172;
	@ObfInfo(name = "ef", desc = "Ltm;")
	public Class507 field5174;
	@ObfInfo(name = "ed", desc = "J")
	public long field5173;

	@ObfInfo(name = "jz", desc = "()V")
	public void method9280() {
		if (this.field5174 != null) {
			this.field5174.field5172 = this.field5172;
			this.field5172.field5174 = this.field5174;
			this.field5172 = null;
			this.field5174 = null;
		}
	}
}
