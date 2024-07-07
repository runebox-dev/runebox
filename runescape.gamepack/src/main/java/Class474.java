import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.Socket;

@ObfInfo(name = "sf")
public class Class474 extends Class484 {
	@ObfInfo(name = "ag", desc = "Lsa;")
	public Class469 field4966;
	@ObfInfo(name = "ad", desc = "Lsz;")
	public Class494 field4965;
	@ObfInfo(name = "aq", desc = "Ljava/net/Socket;")
	public Socket field4964;

	public Class474(Socket var1, int var2, int var3) throws IOException {
		this.field4964 = var1;
		this.field4964.setSoTimeout(30000);
		this.field4964.setTcpNoDelay(true);
		this.field4964.setReceiveBufferSize(65536);
		this.field4964.setSendBufferSize(65536);
		this.field4965 = new Class494(this.field4964.getInputStream(), var2);
		this.field4966 = new Class469(this.field4964.getOutputStream(), var3);
	}

	@ObfInfo(name = "aq", desc = "(II)Z")
	public boolean method8651(int var1) throws IOException {
		return this.field4965.method8833(var1);
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method8656() throws IOException {
		return this.field4965.method8834();
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method8646() throws IOException {
		return this.field4965.method8850();
	}

	@ObfInfo(name = "ak", desc = "([BIIB)I")
	public int method8647(byte[] var1, int var2, int var3) throws IOException {
		return this.field4965.method8853(var1, var2, var3);
	}

	@ObfInfo(name = "ap", desc = "([BIII)V")
	public void method8648(byte[] var1, int var2, int var3) throws IOException {
		this.field4966.method8537(var1, var2, var3);
	}

	@ObfInfo(name = "an", desc = "(S)V")
	public void method8644() {
		this.field4966.method8538();

		try {
			this.field4964.close();
		} catch (IOException var3) {
		}

		this.field4965.method8854();
	}

	public void finalize() {
		this.method8644();
	}
}
