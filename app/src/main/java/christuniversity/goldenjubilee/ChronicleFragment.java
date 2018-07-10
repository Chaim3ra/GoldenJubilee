package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ChronicleFragment extends Fragment {
    View view;
    Button back;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.chronicelayout, container, false);
        MediaController mc = new MediaController(getActivity());
        VideoView view1 = (VideoView) view.findViewById(R.id.videoView5);
        view1.setSystemUiVisibility(View.GONE);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video3;
        view1.setVideoURI(Uri.parse(path));
        //view1.setMediaController(mc);
        view1.start();
        return view;
    }
}
