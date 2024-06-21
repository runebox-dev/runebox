import io.runebox.ObfInfo;
import java.io.IOException;
import java.util.concurrent.Callable;

@ObfInfo(name = "aw")
public class Class23 implements Callable {
	// $FF: synthetic field
	@ObfInfo(desc = "Lae;")
	public final Class5 this$0;
	@ObfInfo(name = "ak", desc = "Lah;")
	public final Class8 field123;

	public Class23(Class5 var1, Class8 var2) {
		this.this$0 = var1;
		this.field123 = var2;
	}

	@ObfInfo(desc = "()Ljava/lang/Object;")
	public Object call() throws Exception {
		try {
			while (this.field123.method128()) {
				Class493.method8960(10L);
			}
		} catch (IOException var2) {
			return new Class4("Error servicing REST query: " + var2.getMessage());
		}

		return this.field123.method115();
	}
}
