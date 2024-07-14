import io.runebox.ObfInfo;

@ObfInfo(name = "bz")
public class Class52 extends Class37 {
	@ObfInfo(name = "ae", desc = "Z")
	public boolean field324;
	@ObfInfo(name = "ad", desc = "I")
	public int field325;
	@ObfInfo(name = "ag", desc = "I")
	public int field326;
	@ObfInfo(name = "ak", desc = "I")
	public int field327;
	@ObfInfo(name = "ap", desc = "I")
	public int field328;
	@ObfInfo(name = "an", desc = "I")
	public int field329;
	@ObfInfo(name = "aq", desc = "I")
	public int field330;
	@ObfInfo(name = "ai", desc = "I")
	public int field331;
	@ObfInfo(name = "ab", desc = "I")
	public int field332;
	@ObfInfo(name = "az", desc = "I")
	public int field333;
	@ObfInfo(name = "aj", desc = "I")
	public int field334;
	@ObfInfo(name = "au", desc = "I")
	public int field335;
	@ObfInfo(name = "ah", desc = "I")
	public int field336;
	@ObfInfo(name = "ax", desc = "I")
	public int field337;
	@ObfInfo(name = "av", desc = "I")
	public int field338;

	public Class52(Class38 var1, int var2, int var3) {
		super.field197 = var1;
		this.field332 = var1.field200;
		this.field331 = var1.field199;
		this.field324 = var1.field202;
		this.field325 = var2;
		this.field326 = var3;
		this.field327 = 8192;
		this.field330 = 0;
		this.method938();
	}

	public Class52(Class38 var1, int var2, int var3, int var4) {
		super.field197 = var1;
		this.field332 = var1.field200;
		this.field331 = var1.field199;
		this.field324 = var1.field202;
		this.field325 = var2;
		this.field326 = var3;
		this.field327 = var4;
		this.field330 = 0;
		this.method938();
	}

	@ObfInfo(name = "bv", desc = "()I")
	public int method526() {
		int var1 = this.field328 * 3 >> 6;
		var1 = (var1 >>> 31) + (var1 ^ var1 >> 31);
		if (this.field338 == 0) {
			var1 -= this.field330 * var1 / (((Class38)super.field197).field198.length << 8);
		} else if (this.field338 >= 0) {
			var1 -= this.field332 * var1 / ((Class38)super.field197).field198.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfInfo(name = "ap", desc = "()V")
	public void method938() {
		this.field328 = this.field326;
		this.field329 = method954(this.field326, this.field327);
		this.field334 = method1045(this.field326, this.field327);
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public synchronized void method1040(int var1) {
		this.field338 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)V")
	public synchronized void method940(int var1) {
		this.method1037(var1 << 6, this.method1039());
	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public synchronized void method941(int var1) {
		this.method1037(var1, this.method1039());
	}

	@ObfInfo(name = "az", desc = "(II)V")
	public synchronized void method1037(int var1, int var2) {
		this.field326 = var1;
		this.field327 = var2;
		this.field335 = 0;
		this.method938();
	}

	@ObfInfo(name = "ax", desc = "()I")
	public synchronized int method943() {
		return this.field326 == Integer.MIN_VALUE ? 0 : this.field326;
	}

	@ObfInfo(name = "ac", desc = "()I")
	public synchronized int method1039() {
		return this.field327 < 0 ? -1 : this.field327;
	}

	@ObfInfo(name = "al", desc = "(I)V")
	public synchronized void method1036(int var1) {
		int var2 = ((Class38)super.field197).field198.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field330 = var1;
	}

	@ObfInfo(name = "ay", desc = "(Z)V")
	public synchronized void method1012(boolean var1) {
		this.field325 = (this.field325 >>> 31) + (this.field325 ^ this.field325 >> 31);
		if (var1) {
			this.field325 = -this.field325;
		}

	}

	@ObfInfo(name = "ao", desc = "()V")
	public void method947() {
		if (this.field335 != 0) {
			if (this.field326 == Integer.MIN_VALUE) {
				this.field326 = 0;
			}

			this.field335 = 0;
			this.method938();
		}

	}

	@ObfInfo(name = "aa", desc = "(II)V")
	public synchronized void method948(int var1, int var2) {
		this.method949(var1, var2, this.method1039());
	}

	@ObfInfo(name = "as", desc = "(III)V")
	public synchronized void method949(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method1037(var2, var3);
		} else {
			int var4 = method954(var2, var3);
			int var5 = method1045(var2, var3);
			if (this.field329 == var4 && this.field334 == var5) {
				this.field335 = 0;
			} else {
				int var6 = var2 - this.field328;
				if (this.field328 - var2 > var6) {
					var6 = this.field328 - var2;
				}

				if (var4 - this.field329 > var6) {
					var6 = var4 - this.field329;
				}

				if (this.field329 - var4 > var6) {
					var6 = this.field329 - var4;
				}

				if (var5 - this.field334 > var6) {
					var6 = var5 - this.field334;
				}

				if (this.field334 - var5 > var6) {
					var6 = this.field334 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field335 = var1;
				this.field326 = var2;
				this.field327 = var3;
				this.field336 = (var2 - this.field328) / var1;
				this.field333 = (var4 - this.field329) / var1;
				this.field337 = (var5 - this.field334) / var1;
			}
		}
	}

	@ObfInfo(name = "aw", desc = "(I)V")
	public synchronized void method950(int var1) {
		if (var1 == 0) {
			this.method941(0);
			this.method9267();
		} else if (this.field329 == 0 && this.field334 == 0) {
			this.field335 = 0;
			this.field326 = 0;
			this.field328 = 0;
			this.method9267();
		} else {
			int var2 = -this.field328;
			if (this.field328 > var2) {
				var2 = this.field328;
			}

			if (-this.field329 > var2) {
				var2 = -this.field329;
			}

			if (this.field329 > var2) {
				var2 = this.field329;
			}

			if (-this.field334 > var2) {
				var2 = -this.field334;
			}

			if (this.field334 > var2) {
				var2 = this.field334;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field335 = var1;
			this.field326 = Integer.MIN_VALUE;
			this.field336 = -this.field328 / var1;
			this.field333 = -this.field329 / var1;
			this.field337 = -this.field334 / var1;
		}
	}

	@ObfInfo(name = "at", desc = "(I)V")
	public synchronized void method951(int var1) {
		if (this.field325 < 0) {
			this.field325 = -var1;
		} else {
			this.field325 = var1;
		}

	}

	@ObfInfo(name = "af", desc = "()I")
	public synchronized int method952() {
		return this.field325 < 0 ? -this.field325 : this.field325;
	}

	@ObfInfo(name = "bx", desc = "()Z")
	public boolean method953() {
		return this.field330 < 0 || this.field330 >= ((Class38)super.field197).field198.length << 8;
	}

	@ObfInfo(name = "bu", desc = "()Z")
	public boolean method945() {
		return this.field335 != 0;
	}

	@ObfInfo(name = "an", desc = "()Lbk;")
	public Class37 method546() {
		return null;
	}

	@ObfInfo(name = "aj", desc = "()Lbk;")
	public Class37 method525() {
		return null;
	}

	@ObfInfo(name = "av", desc = "()I")
	public int method529() {
		return this.field326 == 0 && this.field335 == 0 ? 0 : 1;
	}

	@ObfInfo(name = "ab", desc = "([III)V")
	public synchronized void method531(int[] var1, int var2, int var3) {
		if (this.field326 == 0 && this.field335 == 0) {
			this.method542(var3);
		} else {
			Class38 var4 = (Class38)super.field197;
			int var5 = this.field332 << 8;
			int var6 = this.field331 << 8;
			int var7 = var4.field198.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field338 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field330 < 0) {
				if (this.field325 <= 0) {
					this.method947();
					this.method9267();
					return;
				}

				this.field330 = 0;
			}

			if (this.field330 >= var7) {
				if (this.field325 >= 0) {
					this.method947();
					this.method9267();
					return;
				}

				this.field330 = var7 - 1;
			}

			if (this.field338 < 0) {
				if (this.field324) {
					if (this.field325 < 0) {
						var9 = this.method973(var1, var2, var5, var3, var4.field198[this.field332]);
						if (this.field330 >= var5) {
							return;
						}

						this.field330 = var5 + var5 - 1 - this.field330;
						this.field325 = -this.field325;
					}

					while (true) {
						var9 = this.method989(var1, var9, var6, var3, var4.field198[this.field331 - 1]);
						if (this.field330 < var6) {
							return;
						}

						this.field330 = var6 + var6 - 1 - this.field330;
						this.field325 = -this.field325;
						var9 = this.method973(var1, var9, var5, var3, var4.field198[this.field332]);
						if (this.field330 >= var5) {
							return;
						}

						this.field330 = var5 + var5 - 1 - this.field330;
						this.field325 = -this.field325;
					}
				} else if (this.field325 < 0) {
					while (true) {
						var9 = this.method973(var1, var9, var5, var3, var4.field198[this.field331 - 1]);
						if (this.field330 >= var5) {
							return;
						}

						this.field330 = var6 - 1 - (var6 - 1 - this.field330) % var8;
					}
				} else {
					while (true) {
						var9 = this.method989(var1, var9, var6, var3, var4.field198[this.field332]);
						if (this.field330 < var6) {
							return;
						}

						this.field330 = (this.field330 - var5) % var8 + var5;
					}
				}
			} else {
				if (this.field338 > 0) {
					if (this.field324) {
						label142: {
							if (this.field325 < 0) {
								var9 = this.method973(var1, var2, var5, var3, var4.field198[this.field332]);
								if (this.field330 >= var5) {
									return;
								}

								this.field330 = var5 + var5 - 1 - this.field330;
								this.field325 = -this.field325;
								if (--this.field338 == 0) {
									break label142;
								}
							}

							do {
								var9 = this.method989(var1, var9, var6, var3, var4.field198[this.field331 - 1]);
								if (this.field330 < var6) {
									return;
								}

								this.field330 = var6 + var6 - 1 - this.field330;
								this.field325 = -this.field325;
								if (--this.field338 == 0) {
									break;
								}

								var9 = this.method973(var1, var9, var5, var3, var4.field198[this.field332]);
								if (this.field330 >= var5) {
									return;
								}

								this.field330 = var5 + var5 - 1 - this.field330;
								this.field325 = -this.field325;
							} while(--this.field338 != 0);
						}
					} else {
						int var10;
						if (this.field325 < 0) {
							while (true) {
								var9 = this.method973(var1, var9, var5, var3, var4.field198[this.field331 - 1]);
								if (this.field330 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field330) / var8;
								if (var10 >= this.field338) {
									this.field330 += this.field338 * var8;
									this.field338 = 0;
									break;
								}

								this.field330 += var8 * var10;
								this.field338 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method989(var1, var9, var6, var3, var4.field198[this.field332]);
								if (this.field330 < var6) {
									return;
								}

								var10 = (this.field330 - var5) / var8;
								if (var10 >= this.field338) {
									this.field330 -= this.field338 * var8;
									this.field338 = 0;
									break;
								}

								this.field330 -= var8 * var10;
								this.field338 -= var10;
							}
						}
					}
				}

				if (this.field325 < 0) {
					this.method973(var1, var9, 0, var3, 0);
					if (this.field330 < 0) {
						this.field330 = -1;
						this.method947();
						this.method9267();
					}
				} else {
					this.method989(var1, var9, var7, var3, 0);
					if (this.field330 >= var7) {
						this.field330 = var7;
						this.method947();
						this.method9267();
					}
				}

			}
		}
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public synchronized void method542(int var1) {
		if (this.field335 > 0) {
			if (var1 >= this.field335) {
				if (this.field326 == Integer.MIN_VALUE) {
					this.field326 = 0;
					this.field334 = 0;
					this.field329 = 0;
					this.field328 = 0;
					this.method9267();
					var1 = this.field335;
				}

				this.field335 = 0;
				this.method938();
			} else {
				this.field328 += this.field336 * var1;
				this.field329 += this.field333 * var1;
				this.field334 += this.field337 * var1;
				this.field335 -= var1;
			}
		}

		Class38 var2 = (Class38)super.field197;
		int var3 = this.field332 << 8;
		int var4 = this.field331 << 8;
		int var5 = var2.field198.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field338 = 0;
		}

		if (this.field330 < 0) {
			if (this.field325 <= 0) {
				this.method947();
				this.method9267();
				return;
			}

			this.field330 = 0;
		}

		if (this.field330 >= var5) {
			if (this.field325 >= 0) {
				this.method947();
				this.method9267();
				return;
			}

			this.field330 = var5 - 1;
		}

		this.field330 += this.field325 * var1;
		if (this.field338 < 0) {
			if (!this.field324) {
				if (this.field325 < 0) {
					if (this.field330 >= var3) {
						return;
					}

					this.field330 = var4 - 1 - (var4 - 1 - this.field330) % var6;
				} else {
					if (this.field330 < var4) {
						return;
					}

					this.field330 = (this.field330 - var3) % var6 + var3;
				}

			} else {
				if (this.field325 < 0) {
					if (this.field330 >= var3) {
						return;
					}

					this.field330 = var3 + var3 - 1 - this.field330;
					this.field325 = -this.field325;
				}

				while (this.field330 >= var4) {
					this.field330 = var4 + var4 - 1 - this.field330;
					this.field325 = -this.field325;
					if (this.field330 >= var3) {
						return;
					}

					this.field330 = var3 + var3 - 1 - this.field330;
					this.field325 = -this.field325;
				}

			}
		} else {
			if (this.field338 > 0) {
				if (this.field324) {
					label141: {
						if (this.field325 < 0) {
							if (this.field330 >= var3) {
								return;
							}

							this.field330 = var3 + var3 - 1 - this.field330;
							this.field325 = -this.field325;
							if (--this.field338 == 0) {
								break label141;
							}
						}

						do {
							if (this.field330 < var4) {
								return;
							}

							this.field330 = var4 + var4 - 1 - this.field330;
							this.field325 = -this.field325;
							if (--this.field338 == 0) {
								break;
							}

							if (this.field330 >= var3) {
								return;
							}

							this.field330 = var3 + var3 - 1 - this.field330;
							this.field325 = -this.field325;
						} while(--this.field338 != 0);
					}
				} else {
					int var7;
					if (this.field325 < 0) {
						if (this.field330 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field330) / var6;
						if (var7 < this.field338) {
							this.field330 += var6 * var7;
							this.field338 -= var7;
							return;
						}

						this.field330 += this.field338 * var6;
						this.field338 = 0;
					} else {
						if (this.field330 < var4) {
							return;
						}

						var7 = (this.field330 - var3) / var6;
						if (var7 < this.field338) {
							this.field330 -= var6 * var7;
							this.field338 -= var7;
							return;
						}

						this.field330 -= this.field338 * var6;
						this.field338 = 0;
					}
				}
			}

			if (this.field325 < 0) {
				if (this.field330 < 0) {
					this.field330 = -1;
					this.method947();
					this.method9267();
				}
			} else if (this.field330 >= var5) {
				this.field330 = var5;
				this.method947();
				this.method9267();
			}

		}
	}

	@ObfInfo(name = "by", desc = "([IIIII)I")
	public int method989(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field335 > 0) {
				int var6 = this.field335 + var2;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field335 += var2;
				if (this.field325 == 256 && (this.field330 & 255) == 0) {
					if (Client.field1012) {
						var2 = method972(0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, this.field333, this.field337, 0, var6, var3, this);
					} else {
						var2 = method971(((Class38)super.field197).field198, var1, this.field330, var2, this.field328, this.field336, 0, var6, var3, this);
					}
				} else if (Client.field1012) {
					var2 = method976(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, this.field333, this.field337, 0, var6, var3, this, this.field325, var5);
				} else {
					var2 = method975(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field328, this.field336, 0, var6, var3, this, this.field325, var5);
				}

				this.field335 -= var2;
				if (this.field335 != 0) {
					return var2;
				}

				if (!this.method962()) {
					continue;
				}

				return var4;
			}

			if (this.field325 == 256 && (this.field330 & 255) == 0) {
				if (Client.field1012) {
					return method964(0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, 0, var4, var3, this);
				}

				return method1011(((Class38)super.field197).field198, var1, this.field330, var2, this.field328, 0, var4, var3, this);
			}

			if (Client.field1012) {
				return method1003(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, 0, var4, var3, this, this.field325, var5);
			}

			return method967(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field328, 0, var4, var3, this, this.field325, var5);
		}
	}

	@ObfInfo(name = "bc", desc = "([IIIII)I")
	public int method973(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field335 > 0) {
				int var6 = this.field335 + var2;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field335 += var2;
				if (this.field325 == -256 && (this.field330 & 255) == 0) {
					if (Client.field1012) {
						var2 = method974(0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, this.field333, this.field337, 0, var6, var3, this);
					} else {
						var2 = method1010(((Class38)super.field197).field198, var1, this.field330, var2, this.field328, this.field336, 0, var6, var3, this);
					}
				} else if (Client.field1012) {
					var2 = method978(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, this.field333, this.field337, 0, var6, var3, this, this.field325, var5);
				} else {
					var2 = method977(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field328, this.field336, 0, var6, var3, this, this.field325, var5);
				}

				this.field335 -= var2;
				if (this.field335 != 0) {
					return var2;
				}

				if (!this.method962()) {
					continue;
				}

				return var4;
			}

			if (this.field325 == -256 && (this.field330 & 255) == 0) {
				if (Client.field1012) {
					return method979(0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, 0, var4, var3, this);
				}

				return method965(((Class38)super.field197).field198, var1, this.field330, var2, this.field328, 0, var4, var3, this);
			}

			if (Client.field1012) {
				return method984(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field329, this.field334, 0, var4, var3, this, this.field325, var5);
			}

			return method969(0, 0, ((Class38)super.field197).field198, var1, this.field330, var2, this.field328, 0, var4, var3, this, this.field325, var5);
		}
	}

	@ObfInfo(name = "bb", desc = "()Z")
	public boolean method962() {
		int var1 = this.field326;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method954(var1, this.field327);
			var3 = method1045(var1, this.field327);
		}

		if (this.field328 == var1 && this.field329 == var2 && this.field334 == var3) {
			if (this.field326 == Integer.MIN_VALUE) {
				this.field326 = 0;
				this.field334 = 0;
				this.field329 = 0;
				this.field328 = 0;
				this.method9267();
				return true;
			} else {
				this.method938();
				return false;
			}
		} else {
			if (this.field328 < var1) {
				this.field336 = 1;
				this.field335 = var1 - this.field328;
			} else if (this.field328 > var1) {
				this.field336 = -1;
				this.field335 = this.field328 - var1;
			} else {
				this.field336 = 0;
			}

			if (this.field329 < var2) {
				this.field333 = 1;
				if (this.field335 == 0 || this.field335 > var2 - this.field329) {
					this.field335 = var2 - this.field329;
				}
			} else if (this.field329 > var2) {
				this.field333 = -1;
				if (this.field335 == 0 || this.field335 > this.field329 - var2) {
					this.field335 = this.field329 - var2;
				}
			} else {
				this.field333 = 0;
			}

			if (this.field334 < var3) {
				this.field337 = 1;
				if (this.field335 == 0 || this.field335 > var3 - this.field334) {
					this.field335 = var3 - this.field334;
				}
			} else if (this.field334 > var3) {
				this.field337 = -1;
				if (this.field335 == 0 || this.field335 > this.field334 - var3) {
					this.field335 = this.field334 - var3;
				}
			} else {
				this.field337 = 0;
			}

			return false;
		}
	}

	@ObfInfo(name = "aq", desc = "(II)I")
	public static int method954(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfInfo(name = "ad", desc = "(II)I")
	public static int method1045(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfInfo(name = "ag", desc = "(Lbl;II)Lbz;")
	public static Class52 method1008(Class38 var0, int var1, int var2) {
		return var0.field198 != null && var0.field198.length != 0 ? new Class52(var0, (int)((long)var0.field201 * 256L * (long)var1 / (long)(Client.field293 * 100)), var2 << 6) : null;
	}

	@ObfInfo(name = "ak", desc = "(Lbl;III)Lbz;")
	public static Class52 method937(Class38 var0, int var1, int var2, int var3) {
		return var0.field198 != null && var0.field198.length != 0 ? new Class52(var0, var1, var2, var3) : null;
	}

	@ObfInfo(name = "bn", desc = "([B[IIIIIIILbz;)I")
	public static int method1011(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class52 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
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

		var8.field330 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "bh", desc = "(I[B[IIIIIIIILbz;)I")
	public static int method964(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field330 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "bq", desc = "([B[IIIIIIILbz;)I")
	public static int method965(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class52 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var2 + var3 - (var7 - 1)) > var6) {
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

		var8.field330 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "bd", desc = "(I[B[IIIIIIIILbz;)I")
	public static int method979(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field330 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "bz", desc = "(II[B[IIIIIIILbz;II)I")
	public static int method967(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = (var9 - var4 + var11 - 257) / var11 + var5) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var4 & 255) * (var2[var1 + 1] - var13)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = (var9 - var4 + var11 - 1) / var11 + var5) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var4 & 255) * (var12 - var13)) * var6 >> 6;
			var4 += var11;
		}

		var10.field330 = var4;
		return var5;
	}

	@ObfInfo(name = "bk", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method1003(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = (var10 - var4 + var12 - 257) / var12 + var5) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var4 & 255) * (var13 - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field330 = var4;
		return var5 >> 1;
	}

	@ObfInfo(name = "br", desc = "(II[B[IIIIIIILbz;II)I")
	public static int method969(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class52 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = (var9 + 256 - var4 + var11) / var11 + var5) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var4 & 255) * (var2[var1] - var13)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = (var9 - var4 + var11) / var11 + var5) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var10001 = var5++;
			var3[var10001] += ((var12 << 8) + (var4 & 255) * (var2[var4 >> 8] - var12)) * var6 >> 6;
			var4 += var11;
		}

		var10.field330 = var4;
		return var5;
	}

	@ObfInfo(name = "bf", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method984(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = (var10 + 256 - var4 + var12) / var12 + var5) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var0 = (var13 << 8) + (var4 & 255) * (var2[var4 >> 8] - var13);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field330 = var4;
		return var5 >> 1;
	}

	@ObfInfo(name = "cf", desc = "([B[IIIIIIIILbz;)I")
	public static int method971(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class52 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field329 += (var6 - var3) * var9.field333;
		var9.field334 += (var6 - var3) * var9.field337;

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

		var9.field328 = var4 >> 2;
		var9.field330 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "cv", desc = "(I[B[IIIIIIIIIILbz;)I")
	public static int method972(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class52 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.field328 += (var9 - var4) * var12.field336;
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field329 = var5 >> 2;
		var12.field334 = var6 >> 2;
		var12.field330 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "cl", desc = "([B[IIIIIIIILbz;)I")
	public static int method1010(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class52 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var2 + var3 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field329 += (var6 - var3) * var9.field333;
		var9.field334 += (var6 - var3) * var9.field337;

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

		var9.field328 = var4 >> 2;
		var9.field330 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "cm", desc = "(I[B[IIIIIIIIIILbz;)I")
	public static int method974(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class52 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field328 += (var9 - var4) * var12.field336;
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field329 = var5 >> 2;
		var12.field334 = var6 >> 2;
		var12.field330 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "cg", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method975(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		var11.field329 -= var11.field333 * var5;
		var11.field334 -= var11.field337 * var5;
		if (var12 == 0 || (var8 = (var10 - var4 + var12 - 257) / var12 + var5) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = (var10 - var4 + var12 - 1) / var12 + var5) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var4 & 255) * (var13 - var14)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		var11.field329 += var11.field333 * var5;
		var11.field334 += var11.field337 * var5;
		var11.field328 = var6;
		var11.field330 = var4;
		return var5;
	}

	@ObfInfo(name = "cu", desc = "(II[B[IIIIIIIIIILbz;II)I")
	public static int method976(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class52 var13, int var14, int var15) {
		var13.field328 -= var13.field336 * var5;
		if (var14 == 0 || (var10 = (var12 - var4 + var14 - 257) / var14 + var5) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var4 & 255) * (var15 - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field328 += var13.field336 * var5;
		var13.field329 = var6;
		var13.field334 = var7;
		var13.field330 = var4;
		return var5;
	}

	@ObfInfo(name = "cn", desc = "(II[B[IIIIIIIILbz;II)I")
	public static int method977(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class52 var11, int var12, int var13) {
		var11.field329 -= var11.field333 * var5;
		var11.field334 -= var11.field337 * var5;
		if (var12 == 0 || (var8 = (var10 + 256 - var4 + var12) / var12 + var5) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var4 & 255) * (var2[var1] - var14)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = (var10 - var4 + var12) / var12 + var5) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var4 & 255) * (var2[var4 >> 8] - var13)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		var11.field329 += var11.field333 * var5;
		var11.field334 += var11.field337 * var5;
		var11.field328 = var6;
		var11.field330 = var4;
		return var5;
	}

	@ObfInfo(name = "ce", desc = "(II[B[IIIIIIIIIILbz;II)I")
	public static int method978(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class52 var13, int var14, int var15) {
		var13.field328 -= var13.field336 * var5;
		if (var14 == 0 || (var10 = (var12 + 256 - var4 + var14) / var14 + var5) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var0 = (var15 << 8) + (var4 & 255) * (var2[var4 >> 8] - var15);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field328 += var13.field336 * var5;
		var13.field329 = var6;
		var13.field334 = var7;
		var13.field330 = var4;
		return var5;
	}
}
