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

public class AajTakNewsFragment extends Fragment {

    WebView webView;

    public AajTakNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate layout
        View root = inflater.inflate(R.layout.fragment_aajtak_news, container, false);

        webView = root.findViewById(R.id.aajtak_webView);

        // ✅ Now enable settings after initialization
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        webView.setWebChromeClient(new WebChromeClient()); // needed for video/audio

        // Load AajTak website
        webView.loadUrl("https://www.aajtak.in/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}
