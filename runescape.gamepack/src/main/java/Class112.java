import io.runebox.ObfInfo;

@ObfInfo(name = "eh")
public class Class112 {
	@ObfInfo(name = "ap", desc = "[Ljb;")
	public Class236[] field1404;
	@ObfInfo(name = "ac", desc = "Lvp;")
	public Class562 field1415;
	@ObfInfo(name = "an", desc = "[Lvp;")
	public Class562[] field1405;
	@ObfInfo(name = "ag", desc = "Lde;")
	public Class83 field1417;
	@ObfInfo(name = "ak", desc = "[B")
	public byte[] field1403;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1390831493)
	public int field1402;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1634733587)
	public int field1408;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1077360317)
	public int field1413;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field1400;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field1407;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field1409;
	@ObfInfo(name = "au", desc = "[I")
	public int[] field1411;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field1412;
	@ObfInfo(name = "ax", desc = "[I")
	public int[] field1414;

	public Class112(Class83 var1) {
		this.field1403 = new byte[2048];
		this.field1404 = new Class236[2048];
		this.field1405 = new Class562[2048];
		this.field1402 = 0;
		this.field1407 = new int[2048];
		this.field1408 = 0;
		this.field1409 = new int[2048];
		this.field1400 = new int[2048];
		this.field1411 = new int[2048];
		this.field1412 = new int[2048];
		this.field1413 = 0;
		this.field1414 = new int[2048];
		this.field1415 = new Class562(new byte[5000]);
		this.field1417 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lug;ZI)V", opaque = "-275908458")
	public final void method2878(Class527 var1, boolean var2) {
		var1.method9346();
		Class80 var4 = new Class80();
		int var5 = Client.field732;
		if (var2) {
			Client.field170 = var4;
			Client.field5093.field1024[var5] = var4;
		} else {
			this.field1417.field1024[var5] = var4;
		}

		var4.field995 = var5;
		int var6 = var1.method9347(30);
		byte var7 = (byte)Class350.method6503(var6);
		int var8 = Class350.method6502(var6);
		int var9 = Class350.method6508(var6);
		var4.field1242[0] = var8 - this.field1417.field1019;
		var4.field1266 = (var4.field1242[0] << 7) + (var4.method2249() << 6);
		var4.field1284[0] = var9 - this.field1417.field1021;
		var4.field1229 = (var4.field1284[0] << 7) + (var4.method2249() << 6);
		if (var2) {
			this.field1417.field1016 = var4.field982 = var7;
		}

		if (this.field1405[var5] != null) {
			var4.method2256(this.field1405[var5]);
		}

		this.field1402 = 0;
		this.field1407[++this.field1402 - 1] = var5;
		this.field1403[var5] = 0;
		this.field1408 = 0;

		for (int var10 = 1; var10 < 2048; ++var10) {
			if (var5 != var10) {
				int var11 = var1.method9347(18);
				int var12 = var11 >> 16;
				int var13 = var11 >> 8 & 597;
				int var14 = var11 & 597;
				this.field1400[var10] = Class350.method6494(var12, var13, var14);
				this.field1411[var10] = 0;
				this.field1412[var10] = -1;
				this.field1409[++this.field1408 - 1] = var10;
				this.field1403[var10] = 0;
			}
		}

		var1.method9348();
	}

	@ObfInfo(name = "ad", desc = "(Lug;II)V", opaque = "1008044848")
	public final void method2884(Class527 var1, int var2) {
		int var4 = var1.field5471;
		this.field1413 = 0;
		this.method2879(var1);
		this.method2883(var1);
		if (var1.field5471 - var4 != var2) {
			throw new RuntimeException(var1.field5471 - var4 + " " + var2);
		}
	}

	@ObfInfo(name = "ag", desc = "(Lug;B)V", opaque = "2")
	public final void method2879(Class527 var1) {
		int var3 = 0;
		var1.method9346();

		byte[] var10000;
		int var4;
		int var5;
		int var6;
		for (var4 = 0; var4 < this.field1402; ++var4) {
			var5 = this.field1407[var4];
			if ((this.field1403[var5] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = this.field1403;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var6 = var1.method9347(1);
					if (var6 == 0) {
						var3 = this.method2880(var1);
						var10000 = this.field1403;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						this.method2881(var1, var5);
					}
				}
			}
		}

		var1.method9348();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var1.method9346();

			for (var4 = 0; var4 < this.field1402; ++var4) {
				var5 = this.field1407[var4];
				if ((this.field1403[var5] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = this.field1403;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var6 = var1.method9347(1);
						if (var6 == 0) {
							var3 = this.method2880(var1);
							var10000 = this.field1403;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							this.method2881(var1, var5);
						}
					}
				}
			}

			var1.method9348();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var1.method9346();

				for (var4 = 0; var4 < this.field1408; ++var4) {
					var5 = this.field1409[var4];
					if ((this.field1403[var5] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = this.field1403;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var6 = var1.method9347(1);
							if (var6 == 0) {
								var3 = this.method2880(var1);
								var10000 = this.field1403;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (this.method2905(var1, var5)) {
								var10000 = this.field1403;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var1.method9348();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var1.method9346();

					for (var4 = 0; var4 < this.field1408; ++var4) {
						var5 = this.field1409[var4];
						if ((this.field1403[var5] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = this.field1403;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var6 = var1.method9347(1);
								if (var6 == 0) {
									var3 = this.method2880(var1);
									var10000 = this.field1403;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (this.method2905(var1, var5)) {
									var10000 = this.field1403;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var1.method9348();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						this.field1402 = 0;
						this.field1408 = 0;

						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = this.field1403;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Class80 var7 = this.field1417.field1024[var4];
							if (var7 != null) {
								this.field1407[++this.field1402 - 1] = var4;
							} else {
								this.field1409[++this.field1408 - 1] = var4;
							}
						}

					}
				}
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(Lug;I)I", opaque = "1114269")
	public int method2880(Class527 var1) {
		int var3 = var1.method9347(2);
		int var4;
		if (var3 == 0) {
			var4 = 0;
		} else if (var3 == 1) {
			var4 = var1.method9347(5);
		} else if (var3 == 2) {
			var4 = var1.method9347(8);
		} else {
			var4 = var1.method9347(11);
		}

		return var4;
	}

	@ObfInfo(name = "ap", desc = "(Lug;II)V", opaque = "-1663991966")
	public void method2881(Class527 var1, int var2) {
		boolean var4 = var1.method9347(1) == 1;
		if (var4) {
			this.field1414[++this.field1413 - 1] = var2;
		}

		int var5 = var1.method9347(2);
		Class80 var6 = this.field1417.field1024[var2];
		if (var5 == 0) {
			if (var4) {
				var6.field999 = false;
			} else if (Client.field732 == var2) {
				throw new RuntimeException();
			} else {
				this.field1400[var2] = Class350.method6494(var6.field982, var6.field1242[0] + this.field1417.field1019 >> 13, var6.field1284[0] + this.field1417.field1021 >> 13);
				if (var6.field1265 != -1) {
					this.field1411[var2] = var6.field1265;
				} else {
					this.field1411[var2] = var6.field1295;
				}

				this.field1412[var2] = var6.field1228;
				this.field1417.field1024[var2] = null;
				if (var1.method9347(1) != 0) {
					this.method2905(var1, var2);
				}

			}
		} else {
			int var7;
			int var8;
			int var9;
			if (var5 == 1) {
				var7 = var1.method9347(3);
				var8 = var6.field1242[0];
				var9 = var6.field1284[0];
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

				if (Client.field732 != var2 || !this.field1417.method2315() || var6.field1266 >= 1536 && var6.field1229 >= 1536 && var6.field1266 < 11776 && var6.field1229 < 11776) {
					if (var4) {
						var6.field999 = true;
						var6.field990 = var8;
						var6.field1000 = var9;
					} else {
						var6.field999 = false;
						var6.method2272(this.field1417, var8, var9, this.field1404[var2]);
					}
				} else {
					var6.method2252(var8, var9);
					var6.field999 = false;
				}

			} else if (var5 == 2) {
				var7 = var1.method9347(4);
				var8 = var6.field1242[0];
				var9 = var6.field1284[0];
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

				if (Client.field732 == var2 && this.field1417.method2315() && (var6.field1266 < 1536 || var6.field1229 < 1536 || var6.field1266 >= 11776 || var6.field1229 >= 11776)) {
					var6.method2252(var8, var9);
					var6.field999 = false;
				} else if (var4) {
					var6.field999 = true;
					var6.field990 = var8;
					var6.field1000 = var9;
				} else {
					var6.field999 = false;
					var6.method2272(this.field1417, var8, var9, this.field1404[var2]);
				}

			} else {
				var7 = var1.method9347(1);
				int var10;
				int var11;
				int var12;
				int var13;
				if (var7 == 0) {
					var8 = var1.method9347(12);
					var9 = var8 >> 10;
					var10 = var8 >> 5 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var8 & 31;
					if (var11 > 15) {
						var11 -= 32;
					}

					var12 = var6.field1242[0] + var10;
					var13 = var6.field1284[0] + var11;
					if (Client.field732 != var2 || !this.field1417.method2315() || var6.field1266 >= 1536 && var6.field1229 >= 1536 && var6.field1266 < 11776 && var6.field1229 < 11776) {
						if (var4) {
							var6.field999 = true;
							var6.field990 = var12;
							var6.field1000 = var13;
						} else {
							var6.field999 = false;
							var6.method2272(this.field1417, var12, var13, this.field1404[var2]);
						}
					} else {
						var6.method2252(var12, var13);
						var6.field999 = false;
					}

					var6.field982 = (byte)(var6.field982 + var9 & 3);
					if (Client.field732 == var2 && this.field1417.method2315()) {
						this.field1417.field1016 = var6.field982;
					}

				} else {
					var8 = var1.method9347(30);
					var9 = Class350.method6503(var8);
					var10 = Class350.method6502(var8);
					var11 = Class350.method6508(var8);
					var12 = (var6.field1242[0] + this.field1417.field1019 + var10 & 16383) - this.field1417.field1019;
					var13 = (var6.field1284[0] + this.field1417.field1021 + var11 & 16383) - this.field1417.field1021;
					if (Client.field732 != var2 || !this.field1417.method2315() || var6.field1266 >= 1536 && var6.field1229 >= 1536 && var6.field1266 < 11776 && var6.field1229 < 11776) {
						if (var4) {
							var6.field999 = true;
							var6.field990 = var12;
							var6.field1000 = var13;
						} else {
							var6.field999 = false;
							var6.method2272(this.field1417, var12, var13, this.field1404[var2]);
						}
					} else {
						var6.method2252(var12, var13);
						var6.field999 = false;
					}

					var6.field982 = (byte)(var6.field982 + var9 & 3);
					if (Client.field732 == var2 && this.field1417.method2315()) {
						this.field1417.field1016 = var6.field982;
					}

				}
			}
		}
	}

	@ObfInfo(name = "an", desc = "(Lug;II)Z", opaque = "396253424")
	public boolean method2905(Class527 var1, int var2) {
		int var4 = var1.method9347(2);
		int var5;
		int var6;
		int var9;
		int var10;
		int var11;
		int var12;
		if (var4 == 0) {
			if (var1.method9347(1) != 0) {
				this.method2905(var1, var2);
			}

			var5 = var1.method9347(13);
			var6 = var1.method9347(13);
			boolean var13 = var1.method9347(1) == 1;
			if (var13) {
				this.field1414[++this.field1413 - 1] = var2;
			}

			if (this.field1417.field1024[var2] != null) {
				throw new RuntimeException();
			} else {
				Class80 var14 = this.field1417.field1024[var2] = new Class80();
				var14.field995 = var2;
				if (this.field1405[var2] != null) {
					var14.method2256(this.field1405[var2]);
				}

				var14.field1295 = this.field1411[var2];
				var14.field1228 = this.field1412[var2];
				var9 = this.field1400[var2];
				var10 = var9 >> 28;
				var11 = var9 >> 14 & 255;
				var12 = var9 & 255;
				var14.field1301[0] = this.field1404[var2];
				var14.field982 = (byte)var10;
				var14.method2252((var11 << 13) + var5 - this.field1417.field1019, (var12 << 13) + var6 - this.field1417.field1021);
				var14.field999 = false;
				return true;
			}
		} else if (var4 == 1) {
			var5 = var1.method9347(2);
			var6 = this.field1400[var2];
			this.field1400[var2] = (((var6 >> 28) + var5 & 3) << 28) + (var6 & 268435455);
			return false;
		} else {
			int var7;
			int var8;
			if (var4 == 2) {
				var5 = var1.method9347(5);
				var6 = var5 >> 3;
				var7 = var5 & 7;
				var8 = this.field1400[var2];
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

				this.field1400[var2] = Class350.method6494(var9, var10, var11);
				return false;
			} else {
				var5 = var1.method9347(18);
				var6 = var5 >> 16;
				var7 = var5 >> 8 & 255;
				var8 = var5 & 255;
				var9 = this.field1400[var2];
				var10 = (var9 >> 28) + var6 & 3;
				var11 = (var9 >> 14) + var7 & 255;
				var12 = var8 + var9 & 255;
				this.field1400[var2] = Class350.method6494(var10, var11, var12);
				return false;
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(Lug;B)V", opaque = "1")
	public final void method2883(Class527 var1) {
		for (int var3 = 0; var3 < this.field1413; ++var3) {
			int var4 = this.field1414[var3];
			Class80 var5 = this.field1417.field1024[var4];
			int var6 = var1.method9902();
			if ((var6 & 16) != 0) {
				var6 += var1.method9902() << 8;
			}

			if ((var6 & 4096) != 0) {
				var6 += var1.method9902() << 16;
			}

			this.method2891(var1, var4, var5, var6);
		}

	}

	@ObfInfo(name = "av", desc = "(Lug;ILdb;II)V", opaque = "-1132619758")
	public final void method2891(Class527 var1, int var2, Class80 var3, int var4) {
		byte var6 = Class236.field2504.field2507;
		if ((var4 & 2048) != 0) {
			this.field1404[var2] = (Class236)Class406.method4071(Class236.method4005(), var1.method9864());
		}

		if ((var4 & 256) != 0) {
			var6 = var1.method9955();
		}

		if ((var4 & 2) != 0) {
			var3.field1249 = var1.method9837();
			if (var3.field1249.charAt(0) == '~') {
				var3.field1249 = var3.field1249.substring(1);
				Class115.method3716(2, var3.field991.method9789(), var3.field1249);
			} else if (Client.field170 == var3) {
				Class115.method3716(2, var3.field991.method9789(), var3.field1249);
			}

			var3.field1250 = false;
			var3.field1264 = 0;
			var3.field1254 = 0;
			var3.field1244 = 150;
		}

		int var7;
		if ((var4 & 32768) != 0) {
			for (var7 = 0; var7 < 3; ++var7) {
				var3.field977[var7] = var1.method9837();
			}
		}

		if ((var4 & 8192) != 0) {
			var3.field1289 = Client.field541 + var1.method9868();
			var3.field1253 = Client.field541 + var1.method9981();
			var3.field1261 = var1.method10018();
			var3.field1292 = var1.method9864();
			var3.field1293 = var1.method10018();
			var3.field1277 = (byte)var1.method9860();
		}

		int var8;
		if ((var4 & 64) != 0) {
			var7 = var1.method9997();
			if (var7 == 65535) {
				var7 = -1;
			}

			var8 = var1.method9860();
			Class6.method71(var3, var7, var8);
		}

		if ((var4 & 1) != 0) {
			var7 = var1.method9861();
			byte[] var22 = new byte[var7];
			Class562 var9 = new Class562(var22);
			var1.method9828(var22, 0, var7);
			this.field1405[var2] = var9;
			var3.method2256(var9);
		}

		if ((var4 & 512) != 0) {
			var3.field1280 = var1.method9863();
			var3.field1282 = var1.method10018();
			var3.field1281 = var1.method9864();
			var3.field1283 = var1.method9955();
			var3.field1291 = var1.method9869() + Client.field541;
			var3.field1298 = var1.method9869() + Client.field541;
			var3.field1286 = var1.method9868();
			if (var3.field999) {
				var3.field1280 += var3.field990;
				var3.field1282 += var3.field1000;
				var3.field1281 += var3.field990;
				var3.field1283 += var3.field1000;
				var3.field1267 = 0;
			} else {
				var3.field1280 += var3.field1242[0];
				var3.field1282 += var3.field1284[0];
				var3.field1281 += var3.field1242[0];
				var3.field1283 += var3.field1284[0];
				var3.field1267 = 1;
			}

			var3.field1303 = 0;
		}

		int var10;
		int var11;
		int var23;
		if ((var4 & 65536) != 0) {
			var7 = var1.method9860();

			for (var8 = 0; var8 < var7; ++var8) {
				var23 = var1.method9861();
				var10 = var1.method9869();
				var11 = var1.method9855();
				var3.method2654(var23, var10, var11 >> 16, var11 & 65535);
			}
		}

		int var12;
		int var13;
		int var14;
		if ((var4 & 8) != 0) {
			var7 = var1.method9861();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var10 = -1;
					var11 = -1;
					var12 = -1;
					var23 = var1.method9842();
					if (var23 == 32767) {
						var23 = var1.method9842();
						var11 = var1.method9842();
						var10 = var1.method9842();
						var12 = var1.method9842();
					} else if (var23 != 32766) {
						var11 = var1.method9842();
					} else {
						var23 = -1;
					}

					var13 = var1.method9842();
					var3.method2674(var23, var11, var10, var12, Client.field541, var13);
				}
			}

			var8 = var1.method9859();
			if (var8 > 0) {
				for (var23 = 0; var23 < var8; ++var23) {
					var10 = var1.method9842();
					var11 = var1.method9842();
					if (var11 != 32767) {
						var12 = var1.method9842();
						var13 = var1.method9861();
						var14 = var11 > 0 ? var1.method9859() : var13;
						var3.method2653(var10, Client.field541, var11, var12, var13, var14);
					} else {
						var3.method2670(var10);
					}
				}
			}
		}

		if ((var4 & 32) != 0) {
			var3.field1228 = var1.method9981();
			var3.field1228 += var1.method9861() << 16;
			var7 = 16777215;
			if (var3.field1228 == var7) {
				var3.field1228 = -1;
			}
		}

		if ((var4 & 4) != 0) {
			var7 = var1.method9868();
			Class365 var24 = (Class365)Class406.method4071(Class365.method3148(), var1.method9861());
			boolean var26 = var1.method9860() == 1;
			var10 = var1.method9861();
			var11 = var1.field5471;
			if (var3.field991 != null && var3.field1001 != null) {
				boolean var28 = false;
				if (var24.field4015 && Client.field1585.method1232(var3.field991)) {
					var28 = true;
				}

				if (!var28 && Client.field651 == 0 && !var3.field993) {
					this.field1415.field5471 = 0;
					var1.method9884(this.field1415.field5472, 0, var10);
					this.field1415.field5471 = 0;
					String var30 = Class442.method8142(Class413.method2000(Class381.method3835(this.field1415)));
					var3.field1249 = var30.trim();
					var3.field1264 = var7 >> 8;
					var3.field1254 = var7 & 255;
					var3.field1244 = 150;
					var3.field1255 = null;
					var3.field1250 = var26;
					var3.field1251 = Client.field170 != var3 && var24.field4015 && !Client.field762.isEmpty() && var30.toLowerCase().indexOf(Client.field762) == -1;
					if (var24.field4014) {
						var14 = var26 ? 91 : 1;
					} else {
						var14 = var26 ? 90 : 2;
					}

					if (var24.field4006 != -1) {
						Class115.method3716(var14, Class111.method7220(var24.field4006) + var3.field991.method9789(), var30);
					} else {
						Class115.method3716(var14, var3.field991.method9789(), var30);
					}
				}
			}

			var1.field5471 = var10 + var11;
		}

		if ((var4 & 16384) != 0) {
			var7 = var1.method9981();
			var8 = var7 >> 8;
			var23 = var8 >= 13 && var8 <= 20 ? var8 - 12 : 0;
			Class365 var27 = (Class365)Class406.method4071(Class365.method3148(), var1.method9859());
			boolean var29 = var1.method9860() == 1;
			var12 = var1.method9861();
			var13 = var1.field5471;
			if (var3.field991 != null && var3.field1001 != null) {
				boolean var31 = false;
				if (var27.field4015 && Client.field1585.method1232(var3.field991)) {
					var31 = true;
				}

				if (!var31 && Client.field651 == 0 && !var3.field993) {
					this.field1415.field5471 = 0;
					var1.method9884(this.field1415.field5472, 0, var12);
					this.field1415.field5471 = 0;
					String var15 = Class442.method8142(Class413.method2000(Class381.method3835(this.field1415)));
					var3.field1249 = var15.trim();
					var3.field1264 = var7 >> 8;
					var3.field1254 = var7 & 255;
					var3.field1244 = 150;
					byte[] var16 = null;
					if (var23 > 0 && var23 <= 8) {
						var16 = new byte[var23];

						for (int var17 = 0; var17 < var23; ++var17) {
							var16[var17] = var1.method9863();
						}
					}

					int[] var18;
					if (var16 != null && var16.length != 0 && var16.length <= 8) {
						int[] var20 = new int[var16.length];
						int var21 = 0;

						while (true) {
							if (var21 >= var16.length) {
								var18 = var20;
								break;
							}

							if (var16[var21] < 0 || var16[var21] >= Class572.field5521.length) {
								var18 = null;
								break;
							}

							var20[var21] = Class572.field5521[var16[var21]];
							++var21;
						}
					} else {
						var18 = null;
					}

					var3.field1255 = var18;
					var3.field1250 = var29;
					var3.field1251 = Client.field170 != var3 && var27.field4015 && !Client.field762.isEmpty() && var15.toLowerCase().indexOf(Client.field762) == -1;
					int var32;
					if (var27.field4014) {
						var32 = var29 ? 91 : 1;
					} else {
						var32 = var29 ? 90 : 2;
					}

					if (var27.field4006 != -1) {
						Class115.method3716(var32, Class111.method7220(var27.field4006) + var3.field991.method9789(), var15);
					} else {
						Class115.method3716(var32, var3.field991.method9789(), var15);
					}
				}
			}

			var1.field5471 = var12 + var13 + var23;
		}

		if ((var4 & 128) != 0) {
			var3.field1265 = var1.method9868();
			if (var3.field1267 == 0) {
				var3.field1295 = var3.field1265;
				var3.method2658();
			}
		}

		if (var3.field999) {
			if (var6 == 127) {
				var3.method2252(var3.field990, var3.field1000);
			} else {
				Class236 var25;
				if (Class236.field2504.field2507 != var6) {
					var25 = (Class236)Class406.method4071(Class236.method4005(), var6);
				} else {
					var25 = this.field1404[var2];
				}

				var3.method2272(this.field1417, var3.field990, var3.field1000, var25);
			}
		}

	}
}
