package cl.example.myloginpage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView ImgAndroid = findViewById(R.id.imgAndroid);
        Picasso.get()
                .load ("https://e7.pngegg.com/pngimages/718/930/png-clipart-android-software-development-android-fictional-character-mobile-app-development.png")
                .into(ImgAndroid);

    }
}