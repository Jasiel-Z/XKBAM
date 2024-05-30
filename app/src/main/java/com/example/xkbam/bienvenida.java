package com.example.xkbam;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bienvenida#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bienvenida extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public bienvenida() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment bienvenida.
     */
    // TODO: Rename and change types and number of parameters
    public static bienvenida newInstance(String param1, String param2) {
        bienvenida fragment = new bienvenida();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bienvenida, container, false);

        // Initialize the VideoView
        VideoView videoView = view.findViewById(R.id.valky_video);

        // Set the video URI, assuming the video is in the raw folder
        String videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.ValkyVideo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        // Start the video
        videoView.start();

        return view;
    }
}
