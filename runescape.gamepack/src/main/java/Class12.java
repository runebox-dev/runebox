import io.runebox.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "al")
public class Class12 implements Callable {
	// $FF: synthetic field
	public final Class2 this$0;
	@ObfInfo(name = "al", desc = "Laz;")
	public final Class26 field50;
	@ObfInfo(name = "ak", desc = "Lua;")
	public final Class521 field51;

	public Class12(Class2 var1, Class521 var2, Class26 var3) {
		this.this$0 = var1;
		this.field51 = var2;
		this.field50 = var3;
	}

	public Object call() {
		return this.field50.method147(this.field51);
	}
}
