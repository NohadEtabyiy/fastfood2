// Generated by view binder compiler. Do not edit!
package com.example.fastfood2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fastfood2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNbabcBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ListView mylist;

  @NonNull
  public final TextView nbA;

  @NonNull
  public final TextView nbH;

  private ActivityNbabcBinding(@NonNull LinearLayout rootView, @NonNull ListView mylist,
      @NonNull TextView nbA, @NonNull TextView nbH) {
    this.rootView = rootView;
    this.mylist = mylist;
    this.nbA = nbA;
    this.nbH = nbH;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNbabcBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNbabcBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_nbabc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNbabcBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mylist;
      ListView mylist = ViewBindings.findChildViewById(rootView, id);
      if (mylist == null) {
        break missingId;
      }

      id = R.id.nbA;
      TextView nbA = ViewBindings.findChildViewById(rootView, id);
      if (nbA == null) {
        break missingId;
      }

      id = R.id.nbH;
      TextView nbH = ViewBindings.findChildViewById(rootView, id);
      if (nbH == null) {
        break missingId;
      }

      return new ActivityNbabcBinding((LinearLayout) rootView, mylist, nbA, nbH);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}