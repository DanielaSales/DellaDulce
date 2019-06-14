package sp.senac.br.delladulce;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuInferior_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = (BottomNavigationView) findViewById(R.id.idbttnave);
        navigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.mlogin:
                Toast.makeText(getApplicationContext(), "Cliquei no login", Toast.LENGTH_SHORT).show();
                break;

                case R.id.mpedido:
                Toast.makeText(getApplicationContext(), "Cliquei no pedido", Toast.LENGTH_SHORT).show();
                break;


            case R.id.mlocalizacao:
                Toast.makeText(getApplicationContext(), "Cliquei na localização", Toast.LENGTH_SHORT).show();
                break;
        }

        return false;
    }
}
