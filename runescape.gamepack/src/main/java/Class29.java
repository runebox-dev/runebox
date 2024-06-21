import io.runebox.ObfInfo;
import java.util.concurrent.locks.ReentrantLock;

@ObfInfo(name = "bc")
public class Class29 {
	@ObfInfo(name = "al", desc = "Lbr;")
	public Class44 field151;
	@ObfInfo(name = "ak", desc = "Lcn;")
	public Class66 field145;
	@ObfInfo(name = "aj", desc = "Ljava/util/concurrent/locks/ReentrantLock;")
	public ReentrantLock field146;

	public Class29(Class66 var1, Class44 var2) {
		this.field145 = var1;
		this.field151 = var2;
		this.field146 = new ReentrantLock();
	}

	@ObfInfo(name = "at", desc = "(I)V")
	public static void method399() {
		Class217.field2188.method5995();
	}
}
