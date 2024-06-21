import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.Socket;

public class Class470 extends Class481 {
	@ObfInfo(name = "al", desc = "Lse;")
	public Class473 field4917;
	@ObfInfo(name = "aj", desc = "Lsr;")
	public Class486 field4919;
	@ObfInfo(name = "ak", desc = "Ljava/net/Socket;")
	public Socket field4918;

	public Class470(Socket var1, int var2, int var3) throws IOException {
		this.field4918 = var1;
		this.field4918.setSoTimeout(30000);
		this.field4918.setTcpNoDelay(true);
		this.field4918.setReceiveBufferSize(65536);
		this.field4918.setSendBufferSize(65536);
		this.field4917 = new Class473(this.field4918.getInputStream(), var2);
		this.field4919 = new Class486(this.field4918.getOutputStream(), var3);
	}

	@ObfInfo(name = "al", desc = "(II)Z")
	public boolean method8621(int var1) throws IOException {
		return this.field4917.method8670(var1);
	}

	@ObfInfo(name = "aj", desc = "(S)I")
	public int method8622() throws IOException {
		return this.field4917.method8657();
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method8623() throws IOException {
		return this.field4917.method8656();
	}

	@ObfInfo(name = "af", desc = "([BIIB)I")
	public int method8624(byte[] var1, int var2, int var3) throws IOException {
		return this.field4917.method8659(var1, var2, var3);
	}

	@ObfInfo(name = "aa", desc = "([BIII)V")
	public void method8626(byte[] var1, int var2, int var3) throws IOException {
		this.field4919.method8887(var1, var2, var3);
	}

	@ObfInfo(name = "at", desc = "(B)V")
	public void method8631() {
		this.field4919.method8898();

		try {
			this.field4918.close();
		} catch (IOException var3) {
		}

		this.field4917.method8660();
	}

	public void finalize() {
		this.method8631();
	}
}
