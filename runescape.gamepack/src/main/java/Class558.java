import io.runebox.ObfInfo;
import java.util.zip.Inflater;

@ObfInfo(name = "vl")
public class Class558 {
	@ObfInfo(name = "aq", desc = "Ljava/util/zip/Inflater;")
	public Inflater field5449;

	public Class558() {
		this(-1, 1000000, 1000000);
	}

	public Class558(int var1, int var2, int var3) {
	}

	@ObfInfo(name = "aq", desc = "(Lvp;[BI)V", opaque = "1659372412")
	public void method9768(Class562 var1, byte[] var2) {
		if (31 == var1.field5472[var1.field5471] && -117 == var1.field5472[var1.field5471 + 1]) {
			if (this.field5449 == null) {
				this.field5449 = new Inflater(true);
			}

			try {
				this.field5449.setInput(var1.field5472, 10 + var1.field5471, var1.field5472.length - (8 + var1.field5471 + 10));
				this.field5449.inflate(var2);
			} catch (Exception var5) {
				this.field5449.reset();
				throw new RuntimeException("");
			}

			this.field5449.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
