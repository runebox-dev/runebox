import io.runebox.ObfInfo;
import java.net.URL;

@ObfInfo(name = "ez")
public class Class130 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1191249779)
	public static int field1519;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -2111422939)
	public static int field1525;
	@ObfInfo(name = "aq", desc = "Ljava/net/URL;")
	public final URL field1523;
	@ObfInfo(name = "ap", desc = "[B")
	public volatile byte[] field1518;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1821102533)
	public volatile int field1522;

	static {
		field1519 = -1;
		field1525 = -2;
	}

	public Class130(URL var1) {
		this.field1522 = field1519;
		this.field1523 = var1;
	}

	@ObfInfo(name = "aq", desc = "(S)Z", opaque = "1338")
	public boolean method3050() {
		return this.field1522 != field1519;
	}

	@ObfInfo(name = "ad", desc = "(I)[B")
	public byte[] method3051() {
		return this.field1518;
	}

	@ObfInfo(name = "ag", desc = "(I)Ljava/lang/String;")
	public String method3053() {
		return this.field1523.toString();
	}
}
