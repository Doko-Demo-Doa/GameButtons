package vn.ows.monarchbutton;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.TextView;

public class MonarchButton extends AppCompatButton {

  private int borderColor;
  private int backgroundColor;
  private long outerBorderThickness;

  private TextView textView;

  public MonarchButton(Context context) {
    super(context);
  }

  public MonarchButton(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public MonarchButton(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }
}
