package com.movilespascual.gridlayout;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/*Adapter actúa como intermediario entre el GridView y la fuente de datos
* Carga la información que se debe mostrar in el gridview desde una fuente de datos
* como lo es: un arreglo, un query de una base de datos, y luego crea una vista por
* cada uno de ellos.
* */
public class customAdapter extends BaseAdapter {
    private Context myContext;

    LayoutInflater inflater;


    public customAdapter(Context contexto){
        myContext = contexto;
    }
/*
The getCount() function returns the total number of items to be displayed in a list.
It counts the value from array list size() method or an array’s length. For example,
if we have an list of elements in an arraylist and we have to display the items in a list view
then we can count the total number of elements using the size function and then that integer value
is returned by the function getCount()
* */
    @Override
    public int getCount() {
        return imagenes.length;
    }

    @Override
    public Object getItem(int posicion) {
        return null;
    }

    @Override
    public long getItemId(int posicion) {
        return 0;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {
        ImageView imageView;

        if (inflater == null){
            inflater =(LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view == null){
            view = inflater.inflate(R.layout.grid_item,null);
        }

        ImageView imageView1 = view.findViewById(R.id.gri_image);
        imageView1.setImageResource(imagenes[posicion]);
        return imageView1;
    }

    //Arreglo de imagenes

    public Integer [] imagenes ={
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4

    };
}
