import java.nio.ByteBuffer;

public class Class341 extends Class362 {
	public ByteBuffer field3828;

	public byte[] method6647() {
		byte[] var2 = new byte[this.field3828.capacity()];
		this.field3828.position(0);
		this.field3828.get(var2);
		return var2;
	}

	public void method6652(byte[] var1) {
		this.field3828 = ByteBuffer.allocateDirect(var1.length);
		this.field3828.position(0);
		this.field3828.put(var1);
	}
}
