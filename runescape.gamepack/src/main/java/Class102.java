import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class102 {
	public boolean field1340;
	public boolean field1341;
	public boolean field1342;
	public boolean field1343;
	public double field1347;
	public int field1345;
	public int field1346;
	public int field1348;
	public int field1349;
	public int field1350;
	public int field1351;
	public int field1352;
	public String field1338;
	public final Map field1353;

	public Class102() {
		this.field1341 = false;
		this.field1343 = false;
		this.field1347 = 0.8D;
		this.field1346 = 127;
		this.field1350 = 127;
		this.field1348 = 127;
		this.field1349 = -1;
		this.field1338 = null;
		this.field1345 = 1;
		this.field1352 = 25;
		this.field1353 = new LinkedHashMap();
		this.method2607(true);
	}

	public Class102(Class521 var1) {
		this.field1341 = false;
		this.field1343 = false;
		this.field1347 = 0.8D;
		this.field1346 = 127;
		this.field1350 = 127;
		this.field1348 = 127;
		this.field1349 = -1;
		this.field1338 = null;
		this.field1345 = 1;
		this.field1352 = 25;
		this.field1353 = new LinkedHashMap();
		if (var1 != null && var1.field5221 != null) {
			int var2 = var1.method9405();
			if (var2 >= 0 && var2 <= 11) {
				if (var1.method9405() == 1) {
					this.field1340 = true;
				}

				if (var2 > 1) {
					this.field1342 = var1.method9405() == 1;
				}

				if (var2 > 3) {
					this.field1345 = var1.method9405();
				}

				if (var2 > 2) {
					int var3 = var1.method9405();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method9410();
						int var6 = var1.method9410();
						this.field1353.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field1338 = var1.method9414();
				}

				if (var2 > 5) {
					this.field1341 = var1.method9413();
				}

				if (var2 > 6) {
					this.field1347 = (double)var1.method9405() / 100.0D;
					this.field1346 = var1.method9405();
					this.field1350 = var1.method9405();
					this.field1348 = var1.method9405();
				}

				if (var2 > 7) {
					this.field1349 = var1.method9405();
				}

				if (var2 > 8) {
					this.field1343 = var1.method9405() == 1;
				}

				if (var2 > 9) {
					this.field1351 = var1.method9410();
				}

				if (var2 > 10) {
					this.field1352 = var1.method9405();
				}
			} else {
				this.method2607(true);
			}
		} else {
			this.method2607(true);
		}

	}

	public void method2607(boolean var1) {
	}

	public Class521 method2608() {
		Class521 var2 = new Class521(418, true);
		var2.method9388(11);
		var2.method9388(this.field1340 ? 1 : 0);
		var2.method9388(this.field1342 ? 1 : 0);
		var2.method9388(this.field1345);
		var2.method9388(this.field1353.size());
		Iterator var3 = this.field1353.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.method9590((Integer)var4.getKey());
			var2.method9590((Integer)var4.getValue());
		}

		var2.method9473(this.field1338 != null ? this.field1338 : "");
		var2.method9394(this.field1341);
		var2.method9388((int)(this.field1347 * 100.0D));
		var2.method9388(this.field1346);
		var2.method9388(this.field1350);
		var2.method9388(this.field1348);
		var2.method9388(this.field1349);
		var2.method9388(this.field1343 ? 1 : 0);
		var2.method9590(this.field1351);
		var2.method9388(this.field1352);
		return var2;
	}

	public void method2609(boolean var1) {
		this.field1340 = var1;
		Class188.method3696();
	}

	public boolean method2701() {
		return this.field1340;
	}

	public void method2618(boolean var1) {
		this.field1341 = var1;
		Class188.method3696();
	}

	public boolean method2612() {
		return this.field1341;
	}

	public void method2723(boolean var1) {
		this.field1342 = var1;
		Class188.method3696();
	}

	public boolean method2614() {
		return this.field1342;
	}

	public void method2733(boolean var1) {
		this.field1343 = var1;
		Class188.method3696();
	}

	public void method2616() {
		this.method2733(!this.field1343);
	}

	public boolean method2617() {
		return this.field1343;
	}

	public void method2658(int var1) {
		this.field1351 = var1;
		Class188.method3696();
	}

	public int method2720() {
		return this.field1351;
	}

	public void method2620(double var1) {
		this.field1347 = var1;
		Class188.method3696();
	}

	public double method2621() {
		return this.field1347;
	}

	public void method2622(int var1) {
		this.field1346 = var1;
		Class188.method3696();
	}

	public int method2637() {
		return this.field1346;
	}

	public void method2624(int var1) {
		this.field1350 = var1;
		Class188.method3696();
	}

	public int method2704() {
		return this.field1350;
	}

	public void method2626(int var1) {
		this.field1348 = var1;
		Class188.method3696();
	}

	public int method2657() {
		return this.field1348;
	}

	public void method2628(String var1) {
		this.field1338 = var1;
		Class188.method3696();
	}

	public String method2629() {
		return this.field1338;
	}

	public void method2630(int var1) {
		this.field1349 = var1;
		Class188.method3696();
	}

	public int method2631() {
		return this.field1349;
	}

	public void method2706(int var1) {
		this.field1345 = var1;
		Class188.method3696();
	}

	public int method2695() {
		return this.field1345;
	}

	public void method2634(String var1, int var2) {
		int var4 = this.method2643(var1);
		if (this.field1353.size() >= 10 && !this.field1353.containsKey(var4)) {
			Iterator var5 = this.field1353.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field1353.put(var4, var2);
		Class188.method3696();
	}

	public boolean method2689(String var1) {
		int var3 = this.method2643(var1);
		return this.field1353.containsKey(var3);
	}

	public int method2636(String var1) {
		int var3 = this.method2643(var1);
		return !this.field1353.containsKey(var3) ? 0 : (Integer)this.field1353.get(var3);
	}

	public int method2643(String var1) {
		String var4 = var1.toLowerCase();
		int var5 = var4.length();
		int var6 = 0;

		for (int var7 = 0; var7 < var5; ++var7) {
			var6 = (var6 << 5) - var6 + var4.charAt(var7);
		}

		return var6;
	}

	public void method2638(int var1) {
		this.field1352 = var1;
		if (Client.field3857 != null) {
			Client.field3857.field1283.method5045(Client.field4851.method2679());
		}

		Class188.method3696();
	}

	public int method2679() {
		return this.field1352;
	}
}
