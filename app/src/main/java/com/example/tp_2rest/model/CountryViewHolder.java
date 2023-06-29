package com.example.tp_2rest.model;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.tp_2rest.MapsActivity;
import com.example.tp_2rest.R;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private final TextView name;
    private final TextView capital;
    private final ImageView drapeau;
    private final TextView currency;
    private Country country;
    //Constructeur, on récupère tous les éléments graphiques
// définis dans country_layout.xml
    public CountryViewHolder(final View itemView)
    {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(itemView.getContext(), MapsActivity.class);
                intent.putExtra("lat",country.getLatitude());
                intent.putExtra("lng",country.getLongitude());
                intent.putExtra("name",country.getCommonName());
                itemView.getContext().startActivity(intent);
            }
        });

        name = ((TextView)itemView.findViewById(R.id.tvc_name));
        capital = ((TextView)itemView.findViewById(R.id.tvc_capital));
        //flag = ((TextView)itemView.findViewById(R.id.tvc_flag));
        currency = ((TextView)itemView.findViewById(R.id.tvc_currency));
        drapeau = ((ImageView)itemView.findViewById(R.id.ivc_drapeau));
    }

    //Méthode permettant de mettre à jour la vue connaissant un Country
    public void afficher(Country country, RequestManager glide)
    {
        this.country = country;
        name.setText(country.getCommonName()+ " ("+country.getOfficialName()+ ")");
        capital.setText(country.getCapitalCity());
        //flag.setText("NO FLAG"); // Pour le moment on a pas de drapeau
        currency.setText(country.getCurrencyName() + " ("+
                country.getCurrencyTrigram()+ ", " +
                country.getCurrencySymbol() + ")");
        //glide.load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/No_flag.svg/338px-No_flag.svg.png").apply(RequestOptions.circleCropTransform()).into(drapeau);
        glide.load(country.getFlagUrl()).into(drapeau);
    }
}


