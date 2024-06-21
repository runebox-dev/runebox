import io.runebox.ObfInfo;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "lt")
public class Class306 extends Class286 {
	@ObfInfo(name = "ae", desc = "Ljava/util/HashSet;")
	public HashSet field3238;
	@ObfInfo(name = "ap", desc = "Ljava/util/HashSet;")
	public HashSet field3240;
	@ObfInfo(name = "ax", desc = "Ljava/util/List;")
	public List field3239;

	@ObfInfo(name = "cx", desc = "(Lua;Lua;IZS)V", opaque = "172")
	public void method6147(Class521 var1, Class521 var2, int var3, boolean var4) {
		this.method5835(var1, var3);
		int var6 = var2.method9407();
		this.field3240 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			Class282 var8 = new Class282();

			try {
				var8.method5718(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3240.add(var8);
		}

		var7 = var2.method9407();
		this.field3238 = new HashSet(var7);

		for (int var13 = 0; var13 < var7; ++var13) {
			Class281 var9 = new Class281();

			try {
				var9.method5696(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3238.add(var9);
		}

		this.method6149(var2, var4);
	}

	@ObfInfo(name = "dj", desc = "(Lua;ZI)V", opaque = "-1760184320")
	public void method6149(Class521 var1, boolean var2) {
		this.field3239 = new LinkedList();
		int var4 = var1.method9407();

		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method9423();
			Class348 var7 = new Class348(var1.method9410());
			boolean var8 = var1.method9405() == 1;
			if (var2 || !var8) {
				this.field3239.add(new Class289((Class348)null, var7, var6, (Class294)null));
			}
		}

	}
}
