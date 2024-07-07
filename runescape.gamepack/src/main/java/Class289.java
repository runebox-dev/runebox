import io.runebox.ObfInfo;
import java.lang.ref.SoftReference;

@ObfInfo(name = "lc")
public class Class289 extends Class338 {
	@ObfInfo(name = "aq", desc = "Ljava/lang/ref/SoftReference;")
	public SoftReference field3032;

	public Class289(Object var1, int var2) {
		super(var2);
		this.field3032 = new SoftReference(var1);
	}

	@ObfInfo(name = "aq", desc = "()Ljava/lang/Object;")
	public Object method5698() {
		return this.field3032.get();
	}

	@ObfInfo(name = "ad", desc = "()Z")
	public boolean method5700() {
		return true;
	}
}
