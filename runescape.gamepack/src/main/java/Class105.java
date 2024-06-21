import io.runebox.ObfInfo;
import java.net.URL;

@ObfInfo(name = "ea")
public class Class105 {
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1449664247)
	public static int field1369;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1605744681)
	public static int field1370;
	@ObfInfo(name = "ak", desc = "Ljava/net/URL;")
	public final URL field1375;
	@ObfInfo(name = "af", desc = "[B")
	public volatile byte[] field1373;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1516847857)
	public volatile int field1372;

	static {
		field1370 = -1;
		field1369 = -2;
	}

	public Class105(URL var1) {
		this.field1372 = field1370;
		this.field1375 = var1;
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "1514430916")
	public boolean method2742() {
		return this.field1372 != field1370;
	}

	@ObfInfo(name = "al", desc = "(I)[B")
	public byte[] method2743() {
		return this.field1373;
	}

	@ObfInfo(name = "aj", desc = "(I)Ljava/lang/String;")
	public String method2744() {
		return this.field1375.toString();
	}
}
