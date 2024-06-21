import io.runebox.ObfInfo;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class Class525 {
	@ObfInfo(name = "ak", desc = "Ljava/io/RandomAccessFile;")
	public RandomAccessFile field5229;
	@ObfInfo(name = "aj", desc = "J", longMultiplier = 7464592388017412915L)
	public long field5230;
	@ObfInfo(name = "al", desc = "J", longMultiplier = -6654413090181825883L)
	public final long field5231;

	public Class525(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.field5229 = new RandomAccessFile(var1, var2);
		this.field5231 = var3;
		this.field5230 = 0L;
		int var5 = this.field5229.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.field5229.seek(0L);
			this.field5229.write(var5);
		}

		this.field5229.seek(0L);
	}

	@ObfInfo(name = "ak", desc = "(J)V")
	public final void method9667(long var1) throws IOException {
		this.field5229.seek(var1);
		this.field5230 = var1;
	}

	@ObfInfo(name = "al", desc = "([BIII)V")
	public final void method9668(byte[] var1, int var2, int var3) throws IOException {
		if (this.field5230 + (long)var3 > this.field5231) {
			this.field5229.seek(this.field5231);
			this.field5229.write(1);
			throw new EOFException();
		} else {
			this.field5229.write(var1, var2, var3);
			this.field5230 += (long)var3;
		}
	}

	@ObfInfo(name = "aj", desc = "(B)V")
	public final void method9672() throws IOException {
		this.method9669(false);
	}

	@ObfInfo(name = "az", desc = "(ZI)V", opaque = "-1046803903")
	public final void method9669(boolean var1) throws IOException {
		if (this.field5229 != null) {
			if (var1) {
				try {
					this.field5229.getFD().sync();
				} catch (SyncFailedException var4) {
				}
			}

			this.field5229.close();
			this.field5229 = null;
		}

	}

	@ObfInfo(name = "af", desc = "(I)J")
	public final long method9674() throws IOException {
		return this.field5229.length();
	}

	@ObfInfo(name = "aa", desc = "([BIIB)I", opaque = "4")
	public final int method9682(byte[] var1, int var2, int var3) throws IOException {
		int var5 = this.field5229.read(var1, var2, var3);
		if (var5 > 0) {
			this.field5230 += (long)var5;
		}

		return var5;
	}

	public void finalize() throws Throwable {
		if (this.field5229 != null) {
			System.out.println("");
			this.method9672();
		}

	}
}
