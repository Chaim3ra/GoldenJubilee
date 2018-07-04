package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonFragment extends Fragment {

    View view;

    Button videobutton,milestonebutton,picturebutton,discoverybutton,button5;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.butlayout, container, false);

        videobutton=(Button)view.findViewById(R.id.videobut);
        milestonebutton=(Button)view.findViewById(R.id.milestonebut);
        picturebutton=(Button)view.findViewById(R.id.picturebut);
        discoverybutton=(Button)view.findViewById(R.id.discoverybut);
        button5=(Button)view.findViewById(R.id.button5);
        //button6=(Button)view.findViewById(R.id.button6);


        videobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FirstFragment());
            }
        });

        picturebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new DefaultFragment());
            }
        });

        milestonebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment2(new MilestoneFragment());
            }
        });

        discoverybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment2(new DiscoveryFragment());
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
