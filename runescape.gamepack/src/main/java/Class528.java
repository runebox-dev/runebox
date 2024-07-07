import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfInfo(name = "uh")
public class Class528 extends Class516 {
	@ObfInfo(name = "ak", desc = "[Lue;")
	public Class525[] field5269;
	@ObfInfo(name = "ap", desc = "Ljava/util/List;")
	public List field5273;

	public Class528(Class375 var1, int var2, int var3) {
		byte[] var4 = var1.method7132(var2, var3 + 1);
		this.method9379(new Class562(var4));
	}

	public Class528(Class375 var1, int var2) {
		byte[] var3 = var1.method7132(var2, 0);
		this.method9379(new Class562(var3));
	}

	@ObfInfo(name = "aq", desc = "(Lvp;I)V", opaque = "-1716514812")
	public void method9379(Class562 var1) {
		int var3 = var1.method9848();
		this.field5269 = new Class525[var3];
		this.field5273 = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field5269[var4] = (Class525)Class406.method4071(Class525.method9304(), var1.method9902());
			int var5 = var1.method9848();
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.field5269[var4].method9298(var1);
				int var8 = var1.method9848();
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					int var10 = var1.method9848();
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.field5273.add(var4, var6);
		}

	}

	@ObfInfo(name = "ad", desc = "(Ljava/lang/Object;II)Ljava/util/List;", opaque = "217127987")
	public List method9380(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)this.field5273.get(var2);
		return (List)var4.get(var1);
	}
}
