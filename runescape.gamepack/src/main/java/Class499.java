import io.runebox.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "te")
public class Class499 {
	@ObfInfo(name = "aq", desc = "Lok;")
	public Class375 field5057;
	@ObfInfo(name = "ad", desc = "Lok;")
	public Class375 field5058;
	@ObfInfo(name = "ag", desc = "Ljava/util/HashMap;")
	public HashMap field5059;

	public Class499(Class375 var1, Class375 var2) {
		this.field5057 = var1;
		this.field5058 = var2;
		this.field5059 = new HashMap();
	}

	@ObfInfo(name = "aq", desc = "([Lty;I)Ljava/util/HashMap;", opaque = "-1079207783")
	public HashMap method8882(Class519[] var1) {
		HashMap var3 = new HashMap();

		for (int var5 = 0; var5 < var1.length; ++var5) {
			Class519 var6 = var1[var5];
			if (this.field5059.containsKey(var6)) {
				var3.put(var6, this.field5059.get(var6));
			} else {
				Class424 var7 = Class466.method8514(this.field5057, this.field5058, var6.field5232, "");
				if (var7 != null) {
					this.field5059.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}
}
