package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DiscoveryFragment extends Fragment {

    View view;
    Button discbut1,discbut2,discbut3,discbut4,discbut5,discback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.discoverylayout, container, false);

        discback=(Button)view.findViewById(R.id.discback);

        discback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStackImmediate();
            }
        });

        return view;
    }
}
