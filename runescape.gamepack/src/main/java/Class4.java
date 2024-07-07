import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "ad")
public class Class4 implements Callable {
	@ObfInfo(name = "ad", desc = "Lak;")
	public final Class11 field13;
	// $FF: synthetic field
	public final Class22 this$0;
	@ObfInfo(name = "aq", desc = "Lvp;")
	public final Class562 field11;

	public Class4(Class22 var1, Class562 var2, Class11 var3) {
		this.this$0 = var1;
		this.field11 = var2;
		this.field13 = var3;
	}

	public Object call() {
		return this.field13.method149(this.field11);
	}
}
