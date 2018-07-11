package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class GuestsFragment extends Fragment {
    private LinearLayout mGallery;
    private int[] mImgIds;
    private String[] mtxtIds,mtxt2Ids;
    private LayoutInflater mInflater;
    private HorizontalScrollView horizontalScrollView;
    VideoView videoView;
    View view,view2;
    ImageView img;
    PopupWindow popupWindow;
    Button closePopupBtn;
    ConstraintLayout layout1;
    //Context mContext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //this.mContext=Context;
        int imgid=0;
        view = inflater.inflate(R.layout.guestslayout, container, false);
        mInflater = LayoutInflater.from(view.getContext());
        MediaController mc = new MediaController(getActivity());
        videoView=(VideoView)view.findViewById(R.id.videoView3);
        videoView.setSystemUiVisibility(View.GONE);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video2;
        videoView.setVideoURI(Uri.parse(path));
        videoView.setMediaController(mc);
        videoView.start();
        mImgIds = new int[] { R.drawable.bg, R.drawable.bg2, R.drawable.logo,R.drawable.bg,R.drawable.bg2,R.drawable.logo,R.drawable.bg,R.drawable.logo,R.drawable.bg2
        };

        mtxtIds= new String[] {"A.P.J Abdul Kalam",
                "Dalai Lama",
                "Jeffrey Archer",
                "Rana Daggubati","Upendra Rao","GUEST 2","GUEST 3","GUEST 4","GUEST 5"};
        mtxt2Ids=new String[]{"Scientist",
                "Spiritual Leader",
                "Novelist",
                "Actor/Director","Actor","STUDENT","STUDENT","STUDENT","STUDENT"};
        mGallery = (LinearLayout)view.findViewById(R.id.id_gallery);

        for (int i = 0; i < mImgIds.length; i++)
        {

            view2 = mInflater.inflate(R.layout.activity_index_gallery_item, mGallery, false);
            img = (ImageView) view2.findViewById(R.id.id_index_gallery_item_image);
            img.setImageResource(mImgIds[i]);
            img.setId(imgid);
            imgid++;
            TextView txt = (TextView) view2.findViewById(R.id.id_index_gallery_item_text);
            TextView txt2=(TextView)view2.findViewById(R.id.text2);
            txt2.setText(mtxt2Ids[i]);
            txt.setText(mtxtIds[i]);
            mGallery.addView(view2);;
        }
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater layoutInflater=LayoutInflater.from(view.getContext());
                View customView = layoutInflater.inflate(R.layout.popup,null);
                closePopupBtn = (Button) customView.findViewById(R.id.closePopupBtn);
                Toast.makeText(view.getContext(), String.valueOf(v.getId()), Toast.LENGTH_SHORT).show();

                //instantiate popup window
                popupWindow = new PopupWindow(customView, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);

                //display the popup window
                popupWindow.showAtLocation(layout1, Gravity.CENTER, 0, 0);


                //close the popup window on button click
                closePopupBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });

            }
        });
        return view;
    }

}
