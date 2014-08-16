package com.example.MyAwesomeTry;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;


public class FaOnlyIconButton extends Button {

    // =========== constructor ==========

    public FaOnlyIconButton(Context context) {

        super(context);
        initialize(context);
    }

    public FaOnlyIconButton(Context context, AttributeSet attrs) {

        super(context, attrs);
        initialize(context, attrs);
    }

    public FaOnlyIconButton(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
        initialize(context, attrs);
    }

    // =========== private ==========

    private void initialize(Context context) {

        setTypeface(FaManager.getFont(context));
    }

    private void initialize(Context context, AttributeSet attrs) {

        initialize(context);
        setIcon(getText().toString());
    }

    // =========== public ==========

    // such as: "fa-user"
    public void setIcon(String icon) {

        String iconText = FaManager.getIconText(icon);
        setText(iconText);
    }

}
