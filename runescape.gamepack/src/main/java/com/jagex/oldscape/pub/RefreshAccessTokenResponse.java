package com.jagex.oldscape.pub;

import io.runebox.ObfInfo;

public interface RefreshAccessTokenResponse {
	@ObfInfo(desc = "()Z")
	boolean isSuccess();

	@ObfInfo(desc = "()Ljava/lang/String;")
	String getAccessToken();

	@ObfInfo(desc = "()Ljava/lang/String;")
	String getRefreshToken();
}
