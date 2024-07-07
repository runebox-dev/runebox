import io.runebox.ObfInfo;

@ObfInfo(name = "tv")
public class Class516 extends Class520 {
	@ObfInfo(name = "eb", desc = "Ltv;")
	public Class516 field5156;
	@ObfInfo(name = "ew", desc = "Ltv;")
	public Class516 field5158;
	@ObfInfo(name = "eh", desc = "J")
	public long field5157;

	@ObfInfo(name = "km", desc = "()V")
	public void method9044() {
		if (this.field5156 != null) {
			this.field5156.field5158 = this.field5158;
			this.field5158.field5156 = this.field5156;
			this.field5158 = null;
			this.field5156 = null;
		}
	}
}
