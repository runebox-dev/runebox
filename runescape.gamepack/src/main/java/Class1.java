import io.runebox.ObfInfo;
import java.io.IOException;
import java.util.concurrent.Callable;

@ObfInfo(name = "aa")
public class Class1 implements Callable {
	// $FF: synthetic field
	public final Class24 this$0;
	@ObfInfo(name = "aq", desc = "Lae;")
	public final Class5 field5;

	public Class1(Class24 var1, Class5 var2) {
		this.this$0 = var1;
		this.field5 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field5.method46()) {
				Class336.method3895(10L);
			}
		} catch (IOException var2) {
			return new Class19("Error servicing REST query: " + var2.getMessage());
		}

		return this.field5.method47();
	}
}
