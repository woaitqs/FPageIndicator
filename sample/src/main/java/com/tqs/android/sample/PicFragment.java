package com.tqs.android.sample;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PicFragment extends Fragment {

  private static final String BG_KEY = "BG_KEY";
  private static final String IMG_KEY = "IMG_KEY";

  private int bgRes;
  private int imgRes;

  public static Fragment newInstance(@ColorRes int bgRes, @DrawableRes int imgRes) {
    Fragment fragment = new PicFragment();
    Bundle bundle = new Bundle();
    bundle.putInt(BG_KEY, bgRes);
    bundle.putInt(IMG_KEY, imgRes);
    fragment.setArguments(bundle);
    return fragment;
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    bgRes = getArguments().getInt(BG_KEY);
    imgRes = getArguments().getInt(IMG_KEY);
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater,
      @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_pic, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    view.findViewById(R.id.bg).setBackgroundResource(bgRes);
    ((ImageView) view.findViewById(R.id.pic)).setImageResource(imgRes);
  }
}
