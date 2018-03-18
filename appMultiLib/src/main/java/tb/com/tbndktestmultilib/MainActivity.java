package tb.com.tbndktestmultilib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import tb.com.tbndktestmultilib.R;

public class MainActivity
        extends AppCompatActivity
{

    // Used to load the 'native-lib' library on application startup.
    static
    {
        System.loadLibrary( "one-lib" );
        System.loadLibrary( "msg-one-lib" );
        System.loadLibrary( "two-lib" );
        System.loadLibrary( "msg-two-lib" );
    }

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


    }

    public void libOne( View v)
    {
        // Example of a call to a native method
        TextView tv = ( TextView ) findViewById( R.id.sample_text );
        tv.setText( stringFromJNILibOne() );
    }

    public void libTwo( View v)
    {
        // Example of a call to a native method
        TextView tv = ( TextView ) findViewById( R.id.sample_text );
        tv.setText( stringFromJNILibTwo() );
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNILibOne();
    public native String stringFromJNILibTwo();
}
