import java.io.EOFException;
import java.io.IOException;

public final class Class474 {
	public static byte[] field4935;
	public Class528 field4934;
	public Class528 field4937;
	public int field4933;
	public int field4936;

	static {
		field4935 = new byte[520];
	}

	public Class474(int var1, Class528 var2, Class528 var3, int var4) {
		this.field4937 = null;
		this.field4934 = null;
		this.field4933 = 65000;
		this.field4936 = var1;
		this.field4937 = var2;
		this.field4934 = var3;
		this.field4933 = var4;
	}

	public byte[] method8676(int var1) {
		synchronized(this.field4937) {
			Object var10000;
			try {
				if (this.field4934.method9714() < (long)(var1 * 6 + 6)) {
					var10000 = null;
					return (byte[])var10000;
				}

				this.field4934.method9736((long)(var1 * 6));
				this.field4934.method9711(field4935, 0, 6);
				int var4 = (field4935[2] & 255) + ((field4935[0] & 255) << 16) + ((field4935[1] & 255) << 8);
				int var5 = ((field4935[4] & 255) << 8) + ((field4935[3] & 255) << 16) + (field4935[5] & 255);
				if (var4 < 0 || var4 > this.field4933) {
					var10000 = null;
					return (byte[])var10000;
				}

				if (var5 > 0 && (long)var5 <= this.field4937.method9714() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;

					while (var7 < var4) {
						if (var5 == 0) {
							var10000 = null;
							return (byte[])var10000;
						}

						this.field4937.method9736((long)var5 * 520L);
						int var9 = var4 - var7;
						int var10;
						int var11;
						int var12;
						int var13;
						byte var14;
						if (var1 > 65535) {
							if (var9 > 510) {
								var9 = 510;
							}

							var14 = 10;
							this.field4937.method9711(field4935, 0, var14 + var9);
							var10 = ((field4935[2] & 255) << 8) + ((field4935[0] & 255) << 24) + ((field4935[1] & 255) << 16) + (field4935[3] & 255);
							var11 = (field4935[5] & 255) + ((field4935[4] & 255) << 8);
							var12 = ((field4935[6] & 255) << 16) + ((field4935[7] & 255) << 8) + (field4935[8] & 255);
							var13 = field4935[9] & 255;
						} else {
							if (var9 > 512) {
								var9 = 512;
							}

							var14 = 8;
							this.field4937.method9711(field4935, 0, var14 + var9);
							var10 = ((field4935[0] & 255) << 8) + (field4935[1] & 255);
							var11 = (field4935[3] & 255) + ((field4935[2] & 255) << 8);
							var12 = (field4935[6] & 255) + ((field4935[4] & 255) << 16) + ((field4935[5] & 255) << 8);
							var13 = field4935[7] & 255;
						}

						if (var10 == var1 && var11 == var8 && this.field4936 == var13) {
							if (var12 >= 0 && (long)var12 <= this.field4937.method9714() / 520L) {
								int var15 = var14 + var9;

								for (int var16 = var14; var16 < var15; ++var16) {
									var6[var7++] = field4935[var16];
								}

								var5 = var12;
								++var8;
								continue;
							}

							var10000 = null;
							return (byte[])var10000;
						}

						var10000 = null;
						return (byte[])var10000;
					}

					byte[] var20 = var6;
					return var20;
				}

				var10000 = null;
			} catch (IOException var18) {
				return null;
			}

			return (byte[])var10000;
		}
	}

	public boolean method8684(int var1, byte[] var2, int var3) {
		synchronized(this.field4937) {
			if (var3 >= 0 && var3 <= this.field4933) {
				boolean var6 = this.method8678(var1, var2, var3, true);
				if (!var6) {
					var6 = this.method8678(var1, var2, var3, false);
				}

				return var6;
			} else {
				throw new IllegalArgumentException("" + this.field4936 + ',' + var1 + ',' + var3);
			}
		}
	}

	public boolean method8678(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.field4937) {
			try {
				int var7;
				boolean var10000;
				if (var4) {
					if (this.field4934.method9714() < (long)(var1 * 6 + 6)) {
						var10000 = false;
						return var10000;
					}

					this.field4934.method9736((long)(var1 * 6));
					this.field4934.method9711(field4935, 0, 6);
					var7 = ((field4935[4] & 255) << 8) + ((field4935[3] & 255) << 16) + (field4935[5] & 255);
					if (var7 <= 0 || (long)var7 > this.field4937.method9714() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var7 = (int)((this.field4937.method9714() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}

				field4935[0] = (byte)(var3 >> 16);
				field4935[1] = (byte)(var3 >> 8);
				field4935[2] = (byte)var3;
				field4935[3] = (byte)(var7 >> 16);
				field4935[4] = (byte)(var7 >> 8);
				field4935[5] = (byte)var7;
				this.field4934.method9736((long)(var1 * 6));
				this.field4934.method9709(field4935, 0, 6);
				int var8 = 0;
				int var9 = 0;

				while (true) {
					if (var8 < var3) {
						label154: {
							int var10 = 0;
							int var11;
							if (var4) {
								this.field4937.method9736(520L * (long)var7);
								int var12;
								int var13;
								if (var1 > 65535) {
									try {
										this.field4937.method9711(field4935, 0, 10);
									} catch (EOFException var17) {
										break label154;
									}

									var11 = ((field4935[1] & 255) << 16) + ((field4935[0] & 255) << 24) + ((field4935[2] & 255) << 8) + (field4935[3] & 255);
									var12 = ((field4935[4] & 255) << 8) + (field4935[5] & 255);
									var10 = (field4935[8] & 255) + ((field4935[7] & 255) << 8) + ((field4935[6] & 255) << 16);
									var13 = field4935[9] & 255;
								} else {
									try {
										this.field4937.method9711(field4935, 0, 8);
									} catch (EOFException var16) {
										break label154;
									}

									var11 = ((field4935[0] & 255) << 8) + (field4935[1] & 255);
									var12 = (field4935[3] & 255) + ((field4935[2] & 255) << 8);
									var10 = ((field4935[4] & 255) << 16) + ((field4935[5] & 255) << 8) + (field4935[6] & 255);
									var13 = field4935[7] & 255;
								}

								if (var11 != var1 || var12 != var9 || this.field4936 != var13) {
									var10000 = false;
									return var10000;
								}

								if (var10 < 0 || (long)var10 > this.field4937.method9714() / 520L) {
									var10000 = false;
									return var10000;
								}
							}

							if (var10 == 0) {
								var4 = false;
								var10 = (int)((this.field4937.method9714() + 519L) / 520L);
								if (var10 == 0) {
									++var10;
								}

								if (var10 == var7) {
									++var10;
								}
							}

							if (var1 > 65535) {
								if (var3 - var8 <= 510) {
									var10 = 0;
								}

								field4935[0] = (byte)(var1 >> 24);
								field4935[1] = (byte)(var1 >> 16);
								field4935[2] = (byte)(var1 >> 8);
								field4935[3] = (byte)var1;
								field4935[4] = (byte)(var9 >> 8);
								field4935[5] = (byte)var9;
								field4935[6] = (byte)(var10 >> 16);
								field4935[7] = (byte)(var10 >> 8);
								field4935[8] = (byte)var10;
								field4935[9] = (byte)this.field4936;
								this.field4937.method9736((long)var7 * 520L);
								this.field4937.method9709(field4935, 0, 10);
								var11 = var3 - var8;
								if (var11 > 510) {
									var11 = 510;
								}

								this.field4937.method9709(var2, var8, var11);
								var8 += var11;
							} else {
								if (var3 - var8 <= 512) {
									var10 = 0;
								}

								field4935[0] = (byte)(var1 >> 8);
								field4935[1] = (byte)var1;
								field4935[2] = (byte)(var9 >> 8);
								field4935[3] = (byte)var9;
								field4935[4] = (byte)(var10 >> 16);
								field4935[5] = (byte)(var10 >> 8);
								field4935[6] = (byte)var10;
								field4935[7] = (byte)this.field4936;
								this.field4937.method9736(520L * (long)var7);
								this.field4937.method9709(field4935, 0, 8);
								var11 = var3 - var8;
								if (var11 > 512) {
									var11 = 512;
								}

								this.field4937.method9709(var2, var8, var11);
								var8 += var11;
							}

							var7 = var10;
							++var9;
							continue;
						}
					}

					var10000 = true;
					return var10000;
				}
			} catch (IOException var18) {
				return false;
			}
		}
	}

	public String toString() {
		return "" + this.field4936;
	}
}
