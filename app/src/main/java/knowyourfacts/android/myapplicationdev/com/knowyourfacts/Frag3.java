package knowyourfacts.android.myapplicationdev.com.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    Button changeColour;
    ImageView iv;


    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag3, container, false);

        changeColour = (Button) view.findViewById(R.id.changeColourFrag3);
        iv = (ImageView)view.findViewById(R.id.iv);
        final LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout);

        changeColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                linearLayout.setBackgroundColor(color);
            }
        });

        String imageUrl = "http://68.media.tumblr.com/6961bf4827c1626518e156cd8df6fe62/tumblr_otq1x9z3EK1roqv59o1_500.png";
        Picasso.with(getContext()).load(imageUrl).into(iv);


        return view;
    }
}