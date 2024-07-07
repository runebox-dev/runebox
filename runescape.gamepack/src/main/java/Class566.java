import io.runebox.ObfInfo;
import java.util.zip.Inflater;

@ObfInfo(name = "vu")
public class Class566 {
	@ObfInfo(name = "ak", desc = "Ljava/util/zip/Inflater;")
	public Inflater field5476;

	public Class566() {
		this(-1, 1000000, 1000000);
	}

	public Class566(int var1, int var2, int var3) {
	}

	@ObfInfo(name = "ak", desc = "(Lua;[BB)V", opaque = "1")
	public void method10256(Class521 var1, byte[] var2) {
		if (31 == var1.field5221[var1.field5219] && var1.field5221[var1.field5219 + 1] == -117) {
			if (this.field5476 == null) {
				this.field5476 = new Inflater(true);
			}

			try {
				this.field5476.setInput(var1.field5221, 10 + var1.field5219, var1.field5221.length - (8 + 10 + var1.field5219));
				this.field5476.inflate(var2);
			} catch (Exception var5) {
				this.field5476.reset();
				throw new RuntimeException("");
			}

			this.field5476.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
