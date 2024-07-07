import io.runebox.ObfInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "tw")
public class Class517 implements Class476 {
	@ObfInfo(name = "ak", desc = "Ljava/util/Map;")
	public final Map field5200;

	public Class517(Map var1) {
		this.field5200 = var1;
	}

	@ObfInfo(name = "ak", desc = "(B)Lsd;")
	public Class472 method8712() {
		return null;
	}

	@ObfInfo(name = "al", desc = "(B)[B")
	public byte[] method8711() throws UnsupportedEncodingException {
		return this.method9346().getBytes("UTF-8");
	}

	@ObfInfo(name = "ac", desc = "(B)Ljava/lang/String;", opaque = "1")
	public String method9346() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.field5200.entrySet().iterator();

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
