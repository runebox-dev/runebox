import io.runebox.ObfInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(name = "if")
public class Class214 {
	@ObfInfo(name = "av", desc = "[F")
	public float[] field2328;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1097199299)
	public int field2323;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public String field2321;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field2322;
	@ObfInfo(name = "an", desc = "Ljava/util/ArrayList;")
	public ArrayList field2324;
	@ObfInfo(name = "ap", desc = "Ljava/util/ArrayList;")
	public ArrayList field2325;
	@ObfInfo(name = "ak", desc = "Ljava/util/ArrayList;")
	public ArrayList field2327;
	@ObfInfo(name = "ai", desc = "Ljava/util/Map;")
	public Map field2326;
	@ObfInfo(name = "ab", desc = "Ljava/util/Map;")
	public Map field2330;

	public Class214() {
		this.field2323 = 0;
		this.field2327 = new ArrayList();
		this.field2325 = new ArrayList();
		this.field2324 = new ArrayList();
		this.field2321 = null;
		this.field2328 = new float[4];
		this.field2330 = new HashMap();
		this.field2326 = new HashMap();
	}

	@ObfInfo(name = "aq", desc = "(I)Ljava/lang/String;")
	public String method4099() {
		return this.field2322;
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method4106() {
		return this.field2323;
	}

	@ObfInfo(name = "ag", desc = "(B)V")
	public void method4102() {
		this.field2321 = null;
		this.field2328[0] = 0.0F;
		this.field2328[1] = 0.0F;
		this.field2328[2] = 1.0F;
		this.field2328[3] = 1.0F;
		this.field2327.clear();
		this.field2325.clear();
		this.field2324.clear();
		this.field2330.clear();
		this.field2326.clear();
	}

	@ObfInfo(name = "ak", desc = "(Lorg/json/JSONObject;ILea;I)Z", opaque = "-475235477")
	public boolean method4094(JSONObject var1, int var2, Class105 var3) {
		JSONObject var5 = var1;
		if (var2 < 2) {
			try {
				var5 = var1.getJSONObject("message");
			} catch (Exception var14) {
				this.method4102();
				return false;
			}

			try {
				this.method4095(var5.getJSONArray("images"), var3);
			} catch (Exception var13) {
				this.field2325.clear();
			}

			try {
				this.method4097(var5.getJSONArray("labels"));
			} catch (Exception var12) {
				this.field2324.clear();
			}
		} else {
			try {
				this.method4096(var1.getJSONObject("image"), var3);
			} catch (Exception var11) {
				this.field2325.clear();
			}

			try {
				this.method4098(var1.getJSONObject("label"));
			} catch (Exception var10) {
				this.field2324.clear();
			}
		}

		try {
			this.method4117(var5.getJSONObject("behaviour"));
		} catch (Exception var9) {
			this.field2321 = null;
			this.field2328[0] = 0.0F;
			this.field2328[1] = 0.0F;
			this.field2328[2] = 1.0F;
			this.field2328[3] = 1.0F;
			this.field2327.clear();
		}

		try {
			JSONObject var6 = var5.optJSONObject("meta");
			if (var6 != null) {
				this.method4100(var5.getJSONObject("meta"));
			}
		} catch (Exception var8) {
			this.field2330.clear();
			this.field2326.clear();
		}

		if (var2 == 2) {
			try {
				this.field2322 = var5.getString("id");
				this.field2323 = Integer.parseInt(var5.getString("priority"));
			} catch (Exception var7) {
			}
		}

		return true;
	}

	@ObfInfo(name = "ap", desc = "(Lorg/json/JSONArray;Lea;I)V", opaque = "1403254671")
	public void method4095(JSONArray var1, Class105 var2) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					Class229 var6 = new Class229(this);
					var6.field2466 = var2.method2781(new URL(var5.getString("src")));
					var6.field2464 = method6324(var5, "placement");
					this.field2325.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	@ObfInfo(name = "an", desc = "(Lorg/json/JSONObject;Lea;I)V")
	public void method4096(JSONObject var1, Class105 var2) throws JSONException {
		try {
			Class229 var4 = new Class229(this);
			var4.field2466 = var2.method2781(new URL(var1.getString("src")));
			var4.field2464 = method6324(var1, "placement");
			this.field2325.add(var4);
		} catch (MalformedURLException var5) {
		}

	}

	@ObfInfo(name = "aj", desc = "(Lorg/json/JSONArray;I)V", opaque = "-1391800200")
	public void method4097(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				Class209 var5 = new Class209(this);
				var5.field2269 = var4.getString("text");
				var5.field2270 = Class233.method4448(var4.getString("align_x"));
				var5.field2272 = Class233.method4448(var4.getString("align_y"));
				var5.field2273 = var4.getInt("font");
				var5.field2267 = method6324(var4, "placement");
				this.field2324.add(var5);
			}

		}
	}

	@ObfInfo(name = "av", desc = "(Lorg/json/JSONObject;I)V")
	public void method4098(JSONObject var1) throws JSONException {
		Class209 var3 = new Class209(this);
		var3.field2269 = var1.optString("text");
		var3.field2270 = Class233.method4448(var1.optString("align_x"));
		var3.field2272 = Class233.method4448(var1.optString("align_y"));
		var3.field2273 = var1.optInt("font");
		var3.field2267 = method6324(var1, "placement");
		this.field2324.add(var3);
	}

	@ObfInfo(name = "ab", desc = "(Lorg/json/JSONObject;I)V", opaque = "-1047748750")
	public void method4117(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2328 = method6324(var1, "clickbounds");
			this.field2321 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field2327.add(new Class225(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field2327.add(new Class225(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field2327.add(new Class225(this, var3[var4], 0));
							} else {
								this.field2327.add(new Class233(this, var3[var4], var6));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfInfo(name = "ai", desc = "(Lorg/json/JSONObject;I)V", opaque = "2061659124")
	public void method4100(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.optInt(var3[var4]);
				this.field2330.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.optString(var3[var4]);
					if (var6.equals("true")) {
						this.field2330.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field2330.put(var3[var4], 0);
					} else {
						this.field2326.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfInfo(owner = "mn", name = "ae", desc = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
	public static float[] method6324(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];

		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float)var4.optDouble(0, 0.0D);
			var3[1] = (float)var4.optDouble(1, 0.0D);
			var3[2] = (float)var4.optDouble(2, 1.0D);
			var3[3] = (float)var4.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}

		return var3;
	}
}
