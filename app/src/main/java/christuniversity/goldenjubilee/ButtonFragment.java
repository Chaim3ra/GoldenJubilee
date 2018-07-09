package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonFragment extends Fragment {

    View view;

    Button chroniclebutton,felicationbutton,guestsbutton,festivalsbutton;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.butlayout, container, false);

        chroniclebutton=(Button)view.findViewById(R.id.chroniclebut);
        felicationbutton=(Button)view.findViewById(R.id.felicitationbut);
        guestsbutton=(Button)view.findViewById(R.id.guestsbut);
        festivalsbutton=(Button)view.findViewById(R.id.festivalsbut);
        //button5=(Button)view.findViewById(R.id.button5);
        //button6=(Button)view.findViewById(R.id.button6);


        chroniclebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new ChronicleFragment());
                loadFragment2(new ChronicleButtonFragment());
            }
        });

        felicationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FelicitationFragment());
            }
        });

        guestsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new GuestsFragment());
            }
        });

        festivalsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FestivalFragment());
                loadFragment2(new FestivalButtonFragment());
            }
        });

        return view;


    }
    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void loadFragment2(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //fragmentTransaction.setCustomAnimations(R.animator.slide_in, R.animator.slide_out);
        fragmentTransaction.replace(R.id.buttonLayout, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
