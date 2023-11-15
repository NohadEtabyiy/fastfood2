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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fastfood2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityListNoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView annee;

  @NonNull
  public final LinearLayout infoLayout;

  @NonNull
  public final ListView listviewnote;

  @NonNull
  public final TextView module;

  @NonNull
  public final TextView note;

  @NonNull
  public final LinearLayout titleLayout;

  private ActivityListNoteBinding(@NonNull ConstraintLayout rootView, @NonNull TextView annee,
      @NonNull LinearLayout infoLayout, @NonNull ListView listviewnote, @NonNull TextView module,
      @NonNull TextView note, @NonNull LinearLayout titleLayout) {
    this.rootView = rootView;
    this.annee = annee;
    this.infoLayout = infoLayout;
    this.listviewnote = listviewnote;
    this.module = module;
    this.note = note;
    this.titleLayout = titleLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityListNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityListNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_list_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityListNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.annee;
      TextView annee = ViewBindings.findChildViewById(rootView, id);
      if (annee == null) {
        break missingId;
      }

      id = R.id.infoLayout;
      LinearLayout infoLayout = ViewBindings.findChildViewById(rootView, id);
      if (infoLayout == null) {
        break missingId;
      }

      id = R.id.listviewnote;
      ListView listviewnote = ViewBindings.findChildViewById(rootView, id);
      if (listviewnote == null) {
        break missingId;
      }

      id = R.id.module;
      TextView module = ViewBindings.findChildViewById(rootView, id);
      if (module == null) {
        break missingId;
      }

      id = R.id.note;
      TextView note = ViewBindings.findChildViewById(rootView, id);
      if (note == null) {
        break missingId;
      }

      id = R.id.titleLayout;
      LinearLayout titleLayout = ViewBindings.findChildViewById(rootView, id);
      if (titleLayout == null) {
        break missingId;
      }

      return new ActivityListNoteBinding((ConstraintLayout) rootView, annee, infoLayout,
          listviewnote, module, note, titleLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}