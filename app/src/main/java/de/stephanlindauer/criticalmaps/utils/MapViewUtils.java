package de.stephanlindauer.criticalmaps.utils;

import android.app.Activity;
import android.view.ViewGroup;

import org.osmdroid.DefaultResourceProxyImpl;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.views.MapView;

public class MapViewUtils {

    private static final int TILE_SIZE_PIXELS = 256; //osmdroid default

    public static MapView createMapView(Activity activity, DefaultResourceProxyImpl resourceProxy) {

        MapView mapView = new MapView(activity, TILE_SIZE_PIXELS, resourceProxy);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapView.getController().setZoom(12);
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
        mapView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mapView.setTilesScaledToDpi(true);

        return mapView;
    }
}
