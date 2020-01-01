package id.ac.poliban.mi.nia.latihan06;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //membuat object inflater
        MenuInflater inflater = getMenuInflater();
        //menempelkan menu ke object inflater
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.miAranea){
            View view = this.getWindow().getDecorView();
            //terlihat file gambar cherry_barb sebagai
            //hasil import android drawable importer
            //dikenali dalam source code kita
            view.setBackgroundResource(R.drawable.aranea_highwind);
        }
        if(item.getItemId()==R.id.miCloud){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.cloud_stife);
        }
        if(item.getItemId()==R.id.miLightning){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.lightning_farron);
        }
        if(item.getItemId()==R.id.miLuna){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.lunafreya_nox_fleuret);
        }
        if(item.getItemId()==R.id.miNoctis){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.noctis_lucis_caelum);
        }
        if(item.getItemId()==R.id.miLumina){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.lumina);
        }
        if(item.getItemId()==R.id.miPrompto){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.prompto_argentum);
        }
        return true;
    }
}
