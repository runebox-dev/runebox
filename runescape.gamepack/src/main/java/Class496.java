import io.runebox.ObfInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "tb")
public class Class496 implements Class486 {
	@ObfInfo(name = "aq", desc = "Ljava/util/Map;")
	public final Map field5052;

	public Class496(Map var1) {
		this.field5052 = var1;
	}

	@ObfInfo(name = "aq", desc = "(B)Lsb;")
	public Class470 method8809() {
		return null;
	}

	@ObfInfo(name = "ad", desc = "(I)[B")
	public byte[] method8805() throws UnsupportedEncodingException {
		return this.method8875().getBytes("UTF-8");
	}

	@ObfInfo(name = "ai", desc = "(I)Ljava/lang/String;", opaque = "603613830")
	public String method8875() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.field5052.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
			String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
			var2.append(var5).append("=").append(var6).append("&");
		}

		if (var2.length() == 0) {
			return "";
		} else {
			var2.deleteCharAt(var2.length() - 1);
			var2.insert(0, "?");
			return var2.toString();
		}
	}
}
