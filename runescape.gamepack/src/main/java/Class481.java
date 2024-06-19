import java.io.IOException;
import java.net.Socket;

public abstract class Class481 {
	public abstract boolean method8621(int var1) throws IOException;

	public abstract int method8622() throws IOException;

	public abstract int method8623() throws IOException;

	public abstract int method8624(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method8626(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method8631();

	public static Class481 method3074(Socket var0, int var1, int var2) throws IOException {
		return new Class470(var0, var1, var2);
	}
}
