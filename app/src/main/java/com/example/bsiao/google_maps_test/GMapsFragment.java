package com.example.bsiao.google_maps_test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class GMapsFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap googleMap;

    public GMapsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gmaps, container, false);

        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return v;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        LatLng sydney = new LatLng(-33.852, 151.211);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Sydney"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));    // and move the map's camera to the same location.

        this.googleMap = googleMap;
    }

    public boolean placeMarker(double lat,double lng) {
        LatLng markerLoc = new LatLng(lat,lng);
        googleMap.addMarker(new MarkerOptions().position(markerLoc)
                .title(""));

        return true;
    }

    public boolean moveCameraLatLng(double lat, double lng) {
        LatLng loc = new LatLng(lat,lng);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(loc));

        return true;
    }
}
