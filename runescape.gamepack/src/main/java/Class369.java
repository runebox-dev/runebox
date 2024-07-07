import io.runebox.ObfInfo;
import java.io.IOException;
import java.util.zip.CRC32;

@ObfInfo(name = "oe")
public class Class369 {
	@ObfInfo(name = "ao", desc = "Loh;")
	public Class372 field4370;
	@ObfInfo(name = "ar", desc = "[Loz;")
	public Class390[] field4392;
	@ObfInfo(name = "ah", desc = "Lpz;")
	public Class416 field4380;
	@ObfInfo(name = "an", desc = "Lsp;")
	public Class484 field4374;
	@ObfInfo(name = "ae", desc = "Lup;")
	public Class536 field4378;
	@ObfInfo(name = "ab", desc = "Lup;")
	public Class536 field4381;
	@ObfInfo(name = "ac", desc = "Lup;")
	public Class536 field4383;
	@ObfInfo(name = "az", desc = "Lup;")
	public Class536 field4389;
	@ObfInfo(name = "aa", desc = "Lvp;")
	public Class562 field4387;
	@ObfInfo(name = "as", desc = "Lvp;")
	public Class562 field4388;
	@ObfInfo(name = "am", desc = "Lvp;")
	public Class562 field4391;
	@ObfInfo(name = "ay", desc = "Z")
	public boolean field4385;
	@ObfInfo(name = "be", desc = "B")
	public byte field4395;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -2124691059)
	public int field4373;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 893442467)
	public int field4377;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1839274781)
	public int field4379;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -175499425)
	public int field4382;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 538790613)
	public int field4384;
	@ObfInfo(name = "bj", desc = "I", intMultiplier = 1957149133)
	public int field4386;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = 1848769151)
	public int field4393;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1469341211)
	public int field4394;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = -784341467)
	public int field4396;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = -944356257)
	public int field4397;
	@ObfInfo(name = "af", desc = "Ljava/util/zip/CRC32;")
	public CRC32 field4398;
	@ObfInfo(name = "av", desc = "J", longMultiplier = -831200158254530275L)
	public long field4375;

	public Class369() {
		this.field4394 = 0;
		this.field4381 = new Class536(4096);
		this.field4377 = 0;
		this.field4378 = new Class536(32);
		this.field4379 = 0;
		this.field4380 = new Class416();
		this.field4389 = new Class536(4096);
		this.field4382 = 0;
		this.field4383 = new Class536(4096);
		this.field4384 = 0;
		this.field4387 = new Class562(8);
		this.field4373 = 0;
		this.field4398 = new CRC32();
		this.field4392 = new Class390[256];
		this.field4393 = -1;
		this.field4386 = 255;
		this.field4395 = 0;
		this.field4396 = 0;
		this.field4397 = 0;
	}

	@ObfInfo(name = "aq", desc = "(B)Z", opaque = "0")
	public boolean method7067() {
		long var2 = Class329.method4953();
		int var4 = (int)(var2 - this.field4375);
		this.field4375 = var2;
		if (var4 > 200) {
			var4 = 200;
		}

		this.field4394 += var4;
		if (this.field4384 == 0 && 0 == this.field4379 && this.field4382 == 0 && this.field4377 == 0) {
			return true;
		} else if (this.field4374 == null) {
			return false;
		} else {
			try {
				if (this.field4394 > 30000) {
					throw new IOException();
				} else {
					Class372 var5;
					Class562 var6;
					while (this.field4379 < 200 && this.field4377 > 0) {
						var5 = (Class372)this.field4381.method9442();
						var6 = new Class562(4);
						var6.method9809(1);
						var6.method9811((int)var5.field5234);
						this.field4374.method8648(var6.field5472, 0, 4);
						this.field4378.method9445(var5, var5.field5234);
						--this.field4377;
						++this.field4379;
					}

					while (this.field4384 < 200 && this.field4382 > 0) {
						var5 = (Class372)this.field4380.method7659();
						var6 = new Class562(4);
						var6.method9809(0);
						var6.method9811((int)var5.field5234);
						this.field4374.method8648(var6.field5472, 0, 4);
						var5.method9044();
						this.field4383.method9445(var5, var5.field5234);
						--this.field4382;
						++this.field4384;
					}

					for (int var20 = 0; var20 < 100; ++var20) {
						int var21 = this.field4374.method8656();
						if (var21 < 0) {
							throw new IOException();
						}

						if (var21 == 0) {
							break;
						}

						this.field4394 = 0;
						byte var7 = 0;
						if (this.field4370 == null) {
							var7 = 8;
						} else if (this.field4373 == 0) {
							var7 = 1;
						}

						int var8;
						int var9;
						int var10;
						byte[] var10000;
						int var10001;
						Class562 var23;
						if (var7 > 0) {
							var8 = var7 - this.field4387.field5471;
							if (var8 > var21) {
								var8 = var21;
							}

							this.field4374.method8647(this.field4387.field5472, this.field4387.field5471, var8);
							if (this.field4395 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4387.field5472;
									var10001 = this.field4387.field5471 + var9;
									var10000[var10001] ^= this.field4395;
								}
							}

							var23 = this.field4387;
							var23.field5471 += var8;
							if (this.field4387.field5471 < var7) {
								break;
							}

							if (this.field4370 == null) {
								this.field4387.field5471 = 0;
								var9 = this.field4387.method9902();
								var10 = this.field4387.method9997();
								int var11 = this.field4387.method9902();
								int var12 = this.field4387.method9832();
								long var13 = (long)(var10 + (var9 << 16));
								Class372 var15 = (Class372)this.field4378.method9439(var13);
								this.field4385 = true;
								if (var15 == null) {
									var15 = (Class372)this.field4383.method9439(var13);
									this.field4385 = false;
								}

								if (var15 == null) {
									throw new IOException();
								}

								int var16 = var11 == 0 ? 5 : 9;
								this.field4370 = var15;
								this.field4388 = new Class562(var16 + var12 + this.field4370.field4429);
								this.field4388.method9809(var11);
								this.field4388.method9812(var12);
								this.field4373 = 8;
								this.field4387.field5471 = 0;
							} else if (0 == this.field4373) {
								if (-1 == this.field4387.field5472[0]) {
									this.field4373 = 1;
									this.field4387.field5471 = 0;
								} else {
									this.field4370 = null;
								}
							}
						} else {
							var8 = this.field4388.field5472.length - this.field4370.field4429;
							var9 = 512 - this.field4373;
							if (var9 > var8 - this.field4388.field5471) {
								var9 = var8 - this.field4388.field5471;
							}

							if (var9 > var21) {
								var9 = var21;
							}

							this.field4374.method8647(this.field4388.field5472, this.field4388.field5471, var9);
							if (this.field4395 != 0) {
								for (var10 = 0; var10 < var9; ++var10) {
									var10000 = this.field4388.field5472;
									var10001 = this.field4388.field5471 + var10;
									var10000[var10001] ^= this.field4395;
								}
							}

							var23 = this.field4388;
							var23.field5471 += var9;
							this.field4373 += var9;
							if (var8 == this.field4388.field5471) {
								if (16711935L == this.field4370.field5234) {
									this.field4391 = this.field4388;

									for (var10 = 0; var10 < 256; ++var10) {
										Class390 var22 = this.field4392[var10];
										if (var22 != null) {
											this.method7089(var22, var10);
										}
									}
								} else {
									this.field4398.reset();
									this.field4398.update(this.field4388.field5472, 0, var8);
									var10 = (int)this.field4398.getValue();
									if (var10 != this.field4370.field4431) {
										try {
											this.field4374.method8644();
										} catch (Exception var18) {
										}

										++this.field4396;
										this.field4374 = null;
										this.field4395 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4396 = 0;
									this.field4397 = 0;
									this.field4370.field4430.method7302((int)(this.field4370.field5234 & 65535L), this.field4388.field5472, 16711680L == (this.field4370.field5234 & 16711680L), this.field4385);
								}

								this.field4370.method9267();
								if (this.field4385) {
									--this.field4379;
								} else {
									--this.field4384;
								}

								this.field4373 = 0;
								this.field4370 = null;
								this.field4388 = null;
							} else {
								if (512 != this.field4373) {
									break;
								}

								this.field4373 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					this.field4374.method8644();
				} catch (Exception var17) {
				}

				++this.field4397;
				this.field4374 = null;
				return false;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(ZB)V", opaque = "15")
	public void method7068(boolean var1) {
		if (this.field4374 != null) {
			try {
				Class562 var3 = new Class562(4);
				var3.method9809(var1 ? 2 : 3);
				var3.method9811(0);
				this.field4374.method8648(var3.field5472, 0, 4);
			} catch (IOException var6) {
				try {
					this.field4374.method8644();
				} catch (Exception var5) {
				}

				++this.field4397;
				this.field4374 = null;
			}

		}
	}

	@ObfInfo(name = "ag", desc = "(Lsp;ZB)V", opaque = "-1")
	public void method7069(Class484 var1, boolean var2) {
		if (this.field4374 != null) {
			try {
				this.field4374.method8644();
			} catch (Exception var8) {
			}

			this.field4374 = null;
		}

		this.field4374 = var1;
		this.method7068(var2);
		this.field4387.field5471 = 0;
		this.field4370 = null;
		this.field4388 = null;
		this.field4373 = 0;

		while (true) {
			Class372 var4 = (Class372)this.field4378.method9442();
			if (var4 == null) {
				while (true) {
					var4 = (Class372)this.field4383.method9442();
					if (var4 == null) {
						if (this.field4395 != 0) {
							try {
								Class562 var9 = new Class562(4);
								var9.method9809(4);
								var9.method9809(this.field4395);
								var9.method9810(0);
								this.field4374.method8648(var9.field5472, 0, 4);
							} catch (IOException var7) {
								try {
									this.field4374.method8644();
								} catch (Exception var6) {
								}

								++this.field4397;
								this.field4374 = null;
							}
						}

						this.field4394 = 0;
						this.field4375 = Class329.method4953();
						return;
					}

					this.field4380.method7657(var4);
					this.field4389.method9445(var4, var4.field5234);
					++this.field4382;
					--this.field4384;
				}
			}

			this.field4381.method9445(var4, var4.field5234);
			++this.field4377;
			--this.field4379;
		}
	}

	@ObfInfo(name = "ak", desc = "(Loz;II)V", opaque = "2040913451")
	public void method7070(Class390 var1, int var2) {
		if (var1.field4574 && !var1.field4572) {
			if (var2 <= this.field4393) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4386) {
				this.field4386 = var2;
			}
		} else {
			if (var2 >= this.field4386) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4393) {
				this.field4393 = var2;
			}
		}

		if (this.field4391 != null) {
			this.method7089(var1, var2);
		} else {
			this.method7072((Class390)null, Class376.field4480.field4485, 255, 0, (byte)0, true);
			this.field4392[var2] = var1;
		}
	}

	@ObfInfo(name = "ap", desc = "(Loz;II)V", opaque = "1853358687")
	public void method7089(Class390 var1, int var2) {
		this.field4391.field5471 = var2 * 8 + 5;
		if (this.field4391.field5471 >= this.field4391.field5472.length) {
			if (var1.field4574) {
				var1.method7279();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var4 = this.field4391.method9832();
			int var5 = this.field4391.method9832();
			var1.method7280(var4, var5);
		}
	}

	@ObfInfo(name = "an", desc = "(Loz;IIIBZI)V", opaque = "235670350")
	public void method7072(Class390 var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var8 = (long)((var2 << 16) + var3);
		Class372 var10 = (Class372)this.field4381.method9439(var8);
		if (var10 == null) {
			var10 = (Class372)this.field4378.method9439(var8);
			if (var10 == null) {
				var10 = (Class372)this.field4389.method9439(var8);
				if (var10 != null) {
					if (var6) {
						var10.method9044();
						this.field4381.method9445(var10, var8);
						--this.field4382;
						++this.field4377;
					}

				} else {
					if (!var6) {
						var10 = (Class372)this.field4383.method9439(var8);
						if (var10 != null) {
							return;
						}
					}

					var10 = new Class372();
					var10.field4430 = var1;
					var10.field4431 = var4;
					var10.field4429 = var5;
					if (var6) {
						this.field4381.method9445(var10, var8);
						++this.field4377;
					} else {
						this.field4380.method7656(var10);
						this.field4389.method9445(var10, var8);
						++this.field4382;
					}

				}
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(IIB)V")
	public void method7076(int var1, int var2) {
		long var4 = (long)(var2 + (var1 << 16));
		Class372 var6 = (Class372)this.field4389.method9439(var4);
		if (var6 != null) {
			this.field4380.method7657(var6);
		}
	}

	@ObfInfo(name = "av", desc = "(III)I", opaque = "-1494814597")
	public int method7082(int var1, int var2) {
		long var4 = (long)(var2 + (var1 << 16));
		return this.field4370 != null && this.field4370.field5234 == var4 ? this.field4388.field5471 * 99 / (this.field4388.field5472.length - this.field4370.field4429) + 1 : 0;
	}

	@ObfInfo(name = "ab", desc = "(ZZB)I", opaque = "28")
	public int method7075(boolean var1, boolean var2) {
		int var4 = 0;
		if (var1) {
			var4 += this.field4377 + this.field4379;
		}

		if (var2) {
			var4 += this.field4382 + this.field4384;
		}

		return var4;
	}

	@ObfInfo(name = "ai", desc = "(B)V", opaque = "0")
	public void method7079() {
		if (this.field4374 != null) {
			try {
				this.field4374.method8644();
			} catch (Exception var3) {
			}

			this.field4374 = null;
		}

	}
}
