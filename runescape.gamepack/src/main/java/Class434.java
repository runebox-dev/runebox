import io.runebox.ObfInfo;

@ObfInfo(name = "qr")
public class Class434 extends Class457 {
	public Class434(Class457 var1) {
		super(var1);
		super.field4890 = "SwapSongTask";
	}

	@ObfInfo(name = "aq", desc = "(S)Z", opaque = "254")
	public boolean method7710() {
		if (Class323.field3464.size() > 1 && Class323.field3464.get(0) != null && ((Class351)Class323.field3464.get(0)).field3761.method6097() && Class323.field3464.get(1) != null && ((Class351)Class323.field3464.get(1)).field3761.method6097()) {
			Class351 var2 = (Class351)Class323.field3464.get(0);
			Class323.field3464.set(0, Class323.field3464.get(1));
			Class323.field3464.set(1, var2);
		}

		return true;
	}
}
