package sp.senac.br.delladulce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_Activity extends AppCompatActivity {

    EditText usuario, senha;
    Button entrar, sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        usuario = (EditText) findViewById(R.id.edtUsuario);
        senha = (EditText) findViewById(R.id.edtSenha);

        entrar = (Button)findViewById(R.id.btnEntrar);

        sair = (Button)findViewById(R.id.btnSair);




        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txUsuario = usuario.getText().toString();
                String txSenha = senha.getText().toString();

                if (txUsuario.equals("senac")&&txSenha.equals("senac")){

                    Toast.makeText(getApplicationContext(),
                            "Bem vindo ao sistema",
                            Toast.LENGTH_SHORT).show();

                    Intent abrir = new Intent(login_Activity.this,MenuInferior_Activity.class);
                    startActivity(abrir);

                    finish();

                }else{
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválidos",
                            Toast.LENGTH_SHORT).show();


                    usuario.setText("");
                    senha.setText("");
                    usuario.requestFocus();
                }
            }
        });




    }

}

