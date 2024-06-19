import java.net.URL;

public class Class105 {
	public static int field1369;
	public static int field1370;
	public final URL field1375;
	public volatile byte[] field1373;
	public volatile int field1372;

	static {
		field1370 = -1;
		field1369 = -2;
	}

	public Class105(URL var1) {
		this.field1372 = field1370;
		this.field1375 = var1;
	}

	public boolean method2742() {
		return this.field1372 != field1370;
	}

	public byte[] method2743() {
		return this.field1373;
	}

	public String method2744() {
		return this.field1375.toString();
	}
}
