package com.e.homestool;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;

public class electtoolFragment extends Fragment {


    double[] wido = {37.584165,
        37.576181,
        37.571893,
        37.570948,
        37.562571,
        37.557418,
        37.560074,
        37.560264,
        37.561867,
        37.564505,
        37.566888,
        37.562107,
        37.554519,
        37.5524,
        37.557071,
        37.565207,
        37.559435,
        37.567592,
        37.560055,
        37.529349,
        37.534547,
        37.56143,
        37.558511,
        37.552369,
        37.564319,
        37.546872,
        37.549261,
        37.542501,
        37.535484,
        37.556015,
        37.549179,
        37.554457,
        37.534121,
        37.559053,
        37.560528,
        37.580619,
        37.567807,
        37.586323,
        37.601398,
        37.582963,
        37.599879,
        37.604927,
        37.627249,
        37.626939,
        37.616079,
        37.618256,
        37.61674,
        37.637854,
        37.632203,
        37.625817,
        37.630017,
        37.644627,
        37.638675,
        37.647955,
        37.641433,
        37.624937,
        37.623021,
        37.620516,
        37.618288,
        37.648914,
        37.648943,
        37.649673,
        37.664425,
        37.668216,
        37.638101,
        37.668642,
        37.632522,
        37.620983,
        37.621271,
        37.631989,
        37.662962,
        37.65485,
        37.602555,
        37.610347,
        37.626433,
        37.623647,
        37.618528,
        37.611733,
        37.614195,
        37.600667,
        37.594481,
        37.592198,
        37.604374,
        37.598098,
        37.590344,
        37.58433,
        37.584179,
        37.634982,
        37.621567,
        37.593855,
        37.542284,
        37.544225,
        37.587611,
        37.544151,
        37.518832,
        37.519112,
        37.526449,
        37.517282,
        37.563609,
        37.544037,
        37.534607,
        37.548227,
        37.50769,
        37.493024,
        37.506674,
        37.484109,
        37.525023,
        37.517461,
        37.507277,
        37.517667,
        37.508429,
        37.49935,
        37.498313,
        37.507944,
        37.484143,
        37.485408,
        37.480648,
        37.476265,
        37.487363,
        37.479009,
        37.475095,
        37.475015,
        37.461498,
        37.478231,
        37.470578,
        37.509732,
        37.539622,
        37.526603,
        37.532024,
        37.50586,
        37.49617,
        37.495541,
        37.485761,
        37.486784,
        37.481783,
        37.478434,
        37.509871,
        37.521232,
        37.490604,
        37.52929,
        37.490916,
        37.565059,
        37.551561,
        37.549504,
        37.546339,
        37.556274,
        37.5605,
        37.552367,
        37.551752,
        37.554975,
        37.545013,
        37.543449,
        37.539958,
        37.530368,
        37.532366,
        37.526062,
        37.539262,
        37.523445,
        37.533322,
        37.560007,
        37.550397,
        37.553579,
        37.561041,
        37.561555,
        37.547353,
        37.53166,
        37.556609,
        37.533262,
        37.532369
    };
    double [] geungdo = { 126.970598,
            126.968804,
            126.961971,
            127.016393,
            126.976974,
            126.979332,
            126.985802,
            126.995598,
            127.00774,
            127.005055,
            126.991379,
            127.014462,
            127.008334,
            127.008984,
            127.014607,
            127.021884,
            127.019566,
            127.021333,
            126.966782,
            126.968987,
            126.951432,
            127.045879,
            127.036073,
            127.02269,
            127.055595,
            127.059617,
            127.027234,
            127.018121,
            127.054857,
            127.02916,
            127.05547,
            127.069516,
            127.066242,
            127.089455,
            127.079978,
            127.060961,
            127.066408,
            127.04724,
            127.106373,
            127.088056,
            127.013905,
            127.05053,
            127.018274,
            127.026905,
            127.033813,
            127.023816,
            127.017489,
            127.028808,
            127.038847,
            127.046599,
            127.0175,
            127.019876,
            127.023095,
            127.011952,
            127.010583,
            127.036114,
            127.021599,
            127.012388,
            127.029955,
            127.048478,
            127.027923,
            127.02773,
            127.040669,
            127.035044,
            127.042965,
            127.053381,
            127.050775,
            127.069226,
            127.083388,
            127.067873,
            127.069327,
            127.066936,
            126.929588,
            126.932108,
            126.927303,
            126.916704,
            126.91576,
            126.910363,
            126.920836,
            126.926716,
            126.92314,
            126.91572,
            126.915206,
            126.911835,
            126.908494,
            126.907052,
            126.89751,
            126.920906,
            126.927709,
            126.94689,
            126.943002,
            126.931109,
            126.881259,
            126.866333,
            126.847351,
            126.835538,
            126.860499,
            126.876551,
            126.815751,
            126.847666,
            126.860587,
            126.841816,
            126.880705,
            126.875754,
            126.858577,
            126.884084,
            126.897371,
            126.899788,
            126.907744,
            126.934544,
            126.911265,
            126.909878,
            126.898055,
            126.919309,
            126.94976,
            126.918102,
            126.957037,
            126.958408,
            126.927113,
            126.941655,
            126.96521,
            126.934947,
            126.918785,
            126.991573,
            127.041211,
            127.018473,
            127.118148,
            127.116651,
            127.11675,
            127.126328,
            127.116381,
            127.12812,
            127.130313,
            127.134691,
            127.12968,
            127.132098,
            127.089582,
            127.109427,
            127.130337,
            127.112864,
            127.144547,
            127.173779,
            127.165511,
            127.145713,
            127.151348,
            127.14722,
            127.164334,
            127.135704,
            127.12725,
            127.140834,
            127.136792,
            127.125432,
            127.129791,
            127.122399,
            127.129528,
            127.132884,
            127.146145,
            127.136635,
            127.141978,
            127.180671,
            127.15359,
            127.139356,
            127.171661,
            127.176984,
            127.130097,
            127.124635,
            127.154787,
            127.145584,
            127.121724
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.toolfragment, container, false);

        String[] list_menu = { "드릴","전동 드릴","햄머 드릴" };
        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                list_menu
        );

        listView.setAdapter(listViewAdapter);

        return rootView;
    }
}

