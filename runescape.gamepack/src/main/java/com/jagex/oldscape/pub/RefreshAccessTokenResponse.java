package com.jagex.oldscape.pub;

import io.runebox.ObfInfo;

public interface RefreshAccessTokenResponse {
	@ObfInfo(name = "isSuccess", desc = "()Z")
	boolean isSuccess();

	@ObfInfo(name = "getAccessToken", desc = "()Ljava/lang/String;")
	String getAccessToken();

	@ObfInfo(name = "getRefreshToken", desc = "()Ljava/lang/String;")
	String getRefreshToken();
}
