import io.runebox.ObfInfo;
import java.io.EOFException;
import java.io.IOException;

@ObfInfo(name = "sq")
public final class Class485 {
	@ObfInfo(name = "aq", desc = "[B")
	public static byte[] field5009;
	@ObfInfo(name = "ad", desc = "Luf;")
	public Class526 field5010;
	@ObfInfo(name = "ag", desc = "Luf;")
	public Class526 field5013;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -198935251)
	public int field5011;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 9731805)
	public int field5012;

	static {
		field5009 = new byte[520];
	}

	public Class485(int var1, Class526 var2, Class526 var3, int var4) {
		this.field5010 = null;
		this.field5013 = null;
		this.field5011 = 65000;
		this.field5012 = var1;
		this.field5010 = var2;
		this.field5013 = var3;
		this.field5011 = var4;
	}

	@ObfInfo(name = "aq", desc = "(II)[B", opaque = "-1986274471")
	public byte[] method8790(int var1) {
		synchronized(this.field5010) {
			Object var10000;
			try {
				if (this.field5013.method9327() < (long)(6 + var1 * 6)) {
					var10000 = null;
					return (byte[])var10000;
				}

				this.field5013.method9313((long)(var1 * 6));
				this.field5013.method9316(field5009, 0, 6);
				int var4 = ((field5009[1] & 255) << 8) + ((field5009[0] & 255) << 16) + (field5009[2] & 255);
				int var5 = ((field5009[3] & 255) << 16) + ((field5009[4] & 255) << 8) + (field5009[5] & 255);
				if (var4 < 0 || var4 > this.field5011) {
					var10000 = null;
					return (byte[])var10000;
				}

				if (var5 > 0 && (long)var5 <= this.field5010.method9327() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;

					while (var7 < var4) {
						if (var5 == 0) {
							var10000 = null;
							return (byte[])var10000;
						}

						this.field5010.method9313((long)var5 * 520L);
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
							this.field5010.method9316(field5009, 0, var14 + var9);
							var10 = ((field5009[2] & 255) << 8) + ((field5009[1] & 255) << 16) + ((field5009[0] & 255) << 24) + (field5009[3] & 255);
							var11 = (field5009[5] & 255) + ((field5009[4] & 255) << 8);
							var12 = (field5009[8] & 255) + ((field5009[6] & 255) << 16) + ((field5009[7] & 255) << 8);
							var13 = field5009[9] & 255;
						} else {
							if (var9 > 512) {
								var9 = 512;
							}

							var14 = 8;
							this.field5010.method9316(field5009, 0, var14 + var9);
							var10 = (field5009[1] & 255) + ((field5009[0] & 255) << 8);
							var11 = ((field5009[2] & 255) << 8) + (field5009[3] & 255);
							var12 = ((field5009[4] & 255) << 16) + ((field5009[5] & 255) << 8) + (field5009[6] & 255);
							var13 = field5009[7] & 255;
						}

						if (var10 == var1 && var11 == var8 && this.field5012 == var13) {
							if (var12 >= 0 && (long)var12 <= this.field5010.method9327() / 520L) {
								int var15 = var14 + var9;

								for (int var16 = var14; var16 < var15; ++var16) {
									var6[var7++] = field5009[var16];
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

	@ObfInfo(name = "ad", desc = "(I[BII)Z", opaque = "2128672219")
	public boolean method8798(int var1, byte[] var2, int var3) {
		synchronized(this.field5010) {
			if (var3 >= 0 && var3 <= this.field5011) {
				boolean var6 = this.method8792(var1, var2, var3, true);
				if (!var6) {
					var6 = this.method8792(var1, var2, var3, false);
				}

				return var6;
			} else {
				throw new IllegalArgumentException("" + this.field5012 + ',' + var1 + ',' + var3);
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(I[BIZI)Z", opaque = "1142186565")
	public boolean method8792(int var1, byte[] var2, int var3, boolean var4) {
		synchronized(this.field5010) {
			try {
				int var7;
				boolean var10000;
				if (var4) {
					if (this.field5013.method9327() < (long)(6 + var1 * 6)) {
						var10000 = false;
						return var10000;
					}

					this.field5013.method9313((long)(var1 * 6));
					this.field5013.method9316(field5009, 0, 6);
					var7 = ((field5009[3] & 255) << 16) + ((field5009[4] & 255) << 8) + (field5009[5] & 255);
					if (var7 <= 0 || (long)var7 > this.field5010.method9327() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var7 = (int)((this.field5010.method9327() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}

				field5009[0] = (byte)(var3 >> 16);
				field5009[1] = (byte)(var3 >> 8);
				field5009[2] = (byte)var3;
				field5009[3] = (byte)(var7 >> 16);
				field5009[4] = (byte)(var7 >> 8);
				field5009[5] = (byte)var7;
				this.field5013.method9313((long)(var1 * 6));
				this.field5013.method9336(field5009, 0, 6);
				int var8 = 0;
				int var9 = 0;

				while (true) {
					if (var8 < var3) {
						label154: {
							int var10 = 0;
							int var11;
							if (var4) {
								this.field5010.method9313(520L * (long)var7);
								int var12;
								int var13;
								if (var1 > 65535) {
									try {
										this.field5010.method9316(field5009, 0, 10);
									} catch (EOFException var17) {
										break label154;
									}

									var11 = ((field5009[0] & 255) << 24) + ((field5009[1] & 255) << 16) + ((field5009[2] & 255) << 8) + (field5009[3] & 255);
									var12 = ((field5009[4] & 255) << 8) + (field5009[5] & 255);
									var10 = ((field5009[6] & 255) << 16) + ((field5009[7] & 255) << 8) + (field5009[8] & 255);
									var13 = field5009[9] & 255;
								} else {
									try {
										this.field5010.method9316(field5009, 0, 8);
									} catch (EOFException var16) {
										break label154;
									}

									var11 = (field5009[1] & 255) + ((field5009[0] & 255) << 8);
									var12 = ((field5009[2] & 255) << 8) + (field5009[3] & 255);
									var10 = ((field5009[5] & 255) << 8) + ((field5009[4] & 255) << 16) + (field5009[6] & 255);
									var13 = field5009[7] & 255;
								}

								if (var11 != var1 || var12 != var9 || this.field5012 != var13) {
									var10000 = false;
									return var10000;
								}

								if (var10 < 0 || (long)var10 > this.field5010.method9327() / 520L) {
									var10000 = false;
									return var10000;
								}
							}

							if (var10 == 0) {
								var4 = false;
								var10 = (int)((this.field5010.method9327() + 519L) / 520L);
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

								field5009[0] = (byte)(var1 >> 24);
								field5009[1] = (byte)(var1 >> 16);
								field5009[2] = (byte)(var1 >> 8);
								field5009[3] = (byte)var1;
								field5009[4] = (byte)(var9 >> 8);
								field5009[5] = (byte)var9;
								field5009[6] = (byte)(var10 >> 16);
								field5009[7] = (byte)(var10 >> 8);
								field5009[8] = (byte)var10;
								field5009[9] = (byte)this.field5012;
								this.field5010.method9313((long)var7 * 520L);
								this.field5010.method9336(field5009, 0, 10);
								var11 = var3 - var8;
								if (var11 > 510) {
									var11 = 510;
								}

								this.field5010.method9336(var2, var8, var11);
								var8 += var11;
							} else {
								if (var3 - var8 <= 512) {
									var10 = 0;
								}

								field5009[0] = (byte)(var1 >> 8);
								field5009[1] = (byte)var1;
								field5009[2] = (byte)(var9 >> 8);
								field5009[3] = (byte)var9;
								field5009[4] = (byte)(var10 >> 16);
								field5009[5] = (byte)(var10 >> 8);
								field5009[6] = (byte)var10;
								field5009[7] = (byte)this.field5012;
								this.field5010.method9313((long)var7 * 520L);
								this.field5010.method9336(field5009, 0, 8);
								var11 = var3 - var8;
								if (var11 > 512) {
									var11 = 512;
								}

								this.field5010.method9336(var2, var8, var11);
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
		return "" + this.field5012;
	}
}
