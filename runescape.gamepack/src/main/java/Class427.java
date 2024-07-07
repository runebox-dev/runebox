import io.runebox.ObfInfo;

@ObfInfo(name = "qk")
public class Class427 extends Class447 {
	public Class427(Class447 var1) {
		super(var1);
		super.field4807 = "SwapSongTask";
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		if (Class332.field3455.size() > 1 && Class332.field3455.get(0) != null && ((Class357)Class332.field3455.get(0)).field3940.method6320() && Class332.field3455.get(1) != null && ((Class357)Class332.field3455.get(1)).field3940.method6320()) {
			Class357 var2 = (Class357)Class332.field3455.get(0);
			Class332.field3455.set(0, Class332.field3455.get(1));
			Class332.field3455.set(1, var2);
		}

		return true;
	}
}
