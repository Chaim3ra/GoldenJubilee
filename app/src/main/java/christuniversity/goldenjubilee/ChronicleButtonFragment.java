package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class ChronicleButtonFragment extends Fragment {

    View view;
    Button button1,button2,button3;
    ImageButton back;
    Global2 g1=Global2.getInstance();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.chroniclebuttonlayout, container, false);


        button1 = (Button) view.findViewById(R.id.milebut1);
        button2 = (Button) view.findViewById(R.id.milebut2);
        button3 = (Button) view.findViewById(R.id.milebut3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Christ College",Toast.LENGTH_SHORT).show();
                g1.setData("chronicle1");
                loadFragment(new ChronicleVideoFragment());

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Christ Autonomous", Toast.LENGTH_SHORT).show();
                g1.setData("chronicle1");
                loadFragment(new ChronicleVideoFragment());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Christ Deemed to be University",Toast.LENGTH_SHORT).show();
                g1.setData("chronicle1");
                loadFragment(new ChronicleVideoFragment());
            }
        });

        back=(ImageButton)view.findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment2(new ButtonFragment());
                loadFragment(new DefaultFragment());
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
