import io.runebox.ObfInfo;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfInfo(name = "us")
public final class Class539 {
	@ObfInfo(name = "aq", desc = "Ljava/io/RandomAccessFile;")
	public RandomAccessFile field5305;
	@ObfInfo(name = "ag", desc = "J", longMultiplier = 2625027943220600875L)
	public long field5303;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = -7025589517032801503L)
	public final long field5304;

	public Class539(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field5305 = new RandomAccessFile(var1, var2);
		this.field5304 = var3;
		this.field5303 = 0L;
		int var5 = this.field5305.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field5305.seek(0L);
			this.field5305.write(var5);
		}

		this.field5305.seek(0L);
	}

	@ObfInfo(name = "aq", desc = "(J)V")
	public final void method9479(long var1) throws IOException {
		this.field5305.seek(var1);
		this.field5303 = var1;
	}

	@ObfInfo(name = "ad", desc = "([BIII)V", opaque = "-961764304")
	public final void method9486(byte[] var1, int var2, int var3) throws IOException {
		if (this.field5303 + (long)var3 > this.field5304) {
			this.field5305.seek(this.field5304);
			this.field5305.write(1);
			throw new EOFException();
		} else {
			this.field5305.write(var1, var2, var3);
			this.field5303 += (long)var3;
		}
	}

	@ObfInfo(name = "ag", desc = "(B)V")
	public final void method9481() throws IOException {
		this.method9482(false);
	}

	@ObfInfo(name = "ak", desc = "(ZB)V", opaque = "0")
	public final void method9482(boolean var1) throws IOException {
		if (this.field5305 != null) {
			if (var1) {
				try {
					this.field5305.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field5305.close();
			this.field5305 = null;
		}

	}

	@ObfInfo(name = "ap", desc = "(I)J")
	public final long method9483() throws IOException {
		return this.field5305.length();
	}

	@ObfInfo(name = "an", desc = "([BIII)I", opaque = "1540633937")
	public final int method9499(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field5305.read(var1, var2, var3);
		if (var5 > 0) {
			this.field5303 += (long)var5;
		}

		return var5;
	}

	public void finalize() throws Throwable {
		if (this.field5305 != null) {
			System.out.println("");
			this.method9481();
		}

	}
}
