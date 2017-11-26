package cz.harvie.northdog;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

import cz.harvie.northdog.R;

public class AboutActivity extends Activity {

	@Override    
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		TextView tv = (TextView) findViewById(R.id.about_text);
		tv.setMovementMethod(new ScrollingMovementMethod());
		Linkify.addLinks(tv, Linkify.WEB_URLS);		
	}
	
}
