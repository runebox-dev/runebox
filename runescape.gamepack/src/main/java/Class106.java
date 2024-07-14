import io.runebox.ObfInfo;
import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "eb")
public class Class106 {
	@ObfInfo(name = "an", desc = "Z")
	public boolean field1365;
	@ObfInfo(name = "ag", desc = "[Z")
	public boolean[] field1367;
	/** @deprecated */
	@Deprecated
	@ObfInfo(name = "ap", desc = "[Ljava/lang/String;")
	public String[] field1364;
	@ObfInfo(name = "ak", desc = "Ljava/util/Map;")
	public Map field1363;
	@ObfInfo(name = "aj", desc = "J", longMultiplier = 8608497769085740539L)
	public long field1366;

	public Class106() {
		this.field1365 = false;
		int var1 = Client.field857.method7144(19);
		this.field1363 = new HashMap();
		this.field1367 = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			Class200 var4 = (Class200)Class200.field2203.method6327((long)var2);
			Class200 var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = Client.field3658.method7132(19, var2);
				var4 = new Class200();
				if (var5 != null) {
					var4.method3979(new Class562(var5));
				}

				Class200.field2203.method6330(var4, (long)var2);
				var3 = var4;
			}

			this.field1367[var2] = var3.field2202;
		}

		var2 = 0;
		if (Client.field857.method7295(15)) {
			var2 = Client.field857.method7144(15);
		}

		this.field1364 = new String[var2];
		this.method2809();
	}

	@ObfInfo(name = "aq", desc = "(IIB)V")
	public void method2800(int var1, int var2) {
		this.field1363.put(var1, var2);
		if (this.field1367[var1]) {
			this.field1365 = true;
		}

	}

	@ObfInfo(name = "ad", desc = "(IB)I", opaque = "101")
	public int method2841(int var1) {
		Object var3 = this.field1363.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	@ObfInfo(name = "ag", desc = "(ILjava/lang/String;I)V")
	public void method2802(int var1, String var2) {
		this.field1363.put(var1, var2);
	}

	@ObfInfo(name = "ak", desc = "(II)Ljava/lang/String;", opaque = "-1141305685")
	public String method2820(int var1) {
		Object var3 = this.field1363.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	/** @deprecated */
	@Deprecated
	@ObfInfo(name = "ap", desc = "(ILjava/lang/String;I)V")
	public void method2804(int var1, String var2) {
		this.field1364[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfInfo(name = "an", desc = "(IB)Ljava/lang/String;")
	public String method2805(int var1) {
		return this.field1364[var1];
	}

	@ObfInfo(name = "aj", desc = "(I)V", opaque = "-337642526")
	public void method2806() {
		int var2;
		for (var2 = 0; var2 < this.field1367.length; ++var2) {
			if (!this.field1367[var2]) {
				this.field1363.remove(var2);
			}
		}

		for (var2 = 0; var2 < this.field1364.length; ++var2) {
			this.field1364[var2] = null;
		}

	}

	@ObfInfo(name = "av", desc = "(ZI)Lus;")
	public Class539 method2834(boolean var1) {
		return Class211.method2856("2", Client.field1425.field4406, var1);
	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "-836265128")
	public void method2808() {
		Class539 var2 = this.method2834(true);

		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.field1363.entrySet().iterator();

			while (var5.hasNext()) {
				Entry var6 = (Entry)var5.next();
				int var7 = (Integer)var6.getKey();
				if (this.field1367[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					} else if (var8 instanceof String) {
						var3 += Class562.method2698((String)var8);
					}

					++var4;
				}
			}

			Class562 var25 = new Class562(var3);
			var25.method9809(2);
			var25.method9810(var4);
			Iterator var26 = this.field1363.entrySet().iterator();

			label143:
			while (true) {
				Entry var27;
				int var28;
				do {
					if (!var26.hasNext()) {
						var2.method9486(var25.field5472, 0, var25.field5471);
						break label143;
					}

					var27 = (Entry)var26.next();
					var28 = (Integer)var27.getKey();
				} while(!this.field1367[var28]);

				var25.method9810(var28);
				Object var9 = var27.getValue();
				Class var11 = var9.getClass();
				Class525[] var12 = Class525.method9304();
				int var13 = 0;

				Class525 var10;
				while (true) {
					if (var13 >= var12.length) {
						var10 = null;
						break;
					}

					Class525 var14 = var12[var13];
					if (var14.field5251 == var11) {
						var10 = var14;
						break;
					}

					++var13;
				}

				var25.method9809(var10.field5248);
				Class525.method9296(var9, var25);
			}
		} catch (Exception var23) {
		} finally {
			try {
				var2.method9481();
			} catch (Exception var22) {
			}

		}

		this.field1365 = false;
		this.field1366 = Class329.method4953();
	}

	@ObfInfo(name = "ai", desc = "(B)V", opaque = "1")
	public void method2809() {
		Class539 var2 = this.method2834(false);

		label220: {
			try {
				byte[] var3 = new byte[(int)var2.method9483()];

				int var5;
				for (int var4 = 0; var4 < var3.length; var4 += var5) {
					var5 = var2.method9499(var3, var4, var3.length - var4);
					if (var5 == -1) {
						throw new EOFException();
					}
				}

				Class562 var25 = new Class562(var3);
				if (var25.field5472.length - var25.field5471 >= 1) {
					int var6 = var25.method9902();
					if (var6 < 0 || var6 > 2) {
						return;
					}

					int var7;
					int var8;
					int var9;
					int var10;
					if (var6 >= 2) {
						var7 = var25.method9997();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label220;
							}

							var9 = var25.method9997();
							var10 = var25.method9902();
							Class525 var11 = (Class525)Class406.method4071(Class525.method9304(), var10);
							Object var12 = var11.method9298(var25);
							if (var9 >= 0 && var9 < this.field1367.length && this.field1367[var9]) {
								this.field1363.put(var9, var12);
							}

							++var8;
						}
					} else {
						var7 = var25.method9997();

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var25.method9997();
							var10 = var25.method9832();
							if (var9 >= 0 && var9 < this.field1367.length && this.field1367[var9]) {
								this.field1363.put(var9, var10);
							}
						}

						var8 = var25.method9997();
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								break label220;
							}

							var25.method9997();
							var25.method9837();
							++var9;
						}
					}
				}
			} catch (Exception var23) {
				break label220;
			} finally {
				try {
					var2.method9481();
				} catch (Exception var22) {
				}

			}

			return;
		}

		this.field1365 = false;
	}

	@ObfInfo(name = "ae", desc = "(I)V", opaque = "1313184529")
	public void method2810() {
		if (this.field1365 && this.field1366 < Class329.method4953() - 60000L) {
			this.method2808();
		}

	}

	@ObfInfo(name = "au", desc = "(B)Z")
	public boolean method2811() {
		return this.field1365;
	}
}
