import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(name = "il")
public class Class220 {
	@ObfInfo(name = "ak", desc = "Lil;")
	public static final Class220 field2395;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1357104911)
	public int field2396;
	@ObfInfo(name = "ad", desc = "Ljava/util/Map;")
	public Map field2398;

	static {
		field2395 = new Class220();
	}

	public Class220() {
		this.field2398 = new HashMap();
		this.field2396 = 0;
	}

	@ObfInfo(name = "aq", desc = "(Lorg/json/JSONObject;ILea;I)V")
	public void method4247(JSONObject var1, int var2, Class105 var3) {
		this.field2398.clear();

		try {
			this.field2396 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var8) {
			return;
		}

		try {
			this.method4243(var1.getJSONArray("crmcomponents"), this.field2396, var3);
		} catch (Exception var7) {
		}
	}

	@ObfInfo(name = "ad", desc = "(Lorg/json/JSONArray;ILea;B)V", opaque = "17")
	public void method4243(JSONArray var1, int var2, Class105 var3) throws JSONException {
		if (var1 != null) {
			for (int var5 = 0; var5 < var1.length(); ++var5) {
				JSONObject var6 = var1.getJSONObject(var5);
				if (var6.getString("game").equals("osrs") && !var6.getBoolean("removed")) {
					String var7 = var6.getString("platform");
					if (!var7.equals("mobile") && !var7.equals("android") && !var7.equals("ios")) {
						Class214 var8 = new Class214();

						try {
							var8.method4094(var6, var2, var3);
						} catch (Exception var10) {
						}

						if (!var8.field2321.isEmpty()) {
							String var9 = var6.getString("location");
							this.field2398.put(var9, var8);
						}
					}
				}
			}

			this.field2398 = this.method4239();
			Class329.method4953();
		}
	}

	@ObfInfo(name = "ag", desc = "(B)Ljava/util/Map;", opaque = "0")
	public Map method4239() {
		HashMap var2 = new HashMap();
		ArrayList var3 = new ArrayList();
		var3.addAll(this.field2398.entrySet());
		boolean var4 = false;

		while (!var4) {
			var4 = true;

			for (int var6 = 0; var6 < var3.size() - 1; ++var6) {
				if (((Class214)((Entry)var3.get(var6)).getValue()).method4106() > ((Class214)((Entry)var3.get(var6 + 1)).getValue()).method4106()) {
					Entry var5 = (Entry)var3.get(var6);
					var3.set(var6, var3.get(var6 + 1));
					var3.set(var6 + 1, var5);
					var4 = false;
				}
			}
		}

		Iterator var8 = var3.iterator();

		while (var8.hasNext()) {
			Entry var7 = (Entry)var8.next();
			var2.put(var7.getKey(), var7.getValue());
		}

		return var2;
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;S)Lif;")
	public Class214 method4240(String var1) {
		return (Class214)this.field2398.get(var1);
	}

	@ObfInfo(name = "cr", desc = "([BS)[B", opaque = "4008")
	public static byte[] method4249(byte[] var0) {
		Class562 var2 = new Class562(var0);
		int var3 = var2.method9902();
		int var4 = var2.method9832();
		if (var4 < 0 || Class375.field4461 != 0 && var4 > Class375.field4461) {
			throw new RuntimeException();
		} else if (var3 == 0) {
			byte[] var7 = new byte[var4];
			var2.method9840(var7, 0, var4);
			return var7;
		} else {
			int var5 = var2.method9832();
			if (var5 < 0 || Class375.field4461 != 0 && var5 > Class375.field4461) {
				throw new RuntimeException();
			} else {
				byte[] var6 = new byte[var5];
				if (var3 == 1) {
					Class548.method9558(var6, var5, var0, var4, 9);
				} else {
					Class375.field4457.method9768(var2, var6);
				}

				return var6;
			}
		}
	}
}
