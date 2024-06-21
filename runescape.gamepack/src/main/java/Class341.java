import io.runebox.ObfInfo;
import java.nio.ByteBuffer;

@ObfInfo(name = "nc")
public class Class341 extends Class362 {
	@ObfInfo(name = "ak", desc = "Ljava/nio/ByteBuffer;")
	public ByteBuffer field3828;

	@ObfInfo(name = "aj", desc = "(B)[B")
	public byte[] method6647() {
		byte[] var2 = new byte[this.field3828.capacity()];
		this.field3828.position(0);
		this.field3828.get(var2);
		return var2;
	}

	@ObfInfo(name = "az", desc = "([BI)V")
	public void method6652(byte[] var1) {
		this.field3828 = ByteBuffer.allocateDirect(var1.length);
		this.field3828.position(0);
		this.field3828.put(var1);
	}
}
