package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bot_fragment,container,false);
    }
    public void display(String text){
        TextView textView = getActivity().findViewById(R.id.textView);
        textView.setText(text);
        WebView webView = getActivity().findViewById(R.id.webview);
        webView.setVisibility(View.GONE);
    }
    public void displayURL(){
        WebView webView = (WebView)getActivity().findViewById(R.id.webview);
        webView.loadUrl(getResources().getString(R.string.url));

        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new WebViewClient());
        webView.setVisibility(View.VISIBLE);
    }

}
