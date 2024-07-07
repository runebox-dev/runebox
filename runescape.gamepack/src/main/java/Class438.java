import io.runebox.ObfInfo;

@ObfInfo(name = "qv")
public class Class438 extends Class457 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1559573617)
	public int field4763;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = 4526152563025374107L)
	public long field4764;

	public Class438(Class457 var1, int var2) {
		super(var1);
		this.field4763 = var2;
		super.field4890 = "DelayFadeTask";
	}

	@ObfInfo(name = "aq", desc = "(S)Z")
	public boolean method7710() {
		if (this.field4764 < (long)this.field4763) {
			++this.field4764;
			return false;
		} else {
			return true;
		}
	}
}
