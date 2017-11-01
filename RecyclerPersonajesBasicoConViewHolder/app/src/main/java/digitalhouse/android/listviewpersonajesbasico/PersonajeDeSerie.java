package digitalhouse.android.listviewpersonajesbasico;

/**
 * Created by joe on someday.
 */
public class PersonajeDeSerie {
    private String nombre;

    public PersonajeDeSerie(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object object) {
        PersonajeDeSerie unPersonajeDeSerie = (PersonajeDeSerie) object;

        return nombre.equals(unPersonajeDeSerie.getNombre());
    }

}
