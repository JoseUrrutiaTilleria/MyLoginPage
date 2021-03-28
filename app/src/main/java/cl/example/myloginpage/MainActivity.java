package cl.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ImgLogo = findViewById(R.id.imgLogo);
        Picasso.get()
                .load ("http://blog.desafiolatam.com/wp-content/uploads/2015/03/desafio-latam-logonegro.png")
                .into(ImgLogo);

        Button btnIngresar = findViewById(R.id.btn);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Usuario ingresado con exito", LENGTH_SHORT).show();
            }
        });
    }

}