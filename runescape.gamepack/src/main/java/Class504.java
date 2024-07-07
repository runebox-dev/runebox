import io.runebox.ObfInfo;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(name = "tj")
public class Class504 implements Class486 {
	@ObfInfo(name = "ad", desc = "Lorg/json/JSONObject;")
	public JSONObject field5082;

	public Class504(JSONObject var1) {
		this.field5082 = var1;
	}

	public Class504(String var1) throws UnsupportedEncodingException {
		this.method8934(var1);
	}

	public Class504(byte[] var1) throws UnsupportedEncodingException {
		this.method8951(var1);
	}

	@ObfInfo(name = "aq", desc = "(B)Lsb;")
	public Class470 method8809() {
		return Class470.field4947;
	}

	@ObfInfo(name = "ai", desc = "([BI)V")
	public void method8951(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method8934(var3);
	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/String;I)V", opaque = "-942418922")
	public void method8934(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field5082 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field5082 = new JSONObject();
				this.field5082.put("arrayValues", (Object)var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	@ObfInfo(name = "au", desc = "(B)Lorg/json/JSONObject;")
	public JSONObject method8935() {
		return this.field5082;
	}

	@ObfInfo(name = "ad", desc = "(I)[B", opaque = "524737236")
	public byte[] method8805() throws UnsupportedEncodingException {
		return this.field5082 == null ? new byte[0] : this.field5082.toString().getBytes("UTF-8");
	}
}
