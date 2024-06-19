import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class108 {
	public Class256[] field1390;
	public Class521 field1401;
	public Class521[] field1391;
	public Class98 field1388;
	public byte[] field1389;
	public int field1392;
	public int field1400;
	public int field1403;
	public int[] field1386;
	public int[] field1393;
	public int[] field1395;
	public int[] field1396;
	public int[] field1397;
	public int[] field1399;

	public Class108(Class98 var1) {
		this.field1389 = new byte[2048];
		this.field1390 = new Class256[2048];
		this.field1391 = new Class521[2048];
		this.field1392 = 0;
		this.field1393 = new int[2048];
		this.field1403 = 0;
		this.field1395 = new int[2048];
		this.field1396 = new int[2048];
		this.field1397 = new int[2048];
		this.field1386 = new int[2048];
		this.field1400 = 0;
		this.field1399 = new int[2048];
		this.field1401 = new Class521(new byte[5000]);
		this.field1388 = var1;
	}

	public final void method2785(Class531 var1, boolean var2) {
		var1.method9765();
		Class83 var4 = new Class83();
		int var5 = Client.field646;
		if (var2) {
			Client.field107 = var4;
			Client.field3857.field1293[var5] = var4;
		} else {
			this.field1388.field1293[var5] = var4;
			Client.field107.field1007 = this.field1388;
		}

		var4.field1030 = var5;
		int var6 = var1.method9770(30);
		byte var7 = (byte)(var6 >> 28);
		int var8 = var6 >> 14 & 16383;
		int var9 = var6 & 16383;
		var4.field1080[0] = var8 - this.field1388.field1289;
		var4.field1065 = (var4.field1080[0] << 7) + (var4.method2258() << 6);
		var4.field1127[0] = var9 - this.field1388.field1285;
		var4.field1126 = (var4.field1127[0] << 7) + (var4.method2258() << 6);
		if (var2) {
			this.field1388.field1300 = var4.field1023 = var7;
		}

		if (this.field1391[var5] != null) {
			var4.method2270(this.field1391[var5]);
		}

		this.field1392 = 0;
		this.field1393[++this.field1392 - 1] = var5;
		this.field1389[var5] = 0;
		this.field1403 = 0;

		for (int var10 = 1; var10 < 2048; ++var10) {
			if (var10 != var5) {
				int var11 = var1.method9770(18);
				int var12 = var11 >> 16;
				int var13 = var11 >> 8 & 597;
				int var14 = var11 & 597;
				this.field1396[var10] = (var13 << 14) + (var12 << 28) + var14;
				this.field1397[var10] = 0;
				this.field1386[var10] = -1;
				this.field1395[++this.field1403 - 1] = var10;
				this.field1389[var10] = 0;
			}
		}

		var1.method9799();
	}

	public final void method2786(Class531 var1, int var2) {
		int var4 = var1.field5219;
		this.field1400 = 0;
		this.method2787(var1);
		this.method2808(var1);
		if (var2 != var1.field5219 - var4) {
			throw new RuntimeException(var1.field5219 - var4 + " " + var2);
		}
	}

	public final void method2787(Class531 var1) {
		int var3 = 0;
		var1.method9765();

		byte[] var10000;
		int var4;
		int var5;
		int var6;
		for (var4 = 0; var4 < this.field1392; ++var4) {
			var5 = this.field1393[var4];
			if ((this.field1389[var5] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = this.field1389;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var6 = var1.method9770(1);
					if (var6 == 0) {
						var3 = this.method2788(var1);
						var10000 = this.field1389;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						this.method2789(var1, var5);
					}
				}
			}
		}

		var1.method9799();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var1.method9765();

			for (var4 = 0; var4 < this.field1392; ++var4) {
				var5 = this.field1393[var4];
				if (0 != (this.field1389[var5] & 1)) {
					if (var3 > 0) {
						--var3;
						var10000 = this.field1389;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var6 = var1.method9770(1);
						if (var6 == 0) {
							var3 = this.method2788(var1);
							var10000 = this.field1389;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							this.method2789(var1, var5);
						}
					}
				}
			}

			var1.method9799();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var1.method9765();

				for (var4 = 0; var4 < this.field1403; ++var4) {
					var5 = this.field1395[var4];
					if (0 != (this.field1389[var5] & 1)) {
						if (var3 > 0) {
							--var3;
							var10000 = this.field1389;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var6 = var1.method9770(1);
							if (var6 == 0) {
								var3 = this.method2788(var1);
								var10000 = this.field1389;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (this.method2790(var1, var5)) {
								var10000 = this.field1389;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var1.method9799();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var1.method9765();

					for (var4 = 0; var4 < this.field1403; ++var4) {
						var5 = this.field1395[var4];
						if (0 == (this.field1389[var5] & 1)) {
							if (var3 > 0) {
								--var3;
								var10000 = this.field1389;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var6 = var1.method9770(1);
								if (var6 == 0) {
									var3 = this.method2788(var1);
									var10000 = this.field1389;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (this.method2790(var1, var5)) {
									var10000 = this.field1389;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var1.method9799();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						this.field1392 = 0;
						this.field1403 = 0;

						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = this.field1389;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Class83 var7 = this.field1388.field1293[var4];
							if (var7 != null) {
								this.field1393[++this.field1392 - 1] = var4;
							} else {
								this.field1395[++this.field1403 - 1] = var4;
							}
						}

					}
				}
			}
		}
	}

	public int method2788(Class531 var1) {
		int var3 = var1.method9770(2);
		int var4;
		if (var3 == 0) {
			var4 = 0;
		} else if (var3 == 1) {
			var4 = var1.method9770(5);
		} else if (var3 == 2) {
			var4 = var1.method9770(8);
		} else {
			var4 = var1.method9770(11);
		}

		return var4;
	}

	public void method2789(Class531 var1, int var2) {
		boolean var4 = var1.method9770(1) == 1;
		if (var4) {
			this.field1399[++this.field1400 - 1] = var2;
		}

		int var5 = var1.method9770(2);
		Class83 var6 = this.field1388.field1293[var2];
		if (var5 == 0) {
			if (var4) {
				var6.field1034 = false;
			} else if (Client.field646 == var2) {
				throw new RuntimeException();
			} else {
				this.field1396[var2] = (this.field1388.field1285 + var6.field1127[0] >> 13) + (var6.field1023 << 28) + (var6.field1080[0] + this.field1388.field1289 >> 13 << 14);
				if (var6.field1055 != -1) {
					this.field1397[var2] = var6.field1055;
				} else {
					this.field1397[var2] = var6.field1133;
				}

				this.field1386[var2] = var6.field1070;
				this.field1388.field1293[var2] = null;
				if (var1.method9770(1) != 0) {
					this.method2790(var1, var2);
				}

			}
		} else {
			int var7;
			int var8;
			int var9;
			if (var5 == 1) {
				var7 = var1.method9770(3);
				var8 = var6.field1080[0];
				var9 = var6.field1127[0];
				if (var7 == 0) {
					--var8;
					--var9;
				} else if (var7 == 1) {
					--var9;
				} else if (var7 == 2) {
					++var8;
					--var9;
				} else if (var7 == 3) {
					--var8;
				} else if (var7 == 4) {
					++var8;
				} else if (var7 == 5) {
					--var8;
					++var9;
				} else if (var7 == 6) {
					++var9;
				} else if (var7 == 7) {
					++var8;
					++var9;
				}

				if (Client.field646 != var2 || !this.field1388.method2500() || var6.field1065 >= 1536 && var6.field1126 >= 1536 && var6.field1065 < 11776 && var6.field1126 < 11776) {
					if (var4) {
						var6.field1034 = true;
						var6.field1035 = var8;
						var6.field1036 = var9;
					} else {
						var6.field1034 = false;
						var6.method2261(this.field1388, var8, var9, this.field1390[var2]);
					}
				} else {
					var6.method2249(var8, var9);
					var6.field1034 = false;
				}

			} else if (var5 == 2) {
				var7 = var1.method9770(4);
				var8 = var6.field1080[0];
				var9 = var6.field1127[0];
				if (var7 == 0) {
					var8 -= 2;
					var9 -= 2;
				} else if (var7 == 1) {
					--var8;
					var9 -= 2;
				} else if (var7 == 2) {
					var9 -= 2;
				} else if (var7 == 3) {
					++var8;
					var9 -= 2;
				} else if (var7 == 4) {
					var8 += 2;
					var9 -= 2;
				} else if (var7 == 5) {
					var8 -= 2;
					--var9;
				} else if (var7 == 6) {
					var8 += 2;
					--var9;
				} else if (var7 == 7) {
					var8 -= 2;
				} else if (var7 == 8) {
					var8 += 2;
				} else if (var7 == 9) {
					var8 -= 2;
					++var9;
				} else if (var7 == 10) {
					var8 += 2;
					++var9;
				} else if (var7 == 11) {
					var8 -= 2;
					var9 += 2;
				} else if (var7 == 12) {
					--var8;
					var9 += 2;
				} else if (var7 == 13) {
					var9 += 2;
				} else if (var7 == 14) {
					++var8;
					var9 += 2;
				} else if (var7 == 15) {
					var8 += 2;
					var9 += 2;
				}

				if (var2 == Client.field646 && this.field1388.method2500() && (var6.field1065 < 1536 || var6.field1126 < 1536 || var6.field1065 >= 11776 || var6.field1126 >= 11776)) {
					var6.method2249(var8, var9);
					var6.field1034 = false;
				} else if (var4) {
					var6.field1034 = true;
					var6.field1035 = var8;
					var6.field1036 = var9;
				} else {
					var6.field1034 = false;
					var6.method2261(this.field1388, var8, var9, this.field1390[var2]);
				}

			} else {
				var7 = var1.method9770(1);
				int var10;
				int var11;
				int var12;
				int var13;
				if (var7 == 0) {
					var8 = var1.method9770(12);
					var9 = var8 >> 10;
					var10 = var8 >> 5 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var8 & 31;
					if (var11 > 15) {
						var11 -= 32;
					}

					var12 = var6.field1080[0] + var10;
					var13 = var11 + var6.field1127[0];
					if (Client.field646 != var2 || !this.field1388.method2500() || var6.field1065 >= 1536 && var6.field1126 >= 1536 && var6.field1065 < 11776 && var6.field1126 < 11776) {
						if (var4) {
							var6.field1034 = true;
							var6.field1035 = var12;
							var6.field1036 = var13;
						} else {
							var6.field1034 = false;
							var6.method2261(this.field1388, var12, var13, this.field1390[var2]);
						}
					} else {
						var6.method2249(var12, var13);
						var6.field1034 = false;
					}

					var6.field1023 = (byte)(var9 + var6.field1023 & 3);
					if (Client.field646 == var2 && this.field1388.method2500()) {
						this.field1388.field1300 = var6.field1023;
					}

				} else {
					var8 = var1.method9770(30);
					var9 = var8 >> 28;
					var10 = var8 >> 14 & 16383;
					var11 = var8 & 16383;
					var12 = (var6.field1080[0] + this.field1388.field1289 + var10 & 16383) - this.field1388.field1289;
					var13 = (this.field1388.field1285 + var6.field1127[0] + var11 & 16383) - this.field1388.field1285;
					if (var2 != Client.field646 || !this.field1388.method2500() || var6.field1065 >= 1536 && var6.field1126 >= 1536 && var6.field1065 < 11776 && var6.field1126 < 11776) {
						if (var4) {
							var6.field1034 = true;
							var6.field1035 = var12;
							var6.field1036 = var13;
						} else {
							var6.field1034 = false;
							var6.method2261(this.field1388, var12, var13, this.field1390[var2]);
						}
					} else {
						var6.method2249(var12, var13);
						var6.field1034 = false;
					}

					var6.field1023 = (byte)(var9 + var6.field1023 & 3);
					if (Client.field646 == var2 && this.field1388.method2500()) {
						this.field1388.field1300 = var6.field1023;
					}

				}
			}
		}
	}

	public boolean method2790(Class531 var1, int var2) {
		int var4 = var1.method9770(2);
		int var5;
		int var6;
		int var9;
		int var10;
		int var11;
		int var12;
		if (var4 == 0) {
			if (var1.method9770(1) != 0) {
				this.method2790(var1, var2);
			}

			var5 = var1.method9770(13);
			var6 = var1.method9770(13);
			boolean var13 = var1.method9770(1) == 1;
			if (var13) {
				this.field1399[++this.field1400 - 1] = var2;
			}

			if (this.field1388.field1293[var2] != null) {
				throw new RuntimeException();
			} else {
				Class83 var14 = this.field1388.field1293[var2] = new Class83();
				var14.field1030 = var2;
				if (null != this.field1391[var2]) {
					var14.method2270(this.field1391[var2]);
				}

				var14.field1133 = this.field1397[var2];
				var14.field1070 = this.field1386[var2];
				var9 = this.field1396[var2];
				var10 = var9 >> 28;
				var11 = var9 >> 14 & 255;
				var12 = var9 & 255;
				var14.field1128[0] = this.field1390[var2];
				var14.field1023 = (byte)var10;
				var14.method2249(var5 + (var11 << 13) - this.field1388.field1289, (var12 << 13) + var6 - this.field1388.field1285);
				var14.field1034 = false;
				return true;
			}
		} else if (var4 == 1) {
			var5 = var1.method9770(2);
			var6 = this.field1396[var2];
			this.field1396[var2] = (var6 & 268435455) + ((var5 + (var6 >> 28) & 3) << 28);
			return false;
		} else {
			int var7;
			int var8;
			if (var4 == 2) {
				var5 = var1.method9770(5);
				var6 = var5 >> 3;
				var7 = var5 & 7;
				var8 = this.field1396[var2];
				var9 = (var8 >> 28) + var6 & 3;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				if (var7 == 0) {
					--var10;
					--var11;
				}

				if (var7 == 1) {
					--var11;
				}

				if (var7 == 2) {
					++var10;
					--var11;
				}

				if (var7 == 3) {
					--var10;
				}

				if (var7 == 4) {
					++var10;
				}

				if (var7 == 5) {
					--var10;
					++var11;
				}

				if (var7 == 6) {
					++var11;
				}

				if (var7 == 7) {
					++var10;
					++var11;
				}

				this.field1396[var2] = (var10 << 14) + (var9 << 28) + var11;
				return false;
			} else {
				var5 = var1.method9770(18);
				var6 = var5 >> 16;
				var7 = var5 >> 8 & 255;
				var8 = var5 & 255;
				var9 = this.field1396[var2];
				var10 = var6 + (var9 >> 28) & 3;
				var11 = (var9 >> 14) + var7 & 255;
				var12 = var9 + var8 & 255;
				this.field1396[var2] = var12 + (var10 << 28) + (var11 << 14);
				return false;
			}
		}
	}

	public final void method2808(Class531 var1) {
		for (int var3 = 0; var3 < this.field1400; ++var3) {
			int var4 = this.field1399[var3];
			Class83 var5 = this.field1388.field1293[var4];
			int var6 = var1.method9405();
			if ((var6 & 64) != 0) {
				var6 += var1.method9405() << 8;
			}

			if ((var6 & 32768) != 0) {
				var6 += var1.method9405() << 16;
			}

			this.method2792(var1, var4, var5, var6);
		}

	}

	public final void method2792(Class531 var1, int var2, Class83 var3, int var4) {
		byte var6 = Class256.field2698.field2707;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if ((var4 & 128) != 0) {
			var7 = var1.method9522();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var10 = -1;
					var11 = -1;
					var12 = -1;
					var9 = var1.method9419();
					if (var9 == 32767) {
						var9 = var1.method9419();
						var11 = var1.method9419();
						var10 = var1.method9419();
						var12 = var1.method9419();
					} else if (var9 != 32766) {
						var11 = var1.method9419();
					} else {
						var9 = -1;
					}

					var13 = var1.method9419();
					var3.method2309(var9, var11, var10, var12, Client.field778, var13);
				}
			}

			var8 = var1.method9522();
			if (var8 > 0) {
				for (var9 = 0; var9 < var8; ++var9) {
					var10 = var1.method9419();
					var11 = var1.method9419();
					if (var11 != 32767) {
						var12 = var1.method9419();
						var13 = var1.method9437();
						var14 = var11 > 0 ? var1.method9522() : var13;
						var3.method2310(var10, Client.field778, var11, var12, var13, var14);
					} else {
						var3.method2339(var10);
					}
				}
			}
		}

		if ((var4 & 2) != 0) {
			var7 = var1.method9445();
			Class371 var23 = (Class371)Class62.method1112(Class371.method2873(), var1.method9438());
			boolean var25 = var1.method9437() == 1;
			var10 = var1.method9405();
			var11 = var1.field5219;
			if (var3.field1025 != null && var3.field1029 != null) {
				boolean var32 = false;
				if (var23.field4021 && Client.field274.method1878(var3.field1025)) {
					var32 = true;
				}

				if (!var32 && 0 == Client.field608 && !var3.field1015) {
					this.field1401.field5219 = 0;
					var1.method9417(this.field1401.field5221, 0, var10);
					this.field1401.field5219 = 0;
					String var33 = Class436.method7992(Class412.method7137(Class339.method6268(this.field1401)));
					var3.field1075 = var33.trim();
					var3.field1104 = var7 >> 8;
					var3.field1081 = var7 & 255;
					var3.field1069 = 150;
					var3.field1062 = null;
					var3.field1072 = var25;
					var3.field1078 = Client.field107 != var3 && var23.field4021 && !Client.field483.isEmpty() && var33.toLowerCase().indexOf(Client.field483) == -1;
					if (var23.field4031) {
						var14 = var25 ? 91 : 1;
					} else {
						var14 = var25 ? 90 : 2;
					}

					if (-1 != var23.field4026) {
						Class128.method2747(var14, Class322.method6223(var23.field4026) + var3.field1025.method10260(), var33);
					} else {
						Class128.method2747(var14, var3.field1025.method10260(), var33);
					}
				}
			}

			var1.field5219 = var11 + var10;
		}

		if (0 != (var4 & 32)) {
			var3.field1075 = var1.method9415();
			if (var3.field1075.charAt(0) == '~') {
				var3.field1075 = var3.field1075.substring(1);
				Class128.method2747(2, var3.field1025.method10260(), var3.field1075);
			} else if (Client.field107 == var3) {
				Class128.method2747(2, var3.field1025.method10260(), var3.field1075);
			}

			var3.field1072 = false;
			var3.field1104 = 0;
			var3.field1081 = 0;
			var3.field1069 = 150;
		}

		if ((var4 & 512) != 0) {
			var7 = var1.method9407();
			var8 = var7 >> 8;
			var9 = var8 >= 13 && var8 <= 20 ? var8 - 12 : 0;
			Class371 var28 = (Class371)Class62.method1112(Class371.method2873(), var1.method9437());
			boolean var31 = var1.method9438() == 1;
			var12 = var1.method9438();
			var13 = var1.field5219;
			if (var3.field1025 != null && var3.field1029 != null) {
				boolean var34 = false;
				if (var28.field4021 && Client.field274.method1878(var3.field1025)) {
					var34 = true;
				}

				if (!var34 && 0 == Client.field608 && !var3.field1015) {
					this.field1401.field5219 = 0;
					var1.method9402(this.field1401.field5221, 0, var12);
					this.field1401.field5219 = 0;
					String var15 = Class436.method7992(Class412.method7137(Class339.method6268(this.field1401)));
					var3.field1075 = var15.trim();
					var3.field1104 = var7 >> 8;
					var3.field1081 = var7 & 255;
					var3.field1069 = 150;
					byte[] var16 = null;
					if (var9 > 0 && var9 <= 8) {
						var16 = new byte[var9];

						for (int var17 = 0; var17 < var9; ++var17) {
							var16[var17] = var1.method9406();
						}
					}

					int[] var18;
					if (var16 != null && 0 != var16.length && var16.length <= 8) {
						int[] var20 = new int[var16.length];
						int var21 = 0;

						while (true) {
							if (var21 >= var16.length) {
								var18 = var20;
								break;
							}

							if (var16[var21] < 0 || var16[var21] >= Class559.field5407.length) {
								var18 = null;
								break;
							}

							var20[var21] = Class559.field5407[var16[var21]];
							++var21;
						}
					} else {
						var18 = null;
					}

					var3.field1062 = var18;
					var3.field1072 = var31;
					var3.field1078 = Client.field107 != var3 && var28.field4021 && !Client.field483.isEmpty() && var15.toLowerCase().indexOf(Client.field483) == -1;
					int var35;
					if (var28.field4031) {
						var35 = var31 ? 91 : 1;
					} else {
						var35 = var31 ? 90 : 2;
					}

					if (-1 != var28.field4026) {
						Class128.method2747(var35, Class322.method6223(var28.field4026) + var3.field1025.method10260(), var15);
					} else {
						Class128.method2747(var35, var3.field1025.method10260(), var15);
					}
				}
			}

			var1.field5219 = var9 + var13 + var12;
		}

		if ((var4 & 256) != 0) {
			Class256[] var22 = this.field1390;
			Class256[] var29 = new Class256[]{Class256.field2697, Class256.field2701, Class256.field2699, Class256.field2703, Class256.field2704, Class256.field2705, Class256.field2706, Class256.field2700, Class256.field2698};
			var22[var2] = (Class256)Class62.method1112(var29, var1.method9406());
		}

		if (0 != (var4 & 8192)) {
			var6 = var1.method9439();
		}

		if (0 != (var4 & 4)) {
			var7 = var1.method9405();
			byte[] var24 = new byte[var7];
			Class521 var30 = new Class521(var24);
			var1.method9417(var24, 0, var7);
			this.field1391[var2] = var30;
			var3.method2270(var30);
		}

		if ((var4 & 1) != 0) {
			var3.field1055 = var1.method9445();
			if (0 == var3.field1125) {
				var3.field1133 = var3.field1055;
				var3.method2334();
			}
		}

		if (0 != (var4 & 16384)) {
			for (var7 = 0; var7 < 3; ++var7) {
				var3.field1012[var7] = var1.method9415();
			}
		}

		if ((var4 & 2048) != 0) {
			var3.field1116 = Client.field778 + var1.method9407();
			var3.field1117 = Client.field778 + var1.method9445();
			var3.field1118 = var1.method9440();
			var3.field1119 = var1.method9574();
			var3.field1120 = var1.method9406();
			var3.field1121 = (byte)var1.method9522();
		}

		if (0 != (var4 & 1024)) {
			var3.field1107 = var1.method9406();
			var3.field1109 = var1.method9440();
			var3.field1108 = var1.method9574();
			var3.field1110 = var1.method9440();
			var3.field1111 = var1.method9407() + Client.field778;
			var3.field1112 = var1.method9445() + Client.field778;
			var3.field1113 = var1.method9505();
			if (var3.field1034) {
				var3.field1107 += var3.field1035;
				var3.field1109 += var3.field1036;
				var3.field1108 += var3.field1035;
				var3.field1110 += var3.field1036;
				var3.field1125 = 0;
			} else {
				var3.field1107 += var3.field1080[0];
				var3.field1109 += var3.field1127[0];
				var3.field1108 += var3.field1080[0];
				var3.field1110 += var3.field1127[0];
				var3.field1125 = 1;
			}

			var3.field1077 = 0;
		}

		if ((var4 & 16) != 0) {
			var7 = var1.method9407();
			if (var7 == 65535) {
				var7 = -1;
			}

			var8 = var1.method9405();
			Client.method3578(var3, var7, var8);
		}

		if (0 != (var4 & 8)) {
			var3.field1070 = var1.method9445();
			var3.field1070 += var1.method9522() << 16;
			var7 = 16777215;
			if (var3.field1070 == var7) {
				var3.field1070 = -1;
			}
		}

		if ((var4 & 65536) != 0) {
			var7 = var1.method9405();

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var1.method9405();
				var10 = var1.method9505();
				var11 = var1.method9410();
				var3.method2331(var9, var10, var11 >> 16, var11 & 65535);
			}
		}

		if (var3.field1034) {
			if (var6 == 127) {
				var3.method2249(var3.field1035, var3.field1036);
			} else {
				Class256 var26;
				if (Class256.field2698.field2707 != var6) {
					Class256[] var27 = new Class256[]{Class256.field2697, Class256.field2701, Class256.field2699, Class256.field2703, Class256.field2704, Class256.field2705, Class256.field2706, Class256.field2700, Class256.field2698};
					var26 = (Class256)Class62.method1112(var27, var6);
				} else {
					var26 = this.field1390[var2];
				}

				var3.method2261(this.field1388, var3.field1035, var3.field1036, var26);
			}
		}

	}

	public static void method2812(Class521 var0, int var1) {
		Class34 var3 = new Class34();
		var3.field246 = var0.method9405();
		var3.field251 = var0.method9410();
		var3.field247 = new int[var3.field246];
		var3.field248 = new int[var3.field246];
		var3.field245 = new Field[var3.field246];
		var3.field249 = new int[var3.field246];
		var3.field250 = new Method[var3.field246];
		var3.field252 = new byte[var3.field246][][];

		for (int var4 = 0; var4 < var3.field246; ++var4) {
			try {
				int var5 = var0.method9405();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method9415();
						var7 = var0.method9415();
						var8 = var0.method9405();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method9415();
						}

						String var26 = var0.method9415();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method9410();
								var11[var12] = new byte[var13];
								var0.method9417(var11[var12], 0, var13);
							}
						}

						var3.field247[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = Class95.method2488(var9[var13]);
						}

						Class var28 = Class95.method2488(var26);
						if (Class95.method2488(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = Class95.method2488(var6).getDeclaredMethods();

						for (int var16 = 0; var16 < var14.length; ++var16) {
							Method var17 = var14[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var18.length == var27.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var18[var20] != var27[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var17.getReturnType() == var28) {
										var3.field250[var4] = var17;
									}
								}
							}
						}

						var3.field252[var4] = var11;
					}
				} else {
					var6 = var0.method9415();
					var7 = var0.method9415();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method9410();
					}

					var3.field247[var4] = var5;
					var3.field249[var4] = var8;
					if (Class95.method2488(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field245[var4] = Class95.method2488(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field248[var4] = -1;
			} catch (SecurityException var22) {
				var3.field248[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field248[var4] = -3;
			} catch (Exception var24) {
				var3.field248[var4] = -4;
			} catch (Throwable var25) {
				var3.field248[var4] = -5;
			}
		}

		Class47.field323.method7597(var3);
	}
}
