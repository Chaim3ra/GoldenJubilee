package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class GuestsFragment extends Fragment {
    private LinearLayout mGallery;
    private int[] mImgIds;
    private String[] mtxtIds,mtxt2Ids;
    private LayoutInflater mInflater;
    private HorizontalScrollView horizontalScrollView;
    VideoView videoView;
    View view,view2;
    //Context mContext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //this.mContext=Context;
        view = inflater.inflate(R.layout.guestslayout, container, false);
        mInflater = LayoutInflater.from(view.getContext());
        //MediaController mc = new MediaController(getActivity());
        videoView=(VideoView)view.findViewById(R.id.videoView3);
        videoView.setSystemUiVisibility(View.GONE);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video2;
        videoView.setVideoURI(Uri.parse(path));
        //videoView.setMediaController(mc);
        videoView.start();
        mImgIds = new int[] { R.drawable.bg, R.drawable.bg2, R.drawable.logo,R.drawable.bg,R.drawable.bg2,R.drawable.logo,R.drawable.bg,R.drawable.logo,R.drawable.bg2
        };

        mtxtIds= new String[] {"Rana Dagubatti",
                "BENJAMIN",
                "GALAXY",
                "ROCKET","GUEST 1","GUEST 2","GUEST 3","GUEST 4","GUEST 5"};
        mtxt2Ids=new String[]{"Actor/Director",
                "BENJAMIN",
                "GALAXY",
                "ROCKET","STUDENT","STUDENT","STUDENT","STUDENT","STUDENT"};
        mGallery = (LinearLayout)view.findViewById(R.id.id_gallery);

        for (int i = 0; i < mImgIds.length; i++)
        {

            view2 = mInflater.inflate(R.layout.activity_index_gallery_item, mGallery, false);
            ImageView img = (ImageView) view2.findViewById(R.id.id_index_gallery_item_image);
            img.setImageResource(mImgIds[i]);
            TextView txt = (TextView) view2.findViewById(R.id.id_index_gallery_item_text);
            TextView txt2=(TextView)view2.findViewById(R.id.text2);
            txt2.setText(mtxt2Ids[i]);
            txt.setText(mtxtIds[i]);
            mGallery.addView(view2);
        }
        return view;
    }

}
