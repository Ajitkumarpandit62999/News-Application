package com.example.newsappitsumaircode.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class AbpNewsFragment extends Fragment {

    WebView webView;

    public AbpNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_abp_news, container, false);

        webView = root.findViewById(R.id.abp_webView);
        webView.loadUrl("https://news.abplive.com/"); // ABP News Website
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}
