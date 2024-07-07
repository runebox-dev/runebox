import io.runebox.ObfInfo;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfInfo(name = "am")
public class Class13 extends Class48 {
	@ObfInfo(name = "ak", desc = "[B")
	public byte[] field65;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 662524963)
	public int field64;
	@ObfInfo(name = "aq", desc = "Ljavax/sound/sampled/AudioFormat;")
	public AudioFormat field67;
	@ObfInfo(name = "ad", desc = "Ljavax/sound/sampled/SourceDataLine;")
	public SourceDataLine field66;

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "214892220")
	public void method154() {
		this.field67 = new AudioFormat((float)Client.field293, 16, Client.field1012 ? 2 : 1, true, false);
		this.field65 = new byte[256 << (Client.field1012 ? 2 : 1)];
	}

	@ObfInfo(name = "ad", desc = "(IB)V", opaque = "8")
	public void method169(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field67, var1 << (Client.field1012 ? 2 : 1));
			this.field66 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field66.open();
			this.field66.start();
			this.field64 = var1;
		} catch (LineUnavailableException var4) {
			if (Class337.method2219(var1) != 1) {
				this.method169(Class337.method7475(var1));
			} else {
				this.field66 = null;
				throw var4;
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(B)I", opaque = "1")
	public int method156() {
		return this.field64 - (this.field66.available() >> (Client.field1012 ? 2 : 1));
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method157() {
		int var1 = 256;
		if (Client.field1012) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field295[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field65[var2 * 2] = (byte)(var3 >> 8);
			this.field65[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.field66.write(this.field65, 0, var1 << 1);
	}

	@ObfInfo(name = "ap", desc = "(I)V", opaque = "-761877080")
	public void method155() {
		if (this.field66 != null) {
			this.field66.close();
			this.field66 = null;
		}

	}

	@ObfInfo(name = "an", desc = "(B)V")
	public void method159() {
		this.field66.flush();
	}
}
