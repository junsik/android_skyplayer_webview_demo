package com.baramnetworks.skyplayerwebview;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

import org.json.JSONObject;

class SkyPlayerLauncher {
    private final Context mContext;

    public SkyPlayerLauncher(Context c) {
        mContext = c;
    }

    @JavascriptInterface
    public void play(String contentId) {
        try {
            SkyPlayerAPIClient getRequest = new SkyPlayerAPIClient();
            String result = getRequest.execute(contentId).get();

            JSONObject obj = new JSONObject(result);
            Intent intent = new Intent(mContext, SkyPlayerActivity.class);
            intent.putExtra("title", obj.getString("title"));
            intent.putExtra("hls", obj.getString("hls"));
            intent.putExtra("poster", obj.getString("poster"));
            intent.putExtra("thumbnail_vtt", obj.getString("thumbnail_vtt"));
            intent.putExtra("user", obj.getString("user"));
            mContext.startActivity(intent);
        } catch (Exception ex) {

        }
    }
}
