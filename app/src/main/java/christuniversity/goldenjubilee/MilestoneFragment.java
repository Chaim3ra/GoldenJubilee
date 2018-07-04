package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MilestoneFragment extends Fragment {

    View view;
    Button button1,button2,button3,back;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.milestonelayout, container, false);


        button1 = (Button) view.findViewById(R.id.milebut1);
        button2 = (Button) view.findViewById(R.id.milebut2);
        button3 = (Button) view.findViewById(R.id.milebut3);
        back = (Button) view.findViewById(R.id.milebut4);
        //button5 = (Button) view.findViewById(R.id.button5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStackImmediate();
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
}
