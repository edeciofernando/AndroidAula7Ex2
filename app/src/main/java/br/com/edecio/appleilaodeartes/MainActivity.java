package br.com.edecio.appleilaodeartes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private TextView txtObra;
    private TextView txtPath;
    private ImageView imgObra;
    private Button btnVerObra;
    private Button btnDarLance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtObra = (TextView) findViewById(R.id.txtObra);
        txtPath = (TextView) findViewById(R.id.txtPath);
        imgObra = (ImageView) findViewById(R.id.imgObra);
        btnVerObra = (Button) findViewById(R.id.btnVerObra);
        btnDarLance = (Button) findViewById(R.id.btnDarLance);

        BuscaLeilao buscaLeilao = new BuscaLeilao(txtObra, txtPath, btnVerObra);
        buscaLeilao.execute("http://187.7.106.14/edecio/obradasemana.php");
    }

    public void verObra(View view) {
        String path = txtPath.getText().toString();
        Picasso.with(this).load(path).into(imgObra);
        btnDarLance.setVisibility(View.VISIBLE);
    }

    public void darLance(View view) {
    }
}
