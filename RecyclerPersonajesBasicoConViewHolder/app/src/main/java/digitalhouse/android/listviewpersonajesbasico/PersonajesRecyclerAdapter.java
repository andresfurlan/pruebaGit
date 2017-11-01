package digitalhouse.android.listviewpersonajesbasico;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by joe on 5/8/17.
 */

public class PersonajesRecyclerAdapter extends RecyclerView.Adapter  {

    private List<PersonajeDeSerie> personajesDeSerie;
    private NotificableRecyclerView b;

    public PersonajesRecyclerAdapter(List<PersonajeDeSerie> personajeDeSeries, NotificableRecyclerView notificable) {
        this.personajesDeSerie = personajeDeSeries;
        this.notificableDeRecyclerView = notificable;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View celda = inflater.inflate(R.layout.celda_detalle, parent, false);

        PersonajeViewHolder viewHolder = new PersonajeViewHolder(celda);

        //ASDJALKJSDLKAJSDLJASLDJ
        //


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        final PersonajeViewHolder personajeViewHolder = (PersonajeViewHolder) holder;

        personajeViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificableDeRecyclerView.notificarClick( personajesDeSerie.get(position));
            }
        });

        personajeViewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificableDeRecyclerView.notificarClickDeTexto( personajesDeSerie.get(position).getNombre());
            }
        });

        personajeViewHolder.cargarPersonaje(personajesDeSerie.get(position));
    }

    @Override
    public int getItemCount() {
        return personajesDeSerie.size();
    }

    private class PersonajeViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public PersonajeViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textViewNombrePersonaje);
        }

        public void cargarPersonaje(PersonajeDeSerie personajeDeSerie){
            textView.setText(personajeDeSerie.getNombre());
        }
    }

    public interface NotificableRecyclerView{
        public void notificarClick(PersonajeDeSerie personajeClickeado);

        public void notificarClickDeTexto(String nombre);
    }

}
