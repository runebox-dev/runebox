import io.runebox.ObfInfo;

@ObfInfo(name = "bz")
public class Class52 extends Class27 {
	@ObfInfo(name = "ah", desc = "Z")
	public boolean field358;
	@ObfInfo(name = "aa", desc = "I")
	public int field348;
	@ObfInfo(name = "al", desc = "I")
	public int field349;
	@ObfInfo(name = "ap", desc = "I")
	public int field350;
	@ObfInfo(name = "at", desc = "I")
	public int field351;
	@ObfInfo(name = "af", desc = "I")
	public int field352;
	@ObfInfo(name = "ak", desc = "I")
	public int field353;
	@ObfInfo(name = "aj", desc = "I")
	public int field354;
	@ObfInfo(name = "ab", desc = "I")
	public int field355;
	@ObfInfo(name = "ac", desc = "I")
	public int field356;
	@ObfInfo(name = "ao", desc = "I")
	public int field357;
	@ObfInfo(name = "av", desc = "I")
	public int field359;
	@ObfInfo(name = "aq", desc = "I")
	public int field360;
	@ObfInfo(name = "ae", desc = "I")
	public int field361;
	@ObfInfo(name = "az", desc = "I")
	public int field362;

	public Class52(Class44 var1, int var2, int var3) {
		super.field138 = var1;
		this.field356 = var1.field311;
		this.field357 = var1.field313;
		this.field358 = var1.field315;
		this.field349 = var2;
		this.field354 = var3;
		this.field362 = 8192;
		this.field353 = 0;
		this.method920();
	}

	public Class52(Class44 var1, int var2, int var3, int var4) {
		super.field138 = var1;
		this.field356 = var1.field311;
		this.field357 = var1.field313;
		this.field358 = var1.field315;
		this.field349 = var2;
		this.field354 = var3;
		this.field362 = var4;
		this.field353 = 0;
		this.method920();
	}

	@ObfInfo(name = "bp", desc = "()I")
	public int method377() {
		int var1 = this.field352 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field355 == 0) {
			var1 -= this.field353 * var1 / (((Class44)super.field138).field314.length << 8);
		} else if (this.field355 >= 0) {
			var1 -= this.field356 * var1 / ((Class44)super.field138).field314.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfInfo(name = "af", desc = "()V")
	public void method920() {
		this.field352 = this.field354;
		this.field348 = method940(this.field354, this.field362);
		this.field351 = method913(this.field354, this.field362);
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	public synchronized void method921(int var1) {
		this.field355 = var1;
	}

	@ObfInfo(name = "av", desc = "(I)V")
	public synchronized void method922(int var1) {
		this.method1048(var1 << 6, this.method916());
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public synchronized void method923(int var1) {
		this.method1048(var1, this.method916());
	}

	@ObfInfo(name = "ap", desc = "(II)V")
	public synchronized void method1048(int var1, int var2) {
		this.field354 = var1;
		this.field362 = var2;
		this.field359 = 0;
		this.method920();
	}

	@ObfInfo(name = "ae", desc = "()I")
	public synchronized int method995() {
		return this.field354 == Integer.MIN_VALUE ? 0 : this.field354;
	}

	@ObfInfo(name = "ax", desc = "()I")
	public synchronized int method916() {
		return this.field362 < 0 ? -1 : this.field362;
	}

	@ObfInfo(name = "ay", desc = "(I)V")
	public synchronized void method927(int var1) {
		int var2 = ((Class44)super.field138).field314.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field353 = var1;
	}

	@ObfInfo(name = "au", desc = "(Z)V")
	public synchronized void method928(boolean var1) {
		this.field349 = (this.field349 ^ this.field349 >> 31) + (this.field349 >>> 31);
		if (var1) {
			this.field349 = -this.field349;
		}

	}

	@ObfInfo(name = "as", desc = "()V")
	public void method929() {
		if (this.field359 != 0) {
			if (this.field354 == Integer.MIN_VALUE) {
				this.field354 = 0;
			}

			this.field359 = 0;
			this.method920();
		}

	}

	@ObfInfo(name = "aw", desc = "(II)V")
	public synchronized void method930(int var1, int var2) {
		this.method931(var1, var2, this.method916());
	}

	@ObfInfo(name = "ad", desc = "(III)V")
	public synchronized void method931(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method1048(var2, var3);
		} else {
			int var4 = method940(var2, var3);
			int var5 = method913(var2, var3);
			if (this.field348 == var4 && this.field351 == var5) {
				this.field359 = 0;
			} else {
				int var6 = var2 - this.field352;
				if (this.field352 - var2 > var6) {
					var6 = this.field352 - var2;
				}

				if (var4 - this.field348 > var6) {
					var6 = var4 - this.field348;
				}

				if (this.field348 - var4 > var6) {
					var6 = this.field348 - var4;
				}

				if (var5 - this.field351 > var6) {
					var6 = var5 - this.field351;
				}

				if (this.field351 - var5 > var6) {
					var6 = this.field351 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field359 = var1;
				this.field354 = var2;
				this.field362 = var3;
				this.field360 = (var2 - this.field352) / var1;
				this.field350 = (var4 - this.field348) / var1;
				this.field361 = (var5 - this.field351) / var1;
			}
		}
	}

	@ObfInfo(name = "bn", desc = "(I)V")
	public synchronized void method932(int var1) {
		if (var1 == 0) {
			this.method923(0);
			this.method9277();
		} else if (this.field348 == 0 && this.field351 == 0) {
			this.field359 = 0;
			this.field354 = 0;
			this.field352 = 0;
			this.method9277();
		} else {
			int var2 = -this.field352;
			if (this.field352 > var2) {
				var2 = this.field352;
			}

			if (-this.field348 > var2) {
				var2 = -this.field348;
			}

			if (this.field348 > var2) {
				var2 = this.field348;
			}

			if (-this.field351 > var2) {
				var2 = -this.field351;
			}

			if (this.field351 > var2) {
				var2 = this.field351;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field359 = var1;
			this.field354 = Integer.MIN_VALUE;
			this.field360 = -this.field352 / var1;
			this.field350 = -this.field348 / var1;
			this.field361 = -this.field351 / var1;
		}
	}

	@ObfInfo(name = "bw", desc = "(I)V")
	public synchronized void method933(int var1) {
		if (this.field349 < 0) {
			this.field349 = -var1;
		} else {
			this.field349 = var1;
		}

	}

	@ObfInfo(name = "bu", desc = "()I")
	public synchronized int method934() {
		return this.field349 < 0 ? -this.field349 : this.field349;
	}

	@ObfInfo(name = "bh", desc = "()Z")
	public boolean method943() {
		return this.field353 < 0 || this.field353 >= ((Class44)super.field138).field314.length << 8;
	}

	@ObfInfo(name = "bk", desc = "()Z")
	public boolean method936() {
		return this.field359 != 0;
	}

	@ObfInfo(name = "aa", desc = "()Lba;")
	public Class27 method384() {
		return null;
	}

	@ObfInfo(name = "at", desc = "()Lba;")
	public Class27 method379() {
		return null;
	}

	@ObfInfo(name = "ab", desc = "()I")
	public int method380() {
		return this.field354 == 0 && this.field359 == 0 ? 0 : 1;
	}

	@ObfInfo(name = "ac", desc = "([III)V")
	public synchronized void method381(int[] var1, int var2, int var3) {
		if (this.field354 == 0 && this.field359 == 0) {
			this.method395(var3);
		} else {
			Class44 var4 = (Class44)super.field138;
			int var5 = this.field356 << 8;
			int var6 = this.field357 << 8;
			int var7 = var4.field314.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field355 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field353 < 0) {
				if (this.field349 <= 0) {
					this.method929();
					this.method9277();
					return;
				}

				this.field353 = 0;
			}

			if (this.field353 >= var7) {
				if (this.field349 >= 0) {
					this.method929();
					this.method9277();
					return;
				}

				this.field353 = var7 - 1;
			}

			if (this.field355 < 0) {
				if (this.field358) {
					if (this.field349 < 0) {
						var9 = this.method998(var1, var2, var5, var3, var4.field314[this.field356]);
						if (this.field353 >= var5) {
							return;
						}

						this.field353 = var5 + var5 - 1 - this.field353;
						this.field349 = -this.field349;
					}

					while (true) {
						var9 = this.method942(var1, var9, var6, var3, var4.field314[this.field357 - 1]);
						if (this.field353 < var6) {
							return;
						}

						this.field353 = var6 + var6 - 1 - this.field353;
						this.field349 = -this.field349;
						var9 = this.method998(var1, var9, var5, var3, var4.field314[this.field356]);
						if (this.field353 >= var5) {
							return;
						}

						this.field353 = var5 + var5 - 1 - this.field353;
						this.field349 = -this.field349;
					}
				} else if (this.field349 < 0) {
					while (true) {
						var9 = this.method998(var1, var9, var5, var3, var4.field314[this.field357 - 1]);
						if (this.field353 >= var5) {
							return;
						}

						this.field353 = var6 - 1 - (var6 - 1 - this.field353) % var8;
					}
				} else {
					while (true) {
						var9 = this.method942(var1, var9, var6, var3, var4.field314[this.field356]);
						if (this.field353 < var6) {
							return;
						}

						this.field353 = var5 + (this.field353 - var5) % var8;
					}
				}
			} else {
				if (this.field355 > 0) {
					if (this.field358) {
						label142: {
							if (this.field349 < 0) {
								var9 = this.method998(var1, var2, var5, var3, var4.field314[this.field356]);
								if (this.field353 >= var5) {
									return;
								}

								this.field353 = var5 + var5 - 1 - this.field353;
								this.field349 = -this.field349;
								if (--this.field355 == 0) {
									break label142;
								}
							}

							do {
								var9 = this.method942(var1, var9, var6, var3, var4.field314[this.field357 - 1]);
								if (this.field353 < var6) {
									return;
								}

								this.field353 = var6 + var6 - 1 - this.field353;
								this.field349 = -this.field349;
								if (--this.field355 == 0) {
									break;
								}

								var9 = this.method998(var1, var9, var5, var3, var4.field314[this.field356]);
								if (this.field353 >= var5) {
									return;
								}

								this.field353 = var5 + var5 - 1 - this.field353;
								this.field349 = -this.field349;
							} while(--this.field355 != 0);
						}
					} else {
						int var10;
						if (this.field349 < 0) {
							while (true) {
								var9 = this.method998(var1, var9, var5, var3, var4.field314[this.field357 - 1]);
								if (this.field353 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field353) / var8;
								if (var10 >= this.field355) {
									this.field353 += this.field355 * var8;
									this.field355 = 0;
									break;
								}

								this.field353 += var10 * var8;
								this.field355 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method942(var1, var9, var6, var3, var4.field314[this.field356]);
								if (this.field353 < var6) {
									return;
								}

								var10 = (this.field353 - var5) / var8;
								if (var10 >= this.field355) {
									this.field353 -= this.field355 * var8;
									this.field355 = 0;
									break;
								}

								this.field353 -= var10 * var8;
								this.field355 -= var10;
							}
						}
					}
				}

				if (this.field349 < 0) {
					this.method998(var1, var9, 0, var3, 0);
					if (this.field353 < 0) {
						this.field353 = -1;
						this.method929();
						this.method9277();
					}
				} else {
					this.method942(var1, var9, var7, var3, 0);
					if (this.field353 >= var7) {
						this.field353 = var7;
						this.method929();
						this.method9277();
					}
				}

			}
		}
	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public synchronized void method395(int var1) {
		if (this.field359 > 0) {
			if (var1 >= this.field359) {
				if (this.field354 == Integer.MIN_VALUE) {
					this.field354 = 0;
					this.field351 = 0;
					this.field348 = 0;
					this.field352 = 0;
					this.method9277();
					var1 = this.field359;
				}

				this.field359 = 0;
				this.method920();
			} else {
				this.field352 += this.field360 * var1;
				this.field348 += this.field350 * var1;
				this.field351 += this.field361 * var1;
				this.field359 -= var1;
			}
		}

		Class44 var2 = (Class44)super.field138;
		int var3 = this.field356 << 8;
		int var4 = this.field357 << 8;
		int var5 = var2.field314.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field355 = 0;
		}

		if (this.field353 < 0) {
			if (this.field349 <= 0) {
				this.method929();
				this.method9277();
				return;
			}

			this.field353 = 0;
		}

		if (this.field353 >= var5) {
			if (this.field349 >= 0) {
				this.method929();
				this.method9277();
				return;
			}

			this.field353 = var5 - 1;
		}

		this.field353 += this.field349 * var1;
		if (this.field355 < 0) {
			if (!this.field358) {
				if (this.field349 < 0) {
					if (this.field353 >= var3) {
						return;
					}

					this.field353 = var4 - 1 - (var4 - 1 - this.field353) % var6;
				} else {
					if (this.field353 < var4) {
						return;
					}

					this.field353 = var3 + (this.field353 - var3) % var6;
				}

			} else {
				if (this.field349 < 0) {
					if (this.field353 >= var3) {
						return;
					}

					this.field353 = var3 + var3 - 1 - this.field353;
					this.field349 = -this.field349;
				}

				while (this.field353 >= var4) {
					this.field353 = var4 + var4 - 1 - this.field353;
					this.field349 = -this.field349;
					if (this.field353 >= var3) {
						return;
					}

					this.field353 = var3 + var3 - 1 - this.field353;
					this.field349 = -this.field349;
				}

			}
		} else {
			if (this.field355 > 0) {
				if (this.field358) {
					label140: {
						if (this.field349 < 0) {
							if (this.field353 >= var3) {
								return;
							}

							this.field353 = var3 + var3 - 1 - this.field353;
							this.field349 = -this.field349;
							if (--this.field355 == 0) {
								break label140;
							}
						}

						do {
							if (this.field353 < var4) {
								return;
							}

							this.field353 = var4 + var4 - 1 - this.field353;
							this.field349 = -this.field349;
							if (--this.field355 == 0) {
								break;
							}

							if (this.field353 >= var3) {
								return;
							}

							this.field353 = var3 + var3 - 1 - this.field353;
							this.field349 = -this.field349;
						} while(--this.field355 != 0);
					}
				} else {
					int var7;
					if (this.field349 < 0) {
						if (this.field353 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field353) / var6;
						if (var7 < this.field355) {
							this.field353 += var7 * var6;
							this.field355 -= var7;
							return;
						}

						this.field353 += this.field355 * var6;
						this.field355 = 0;
					} else {
						if (this.field353 < var4) {
							return;
						}

						var7 = (this.field353 - var3) / var6;
						if (var7 < this.field355) {
							this.field353 -= var7 * var6;
							this.field355 -= var7;
							return;
						}

						this.field353 -= this.field355 * var6;
						this.field355 = 0;
					}
				}
			}

			if (this.field349 < 0) {
				if (this.field353 < 0) {
					this.field353 = -1;
					this.method929();
					this.method9277();
				}
			} else if (this.field353 >= var5) {
				this.field353 = var5;
				this.method929();
				this.method9277();
			}

		}
	}

	@ObfInfo(name = "br", desc = "([IIIII)I")
	public int method942(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field359 > 0) {
				int var6 = this.field359 + var2;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field359 += var2;
				if (this.field349 == 256 && (this.field353 & 255) == 0) {
					if (Client.field1887) {
						var2 = method1018(0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, this.field350, this.field361, 0, var6, var3, this);
					} else {
						var2 = method953(((Class44)super.field138).field314, var1, this.field353, var2, this.field352, this.field360, 0, var6, var3, this);
					}
				} else if (Client.field1887) {
					var2 = method957(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, this.field350, this.field361, 0, var6, var3, this, this.field349, var5);
				} else {
					var2 = method956(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field352, this.field360, 0, var6, var3, this, this.field349, var5);
				}

				this.field359 -= var2;
				if (this.field359 != 0) {
					return var2;
				}

				if (!this.method944()) {
					continue;
				}

				return var4;
			}

			if (this.field349 == 256 && (this.field353 & 255) == 0) {
				if (Client.field1887) {
					return method946(0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, 0, var4, var3, this);
				}

				return method969(((Class44)super.field138).field314, var1, this.field353, var2, this.field352, 0, var4, var3, this);
			}

			if (Client.field1887) {
				return method982(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, 0, var4, var3, this, this.field349, var5);
			}

			return method949(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field352, 0, var4, var3, this, this.field349, var5);
		}
	}

	@ObfInfo(name = "bx", desc = "([IIIII)I")
	public int method998(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field359 > 0) {
				int var6 = this.field359 + var2;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field359 += var2;
				if (this.field349 == -256 && (this.field353 & 255) == 0) {
					if (Client.field1887) {
						var2 = method955(0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, this.field350, this.field361, 0, var6, var3, this);
					} else {
						var2 = method954(((Class44)super.field138).field314, var1, this.field353, var2, this.field352, this.field360, 0, var6, var3, this);
					}
				} else if (Client.field1887) {
					var2 = method959(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, this.field350, this.field361, 0, var6, var3, this, this.field349, var5);
				} else {
					var2 = method958(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field352, this.field360, 0, var6, var3, this, this.field349, var5);
				}

				this.field359 -= var2;
				if (this.field359 != 0) {
					return var2;
				}

				if (!this.method944()) {
					continue;
				}

				return var4;
			}

			if (this.field349 == -256 && (this.field353 & 255) == 0) {
				if (Client.field1887) {
					return method948(0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, 0, var4, var3, this);
				}

				return method947(((Class44)super.field138).field314, var1, this.field353, var2, this.field352, 0, var4, var3, this);
			}

			if (Client.field1887) {
				return method952(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field348, this.field351, 0, var4, var3, this, this.field349, var5);
			}

			return method1017(0, 0, ((Class44)super.field138).field314, var1, this.field353, var2, this.field352, 0, var4, var3, this, this.field349, var5);
		}
	}

	@ObfInfo(name = "bd", desc = "()Z")
	public boolean method944() {
		int var1 = this.field354;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method940(var1, this.field362);
			var3 = method913(var1, this.field362);
		}

		if (this.field352 == var1 && this.field348 == var2 && this.field351 == var3) {
			if (this.field354 == Integer.MIN_VALUE) {
				this.field354 = 0;
				this.field351 = 0;
				this.field348 = 0;
				this.field352 = 0;
				this.method9277();
				return true;
			} else {
				this.method920();
				return false;
			}
		} else {
			if (this.field352 < var1) {
				this.field360 = 1;
				this.field359 = var1 - this.field352;
			} else if (this.field352 > var1) {
				this.field360 = -1;
				this.field359 = this.field352 - var1;
			} else {
				this.field360 = 0;
			}

			if (this.field348 < var2) {
				this.field350 = 1;
				if (this.field359 == 0 || this.field359 > var2 - this.field348) {
					this.field359 = var2 - this.field348;
				}
			} else if (this.field348 > var2) {
				this.field350 = -1;
				if (this.field359 == 0 || this.field359 > this.field348 - var2) {
					this.field359 = this.field348 - var2;
				}
			} else {
				this.field350 = 0;
			}

			if (this.field351 < var3) {
				this.field361 = 1;
				if (this.field359 == 0 || this.field359 > var3 - this.field351) {
					this.field359 = var3 - this.field351;
				}
			} else if (this.field351 > var3) {
				this.field361 = -1;
				if (this.field359 == 0 || this.field359 > this.field351 - var3) {
					this.field359 = this.field351 - var3;
				}
			} else {
				this.field361 = 0;
			}

			return false;
		}
	}

	@ObfInfo(name = "ak", desc = "(II)I")
	public static int method940(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfInfo(name = "al", desc = "(II)I")
	public static int method913(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfInfo(name = "aj", desc = "(Lbr;II)Lbz;")
	public static Class52 method918(Class44 var0, int var1, int var2) {
		return var0.field314 != null && var0.field314.length != 0 ? new Class52(var0, (int)((long)var0.field312 * 256L * (long)var1 / (long)(Client.field1382 * 100)), var2 << 6) : null;
	}

	@ObfInfo(name = "az", desc = "(Lbr;III)Lbz;")
	public static Class52 method919(Class44 var0, int var1, int var2, int var3) {
		return var0.field314 != null && var0.field314.length != 0 ? new Class52(var0, var1, var2, var3) : null;
	}

	@ObfInfo(name = "bv", desc = "([B[IIIIIIILbz;)I")
	public static int method969(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class52 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var7 + var3 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field353 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "bm", desc = "(I[B[IIIIIIIILbz;)I")
	public static int method946(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var9 + var4 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var6 * var11) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
			var2[var10001] += var6 * var11;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
			var2[var10001] += var6 * var11;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
			var2[var10001] += var6 * var11;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var6 * var11) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
		}

		var10.field353 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "bq", desc = "([B[IIIIIIILbz;)I")
	public static int method947(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class52 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field353 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "bj", desc = "(I[B[IIIIIIIILbz;)I")
	public static int method948(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var6 * var11) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
			var2[var10001] += var6 * var11;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
			var2[var10001] += var6 * var11;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
			var2[var10001] += var6 * var11;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var6 * var11) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var11;
			var10001 = var4++;
		}

		var10.field353 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "bc", desc = "(II[B[IIIIIIILbz;II)I")
	public static int method949(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var12 - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		var10.field353 = var4;
		return var5;
	}

	@ObfInfo(name = "bz", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method982(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var13 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
		}

		var11.field353 = var4;
		return var5 >> 1;
	}

	@ObfInfo(name = "ba", desc = "(II[B[IIIIIIILbz;II)I")
	public static int method1017(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var10001 = var5++;
			var3[var10001] += ((var12 << 8) + (var2[var4 >> 8] - var12) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		var10.field353 = var4;
		return var5;
	}

	@ObfInfo(name = "bb", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method952(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var0 = (var13 << 8) + (var2[var4 >> 8] - var13) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
		}

		var11.field353 = var4;
		return var5 >> 1;
	}

	@ObfInfo(name = "by", desc = "([B[IIIIIIIILbz;)I")
	public static int method953(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class52 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var8 + var3 - var2) > var7) {
			var6 = var7;
		}

		var9.field348 += var9.field350 * (var6 - var3);
		var9.field351 += var9.field361 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field352 = var4 >> 2;
		var9.field353 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "cw", desc = "(I[B[IIIIIIIIIILbz;)I")
	public static int method1018(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class52 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field352 += var12.field360 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
		}

		var12.field348 = var5 >> 2;
		var12.field351 = var6 >> 2;
		var12.field353 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "ck", desc = "([B[IIIIIIIILbz;)I")
	public static int method954(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class52 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field348 += var9.field350 * (var6 - var3);
		var9.field351 += var9.field361 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field352 = var4 >> 2;
		var9.field353 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "cn", desc = "(I[B[IIIIIIIIIILbz;)I")
	public static int method955(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class52 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field352 += var12.field360 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var5 * var13;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var6 * var13;
		}

		var12.field348 = var5 >> 2;
		var12.field351 = var6 >> 2;
		var12.field353 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "ch", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method956(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		var11.field348 -= var11.field350 * var5;
		var11.field351 -= var11.field361 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var13 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		var11.field348 += var11.field350 * var5;
		var11.field351 += var11.field361 * var5;
		var11.field352 = var6;
		var11.field353 = var4;
		return var5;
	}

	@ObfInfo(name = "cp", desc = "(II[B[IIIIIIIIIILbz;II)I")
	public static int method957(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class52 var13, int var14, int var15) {
		var13.field352 -= var13.field360 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var15 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field352 += var13.field360 * var5;
		var13.field348 = var6;
		var13.field351 = var7;
		var13.field353 = var4;
		return var5;
	}

	@ObfInfo(name = "cd", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method958(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		var11.field348 -= var11.field350 * var5;
		var11.field351 -= var11.field361 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var4 >> 8] - var13) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		var11.field348 += var11.field350 * var5;
		var11.field351 += var11.field361 * var5;
		var11.field352 = var6;
		var11.field353 = var4;
		return var5;
	}

	@ObfInfo(name = "cs", desc = "(II[B[IIIIIIIIIILbz;II)I")
	public static int method959(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class52 var13, int var14, int var15) {
		var13.field352 -= var13.field360 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var0 = (var15 << 8) + (var2[var4 >> 8] - var15) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var6 * var0 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var7 * var0 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field352 += var13.field360 * var5;
		var13.field348 = var6;
		var13.field351 = var7;
		var13.field353 = var4;
		return var5;
	}
}
