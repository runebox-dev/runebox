import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.Socket;

@ObfInfo(name = "sm")
public abstract class Class481 {
	@ObfInfo(name = "al", desc = "(II)Z")
	public abstract boolean method8621(int var1) throws IOException;

	@ObfInfo(name = "aj", desc = "(S)I")
	public abstract int method8622() throws IOException;

	@ObfInfo(name = "az", desc = "(I)I")
	public abstract int method8623() throws IOException;

	@ObfInfo(name = "af", desc = "([BIIB)I")
	public abstract int method8624(byte[] var1, int var2, int var3) throws IOException;

	@ObfInfo(name = "aa", desc = "([BIII)V")
	public abstract void method8626(byte[] var1, int var2, int var3) throws IOException;

	@ObfInfo(name = "at", desc = "(B)V")
	public abstract void method8631();

	@ObfInfo(owner = "fc", name = "ak", desc = "(Ljava/net/Socket;III)Lsm;")
	public static Class481 method3074(Socket var0, int var1, int var2) throws IOException {
		return new Class470(var0, var1, var2);
	}
}
