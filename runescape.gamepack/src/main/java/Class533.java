import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfInfo(name = "um")
public class Class533 extends Class507 {
	@ObfInfo(name = "az", desc = "[Luy;")
	public Class545[] field5262;
	@ObfInfo(name = "af", desc = "Ljava/util/List;")
	public List field5263;

	public Class533(Class382 var1, int var2, int var3) {
		byte[] var4 = var1.method7216(var2, var3 + 1);
		this.method9816(new Class521(var4));
	}

	public Class533(Class382 var1, int var2) {
		byte[] var3 = var1.method7216(var2, 0);
		this.method9816(new Class521(var3));
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V", opaque = "-509410224")
	public void method9816(Class521 var1) {
		int var3 = var1.method9425();
		this.field5262 = new Class545[var3];
		this.field5263 = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field5262[var4] = (Class545)Class62.method1112(Class545.method9900(), var1.method9405());
			int var5 = var1.method9425();
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.field5262[var4].method9893(var1);
				int var8 = var1.method9425();
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					int var10 = var1.method9425();
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.field5263.add(var4, var6);
		}

	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/Object;II)Ljava/util/List;", opaque = "-1612093890")
	public List method9817(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)this.field5263.get(var2);
		return (List)var4.get(var1);
	}
}
