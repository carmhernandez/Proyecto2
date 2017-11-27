package com.example.sistemas.proyecto;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Datos> Lista;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opciones, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.uno) {
            Intent i = new Intent(this, Main2Activity.class );
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Datos>();

        Lista.add(new Datos("Iglesias Lourdes Pasto,    La capilla de Nuestra Señora de Lourdes, que se destaca por su arquitectura colonial, tiene una sola nave rectangular. Su altar era de madera, pero ahora es de piedra, en forma de gruta, y en él se aprecia la imagen de Nuestra Señora de Lourdes. La capilla, en la que también se venera la imagen del Señor de los Despojos, tuvo su segunda remodelación, cuya obra terminó en 2006. ",1,R.drawable.lourdes,"Lourdes"));
        Lista.add(new Datos("Iglesias de San Andres Pasto,    El templo de San Andrés está ubicado en uno de los sectores más tradicionales de la ciudad, conocido como RUMIPAMBA, que en quichua significa “LLANURA DE PIEDRA”. Rumipamba ha sido escenario de importantes acontecimientos para la historia de Pasto, como la decapitación en 1564 a manos de las autoridades españolas, del joven criollo Gonzalo Rodríguez, quien desde comienzos de la colonia, buscaba la independencia de este territorio.",2,R.drawable.andres,"San Andres"));
        Lista.add(new Datos("Iglesias de la Catedral Pasto , La Catedral de Pasto, también conocida como Templo del Sagrado Corazón es una iglesia catedralicia de culto católico consagrada al Sagrado Corazón de Jesús y a San Francisco, localizada en el centro de la ciudad de Pasto.",3,R.drawable.catedra,"Catedral"));
        Lista.add(new Datos("Iglesias de Cristo Rey Pasto ,El templo de Cristo Rey, en Pasto, fue levantado por los padres jesuitas luego de que decidieron echar abajo la iglesia de Santo Toribio, construida en 1572. Además de este espacio, se heredó de la comunidad dominica la imagen del Cristo de Sibundoy, adquirida en 1583, que es considerada como una de las joyas artísticas y religiosas del templo.  ",4,R.drawable.cri,"Cristo Rey"));
        Lista.add(new Datos("Iglesias de Fatima Pasto,  Es románico ultra modernista en su área se forma una amplia Cruz Latina, su altar único ocupa el centro del crucero y en la cumbre del templete, sostenido por cuatro columnas torneadas en espiral, está la preciosa imagen de la Virgen de Fátima que alumbra su amorosa luz. En los muros del templo se observa una serie de amplios y elegantes vitrales. El ara o altar es una enteriza laja blanca sobre bases de mármol negro. La luz entra a torrentes y el iris de sus vitrales amplios juegan como un encantado caleidoscopio.\n  ",5,R.drawable.fatima1,"Fatima"));
        Lista.add(new Datos("Iglesias de las Lajas Pasto , Maravilla por su arquitectura medieval y por su ubicación topográfica entre los riscos de la cordillera de los Andes, razón por la cual, es denominado como Un milagro de Dios sobre el abismo. ",6,R.drawable.la,"Lajas"));
        Lista.add(new Datos("Iglesias de Santiago Pasto , El 13 de marzo de 1894 se comenzó la demolición del ruinoso templo de Santiago; el 20 del mismo mes y año se coloco la piedra angular del nuevo y el primero de octubre de 1897, Fray Ezequiel Moreno Díaz, Obispo de Pasto, le inauguro solemnemente, con la rectoría espiritual de los capuchinos ecuatorianos, requeridos asiduamente y para quienes se construyo el amplio monasterio.",7,R.drawable.santiagoooo,"Santiago"));


        Adaptador miadaptador = new Adaptador(getApplicationContext(),Lista);

          listaDatos.setAdapter(miadaptador);

          listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  Datos obj = (Datos) parent.getItemAtPosition(position);


                  Intent paso = new Intent(getApplicationContext(), Detalle2Activity.class);
                  paso.putExtra("objeto",(Serializable) obj);
                  startActivity(paso);
              }
          });
    }
}
