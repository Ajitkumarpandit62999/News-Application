package com.example.newsappitsumaircode.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class PublicNewsFragment extends Fragment {

    WebView webView;

    public PublicNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate layout
        View root = inflater.inflate(R.layout.fragment_public_news, container, false);

        webView = root.findViewById(R.id.public_webView);
        webView.loadUrl("https://public.app/o"); // Public News Website
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}
