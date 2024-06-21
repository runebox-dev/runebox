import io.runebox.ObfInfo;
import java.lang.ref.SoftReference;

public class Class296 extends Class320 {
	@ObfInfo(name = "ak", desc = "Ljava/lang/ref/SoftReference;")
	public SoftReference field3194;

	public Class296(Object var1, int var2) {
		super(var2);
		this.field3194 = new SoftReference(var1);
	}

	@ObfInfo(name = "ak", desc = "()Ljava/lang/Object;")
	public Object method5946() {
		return this.field3194.get();
	}

	@ObfInfo(name = "al", desc = "()Z")
	public boolean method5947() {
		return true;
	}
}
