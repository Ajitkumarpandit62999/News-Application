package com.example.newsappitsumaircode.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class GrokNewsFragment extends Fragment {

    WebView webView;

    public GrokNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_grok_news, container, false);

        webView = root.findViewById(R.id.grok_webView);

        // Enable JavaScript & storage
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        // Allow auto-play for video/audio if API >= 17
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }

        // Needed for video/audio/fullscreen
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewController());

        // Load Grok AI
        webView.loadUrl("https://grok.com/");

        return root;
    }
}
