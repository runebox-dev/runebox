import io.runebox.ObfInfo;
import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "ef")
public class Class110 {
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field1404;
	@ObfInfo(name = "aj", desc = "[Z")
	public boolean[] field1411;
	/** @deprecated */
	@Deprecated
	@ObfInfo(name = "af", desc = "[Ljava/lang/String;")
	public String[] field1407;
	@ObfInfo(name = "az", desc = "Ljava/util/Map;")
	public Map field1409;
	@ObfInfo(name = "at", desc = "J", longMultiplier = -8668677638035651351L)
	public long field1406;

	public Class110() {
		this.field1404 = false;
		int var1 = Client.field3018.method7237(19);
		this.field1409 = new HashMap();
		this.field1411 = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			Class193 var3 = Class193.method3071(var2);
			this.field1411[var2] = var3.field1987;
		}

		var2 = 0;
		if (Client.field3018.method7318(15)) {
			var2 = Client.field3018.method7237(15);
		}

		this.field1407 = new String[var2];
		this.method2823();
	}

	@ObfInfo(name = "ak", desc = "(IIB)V", opaque = "8")
	public void method2814(int var1, int var2) {
		this.field1409.put(var1, var2);
		if (this.field1411[var1]) {
			this.field1404 = true;
		}

	}

	@ObfInfo(name = "al", desc = "(II)I", opaque = "-1193056385")
	public int method2813(int var1) {
		Object var3 = this.field1409.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	@ObfInfo(name = "aj", desc = "(ILjava/lang/String;I)V")
	public void method2828(int var1, String var2) {
		this.field1409.put(var1, var2);
	}

	@ObfInfo(name = "az", desc = "(II)Ljava/lang/String;", opaque = "-2091802094")
	public String method2854(int var1) {
		Object var3 = this.field1409.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	/** @deprecated */
	@Deprecated
	@ObfInfo(name = "af", desc = "(ILjava/lang/String;I)V")
	public void method2815(int var1, String var2) {
		this.field1407[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfInfo(name = "aa", desc = "(II)Ljava/lang/String;")
	public String method2819(int var1) {
		return this.field1407[var1];
	}

	@ObfInfo(name = "at", desc = "(I)V", opaque = "-827452952")
	public void method2820() {
		int var2;
		for (var2 = 0; var2 < this.field1411.length; ++var2) {
			if (!this.field1411[var2]) {
				this.field1409.remove(var2);
			}
		}

		for (var2 = 0; var2 < this.field1407.length; ++var2) {
			this.field1407[var2] = null;
		}

	}

	@ObfInfo(name = "ab", desc = "(ZB)Lue;")
	public Class525 method2817(boolean var1) {
		return Class179.method2980("2", Client.field1497.field4550, var1);
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaque = "2114717116")
	public void method2821() {
		Class525 var2 = this.method2817(true);

		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.field1409.entrySet().iterator();

			while (var5.hasNext()) {
				Entry var6 = (Entry)var5.next();
				int var7 = (Integer)var6.getKey();
				if (this.field1411[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					} else if (var8 instanceof String) {
						var3 += Class521.method7983((String)var8);
					}

					++var4;
				}
			}

			Class521 var29 = new Class521(var3);
			var29.method9388(2);
			var29.method9389(var4);
			Iterator var30 = this.field1409.entrySet().iterator();

			label175:
			while (true) {
				int var32;
				Entry var31;
				do {
					if (!var30.hasNext()) {
						var2.method9668(var29.field5221, 0, var29.field5219);
						break label175;
					}

					var31 = (Entry)var30.next();
					var32 = (Integer)var31.getKey();
				} while(!this.field1411[var32]);

				var29.method9389(var32);
				Object var9 = var31.getValue();
				Class var11 = var9.getClass();
				Class545[] var12 = Class545.method9900();
				int var13 = 0;

				Class545 var10;
				while (true) {
					if (var13 >= var12.length) {
						var10 = null;
						break;
					}

					Class545 var14 = var12[var13];
					if (var14.field5338 == var11) {
						var10 = var14;
						break;
					}

					++var13;
				}

				var29.method9388(var10.field5341);
				Class var34 = var9.getClass();
				Class545[] var16 = Class545.method9900();
				int var17 = 0;

				Class545 var15;
				while (true) {
					if (var17 >= var16.length) {
						var15 = null;
						break;
					}

					Class545 var18 = var16[var17];
					if (var18.field5338 == var34) {
						var15 = var18;
						break;
					}

					++var17;
				}

				if (var15 == null) {
					throw new IllegalArgumentException();
				}

				Class529 var33 = var15.field5339;
				var33.method9645(var9, var29);
			}
		} catch (Exception var27) {
		} finally {
			try {
				var2.method9672();
			} catch (Exception var26) {
			}

		}

		this.field1404 = false;
		this.field1406 = Class130.method3047();
	}

	@ObfInfo(name = "ao", desc = "(B)V", opaque = "0")
	public void method2823() {
		Class525 var2 = this.method2817(false);

		label220: {
			try {
				byte[] var3 = new byte[(int)var2.method9674()];

				int var5;
				for (int var4 = 0; var4 < var3.length; var4 += var5) {
					var5 = var2.method9682(var3, var4, var3.length - var4);
					if (var5 == -1) {
						throw new EOFException();
					}
				}

				Class521 var25 = new Class521(var3);
				if (var25.field5221.length - var25.field5219 >= 1) {
					int var6 = var25.method9405();
					if (var6 < 0 || var6 > 2) {
						return;
					}

					int var7;
					int var8;
					int var9;
					int var10;
					if (var6 >= 2) {
						var7 = var25.method9407();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label220;
							}

							var9 = var25.method9407();
							var10 = var25.method9405();
							Class545 var11 = (Class545)Class62.method1112(Class545.method9900(), var10);
							Object var12 = var11.method9893(var25);
							if (var9 >= 0 && var9 < this.field1411.length && this.field1411[var9]) {
								this.field1409.put(var9, var12);
							}

							++var8;
						}
					} else {
						var7 = var25.method9407();

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var25.method9407();
							var10 = var25.method9410();
							if (var9 >= 0 && var9 < this.field1411.length && this.field1411[var9]) {
								this.field1409.put(var9, var10);
							}
						}

						var8 = var25.method9407();
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								break label220;
							}

							var25.method9407();
							var25.method9415();
							++var9;
						}
					}
				}
			} catch (Exception var23) {
				break label220;
			} finally {
				try {
					var2.method9672();
				} catch (Exception var22) {
				}

			}

			return;
		}

		this.field1404 = false;
	}

	@ObfInfo(name = "ah", desc = "(I)V", opaque = "-1273488440")
	public void method2839() {
		if (this.field1404 && this.field1406 < Class130.method3047() - 60000L) {
			this.method2821();
		}

	}

	@ObfInfo(name = "av", desc = "(I)Z")
	public boolean method2848() {
		return this.field1404;
	}
}
