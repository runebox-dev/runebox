import io.runebox.ObfInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "dq")
public class Class95 {
	@ObfInfo(name = "an", desc = "Z")
	public boolean field1160;
	@ObfInfo(name = "aj", desc = "Z")
	public boolean field1161;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field1164;
	@ObfInfo(name = "ap", desc = "Z")
	public boolean field1168;
	@ObfInfo(name = "ai", desc = "D")
	public double field1163;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 35823685)
	public int field1155;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -2063082351)
	public int field1162;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1571776205)
	public int field1165;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -2129688829)
	public int field1166;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -966473101)
	public int field1167;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -21294833)
	public int field1170;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -302803323)
	public int field1171;
	@ObfInfo(name = "ax", desc = "Ljava/lang/String;")
	public String field1159;
	@ObfInfo(name = "ay", desc = "Ljava/util/Map;")
	public final Map field1172;

	public Class95() {
		this.field1160 = false;
		this.field1164 = false;
		this.field1163 = 0.8D;
		this.field1165 = 127;
		this.field1155 = 127;
		this.field1167 = 127;
		this.field1162 = -1;
		this.field1159 = null;
		this.field1170 = 1;
		this.field1171 = 25;
		this.field1172 = new LinkedHashMap();
		this.method2460(true);
	}

	public Class95(Class562 var1) {
		this.field1160 = false;
		this.field1164 = false;
		this.field1163 = 0.8D;
		this.field1165 = 127;
		this.field1155 = 127;
		this.field1167 = 127;
		this.field1162 = -1;
		this.field1159 = null;
		this.field1170 = 1;
		this.field1171 = 25;
		this.field1172 = new LinkedHashMap();
		if (var1 != null && var1.field5472 != null) {
			int var2 = var1.method9902();
			if (var2 >= 0 && var2 <= 11) {
				if (var1.method9902() == 1) {
					this.field1168 = true;
				}

				if (var2 > 1) {
					this.field1161 = var1.method9902() == 1;
				}

				if (var2 > 3) {
					this.field1170 = var1.method9902();
				}

				if (var2 > 2) {
					int var3 = var1.method9902();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method9832();
						int var6 = var1.method9832();
						this.field1172.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field1159 = var1.method9836();
				}

				if (var2 > 5) {
					this.field1160 = var1.method9835();
				}

				if (var2 > 6) {
					this.field1163 = (double)var1.method9902() / 100.0D;
					this.field1165 = var1.method9902();
					this.field1155 = var1.method9902();
					this.field1167 = var1.method9902();
				}

				if (var2 > 7) {
					this.field1162 = var1.method9902();
				}

				if (var2 > 8) {
					this.field1164 = var1.method9902() == 1;
				}

				if (var2 > 9) {
					this.field1166 = var1.method9832();
				}

				if (var2 > 10) {
					this.field1171 = var1.method9902();
				}
			} else {
				this.method2460(true);
			}
		} else {
			this.method2460(true);
		}

	}

	@ObfInfo(name = "aq", desc = "(ZI)V")
	public void method2460(boolean var1) {
	}

	@ObfInfo(name = "ad", desc = "(I)Lvp;", opaque = "-1838443573")
	public Class562 method2461() {
		Class562 var2 = new Class562(418, true);
		var2.method9809(11);
		var2.method9809(this.field1168 ? 1 : 0);
		var2.method9809(this.field1161 ? 1 : 0);
		var2.method9809(this.field1170);
		var2.method9809(this.field1172.size());
		Iterator var3 = this.field1172.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.method9812((Integer)var4.getKey());
			var2.method9812((Integer)var4.getValue());
		}

		var2.method9816(this.field1159 != null ? this.field1159 : "");
		var2.method9827(this.field1160);
		var2.method9809((int)(this.field1163 * 100.0D));
		var2.method9809(this.field1165);
		var2.method9809(this.field1155);
		var2.method9809(this.field1167);
		var2.method9809(this.field1162);
		var2.method9809(this.field1164 ? 1 : 0);
		var2.method9812(this.field1166);
		var2.method9809(this.field1171);
		return var2;
	}

	@ObfInfo(name = "ak", desc = "(ZI)V")
	public void method2462(boolean var1) {
		this.field1168 = var1;
		method3133();
	}

	@ObfInfo(name = "ap", desc = "(S)Z")
	public boolean method2554() {
		return this.field1168;
	}

	@ObfInfo(name = "an", desc = "(ZI)V")
	public void method2520(boolean var1) {
		this.field1160 = var1;
		method3133();
	}

	@ObfInfo(name = "aj", desc = "(I)Z")
	public boolean method2562() {
		return this.field1160;
	}

	@ObfInfo(name = "av", desc = "(ZB)V")
	public void method2466(boolean var1) {
		this.field1161 = var1;
		method3133();
	}

	@ObfInfo(name = "ab", desc = "(B)Z")
	public boolean method2492() {
		return this.field1161;
	}

	@ObfInfo(name = "ai", desc = "(ZI)V")
	public void method2532(boolean var1) {
		this.field1164 = var1;
		method3133();
	}

	@ObfInfo(name = "ae", desc = "(I)V", opaque = "-1368627558")
	public void method2469() {
		this.method2532(!this.field1164);
	}

	@ObfInfo(name = "au", desc = "(I)Z")
	public boolean method2470() {
		return this.field1164;
	}

	@ObfInfo(name = "ah", desc = "(II)V")
	public void method2547(int var1) {
		this.field1166 = var1;
		method3133();
	}

	@ObfInfo(name = "az", desc = "(S)I")
	public int method2471() {
		return this.field1166;
	}

	@ObfInfo(name = "ax", desc = "(D)V")
	public void method2528(double var1) {
		this.field1163 = var1;
		method3133();
	}

	@ObfInfo(name = "ac", desc = "(S)D")
	public double method2468() {
		return this.field1163;
	}

	@ObfInfo(name = "al", desc = "(IB)V")
	public void method2480(int var1) {
		this.field1165 = var1;
		method3133();
	}

	@ObfInfo(name = "ay", desc = "(S)I")
	public int method2544() {
		return this.field1165;
	}

	@ObfInfo(name = "ao", desc = "(II)V")
	public void method2477(int var1) {
		this.field1155 = var1;
		method3133();
	}

	@ObfInfo(name = "aa", desc = "(I)I")
	public int method2478() {
		return this.field1155;
	}

	@ObfInfo(name = "as", desc = "(IB)V")
	public void method2479(int var1) {
		this.field1167 = var1;
		method3133();
	}

	@ObfInfo(name = "aw", desc = "(I)I")
	public int method2508() {
		return this.field1167;
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;B)V")
	public void method2481(String var1) {
		this.field1159 = var1;
		method3133();
	}

	@ObfInfo(name = "af", desc = "(I)Ljava/lang/String;")
	public String method2482() {
		return this.field1159;
	}

	@ObfInfo(name = "am", desc = "(II)V")
	public void method2483(int var1) {
		this.field1162 = var1;
		method3133();
	}

	@ObfInfo(name = "ar", desc = "(I)I")
	public int method2484() {
		return this.field1162;
	}

	@ObfInfo(name = "bt", desc = "(II)V")
	public void method2485(int var1) {
		this.field1170 = var1;
		method3133();
	}

	@ObfInfo(name = "bj", desc = "(I)I")
	public int method2513() {
		return this.field1170;
	}

	@ObfInfo(name = "be", desc = "(Ljava/lang/String;IB)V", opaque = "2")
	public void method2487(String var1, int var2) {
		int var4 = this.method2490(var1);
		if (this.field1172.size() >= 10 && !this.field1172.containsKey(var4)) {
			Iterator var5 = this.field1172.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field1172.put(var4, var2);
		method3133();
	}

	@ObfInfo(name = "bm", desc = "(Ljava/lang/String;I)Z")
	public boolean method2488(String var1) {
		int var3 = this.method2490(var1);
		return this.field1172.containsKey(var3);
	}

	@ObfInfo(name = "bo", desc = "(Ljava/lang/String;I)I", opaque = "317942759")
	public int method2489(String var1) {
		int var3 = this.method2490(var1);
		return !this.field1172.containsKey(var3) ? 0 : (Integer)this.field1172.get(var3);
	}

	@ObfInfo(name = "bi", desc = "(Ljava/lang/String;I)I")
	public int method2490(String var1) {
		return Class413.method5797(var1.toLowerCase());
	}

	@ObfInfo(name = "ba", desc = "(II)V")
	public void method2491(int var1) {
		this.field1171 = var1;
		Client.method4830();
		method3133();
	}

	@ObfInfo(name = "bg", desc = "(I)I")
	public int method2459() {
		return this.field1171;
	}

	@ObfInfo(owner = "fh", name = "ag", desc = "(I)V", opaque = "1979820768")
	public static void method3133() {
		Class539 var1 = null;

		try {
			var1 = Class211.method2856("", Client.field1425.field4406, true);
			Class562 var2 = Client.field1474.method2461();
			var1.method9486(var2.field5472, 0, var2.field5471);
		} catch (Exception var4) {
		}

		try {
			if (var1 != null) {
				var1.method9482(true);
			}
		} catch (Exception var3) {
		}

	}
}
