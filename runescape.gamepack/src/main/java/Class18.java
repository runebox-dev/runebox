import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class Class18 extends Class30 {
	public byte[] field89;
	public int field91;
	public AudioFormat field90;
	public SourceDataLine field92;

	public void method251() {
		this.field90 = new AudioFormat((float)Client.field1382, 16, Client.field1887 ? 2 : 1, true, false);
		this.field89 = new byte[256 << (Client.field1887 ? 2 : 1)];
	}

	public void method250(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field90, var1 << (Client.field1887 ? 2 : 1));
			this.field92 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field92.open();
			this.field92.start();
			this.field91 = var1;
		} catch (LineUnavailableException var4) {
			if (Class69.method1938(var1) != 1) {
				this.method250(Class248.method4765(var1));
			} else {
				this.field92 = null;
				throw var4;
			}
		}
	}

	public int method262() {
		return this.field91 - (this.field92.available() >> (Client.field1887 ? 2 : 1));
	}

	public void method252() {
		int var1 = 256;
		if (Client.field1887) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field159[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field89[var2 * 2] = (byte)(var3 >> 8);
			this.field89[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.field92.write(this.field89, 0, var1 << 1);
	}

	public void method253() {
		if (this.field92 != null) {
			this.field92.close();
			this.field92 = null;
		}

	}

	public void method254() {
		this.field92.flush();
	}
}