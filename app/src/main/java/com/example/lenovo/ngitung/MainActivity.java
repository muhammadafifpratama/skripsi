package com.example.lenovo.ngitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEditText1;
    EditText mEditText2;
    EditText mEditText3;
    EditText mEditText4;
    EditText mEditText5;
    EditText mEditText6;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = (EditText)findViewById(R.id.editText);
        mEditText2 = (EditText)findViewById(R.id.editText2);
        mEditText3 = (EditText)findViewById(R.id.editText3);
        mEditText4 = (EditText)findViewById(R.id.editText4);
        mEditText5 = (EditText)findViewById(R.id.editText5);
        mEditText6 = (EditText)findViewById(R.id.editText6);

        mButton =  (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //When the button is clicked, call the calucate method.
                perhitungan();
            }
        });

    }

    public void perhitungan() {
        Double bobot1 = Double.parseDouble(mEditText1.getText().toString());
        Double bobot2 = Double.parseDouble(mEditText2.getText().toString());
        Double bobot3 = Double.parseDouble(mEditText3.getText().toString());
        Double bobot4 = Double.parseDouble(mEditText4.getText().toString());
        Double bobot5 = Double.parseDouble(mEditText5.getText().toString());
        Double bobot6 = Double.parseDouble(mEditText6.getText().toString());
        int k1a1 = 3000;
        int k1a2 = 1600;
        int k1a3 = 5450;
        int k1a4 = 3000;
        int k2a1 = 3000;
        int k2a2 = 4100;
        int k2a3 = 3000;
        int k2a4 = 2900;
        int k3a1 = 3;
        int k3a2 = 2;
        int k3a3 = 6;
        int k3a4 = 3;
        int k4a1 = 32;
        int k4a2 = 16;
        int k4a3 = 64;
        int k4a4 = 32;
        int k5a1 = 424;
        int k5a2 = 296;
        int k5a3 = 401;
        int k5a4 = 282;
        int k6a1 = 16;
        int k6a2 = 13;
        int k6a3 = 16;
        int k6a4 = 13;
        int sum1;
        int sum2;
        int sum3;
        int sum4;
        int sum5;
        int sum6;
        double num1 = Math.pow(k1a1,2);
        double num2 = Math.pow(k1a2,2);
        double num3 = Math.pow(k1a3,2);
        double num4 = Math.pow(k1a4,2);
        int a = (int) num1;
        int b = (int) num2;
        int c = (int) num3;
        int d = (int) num4;
        sum1 = a+b+c+d;
        double pembagi = Math.sqrt(sum1);
        //String pembagi1 = Double.toString(pembagi);
        //mTextView.setText(pembagi1);
        double num5 = Math.pow(k2a1,2);
        double num6 = Math.pow(k2a2,2);
        double num7 = Math.pow(k2a3,2);
        double num8 = Math.pow(k2a4,2);
        int e = (int) num5;
        int f = (int) num6;
        int g = (int) num7;
        int h = (int) num8;
        sum2 = e+f+g+h;
        double pembagi2 = Math.sqrt(sum2);
        double num9 = Math.pow(k3a1,2);
        double num10 = Math.pow(k3a2,2);
        double num11 = Math.pow(k3a3,2);
        double num12 = Math.pow(k3a4,2);
        int i = (int) num9;
        int j = (int) num10;
        int k = (int) num11;
        int l = (int) num12;
        sum3 = i+j+k+l;
        double pembagi3 = Math.sqrt(sum3);
        double num13 = Math.pow(k4a1,2);
        double num14 = Math.pow(k4a2,2);
        double num15 = Math.pow(k4a3,2);
        double num16 = Math.pow(k4a4,2);
        int m = (int) num13;
        int n = (int) num14;
        int o = (int) num15;
        int p = (int) num16;
        sum4 = m+n+o+p;
        double pembagi4 = Math.sqrt(sum4);
        double num17 = Math.pow(k5a1,2);
        double num18 = Math.pow(k5a2,2);
        double num19 = Math.pow(k5a3,2);
        double num20 = Math.pow(k5a4,2);
        int q = (int) num17;
        int r = (int) num18;
        int s = (int) num19;
        int t = (int) num20;
        sum5 = q+r+s+t;
        double pembagi5 = Math.sqrt(sum5);
        double num21 = Math.pow(k6a1,2);
        double num22 = Math.pow(k6a2,2);
        double num23 = Math.pow(k6a3,2);
        double num24 = Math.pow(k6a4,2);
        int u = (int) num21;
        int v = (int) num22;
        int w = (int) num23;
        int x = (int) num24;
        sum6 = u+v+w+x;
        double pembagi6 = Math.sqrt(sum6);
         // int ternormalisasi = 0;
        double ternormalisasi =  k1a1/pembagi;
        double ternormalisasi1 = k1a2/pembagi;
        double ternormalisasi2 = k1a3/pembagi;
        double ternormalisasi3 = k1a4/pembagi;
        double ternormalisasi4 = k2a1/pembagi2;
        double ternormalisasi5 = k2a2/pembagi2;
        double ternormalisasi6 = k2a3/pembagi2;
        double ternormalisasi7 = k2a4/pembagi2;
        double ternormalisasi8 = k3a1/pembagi3;
        double ternormalisasi9 = k3a2/pembagi3;
        double ternormalisasi10 = k3a3/pembagi3;
        double ternormalisasi11 = k3a4/pembagi3;
        double ternormalisasi12 = k4a1/pembagi4;
        double ternormalisasi13 = k4a2/pembagi4;
        double ternormalisasi14 = k4a3/pembagi4;
        double ternormalisasi15 = k4a4/pembagi4;
        double ternormalisasi16 = k5a1/pembagi5;
        double ternormalisasi17 = k5a2/pembagi5;
        double ternormalisasi18 = k5a3/pembagi5;
        double ternormalisasi19 = k5a4/pembagi5;
        double ternormalisasi20 = k6a1/pembagi6;
        double ternormalisasi21 = k6a2/pembagi6;
        double ternormalisasi22 = k6a3/pembagi6;
        double ternormalisasi23 = k6a4/pembagi6;
        // String ngetes = Double.toString(pembagi);
        //String hasil = Integer.toString(ternormalisasi);
        //mTextView.setText(ngetes);
        double terbobot =  ternormalisasi*bobot1;
        double terbobot1 = ternormalisasi1*bobot1;
        double terbobot2 = ternormalisasi2*bobot1;
        double terbobot3 = ternormalisasi3*bobot1;
        double terbobot4 = ternormalisasi4*bobot2;
        double terbobot5 = ternormalisasi5*bobot2;
        double terbobot6 = ternormalisasi6*bobot2;
        double terbobot7 = ternormalisasi7*bobot2;
        double terbobot8 = ternormalisasi8*bobot3;
        double terbobot9 = ternormalisasi9*bobot3;
        double terbobot10 = ternormalisasi10*bobot3;
        double terbobot11 = ternormalisasi11*bobot3;
        double terbobot12 = ternormalisasi12*bobot4;
        double terbobot13 = ternormalisasi13*bobot4;
        double terbobot14 = ternormalisasi14*bobot4;
        double terbobot15 = ternormalisasi15*bobot4;
        double terbobot16 = ternormalisasi16*bobot5;
        double terbobot17 = ternormalisasi17*bobot5;
        double terbobot18 = ternormalisasi18*bobot5;
        double terbobot19 = ternormalisasi19*bobot5;
        double terbobot20 = ternormalisasi20*bobot6;
        double terbobot21 = ternormalisasi21*bobot6;
        double terbobot22 = ternormalisasi22*bobot6;
        double terbobot23 = ternormalisasi23*bobot6;

        double aplus1 = Math.min(terbobot, Math.min(terbobot1, Math.min(terbobot2, terbobot3)));
        double aplus2 = Math.max(terbobot4, Math.max(terbobot5, Math.max(terbobot6, terbobot7)));
        double aplus3 = Math.max(terbobot8, Math.max(terbobot9, Math.max(terbobot10, terbobot11)));
        double aplus4 = Math.max(terbobot12, Math.max(terbobot13, Math.max(terbobot14, terbobot15)));
        double aplus5 = Math.max(terbobot16, Math.max(terbobot17, Math.max(terbobot18, terbobot19)));
        double aplus6 = Math.max(terbobot20, Math.max(terbobot21, Math.max(terbobot22, terbobot23)));
        double aminus1 = Math.max(terbobot, Math.max(terbobot1, Math.max(terbobot2, terbobot3)));
        double aminus2 = Math.min(terbobot4, Math.min(terbobot5, Math.min(terbobot6, terbobot7)));
        double aminus3 = Math.min(terbobot8, Math.min(terbobot9, Math.min(terbobot10, terbobot11)));
        double aminus4 = Math.min(terbobot12, Math.min(terbobot13, Math.min(terbobot14, terbobot15)));
        double aminus5 = Math.min(terbobot16, Math.min(terbobot17, Math.min(terbobot18, terbobot19)));
        double aminus6 = Math.min(terbobot20, Math.min(terbobot21, Math.min(terbobot22, terbobot23)));
        //String ngetes = Double.toString(aplus1);
        //mTextView.setText(ngetes);
        double pengurangandplus1 = aplus1 - terbobot;
        double pengurangandplus2 = aplus2 - terbobot4;
        double pengurangandplus3 = aplus3 - terbobot8;
        double pengurangandplus4 = aplus4 - terbobot12;
        double pengurangandplus5 = aplus5 - terbobot16;
        double pengurangandplus6 = aplus6 - terbobot20;
        double pengurangandplus7 = aplus1 - terbobot1;
        double pengurangandplus8 = aplus2 - terbobot5;
        double pengurangandplus9 = aplus3 - terbobot9;
        double pengurangandplus10 = aplus4 - terbobot13;
        double pengurangandplus11 = aplus5 - terbobot17;
        double pengurangandplus12 = aplus6 - terbobot21;
        double pengurangandplus13 = aplus1 - terbobot2;
        double pengurangandplus14 = aplus2 - terbobot6;
        double pengurangandplus15 = aplus3 - terbobot10;
        double pengurangandplus16 = aplus4 - terbobot14;
        double pengurangandplus17 = aplus5 - terbobot18;
        double pengurangandplus18 = aplus6 - terbobot22;
        double pengurangandplus19 = aplus1 - terbobot3;
        double pengurangandplus20 = aplus2 - terbobot7;
        double pengurangandplus21 = aplus3 - terbobot11;
        double pengurangandplus22 = aplus4 - terbobot15;
        double pengurangandplus23 = aplus5 - terbobot19;
        double pengurangandplus24 = aplus6 - terbobot23;
        double pow1 = Math.pow(pengurangandplus1, 2);
        double pow2 = Math.pow(pengurangandplus2, 2);
        double pow3 = Math.pow(pengurangandplus3, 2);
        double pow4 = Math.pow(pengurangandplus4, 2);
        double pow5 = Math.pow(pengurangandplus5, 2);
        double pow6 = Math.pow(pengurangandplus6, 2);
        double pow7 = Math.pow(pengurangandplus7, 2);
        double pow8 = Math.pow(pengurangandplus8, 2);
        double pow9 = Math.pow(pengurangandplus9, 2);
        double pow10 = Math.pow(pengurangandplus10, 2);
        double pow11 = Math.pow(pengurangandplus11, 2);
        double pow12 = Math.pow(pengurangandplus12, 2);
        double pow13 = Math.pow(pengurangandplus13, 2);
        double pow14 = Math.pow(pengurangandplus14, 2);
        double pow15 = Math.pow(pengurangandplus15, 2);
        double pow16 = Math.pow(pengurangandplus16, 2);
        double pow17 = Math.pow(pengurangandplus17, 2);
        double pow18 = Math.pow(pengurangandplus18, 2);
        double pow19 = Math.pow(pengurangandplus19, 2);
        double pow20 = Math.pow(pengurangandplus20, 2);
        double pow21 = Math.pow(pengurangandplus21, 2);
        double pow22 = Math.pow(pengurangandplus22, 2);
        double pow23 = Math.pow(pengurangandplus23, 2);
        double pow24 = Math.pow(pengurangandplus24, 2);
        double dplus = pow1 + pow2 + pow3 + pow4 + pow5 + pow6;
        double dplus1 = pow7 + pow8 + pow9 + pow10 + pow11 + pow12;
        double dplus2 = pow13 + pow14 + pow15 + pow16 + pow17 + pow18;
        double dplus3 = pow19 + pow20 + pow21 + pow22 + pow23 + pow24 ;
        double akhirnya = Math.sqrt(dplus);
        double akhirnya1 = Math.sqrt(dplus1);
        double akhirnya2 = Math.sqrt(dplus2);
        double akhirnya3 = Math.sqrt(dplus3);
        double pengurangandmin1 = terbobot - aminus1;
        double pengurangandmin2 = terbobot4 - aminus2;
        double pengurangandmin3 = terbobot8 - aminus3;
        double pengurangandmin4 = terbobot12 - aminus4;
        double pengurangandmin5 = terbobot16 - aminus5;
        double pengurangandmin6 = terbobot20 - aminus6;
        double pengurangandmin7 = terbobot1 - aminus1;
        double pengurangandmin8 = terbobot5 - aminus2;
        double pengurangandmin9 = terbobot9 - aminus3;
        double pengurangandmin10 = terbobot13 - aminus4;
        double pengurangandmin11 = terbobot17 - aminus5;
        double pengurangandmin12 = terbobot21 - aminus6;
        double pengurangandmin13 = terbobot2 - aminus1;
        double pengurangandmin14 = terbobot6 - aminus2;
        double pengurangandmin15 = terbobot10 - aminus3;
        double pengurangandmin16 = terbobot14 - aminus4;
        double pengurangandmin17 = terbobot18 - aminus5;
        double pengurangandmin18 = terbobot22 - aminus6;
        double pengurangandmin19 = terbobot3 - aminus1;
        double pengurangandmin20 = terbobot7 - aminus2;
        double pengurangandmin21 = terbobot11 - aminus3;
        double pengurangandmin22 = terbobot15 - aminus4;
        double pengurangandmin23 = terbobot19 - aminus5;
        double pengurangandmin24 = terbobot23 - aminus6;
        double pow25 = Math.pow(pengurangandmin1, 2);
        double pow26 = Math.pow(pengurangandmin2, 2);
        double pow27 = Math.pow(pengurangandmin3, 2);
        double pow28 = Math.pow(pengurangandmin4, 2);
        double pow29 = Math.pow(pengurangandmin5, 2);
        double pow30 = Math.pow(pengurangandmin6, 2);
        double pow31 = Math.pow(pengurangandmin7, 2);
        double pow32 = Math.pow(pengurangandmin8, 2);
        double pow33 = Math.pow(pengurangandmin9, 2);
        double pow34 = Math.pow(pengurangandmin10, 2);
        double pow35 = Math.pow(pengurangandmin11, 2);
        double pow36 = Math.pow(pengurangandmin12, 2);
        double pow37 = Math.pow(pengurangandmin13, 2);
        double pow38 = Math.pow(pengurangandmin14, 2);
        double pow39 = Math.pow(pengurangandmin15, 2);
        double pow40 = Math.pow(pengurangandmin16, 2);
        double pow41 = Math.pow(pengurangandmin17, 2);
        double pow42 = Math.pow(pengurangandmin18, 2);
        double pow43 = Math.pow(pengurangandmin19, 2);
        double pow44 = Math.pow(pengurangandmin20, 2);
        double pow45 = Math.pow(pengurangandmin21, 2);
        double pow46 = Math.pow(pengurangandmin22, 2);
        double pow47 = Math.pow(pengurangandmin23, 2);
        double pow48 = Math.pow(pengurangandmin24, 2);
        double dmin1 = pow25 + pow26 + pow27 + pow28 + pow29 + pow30;
        double dmin2 = pow31 + pow32 + pow33 + pow34 + pow35 + pow36;
        double dmin3 = pow37 + pow38 + pow39 + pow40 + pow41 + pow42;
        double dmin4 = pow43 + pow44 + pow45 + pow46 + pow47 + pow48 ;
        double akhirnya4 = Math.sqrt(dmin1);
        double akhirnya5 = Math.sqrt(dmin2);
        double akhirnya6 = Math.sqrt(dmin3);
        double akhirnya7 = Math.sqrt(dmin4);
        double selese = akhirnya + akhirnya4;
        double selese1 = akhirnya1 + akhirnya5;
        double selese2 = akhirnya2 + akhirnya6;
        double selese3 = akhirnya3 + akhirnya7;
        double juga = akhirnya4/selese;
        double juga1 = akhirnya5/selese1;
        double juga2 = akhirnya6/selese2;
        double juga3 = akhirnya7/selese3;
        double jawaban = Math.max(juga, Math.max(juga1, Math.max(juga2, juga3)));
        String hasil = Double.toString(jawaban);
        String hasil1 = Double.toString(juga);
        String hasil2 = Double.toString(juga1);
        String hasil3 = Double.toString(juga2);
        String hasil4 = Double.toString(juga3);
        TextView mTextView = (TextView) findViewById(R.id.textView2);
        TextView hp1 = (TextView) findViewById(R.id.textView3);
        TextView hp2 = (TextView) findViewById(R.id.textView4);
        TextView hp3 = (TextView) findViewById(R.id.textView5);
        TextView hp4 = (TextView) findViewById(R.id.textView6);
        mTextView.setText(hasil);
        mTextView.setVisibility(View.VISIBLE);
        hp1.setVisibility(View.VISIBLE);
        hp2.setVisibility(View.VISIBLE);
        hp3.setVisibility(View.VISIBLE);
        hp4.setVisibility(View.VISIBLE);
        hp1.setText(hasil1);
        hp2.setText(hasil2);
        hp3.setText(hasil3);
        hp4.setText(hasil4);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
