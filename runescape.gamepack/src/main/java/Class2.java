import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class2 {
	public ExecutorService field4;
	public Future field7;
	public final Class26 field3;
	public final Class521 field5;

	public Class2(Class521 var1, Class26 var2) {
		this.field4 = Executors.newSingleThreadExecutor();
		this.field5 = var1;
		this.field3 = var2;
		this.method22();
	}

	public boolean method19() {
		return this.field7.isDone();
	}

	public void method20() {
		this.field4.shutdown();
		this.field4 = null;
	}

	public Class521 method21() {
		try {
			return (Class521)this.field7.get();
		} catch (Exception var3) {
			return null;
		}
	}

	public void method22() {
		this.field7 = this.field4.submit(new Class12(this, this.field5, this.field3));
	}
}
