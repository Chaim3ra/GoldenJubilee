package christuniversity.goldenjubilee;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class FestivalFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.festivalidelayout, container, false);
        MediaController mc = new MediaController(getActivity());
        VideoView view1 = (VideoView) view.findViewById(R.id.videoView4);
        view1.setSystemUiVisibility(View.GONE);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video2;
        view1.setVideoURI(Uri.parse(path));
        view1.setMediaController(mc);
        view1.start();
        return view;
    }
}
