package ton.android.rss.doctin;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TwoLineListItem;
import android.util.Xml;
import android.text.Html;




import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.IOException;

/**
 * Created by LamNT12 on 3/17/2015.
 */
public class ViewDetailWeb extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        WebView detailWeb = (WebView) findViewById(R.id.detailWeb);
        EditText urlDetail = (EditText) findViewById(R.id.editText1);

        Intent intent = getIntent();
        String Link = intent.getStringExtra("Link");
        detailWeb.loadUrl(Link);
        urlDetail.setText(Link);


    }



}
