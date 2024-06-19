import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Class490 implements Class476 {
	public JSONObject field5000;

	public Class490(JSONObject var1) {
		this.field5000 = var1;
	}

	public Class490(String var1) throws UnsupportedEncodingException {
		this.method8937(var1);
	}

	public Class490(byte[] var1) throws UnsupportedEncodingException {
		this.method8951(var1);
	}

	public Class472 method8712() {
		return Class472.field4924;
	}

	public void method8951(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method8937(var3);
	}

	public void method8937(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field5000 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field5000 = new JSONObject();
				this.field5000.put("arrayValues", (Object)var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	public JSONObject method8942() {
		return this.field5000;
	}

	public byte[] method8711() throws UnsupportedEncodingException {
		return this.field5000 == null ? new byte[0] : this.field5000.toString().getBytes("UTF-8");
	}
}
