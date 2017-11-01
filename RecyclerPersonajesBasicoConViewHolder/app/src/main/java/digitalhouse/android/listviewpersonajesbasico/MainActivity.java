package digitalhouse.android.listviewpersonajesbasico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PersonajesRecyclerAdapter.NotificableRecyclerView{

    //Aca declaro que voy a tener una lista de personajes favoritos
    List<PersonajeDeSerie> misPersonajesFavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aca comienzo a cargar la lista con los personajes
        misPersonajesFavoritos = new ArrayList<>();
        misPersonajesFavoritos.add(new PersonajeDeSerie("Goku"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Seiya"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Ikki"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("HeMan"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("La vaca y el pollito"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Coraje el perro cobarte"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Dexter y su laboratorio"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Oliver Atom"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Tom Misaki"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Pinky y Cerebro"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Los Simpsons"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Duckman"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Steve hyuga"));
        misPersonajesFavoritos.add(new PersonajeDeSerie("Johny Bravo"));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        PersonajesRecyclerAdapter personajesRecyclerAdapter = new PersonajesRecyclerAdapter(misPersonajesFavoritos, this);

        recyclerView.setAdapter(personajesRecyclerAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

    @Override
    public void notificarClick(PersonajeDeSerie personajeClickeado) {
        Toast.makeText(this, "Click personaje", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void notificarClickDeTexto(String nombre) {
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show();
    }
}
