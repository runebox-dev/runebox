import io.runebox.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "pp")
public class Class406 {
	static {
		new HashMap();
	}

	@ObfInfo(owner = "id", name = "aq", desc = "([Lpc;II)Lpc;", opaque = "-1635336265")
	public static Class393 method4071(Class393[] var0, int var1) {
		for (int var4 = 0; var4 < var0.length; ++var4) {
			Class393 var5 = var0[var4];
			if (var5.method129() == var1) {
				return var5;
			}
		}

		return null;
	}
}
