package com.example.grace.ARchitect;

import android.location.LocationListener;

import com.wikitude.architect.ArchitectJavaScriptInterfaceListener;
import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.ArchitectView.SensorAccuracyChangeListener;

public interface ArchitectViewHolderInterface {
	
	/**
	 * 50km = architectView's default cullingDistance, return this value in "getInitialCullingDistanceMeters()" to not change cullingDistance.
	 */
	public static final int CULLING_DISTANCE_DEFAULT_METERS = 50 * 1000;
	
	/**
	 * path to the architect-file (AR-Experience HTML) to launch
	 * @return
	 */
	public String getARchitectWorldPath();
	
	/**
	 * @return layout id of your layout.xml that holds an ARchitect View, e.g. R.layout.camview
	 */
	public int getContentViewId();
	
	/**
	 * @return Wikitude SDK license key, checkout www.wikitude.com for details
	 */
	public String getWikitudeSDKLicenseKey();
	
	/**
	 * @return layout-id of architectView, e.g. R.id.architectView
	 */
	public int getArchitectViewId();

	
	/**
	 * sets maximum distance to render places. In case your places are more than 50km away from the user you must adjust this value (compare 'AR.context.scene.cullingDistance').
	 * Return ArchitectViewHolder.CULLING_DISTANCE_DEFAULT_METERS to not change default behavior (50km range) or any positive float to set cullingDistance on architectView start.
	 * @return
	 */
	public float getInitialCullingDistanceMeters();
	


	/**
	 * @return Implementation of ArchitectWorldLoadedListener. That way you know when a AR world is finished loading or when it failed to load.
     */
	ArchitectView.ArchitectWorldLoadedListener getWorldLoadedListener();
}
