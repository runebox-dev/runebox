import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(name = "hb")
public class Class184 {
	@ObfInfo(name = "az", desc = "Lhb;")
	public static final Class184 field1918;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 539899087)
	public int field1917;
	@ObfInfo(name = "al", desc = "Ljava/util/Map;")
	public Map field1916;

	static {
		field1918 = new Class184();
	}

	public Class184() {
		this.field1916 = new HashMap();
		this.field1917 = 0;
	}

	@ObfInfo(name = "al", desc = "(Lorg/json/JSONObject;ILeb;I)V")
	public void method3664(JSONObject var1, int var2, Class106 var3) {
		this.field1916.clear();

		try {
			this.field1917 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var8) {
			return;
		}

		try {
			this.method3672(var1.getJSONArray("crmcomponents"), this.field1917, var3);
		} catch (Exception var7) {
		}
	}

	@ObfInfo(name = "aj", desc = "(Lorg/json/JSONArray;ILeb;I)V", opaque = "-1407371092")
	public void method3672(JSONArray var1, int var2, Class106 var3) throws JSONException {
		if (var1 != null) {
			for (int var5 = 0; var5 < var1.length(); ++var5) {
				JSONObject var6 = var1.getJSONObject(var5);
				if (var6.getString("game").equals("osrs") && !var6.getBoolean("removed")) {
					String var7 = var6.getString("platform");
					if (!var7.equals("mobile") && !var7.equals("android") && !var7.equals("ios")) {
						Class192 var8 = new Class192();

						try {
							var8.method3760(var6, var2, var3);
						} catch (Exception var10) {
						}

						if (!var8.field1980.isEmpty()) {
							String var9 = var6.getString("location");
							this.field1916.put(var9, var8);
						}
					}
				}
			}

			this.field1916 = this.method3666();
			Class327.method3047();
		}
	}

	@ObfInfo(name = "az", desc = "(I)Ljava/util/Map;", opaque = "1030355894")
	public Map method3666() {
		HashMap var2 = new HashMap();
		ArrayList var3 = new ArrayList();
		var3.addAll(this.field1916.entrySet());
		boolean var4 = false;

		while (!var4) {
			var4 = true;

			for (int var6 = 0; var6 < var3.size() - 1; ++var6) {
				if (((Class192)((Entry)var3.get(var6)).getValue()).method3758() > ((Class192)((Entry)var3.get(var6 + 1)).getValue()).method3758()) {
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

	@ObfInfo(name = "af", desc = "(Ljava/lang/String;I)Lhj;")
	public Class192 method3674(String var1) {
		return (Class192)this.field1916.get(var1);
	}
}
