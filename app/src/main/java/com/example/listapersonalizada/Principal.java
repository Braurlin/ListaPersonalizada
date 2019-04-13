package com.example.listapersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    ListView lista;

    String[][] datos =  {
            //{"titulo", "director", "duracion", "10", "descripcion" }
            {"Ant-Man and the Wasp", "Peyton Reed", "1:58", "7", "Después de su experiencia con el" +
                    "Capitán América, Scott Lang reflexiona sobre ser un super héroe y un padre," +
                    "entonces Hope van Dyne y el Dr. Hank Pym presentan una misión urgente que pone" +
                    "a Ant-Man a luchar al lado de la Avispa para descubrir secretos del pasado." },

            {"Aquaman", "James Wan", "2:23", "7", "Arthur, mitad humano mitad atlante y heredero del" +
            "reino submarino de la Atlántida, se embarca en la misión de impedir una guerra" +
            "entre los mundos del océano y la tierra." },

            {"Máquinas Mortales", "Christian Rivers", "2:08", "6", "En un mundo post apocalíptico" +
                    "donde las ciudades se desplazan sobre ruedas y se consumen entre sí para" +
                    "sobrevivir, dos personas se encuentran en Londres para detener una amenaza." },

            {"Mowgli", "Andy Serkis", "1:44", "6", "Un cachorro de humano criado por lobos en las" +
            "selvas de la India y bajo las enseñanzas del oso Baloo y la pantera negra" +
            "Bagheera, debe enfrentarse al amenazador tigre Shere Khan, así como a su propio origen." },

            {"Robin Hood", "Otto Bathurst", "1:56", "5", "El cruzado endurecido en batalla Robin" +
                    "Hood y su comandante moro organizan una audaz rebelión en contra de la" +
                    "corrupción de la corona inglesa." },

            {"Spider-Man: Un nuevo universo", "Bob Persichetti, Peter Ramsey", "1:57", "8", "El" +
                    "joven Miles Morales se convierte en el Spider-man de su realidad, cruzando su" +
                    "camino con varias contrapartes de otras dimensiones para detener un peligro" +
                    "que amenaza a todas las realidades." },

            {"Vengadores: Endgame", "Anthony Russo, Joe Russo", "2:27", "8", "After the devastating" +
            "events of Vengadores: Infinity War (2018), the universe is in ruins. With the" +
            "help of remaining allies, the Avengers assemble once more in order to undo" +
            "Thanos' actions and restore order to the universe." },

            {"Angry Birds 2", "Thurop Van Orman, John Rice (co-director)", "1:21", "7", "The " +
                    "flightless birds and scheming green pigs take their beef to the next level." },

            {"Capitana Marvel", "Anna Boden, Ryan Fleck", "2:03", "7", "Carol Danvers becomes one " +
                    "of the universe's most powerful heroes when Earth is caught in the middle of a " +
                    "galactic war between two alien races." },

            {"Cómo entrenar a tu dragón 3", "Dean DeBlois", "1:44", "8", "When Hiccup discovers " +
                    "Toothless isn't the only Night Fury, he must seek \"The Hidden World\", a " +
                    "secret Dragon Utopia before a hired tyrant named Grimmel finds it first." },

            {"Alita: Ángel de combate", "Robert Rodriguez", "2:02", "7", "A deactivated female " +
                    "cyborg is revived, but cannot remember anything of her past life and goes on a " +
                    "quest to find out who she is." },

            {"Triple amenaza", "Jesse V. Johnson", "1:36", "7", "A hit contract is taken out on a " +
                    "billionaires daughter intent on bringing down a major crime syndicate. A down " +
                    "and out team of mercenaries must take on a group of professional assassins and " +
                    "stop them before they kill their target." },

            {"El Parque Mágico", "Josh Appelbaum", "1:25", "5", "Wonder Park tells the story of an " +
                    "amusement park where the imagination of a wildly creative girl named June comes alive." }
    };

    int[] datosImg = {R.drawable.antmanandthewasp, R.drawable.aquaman, R.drawable.maquinasmortales,
            R.drawable.mowgli, R.drawable.robinhood, R.drawable.spiderman, R.drawable.avendgame,
            R.drawable.angrybirdtwo, R.drawable.capitanamarvel, R.drawable.comoentrenartudragontres,
            R.drawable.alita, R.drawable.triplecombate, R.drawable.parquemagico};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista = (ListView) findViewById(R.id.lista);

        lista.setAdapter(new Adaptador(this, datos, datosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetallesPelicula.class);
                visorDetalles.putExtra("TIT", datos[position][0]);
                visorDetalles.putExtra("DET", datos[position][4]);
                startActivity(visorDetalles);
            }
        });
    }
}
