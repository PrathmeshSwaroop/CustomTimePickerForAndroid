package com.example.timepicker;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.NumberPicker;

public class CustomNumberPickerForAndroid4 extends NumberPicker
{

	public CustomNumberPickerForAndroid4(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public CustomNumberPickerForAndroid4(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	public CustomNumberPickerForAndroid4(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#addFocusables(java.util.ArrayList, int, int)
	 */
	@Override
	public void addFocusables(ArrayList<View> views, int direction,
			int focusableMode) {
		// TODO Auto-generated method stub
		super.addFocusables(views, direction, focusableMode);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#computeScroll()
	 */
	@Override
	public void computeScroll() {
		// TODO Auto-generated method stub
		super.computeScroll();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#dispatchHoverEvent(android.view.MotionEvent)
	 */
	@Override
	protected boolean dispatchHoverEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchHoverEvent(event);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#dispatchKeyEvent(android.view.KeyEvent)
	 */
	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchKeyEvent(event);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#dispatchTouchEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchTouchEvent(event);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#dispatchTrackballEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean dispatchTrackballEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchTrackballEvent(event);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getAccessibilityNodeProvider()
	 */
	@Override
	public AccessibilityNodeProvider getAccessibilityNodeProvider() {
		// TODO Auto-generated method stub
		return super.getAccessibilityNodeProvider();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getBottomFadingEdgeStrength()
	 */
	@Override
	protected float getBottomFadingEdgeStrength() {
		// TODO Auto-generated method stub
		return super.getBottomFadingEdgeStrength();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getDisplayedValues()
	 */
	@Override
	public String[] getDisplayedValues() {
		// TODO Auto-generated method stub
		return super.getDisplayedValues();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getMaxValue()
	 */
	@Override
	public int getMaxValue() {
		// TODO Auto-generated method stub
		return super.getMaxValue();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getMinValue()
	 */
	@Override
	public int getMinValue() {
		// TODO Auto-generated method stub
		return super.getMinValue();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getSolidColor()
	 */
	@Override
	public int getSolidColor() {
		// TODO Auto-generated method stub
		return super.getSolidColor();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getTopFadingEdgeStrength()
	 */
	@Override
	protected float getTopFadingEdgeStrength() {
		// TODO Auto-generated method stub
		return super.getTopFadingEdgeStrength();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getValue()
	 */
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return super.getValue();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#getWrapSelectorWheel()
	 */
	@Override
	public boolean getWrapSelectorWheel() {
		// TODO Auto-generated method stub
		return super.getWrapSelectorWheel();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#onDetachedFromWindow()
	 */
	@Override
	protected void onDetachedFromWindow() {
		// TODO Auto-generated method stub
		super.onDetachedFromWindow();
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#onDraw(android.graphics.Canvas)
	 */
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent)
	 */
	@Override
	public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		super.onInitializeAccessibilityEvent(event);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#onInterceptTouchEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean onInterceptTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onInterceptTouchEvent(event);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#onLayout(boolean, int, int, int, int)
	 */
	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		// TODO Auto-generated method stub
		super.onLayout(changed, left, top, right, bottom);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#onMeasure(int, int)
	 */
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#onTouchEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onTouchEvent(event);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#scrollBy(int, int)
	 */
	@Override
	public void scrollBy(int x, int y) {
		// TODO Auto-generated method stub
		super.scrollBy(x, y);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setDisplayedValues(java.lang.String[])
	 */
	@Override
	public void setDisplayedValues(String[] displayedValues) {
		// TODO Auto-generated method stub
		super.setDisplayedValues(displayedValues);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		super.setEnabled(enabled);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setFormatter(android.widget.NumberPicker.Formatter)
	 */
	@Override
	public void setFormatter(Formatter formatter) {
		// TODO Auto-generated method stub
		super.setFormatter(formatter);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setMaxValue(int)
	 */
	@Override
	public void setMaxValue(int maxValue) {
		// TODO Auto-generated method stub
		super.setMaxValue(maxValue);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setMinValue(int)
	 */
	@Override
	public void setMinValue(int minValue) {
		// TODO Auto-generated method stub
		super.setMinValue(minValue);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setOnLongPressUpdateInterval(long)
	 */
	@Override
	public void setOnLongPressUpdateInterval(long intervalMillis) {
		// TODO Auto-generated method stub
		super.setOnLongPressUpdateInterval(intervalMillis);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setOnScrollListener(android.widget.NumberPicker.OnScrollListener)
	 */
	@Override
	public void setOnScrollListener(OnScrollListener onScrollListener) {
		// TODO Auto-generated method stub
		super.setOnScrollListener(onScrollListener);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setOnValueChangedListener(android.widget.NumberPicker.OnValueChangeListener)
	 */
	@Override
	public void setOnValueChangedListener(
			OnValueChangeListener onValueChangedListener) {
		// TODO Auto-generated method stub
		super.setOnValueChangedListener(onValueChangedListener);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setValue(int)
	 */
	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		super.setValue(value);
	}
	/* (non-Javadoc)
	 * @see android.widget.NumberPicker#setWrapSelectorWheel(boolean)
	 */
	@Override
	public void setWrapSelectorWheel(boolean wrapSelectorWheel) {
		// TODO Auto-generated method stub
		super.setWrapSelectorWheel(wrapSelectorWheel);
	}

	
}
