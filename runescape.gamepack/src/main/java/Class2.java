import io.runebox.ObfInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(name = "ab")
public class Class2 {
	@ObfInfo(name = "ak", desc = "Ljava/util/concurrent/ExecutorService;")
	public ExecutorService field4;
	@ObfInfo(name = "al", desc = "Ljava/util/concurrent/Future;")
	public Future field7;
	@ObfInfo(name = "az", desc = "Laz;")
	public final Class26 field3;
	@ObfInfo(name = "aj", desc = "Lua;")
	public final Class521 field5;

	public Class2(Class521 var1, Class26 var2) {
		this.field4 = Executors.newSingleThreadExecutor();
		this.field5 = var1;
		this.field3 = var2;
		this.method22();
	}

	@ObfInfo(name = "ak", desc = "(I)Z")
	public boolean method19() {
		return this.field7.isDone();
	}

	@ObfInfo(name = "al", desc = "(B)V")
	public void method20() {
		this.field4.shutdown();
		this.field4 = null;
	}

	@ObfInfo(name = "aj", desc = "(S)Lua;")
	public Class521 method21() {
		try {
			return (Class521)this.field7.get();
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfInfo(name = "az", desc = "(I)V")
	public void method22() {
		this.field7 = this.field4.submit(new Class12(this, this.field5, this.field3));
	}
}
