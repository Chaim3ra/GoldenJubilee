package christuniversity.goldenjubilee;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DefaultFragment extends Fragment {

    View view;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.defaultfrag, container, false);
       /* Glide.with(this)
                .load(YOUR_GIF)
                .into(imageView);*/
        return view;
    }
}
