import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Class195 extends Class202 {
	public String field2009;
	// $FF: synthetic field
	public final Class192 this$0;

	public Class195(Class192 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2009 = var3;
	}

	public int method3591() {
		return 1;
	}

	public String method3835() {
		return this.field2009;
	}

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
}
