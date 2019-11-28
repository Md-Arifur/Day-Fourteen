package com.bitm.addshowevent.view.bottomSheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.bitm.addshowevent.R;
import com.bitm.addshowevent.databinding.BottomSheetAddEventBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AddEventBottomSheet extends BottomSheetDialogFragment {

    private BottomSheetAddEventBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.bottom_sheet_add_event,container,false);
        return binding.getRoot();
    }
}
