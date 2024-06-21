import io.runebox.ObfInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(name = "hj")
public class Class192 {
	@ObfInfo(name = "ab", desc = "[F")
	public float[] field1979;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -988627865)
	public int field1976;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field1975;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	public String field1980;
	@ObfInfo(name = "az", desc = "Ljava/util/ArrayList;")
	public ArrayList field1977;
	@ObfInfo(name = "af", desc = "Ljava/util/ArrayList;")
	public ArrayList field1978;
	@ObfInfo(name = "aa", desc = "Ljava/util/ArrayList;")
	public ArrayList field1981;
	@ObfInfo(name = "ao", desc = "Ljava/util/Map;")
	public Map field1983;
	@ObfInfo(name = "ac", desc = "Ljava/util/Map;")
	public Map field1984;

	public Class192() {
		this.field1976 = 0;
		this.field1977 = new ArrayList();
		this.field1978 = new ArrayList();
		this.field1981 = new ArrayList();
		this.field1980 = null;
		this.field1979 = new float[4];
		this.field1984 = new HashMap();
		this.field1983 = new HashMap();
	}

	@ObfInfo(name = "ak", desc = "(I)Ljava/lang/String;")
	public String method3768() {
		return this.field1975;
	}

	@ObfInfo(name = "al", desc = "(B)I")
	public int method3758() {
		return this.field1976;
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public void method3759() {
		this.field1980 = null;
		this.field1979[0] = 0.0F;
		this.field1979[1] = 0.0F;
		this.field1979[2] = 1.0F;
		this.field1979[3] = 1.0F;
		this.field1977.clear();
		this.field1978.clear();
		this.field1981.clear();
		this.field1984.clear();
		this.field1983.clear();
	}

	@ObfInfo(name = "az", desc = "(Lorg/json/JSONObject;ILeb;B)Z", opaque = "16")
	public boolean method3760(JSONObject var1, int var2, Class106 var3) {
		JSONObject var5 = var1;
		if (var2 < 2) {
			try {
				var5 = var1.getJSONObject("message");
			} catch (Exception var14) {
				this.method3759();
				return false;
			}

			try {
				this.method3780(var5.getJSONArray("images"), var3);
			} catch (Exception var13) {
				this.field1978.clear();
			}

			try {
				this.method3757(var5.getJSONArray("labels"));
			} catch (Exception var12) {
				this.field1981.clear();
			}
		} else {
			try {
				this.method3762(var1.getJSONObject("image"), var3);
			} catch (Exception var11) {
				this.field1978.clear();
			}

			try {
				this.method3775(var1.getJSONObject("label"));
			} catch (Exception var10) {
				this.field1981.clear();
			}
		}

		try {
			this.method3765(var5.getJSONObject("behaviour"));
		} catch (Exception var9) {
			this.field1980 = null;
			this.field1979[0] = 0.0F;
			this.field1979[1] = 0.0F;
			this.field1979[2] = 1.0F;
			this.field1979[3] = 1.0F;
			this.field1977.clear();
		}

		try {
			JSONObject var6 = var5.optJSONObject("meta");
			if (var6 != null) {
				this.method3766(var5.getJSONObject("meta"));
			}
		} catch (Exception var8) {
			this.field1984.clear();
			this.field1983.clear();
		}

		if (var2 == 2) {
			try {
				this.field1975 = var5.getString("id");
				this.field1976 = Integer.parseInt(var5.getString("priority"));
			} catch (Exception var7) {
			}
		}

		return true;
	}

	@ObfInfo(name = "af", desc = "(Lorg/json/JSONArray;Leb;I)V", opaque = "1588494880")
	public void method3780(JSONArray var1, Class106 var2) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					Class161 var6 = new Class161(this);
					var6.field1797 = var2.method2759(new URL(var5.getString("src")));
					var6.field1796 = method3838(var5, "placement");
					this.field1978.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	@ObfInfo(name = "aa", desc = "(Lorg/json/JSONObject;Leb;I)V")
	public void method3762(JSONObject var1, Class106 var2) throws JSONException {
		try {
			Class161 var4 = new Class161(this);
			var4.field1797 = var2.method2759(new URL(var1.getString("src")));
			var4.field1796 = method3838(var1, "placement");
			this.field1978.add(var4);
		} catch (MalformedURLException var5) {
		}

	}

	@ObfInfo(name = "at", desc = "(Lorg/json/JSONArray;I)V", opaque = "-682908171")
	public void method3757(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				Class189 var5 = new Class189(this);
				var5.field1947 = var4.getString("text");
				var5.field1946 = method5324(var4.getString("align_x"));
				var5.field1952 = method5324(var4.getString("align_y"));
				var5.field1948 = var4.getInt("font");
				var5.field1944 = method3838(var4, "placement");
				this.field1981.add(var5);
			}

		}
	}

	@ObfInfo(name = "ab", desc = "(Lorg/json/JSONObject;B)V")
	public void method3775(JSONObject var1) throws JSONException {
		Class189 var3 = new Class189(this);
		var3.field1947 = var1.optString("text");
		var3.field1946 = method5324(var1.optString("align_x"));
		var3.field1952 = method5324(var1.optString("align_y"));
		var3.field1948 = var1.optInt("font");
		var3.field1944 = method3838(var1, "placement");
		this.field1981.add(var3);
	}

	@ObfInfo(name = "ac", desc = "(Lorg/json/JSONObject;I)V", opaque = "-1311565037")
	public void method3765(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1979 = method3838(var1, "clickbounds");
			this.field1980 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field1977.add(new Class177(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field1977.add(new Class177(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field1977.add(new Class177(this, var3[var4], 0));
							} else {
								this.field1977.add(new Class195(this, var3[var4], var6));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfInfo(name = "ao", desc = "(Lorg/json/JSONObject;I)V", opaque = "819713535")
	public void method3766(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.optInt(var3[var4]);
				this.field1984.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.optString(var3[var4]);
					if (var6.equals("true")) {
						this.field1984.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field1984.put(var3[var4], 0);
					} else {
						this.field1983.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfInfo(name = "at", desc = "(II)I", opaque = "-829713781")
	public static int method3791(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var2 + var0;
	}

	@ObfInfo(owner = "hm", name = "ah", desc = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
	public static float[] method3838(JSONObject var0, String var1) throws JSONException {
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

	@ObfInfo(owner = "kf", name = "av", desc = "(Ljava/lang/String;B)I", opaque = "2")
	public static int method5324(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
