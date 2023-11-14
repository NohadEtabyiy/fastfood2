package com.example.fastfood2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//we need to extend the ArrayAdapter class as we are building an adapter
public class listAdapter extends ArrayAdapter<module> {

    //the list values in the List of type hero
    List<module> ModuleList;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    //constructor initializing the values
    public listAdapter(Context context, int resource, List<module> stagiairesList) {
        super(context, resource, stagiairesList);
        this.context = context;
        this.resource = resource;
        this.ModuleList = stagiairesList;
    }

    //this will return the ListView Item as a View

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view
        ImageView imageView = view.findViewById(R.id.grid_image);
        TextView textViewName = view.findViewById(R.id.item_name);



        //getting the hero of the specified position
        module hero = ModuleList.get(position);

        //adding values to the list item
        imageView.setImageDrawable(context.getResources().getDrawable(hero.getImage()));
        textViewName.setText(hero.getName());


        //adding a click listener to the button to remove item from the list
     /*   buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we will call this method to remove the selected value from the list
                //we are passing the position which is to be removed in the method
                removeStagiaire(position);
            }
        });*/

        //finally returning the view
        return view;
    }

    //this method will remove the item from the list
    /*private void removeStagiaire(final int position) {
        //Creating an alert dialog to confirm the deletion
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Are you sure you want to delete this?");

        //if the response is positive in the alert
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                //removing the item
                stagiairesList.remove(position);

                //reloading the list
                notifyDataSetChanged();
            }
        });

        //if response is negative nothing is being done
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        //creating and displaying the alert dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }*/
}