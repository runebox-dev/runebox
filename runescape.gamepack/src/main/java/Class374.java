import java.io.IOException;
import java.util.zip.CRC32;

public class Class374 {
	public Class367 field4080;
	public Class384[] field4077;
	public Class414 field4079;
	public Class481 field4085;
	public Class518 field4072;
	public Class518 field4075;
	public Class518 field4091;
	public Class518 field4094;
	public Class521 field4082;
	public Class521 field4086;
	public Class521 field4090;
	public boolean field4084;
	public byte field4070;
	public int field4073;
	public int field4076;
	public int field4078;
	public int field4081;
	public int field4083;
	public int field4088;
	public int field4092;
	public int field4093;
	public int field4095;
	public int field4096;
	public CRC32 field4089;
	public long field4074;

	public Class374() {
		this.field4073 = 0;
		this.field4072 = new Class518(4096);
		this.field4076 = 0;
		this.field4091 = new Class518(32);
		this.field4078 = 0;
		this.field4079 = new Class414();
		this.field4075 = new Class518(4096);
		this.field4081 = 0;
		this.field4094 = new Class518(4096);
		this.field4083 = 0;
		this.field4086 = new Class521(8);
		this.field4088 = 0;
		this.field4089 = new CRC32();
		this.field4077 = new Class384[256];
		this.field4092 = -1;
		this.field4093 = 255;
		this.field4070 = 0;
		this.field4095 = 0;
		this.field4096 = 0;
	}

	public boolean method7173() {
		long var2 = Class327.method3047();
		int var4 = (int)(var2 - this.field4074);
		this.field4074 = var2;
		if (var4 > 200) {
			var4 = 200;
		}

		this.field4073 += var4;
		if (this.field4083 == 0 && this.field4078 == 0 && this.field4081 == 0 && 0 == this.field4076) {
			return true;
		} else if (this.field4085 == null) {
			return false;
		} else {
			try {
				if (this.field4073 > 30000) {
					throw new IOException();
				} else {
					Class367 var5;
					Class521 var6;
					while (this.field4078 < 200 && this.field4076 > 0) {
						var5 = (Class367)this.field4072.method9363();
						var6 = new Class521(4);
						var6.method9388(1);
						var6.method9390((int)var5.field5170);
						this.field4085.method8626(var6.field5221, 0, 4);
						this.field4091.method9360(var5, var5.field5170);
						--this.field4076;
						++this.field4078;
					}

					while (this.field4083 < 200 && this.field4081 > 0) {
						var5 = (Class367)this.field4079.method7751();
						var6 = new Class521(4);
						var6.method9388(0);
						var6.method9390((int)var5.field5170);
						this.field4085.method8626(var6.field5221, 0, 4);
						var5.method9280();
						this.field4094.method9360(var5, var5.field5170);
						--this.field4081;
						++this.field4083;
					}

					for (int var20 = 0; var20 < 100; ++var20) {
						int var21 = this.field4085.method8622();
						if (var21 < 0) {
							throw new IOException();
						}

						if (var21 == 0) {
							break;
						}

						this.field4073 = 0;
						byte var7 = 0;
						if (this.field4080 == null) {
							var7 = 8;
						} else if (0 == this.field4088) {
							var7 = 1;
						}

						int var8;
						int var9;
						int var10;
						byte[] var10000;
						int var10001;
						Class521 var23;
						if (var7 > 0) {
							var8 = var7 - this.field4086.field5219;
							if (var8 > var21) {
								var8 = var21;
							}

							this.field4085.method8624(this.field4086.field5221, this.field4086.field5219, var8);
							if (this.field4070 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4086.field5221;
									var10001 = var9 + this.field4086.field5219;
									var10000[var10001] ^= this.field4070;
								}
							}

							var23 = this.field4086;
							var23.field5219 += var8;
							if (this.field4086.field5219 < var7) {
								break;
							}

							if (this.field4080 == null) {
								this.field4086.field5219 = 0;
								var9 = this.field4086.method9405();
								var10 = this.field4086.method9407();
								int var11 = this.field4086.method9405();
								int var12 = this.field4086.method9410();
								long var13 = (long)((var9 << 16) + var10);
								Class367 var15 = (Class367)this.field4091.method9361(var13);
								this.field4084 = true;
								if (var15 == null) {
									var15 = (Class367)this.field4094.method9361(var13);
									this.field4084 = false;
								}

								if (var15 == null) {
									throw new IOException();
								}

								int var16 = var11 == 0 ? 5 : 9;
								this.field4080 = var15;
								this.field4082 = new Class521(this.field4080.field4003 + var16 + var12);
								this.field4082.method9388(var11);
								this.field4082.method9590(var12);
								this.field4088 = 8;
								this.field4086.field5219 = 0;
							} else if (this.field4088 == 0) {
								if (this.field4086.field5221[0] == -1) {
									this.field4088 = 1;
									this.field4086.field5219 = 0;
								} else {
									this.field4080 = null;
								}
							}
						} else {
							var8 = this.field4082.field5221.length - this.field4080.field4003;
							var9 = 512 - this.field4088;
							if (var9 > var8 - this.field4082.field5219) {
								var9 = var8 - this.field4082.field5219;
							}

							if (var9 > var21) {
								var9 = var21;
							}

							this.field4085.method8624(this.field4082.field5221, this.field4082.field5219, var9);
							if (this.field4070 != 0) {
								for (var10 = 0; var10 < var9; ++var10) {
									var10000 = this.field4082.field5221;
									var10001 = this.field4082.field5219 + var10;
									var10000[var10001] ^= this.field4070;
								}
							}

							var23 = this.field4082;
							var23.field5219 += var9;
							this.field4088 += var9;
							if (this.field4082.field5219 == var8) {
								if (this.field4080.field5170 == 16711935L) {
									this.field4090 = this.field4082;

									for (var10 = 0; var10 < 256; ++var10) {
										Class384 var22 = this.field4077[var10];
										if (var22 != null) {
											this.method7156(var22, var10);
										}
									}
								} else {
									this.field4089.reset();
									this.field4089.update(this.field4082.field5221, 0, var8);
									var10 = (int)this.field4089.getValue();
									if (this.field4080.field4000 != var10) {
										try {
											this.field4085.method8631();
										} catch (Exception var18) {
										}

										++this.field4095;
										this.field4085 = null;
										this.field4070 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4095 = 0;
									this.field4096 = 0;
									this.field4080.field4002.method7363((int)(this.field4080.field5170 & 65535L), this.field4082.field5221, (this.field4080.field5170 & 16711680L) == 16711680L, this.field4084);
								}

								this.field4080.method9277();
								if (this.field4084) {
									--this.field4078;
								} else {
									--this.field4083;
								}

								this.field4088 = 0;
								this.field4080 = null;
								this.field4082 = null;
							} else {
								if (this.field4088 != 512) {
									break;
								}

								this.field4088 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					this.field4085.method8631();
				} catch (Exception var17) {
				}

				++this.field4096;
				this.field4085 = null;
				return false;
			}
		}
	}

	public void method7166(boolean var1) {
		if (this.field4085 != null) {
			try {
				Class521 var3 = new Class521(4);
				var3.method9388(var1 ? 2 : 3);
				var3.method9390(0);
				this.field4085.method8626(var3.field5221, 0, 4);
			} catch (IOException var6) {
				try {
					this.field4085.method8631();
				} catch (Exception var5) {
				}

				++this.field4096;
				this.field4085 = null;
			}

		}
	}

	public void method7154(Class481 var1, boolean var2) {
		if (this.field4085 != null) {
			try {
				this.field4085.method8631();
			} catch (Exception var8) {
			}

			this.field4085 = null;
		}

		this.field4085 = var1;
		this.method7166(var2);
		this.field4086.field5219 = 0;
		this.field4080 = null;
		this.field4082 = null;
		this.field4088 = 0;

		while (true) {
			Class367 var4 = (Class367)this.field4091.method9363();
			if (var4 == null) {
				while (true) {
					var4 = (Class367)this.field4094.method9363();
					if (var4 == null) {
						if (this.field4070 != 0) {
							try {
								Class521 var9 = new Class521(4);
								var9.method9388(4);
								var9.method9388(this.field4070);
								var9.method9389(0);
								this.field4085.method8626(var9.field5221, 0, 4);
							} catch (IOException var7) {
								try {
									this.field4085.method8631();
								} catch (Exception var6) {
								}

								++this.field4096;
								this.field4085 = null;
							}
						}

						this.field4073 = 0;
						this.field4074 = Class327.method3047();
						return;
					}

					this.field4079.method7750(var4);
					this.field4075.method9360(var4, var4.field5170);
					++this.field4081;
					--this.field4083;
				}
			}

			this.field4072.method9360(var4, var4.field5170);
			++this.field4076;
			--this.field4078;
		}
	}

	public void method7155(Class384 var1, int var2) {
		if (var1.field4500 && !var1.field4506) {
			if (var2 <= this.field4092) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4093) {
				this.field4093 = var2;
			}
		} else {
			if (var2 >= this.field4093) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4092) {
				this.field4092 = var2;
			}
		}

		if (this.field4090 != null) {
			this.method7156(var1, var2);
		} else {
			this.method7157((Class384)null, Class375.field4101.field4121, 255, 0, (byte)0, true);
			this.field4077[var2] = var1;
		}
	}

	public void method7156(Class384 var1, int var2) {
		this.field4090.field5219 = var2 * 8 + 5;
		if (this.field4090.field5219 >= this.field4090.field5221.length) {
			if (var1.field4500) {
				var1.method7323();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var4 = this.field4090.method9410();
			int var5 = this.field4090.method9410();
			var1.method7346(var4, var5);
		}
	}

	public void method7157(Class384 var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var8 = (long)((var2 << 16) + var3);
		Class367 var10 = (Class367)this.field4072.method9361(var8);
		if (var10 == null) {
			var10 = (Class367)this.field4091.method9361(var8);
			if (var10 == null) {
				var10 = (Class367)this.field4075.method9361(var8);
				if (var10 != null) {
					if (var6) {
						var10.method9280();
						this.field4072.method9360(var10, var8);
						--this.field4081;
						++this.field4076;
					}

				} else {
					if (!var6) {
						var10 = (Class367)this.field4094.method9361(var8);
						if (var10 != null) {
							return;
						}
					}

					var10 = new Class367();
					var10.field4002 = var1;
					var10.field4000 = var4;
					var10.field4003 = var5;
					if (var6) {
						this.field4072.method9360(var10, var8);
						++this.field4076;
					} else {
						this.field4079.method7753(var10);
						this.field4075.method9360(var10, var8);
						++this.field4081;
					}

				}
			}
		}
	}

	public void method7165(int var1, int var2) {
		long var4 = (long)((var1 << 16) + var2);
		Class367 var6 = (Class367)this.field4075.method9361(var4);
		if (var6 != null) {
			this.field4079.method7750(var6);
		}
	}

	public int method7159(int var1, int var2) {
		long var4 = (long)((var1 << 16) + var2);
		return this.field4080 != null && var4 == this.field4080.field5170 ? this.field4082.field5219 * 99 / (this.field4082.field5221.length - this.field4080.field4003) + 1 : 0;
	}

	public int method7161(boolean var1, boolean var2) {
		int var4 = 0;
		if (var1) {
			var4 += this.field4076 + this.field4078;
		}

		if (var2) {
			var4 += this.field4081 + this.field4083;
		}

		return var4;
	}

	public void method7176() {
		if (this.field4085 != null) {
			try {
				this.field4085.method8631();
			} catch (Exception var3) {
			}

			this.field4085 = null;
		}

	}

	public static void method7189(Class340 var0, int var1, int var2) {
		Class358 var4 = var0.field3764;
		boolean var5 = var4.field3946 != var2;
		var4.field3946 = var2;
		if (var5) {
			int var6;
			int var7;
			if (var4.field3946 == var1) {
				for (var6 = 0; var6 < Class358.field3955.length; ++var6) {
					var7 = Class358.field3955[var6];
					if (var4.field3950[var7] > 0 && var4.field3950[var7] < 512) {
						var4.field3950[var7] = var4.field3953[var7];
					}
				}
			} else {
				label84: {
					if (var4.field3950[0] >= 512) {
						boolean var11;
						if (var4.field3950[0] < 512) {
							var11 = false;
						} else {
							Class232 var12 = Class7.method109(var4.field3950[0] - 512);
							var11 = Class229.field2411.field2414 != var12.field2465 && var12.field2466 != Class229.field2411.field2414;
						}

						if (!var11) {
							break label84;
						}
					}

					var4.field3950[Class229.field2411.field2414] = 1;
				}

				for (var6 = 0; var6 < 7; ++var6) {
					var7 = Class358.field3955[var6];
					if (var4.field3950[var7] > 0 && var4.field3950[var7] < 512) {
						int[] var8 = var4.field3950;

						for (int var9 = 0; var9 < Client.field4711; ++var9) {
							Class197 var10 = Class197.method3060(var9);
							if (var10 != null && !var10.field2014 && var6 + (var2 == 1 ? 7 : 0) == var10.field2023) {
								var8[Class358.field3955[var6]] = var9 + 256;
								break;
							}
						}
					}
				}
			}
		}

		var4.method7055();
	}
}
