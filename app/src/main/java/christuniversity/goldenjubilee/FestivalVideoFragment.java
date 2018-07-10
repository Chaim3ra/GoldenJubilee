package christuniversity.goldenjubilee;

import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class FestivalVideoFragment extends Fragment{
    View view;
    Global g1=Global.getInstance();
    String vidname=g1.getData();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.festivalidelayout, container, false);
        MediaController mc = new MediaController(getActivity());
        VideoView view1 = (VideoView) view.findViewById(R.id.videoView4);
        view1.setSystemUiVisibility(View.GONE);
        String path = "android.resource://" + getActivity().getPackageName() + "/raw/" + vidname;
        view1.setVideoURI(Uri.parse(path));
        //view1.setMediaController(mc);
        view1.start();
        return view;
    }
}
