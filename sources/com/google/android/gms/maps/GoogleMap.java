// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate, Projection, UiSettings, LocationSource

public final class GoogleMap
{
    public static interface CancelableCallback
    {

        public abstract void onCancel();

        public abstract void onFinish();
    }

    public static interface InfoWindowAdapter
    {

        public abstract View getInfoContents(Marker marker);

        public abstract View getInfoWindow(Marker marker);
    }

    public static interface OnCameraChangeListener
    {

        public abstract void onCameraChange(CameraPosition cameraposition);
    }

    public static interface OnIndoorStateChangeListener
    {

        public abstract void onIndoorBuildingFocused();

        public abstract void onIndoorLevelActivated(IndoorBuilding indoorbuilding);
    }

    public static interface OnInfoWindowClickListener
    {

        public abstract void onInfoWindowClick(Marker marker);
    }

    public static interface OnMapClickListener
    {

        public abstract void onMapClick(LatLng latlng);
    }

    public static interface OnMapLoadedCallback
    {

        public abstract void onMapLoaded();
    }

    public static interface OnMapLongClickListener
    {

        public abstract void onMapLongClick(LatLng latlng);
    }

    public static interface OnMarkerClickListener
    {

        public abstract boolean onMarkerClick(Marker marker);
    }

    public static interface OnMarkerDragListener
    {

        public abstract void onMarkerDrag(Marker marker);

        public abstract void onMarkerDragEnd(Marker marker);

        public abstract void onMarkerDragStart(Marker marker);
    }

    public static interface OnMyLocationButtonClickListener
    {

        public abstract boolean onMyLocationButtonClick();
    }

    public static interface OnMyLocationChangeListener
    {

        public abstract void onMyLocationChange(Location location);
    }

    public static interface SnapshotReadyCallback
    {

        public abstract void onSnapshotReady(Bitmap bitmap);
    }

    private static final class zza extends com.google.android.gms.maps.internal.zzb.zza
    {

        public void onCancel()
        {
            zzatK.onCancel();
        }

        public void onFinish()
        {
            zzatK.onFinish();
        }

        private final CancelableCallback zzatK;

        zza(CancelableCallback cancelablecallback)
        {
            zzatK = cancelablecallback;
        }
    }


    protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
    {
        zzats = (IGoogleMapDelegate)zzv.zzr(igooglemapdelegate);
    }

    public final Circle addCircle(CircleOptions circleoptions)
    {
        try
        {
            circleoptions = new Circle(zzats.addCircle(circleoptions));
        }
        // Misplaced declaration of an exception variable
        catch(CircleOptions circleoptions)
        {
            throw new RuntimeRemoteException(circleoptions);
        }
        return circleoptions;
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
    {
        try
        {
            groundoverlayoptions = zzats.addGroundOverlay(groundoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch(GroundOverlayOptions groundoverlayoptions)
        {
            throw new RuntimeRemoteException(groundoverlayoptions);
        }
        if(groundoverlayoptions == null)
            break MISSING_BLOCK_LABEL_26;
        groundoverlayoptions = new GroundOverlay(groundoverlayoptions);
        return groundoverlayoptions;
        return null;
    }

    public final Marker addMarker(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = zzats.addMarker(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch(MarkerOptions markeroptions)
        {
            throw new RuntimeRemoteException(markeroptions);
        }
        if(markeroptions == null)
            break MISSING_BLOCK_LABEL_26;
        markeroptions = new Marker(markeroptions);
        return markeroptions;
        return null;
    }

    public final Polygon addPolygon(PolygonOptions polygonoptions)
    {
        try
        {
            polygonoptions = new Polygon(zzats.addPolygon(polygonoptions));
        }
        // Misplaced declaration of an exception variable
        catch(PolygonOptions polygonoptions)
        {
            throw new RuntimeRemoteException(polygonoptions);
        }
        return polygonoptions;
    }

    public final Polyline addPolyline(PolylineOptions polylineoptions)
    {
        try
        {
            polylineoptions = new Polyline(zzats.addPolyline(polylineoptions));
        }
        // Misplaced declaration of an exception variable
        catch(PolylineOptions polylineoptions)
        {
            throw new RuntimeRemoteException(polylineoptions);
        }
        return polylineoptions;
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
    {
        try
        {
            tileoverlayoptions = zzats.addTileOverlay(tileoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch(TileOverlayOptions tileoverlayoptions)
        {
            throw new RuntimeRemoteException(tileoverlayoptions);
        }
        if(tileoverlayoptions == null)
            break MISSING_BLOCK_LABEL_26;
        tileoverlayoptions = new TileOverlay(tileoverlayoptions);
        return tileoverlayoptions;
        return null;
    }

    public final void animateCamera(CameraUpdate cameraupdate)
    {
        try
        {
            zzats.animateCamera(cameraupdate.zztp());
            return;
        }
        // Misplaced declaration of an exception variable
        catch(CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void animateCamera(CameraUpdate cameraupdate, int i, CancelableCallback cancelablecallback)
    {
        IGoogleMapDelegate igooglemapdelegate;
        zzd zzd;
        try
        {
            igooglemapdelegate = zzats;
            zzd = cameraupdate.zztp();
        }
        // Misplaced declaration of an exception variable
        catch(CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
        if(cancelablecallback != null)
            break MISSING_BLOCK_LABEL_30;
        cameraupdate = null;
        igooglemapdelegate.animateCameraWithDurationAndCallback(zzd, i, cameraupdate);
        return;
        cameraupdate = new zza(cancelablecallback);
        break MISSING_BLOCK_LABEL_18;
    }

    public final void animateCamera(CameraUpdate cameraupdate, CancelableCallback cancelablecallback)
    {
        IGoogleMapDelegate igooglemapdelegate;
        zzd zzd;
        try
        {
            igooglemapdelegate = zzats;
            zzd = cameraupdate.zztp();
        }
        // Misplaced declaration of an exception variable
        catch(CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
        if(cancelablecallback != null)
            break MISSING_BLOCK_LABEL_27;
        cameraupdate = null;
        igooglemapdelegate.animateCameraWithCallback(zzd, cameraupdate);
        return;
        cameraupdate = new zza(cancelablecallback);
        break MISSING_BLOCK_LABEL_17;
    }

    public final void clear()
    {
        try
        {
            zzats.clear();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final CameraPosition getCameraPosition()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = zzats.getCameraPosition();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraposition;
    }

    public IndoorBuilding getFocusedBuilding()
    {
        Object obj;
        try
        {
            obj = zzats.getFocusedBuilding();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        if(obj == null)
            break MISSING_BLOCK_LABEL_25;
        obj = new IndoorBuilding(((zzg) (obj)));
        return ((IndoorBuilding) (obj));
        return null;
    }

    public final int getMapType()
    {
        int i;
        try
        {
            i = zzats.getMapType();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public final float getMaxZoomLevel()
    {
        float f;
        try
        {
            f = zzats.getMaxZoomLevel();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public final float getMinZoomLevel()
    {
        float f;
        try
        {
            f = zzats.getMinZoomLevel();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public final Location getMyLocation()
    {
        Location location;
        try
        {
            location = zzats.getMyLocation();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return location;
    }

    public final Projection getProjection()
    {
        Projection projection;
        try
        {
            projection = new Projection(zzats.getProjection());
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return projection;
    }

    public final UiSettings getUiSettings()
    {
        UiSettings uisettings;
        try
        {
            if(zzatt == null)
                zzatt = new UiSettings(zzats.getUiSettings());
            uisettings = zzatt;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return uisettings;
    }

    public final boolean isBuildingsEnabled()
    {
        boolean flag;
        try
        {
            flag = zzats.isBuildingsEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isIndoorEnabled()
    {
        boolean flag;
        try
        {
            flag = zzats.isIndoorEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isMyLocationEnabled()
    {
        boolean flag;
        try
        {
            flag = zzats.isMyLocationEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isTrafficEnabled()
    {
        boolean flag;
        try
        {
            flag = zzats.isTrafficEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final void moveCamera(CameraUpdate cameraupdate)
    {
        try
        {
            zzats.moveCamera(cameraupdate.zztp());
            return;
        }
        // Misplaced declaration of an exception variable
        catch(CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void setBuildingsEnabled(boolean flag)
    {
        try
        {
            zzats.setBuildingsEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setContentDescription(String s)
    {
        try
        {
            zzats.setContentDescription(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public final boolean setIndoorEnabled(boolean flag)
    {
        try
        {
            flag = zzats.setIndoorEnabled(flag);
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infowindowadapter)
    {
        if(infowindowadapter == null)
            try
            {
                zzats.setInfoWindowAdapter(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(InfoWindowAdapter infowindowadapter)
            {
                throw new RuntimeRemoteException(infowindowadapter);
            }
        zzats.setInfoWindowAdapter(new com.google.android.gms.maps.internal.zzd.zza(infowindowadapter) {

            public zzd zzf(zzi zzi)
            {
                return zze.zzt(zzatJ.getInfoWindow(new Marker(zzi)));
            }

            public zzd zzg(zzi zzi)
            {
                return zze.zzt(zzatJ.getInfoContents(new Marker(zzi)));
            }

            final InfoWindowAdapter zzatJ;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatJ = infowindowadapter;
                super();
            }
        }
);
        return;
    }

    public final void setLocationSource(LocationSource locationsource)
    {
        if(locationsource == null)
            try
            {
                zzats.setLocationSource(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(LocationSource locationsource)
            {
                throw new RuntimeRemoteException(locationsource);
            }
        zzats.setLocationSource(new com.google.android.gms.maps.internal.ILocationSourceDelegate.zza(locationsource) {

            public void activate(com.google.android.gms.maps.internal.zzi zzi)
            {
                zzatA.activate(new LocationSource.OnLocationChangedListener(this, zzi) {

                    public void onLocationChanged(Location location)
                    {
                        try
                        {
                            zzatB.zzd(location);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch(Location location)
                        {
                            throw new RuntimeRemoteException(location);
                        }
                    }

                    final com.google.android.gms.maps.internal.zzi zzatB;
                    final _cls6 zzatC;

            
            {
                zzatC = _pcls6;
                zzatB = zzi1;
                super();
            }
                }
);
            }

            public void deactivate()
            {
                zzatA.deactivate();
            }

            final LocationSource zzatA;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatA = locationsource;
                super();
            }
        }
);
        return;
    }

    public final void setMapType(int i)
    {
        try
        {
            zzats.setMapType(i);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setMyLocationEnabled(boolean flag)
    {
        try
        {
            zzats.setMyLocationEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener oncamerachangelistener)
    {
        if(oncamerachangelistener == null)
            try
            {
                zzats.setOnCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnCameraChangeListener oncamerachangelistener)
            {
                throw new RuntimeRemoteException(oncamerachangelistener);
            }
        zzats.setOnCameraChangeListener(new com.google.android.gms.maps.internal.zzf.zza(oncamerachangelistener) {

            public void onCameraChange(CameraPosition cameraposition)
            {
                zzatD.onCameraChange(cameraposition);
            }

            final OnCameraChangeListener zzatD;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatD = oncamerachangelistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onindoorstatechangelistener)
    {
        if(onindoorstatechangelistener == null)
            try
            {
                zzats.setOnIndoorStateChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnIndoorStateChangeListener onindoorstatechangelistener)
            {
                throw new RuntimeRemoteException(onindoorstatechangelistener);
            }
        zzats.setOnIndoorStateChangeListener(new com.google.android.gms.maps.internal.zzg.zza(onindoorstatechangelistener) {

            public void onIndoorBuildingFocused()
            {
                zzatu.onIndoorBuildingFocused();
            }

            public void zza(zzg zzg)
            {
                zzatu.onIndoorLevelActivated(new IndoorBuilding(zzg));
            }

            final OnIndoorStateChangeListener zzatu;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatu = onindoorstatechangelistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
    {
        if(oninfowindowclicklistener == null)
            try
            {
                zzats.setOnInfoWindowClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnInfoWindowClickListener oninfowindowclicklistener)
            {
                throw new RuntimeRemoteException(oninfowindowclicklistener);
            }
        zzats.setOnInfoWindowClickListener(new com.google.android.gms.maps.internal.zzh.zza(oninfowindowclicklistener) {

            public void zze(zzi zzi)
            {
                zzatI.onInfoWindowClick(new Marker(zzi));
            }

            final OnInfoWindowClickListener zzatI;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatI = oninfowindowclicklistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
    {
        if(onmapclicklistener == null)
            try
            {
                zzats.setOnMapClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMapClickListener onmapclicklistener)
            {
                throw new RuntimeRemoteException(onmapclicklistener);
            }
        zzats.setOnMapClickListener(new com.google.android.gms.maps.internal.zzj.zza(onmapclicklistener) {

            public void onMapClick(LatLng latlng)
            {
                zzatE.onMapClick(latlng);
            }

            final OnMapClickListener zzatE;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatE = onmapclicklistener;
                super();
            }
        }
);
        return;
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onmaploadedcallback)
    {
        if(onmaploadedcallback == null)
            try
            {
                zzats.setOnMapLoadedCallback(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMapLoadedCallback onmaploadedcallback)
            {
                throw new RuntimeRemoteException(onmaploadedcallback);
            }
        zzats.setOnMapLoadedCallback(new com.google.android.gms.maps.internal.zzk.zza(onmaploadedcallback) {

            public void onMapLoaded()
                throws RemoteException
            {
                zzaty.onMapLoaded();
            }

            final GoogleMap zzatv;
            final OnMapLoadedCallback zzaty;

            
            {
                zzatv = GoogleMap.this;
                zzaty = onmaploadedcallback;
                super();
            }
        }
);
        return;
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onmaplongclicklistener)
    {
        if(onmaplongclicklistener == null)
            try
            {
                zzats.setOnMapLongClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMapLongClickListener onmaplongclicklistener)
            {
                throw new RuntimeRemoteException(onmaplongclicklistener);
            }
        zzats.setOnMapLongClickListener(new com.google.android.gms.maps.internal.zzl.zza(onmaplongclicklistener) {

            public void onMapLongClick(LatLng latlng)
            {
                zzatF.onMapLongClick(latlng);
            }

            final OnMapLongClickListener zzatF;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatF = onmaplongclicklistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
    {
        if(onmarkerclicklistener == null)
            try
            {
                zzats.setOnMarkerClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMarkerClickListener onmarkerclicklistener)
            {
                throw new RuntimeRemoteException(onmarkerclicklistener);
            }
        zzats.setOnMarkerClickListener(new com.google.android.gms.maps.internal.zzn.zza(onmarkerclicklistener) {

            public boolean zza(zzi zzi)
            {
                return zzatG.onMarkerClick(new Marker(zzi));
            }

            final OnMarkerClickListener zzatG;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatG = onmarkerclicklistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onmarkerdraglistener)
    {
        if(onmarkerdraglistener == null)
            try
            {
                zzats.setOnMarkerDragListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMarkerDragListener onmarkerdraglistener)
            {
                throw new RuntimeRemoteException(onmarkerdraglistener);
            }
        zzats.setOnMarkerDragListener(new com.google.android.gms.maps.internal.zzo.zza(onmarkerdraglistener) {

            public void zzb(zzi zzi)
            {
                zzatH.onMarkerDragStart(new Marker(zzi));
            }

            public void zzc(zzi zzi)
            {
                zzatH.onMarkerDragEnd(new Marker(zzi));
            }

            public void zzd(zzi zzi)
            {
                zzatH.onMarkerDrag(new Marker(zzi));
            }

            final OnMarkerDragListener zzatH;
            final GoogleMap zzatv;

            
            {
                zzatv = GoogleMap.this;
                zzatH = onmarkerdraglistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
    {
        if(onmylocationbuttonclicklistener == null)
            try
            {
                zzats.setOnMyLocationButtonClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
            {
                throw new RuntimeRemoteException(onmylocationbuttonclicklistener);
            }
        zzats.setOnMyLocationButtonClickListener(new com.google.android.gms.maps.internal.zzp.zza(onmylocationbuttonclicklistener) {

            public boolean onMyLocationButtonClick()
                throws RemoteException
            {
                return zzatx.onMyLocationButtonClick();
            }

            final GoogleMap zzatv;
            final OnMyLocationButtonClickListener zzatx;

            
            {
                zzatv = GoogleMap.this;
                zzatx = onmylocationbuttonclicklistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onmylocationchangelistener)
    {
        if(onmylocationchangelistener == null)
            try
            {
                zzats.setOnMyLocationChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMyLocationChangeListener onmylocationchangelistener)
            {
                throw new RuntimeRemoteException(onmylocationchangelistener);
            }
        zzats.setOnMyLocationChangeListener(new com.google.android.gms.maps.internal.zzq.zza(onmylocationchangelistener) {

            public void zzc(Location location)
            {
                zzatw.onMyLocationChange(location);
            }

            public void zzh(zzd zzd)
            {
                zzatw.onMyLocationChange((Location)zze.zzg(zzd));
            }

            final GoogleMap zzatv;
            final OnMyLocationChangeListener zzatw;

            
            {
                zzatv = GoogleMap.this;
                zzatw = onmylocationchangelistener;
                super();
            }
        }
);
        return;
    }

    public final void setPadding(int i, int j, int k, int l)
    {
        try
        {
            zzats.setPadding(i, j, k, l);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setTrafficEnabled(boolean flag)
    {
        try
        {
            zzats.setTrafficEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotreadycallback)
    {
        snapshot(snapshotreadycallback, null);
    }

    public final void snapshot(SnapshotReadyCallback snapshotreadycallback, Bitmap bitmap)
    {
        if(bitmap != null)
            bitmap = zze.zzt(bitmap);
        else
            bitmap = null;
        bitmap = (zze)(zze)bitmap;
        try
        {
            zzats.snapshot(new com.google.android.gms.maps.internal.zzw.zza(snapshotreadycallback) {

                public void onSnapshotReady(Bitmap bitmap1)
                    throws RemoteException
                {
                    zzatz.onSnapshotReady(bitmap1);
                }

                public void zzi(zzd zzd)
                    throws RemoteException
                {
                    zzatz.onSnapshotReady((Bitmap)zze.zzg(zzd));
                }

                final GoogleMap zzatv;
                final SnapshotReadyCallback zzatz;

            
            {
                zzatv = GoogleMap.this;
                zzatz = snapshotreadycallback;
                super();
            }
            }
, bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(SnapshotReadyCallback snapshotreadycallback)
        {
            throw new RuntimeRemoteException(snapshotreadycallback);
        }
    }

    public final void stopAnimation()
    {
        try
        {
            zzats.stopAnimation();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    IGoogleMapDelegate zztr()
    {
        return zzats;
    }

    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate zzats;
    private UiSettings zzatt;
}
