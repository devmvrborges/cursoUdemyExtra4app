package listview.studio.com.listview;
/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 19/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Exemplo de ListView utilizando 24 itens dentro de uma String
.

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {


    private ListView listaItens;
    private String[] itens = {
            "Item 1", "Item 2", "Item 3",
            "Item 4", "Item 5", "Item 6",
            "Item 7", "Item 8", "Item 9",
            "Item 10", "Item 11", "Item 12",
            "Item 13", "Item 14", "Item 15",
            "Item 16", "Item 17", "Item 18",
            "Item 19", "Item 19", "Item 21",
            "Item 22", "Item 23", "Item 24",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = (ListView) findViewById(R.id.listViewId);
        //criando um adaptador dessa lista de itens para que o listview possa exibir
        ArrayAdapter<String> adaptadorDeItens = new ArrayAdapter<String>(
                //primeiro parametro
                getApplicationContext(),
                //segundo parametro o layout
                android.R.layout.simple_list_item_1,
                //terceiro parametro fazendo referencia ao layout 1 acima
                android.R.id.text1,
                itens);

        listaItens.setAdapter(adaptadorDeItens);
        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Variavel para pegar o codigo da posição e o conteudo e mostrar em um Toast
                int codigoPosicao = position;
                String valorClicado = (String) listaItens.getItemAtPosition(codigoPosicao);
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
