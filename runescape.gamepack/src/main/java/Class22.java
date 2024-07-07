import io.runebox.ObfInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(name = "av")
public class Class22 {
	@ObfInfo(name = "aq", desc = "Ljava/util/concurrent/ExecutorService;")
	public ExecutorService field105;
	@ObfInfo(name = "ad", desc = "Ljava/util/concurrent/Future;")
	public Future field111;
	@ObfInfo(name = "ak", desc = "Lak;")
	public final Class11 field110;
	@ObfInfo(name = "ag", desc = "Lvp;")
	public final Class562 field106;

	public Class22(Class562 var1, Class11 var2) {
		this.field105 = Executors.newSingleThreadExecutor();
		this.field106 = var1;
		this.field110 = var2;
		this.method291();
	}

	@ObfInfo(name = "aq", desc = "(I)Z")
	public boolean method288() {
		return this.field111.isDone();
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public void method289() {
		this.field105.shutdown();
		this.field105 = null;
	}

	@ObfInfo(name = "ag", desc = "(B)Lvp;")
	public Class562 method290() {
		try {
			return (Class562)this.field111.get();
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfInfo(name = "ak", desc = "(B)V")
	public void method291() {
		this.field111 = this.field105.submit(new Class4(this, this.field106, this.field110));
	}
}
