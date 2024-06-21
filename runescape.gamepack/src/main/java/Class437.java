import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "qu")
public class Class437 extends Class447 {
	public Class437(Class447 var1) {
		super(var1);
		super.field4807 = "StartSongTask";
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		Iterator var2 = Class332.field3455.iterator();

		while (var2.hasNext()) {
			Class357 var3 = (Class357)var2.next();
			if (var3 != null && !var3.field3941 && var3.field3940 != null) {
				try {
					var3.field3940.method6316();
					var3.field3940.method6400(0);
					if (var3.field3932 != null) {
						var3.field3940.method6318(var3.field3932, var3.field3936);
					}

					var3.field3932 = null;
					var3.field3942 = null;
					var3.field3938 = null;
					var3.field3941 = true;
				} catch (Exception var5) {
					Class548.method8904((String)null, var5);
					this.method8379(var5.getMessage());
					return true;
				}
			}
		}

		super.field4812 = true;
		return true;
	}
}
