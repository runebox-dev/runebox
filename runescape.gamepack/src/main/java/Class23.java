import java.io.IOException;
import java.util.concurrent.Callable;

public class Class23 implements Callable {
	// $FF: synthetic field
	public final Class5 this$0;
	public final Class8 field123;

	public Class23(Class5 var1, Class8 var2) {
		this.this$0 = var1;
		this.field123 = var2;
	}

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