// Generated by view binder compiler. Do not edit!
package com.example.fastfood2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fastfood2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MylistBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView module;

  @NonNull
  public final TextView salle;

  @NonNull
  public final TextView time;

  private MylistBinding(@NonNull LinearLayout rootView, @NonNull TextView date,
      @NonNull TextView module, @NonNull TextView salle, @NonNull TextView time) {
    this.rootView = rootView;
    this.date = date;
    this.module = module;
    this.salle = salle;
    this.time = time;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MylistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MylistBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.mylist, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MylistBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.module;
      TextView module = ViewBindings.findChildViewById(rootView, id);
      if (module == null) {
        break missingId;
      }

      id = R.id.salle;
      TextView salle = ViewBindings.findChildViewById(rootView, id);
      if (salle == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      return new MylistBinding((LinearLayout) rootView, date, module, salle, time);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
