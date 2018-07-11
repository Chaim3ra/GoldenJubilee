package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FestivalButtonFragment extends Fragment {



    public FestivalButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //String vids[]=new String[]{"android.resource://" + getActivity().getPackageName() + "/" + R.raw.defaultvid,"android.resource://" + getActivity().getPackageName() + "/" + R.raw.video2,"android.resource://" + getActivity().getPackageName() + "/" + R.raw.video3};
        View view= inflater.inflate(R.layout.festivalbuttonlayout, container, false);
        Button btn1=(Button)view.findViewById(R.id.festival1);
        Button btn2=(Button)view.findViewById(R.id.festival2);
        Button btn3=(Button)view.findViewById(R.id.festival3);
        Button btn4=(Button)view.findViewById(R.id.festival4);
        //Button btn5=(Button)view.findViewById(R.id.festival5);
        /*Button btn6=(Button)view.findViewById(R.id.festival6);
        Button btn7=(Button)view.findViewById(R.id.festival7);
        Button btn8=(Button)view.findViewById(R.id.festival8);
        Button btn9=(Button)view.findViewById(R.id.festival9);
        Button btn10=(Button)view.findViewById(R.id.festival10);
        Button btn11=(Button)view.findViewById(R.id.festival11);
        Button btn12=(Button)view.findViewById(R.id.festival12);*/
        Button back=(Button)view.findViewById(R.id.backButton);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment2(new ButtonFragment());
                loadFragment(new DefaultFragment());

            }
        });

        final Global g1=Global.getInstance();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 1",Toast.LENGTH_SHORT).show();
                g1.setData("darpan");
                loadFragment(new FestivalVideoFragment());

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 2",Toast.LENGTH_SHORT).show();
                g1.setData("video2");
                loadFragment(new FestivalVideoFragment());

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 3",Toast.LENGTH_SHORT).show();
                g1.setData("inbloom");
                loadFragment(new FestivalVideoFragment());

            }
        });



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 4",Toast.LENGTH_SHORT).show();
                g1.setData("nritta");

            }
        });

        /*btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 5",Toast.LENGTH_SHORT).show();
                g1.setData("festvideo5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 6",Toast.LENGTH_SHORT).show();

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 7",Toast.LENGTH_SHORT).show();

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 8",Toast.LENGTH_SHORT).show();

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 9",Toast.LENGTH_SHORT).show();

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 10",Toast.LENGTH_SHORT).show();

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 11",Toast.LENGTH_SHORT).show();

            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Button 12",Toast.LENGTH_SHORT).show();

            }
        });*/

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