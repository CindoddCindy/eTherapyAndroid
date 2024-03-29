package com.cindodcindy.etherapy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.cindodcindy.etherapy.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class MuslimLaporan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muslim_laporan);

        drawLineChart();
    }

    private void drawLineChart() {
        LineChart lineChart = findViewById(R.id.lineChartMuslim);
        List<Entry> lineEntries = getDataSet();
        LineDataSet lineDataSet = new LineDataSet(lineEntries, getString(R.string.muslim_keterangan));
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setLineWidth(2);
        lineDataSet.setColor(Color.RED);
        lineDataSet.setCircleColor(Color.YELLOW);
        lineDataSet.setCircleRadius(6);
        lineDataSet.setCircleHoleRadius(3);
        lineDataSet.setDrawHighlightIndicators(true);
        lineDataSet.setHighLightColor(Color.RED);
        lineDataSet.setValueTextSize(12);
        lineDataSet.setValueTextColor(Color.DKGRAY);

        LineData lineData = new LineData(lineDataSet);
        lineChart.getDescription().setText(getString(R.string.muslim_rate));
        lineChart.getDescription().setTextSize(12);
        lineChart.setDrawMarkers(true);
        lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTH_SIDED);
        lineChart.animateY(1000);
        lineChart.getXAxis().setGranularityEnabled(true);
        lineChart.getXAxis().setGranularity(1.0f);
        lineChart.getXAxis().setLabelCount(lineDataSet.getEntryCount());
        lineChart.setData(lineData);
    }

    private List<Entry> getDataSet() {
        List<Entry> lineEntries = new ArrayList<Entry>();
        lineEntries.add(new Entry(1, 7));
        lineEntries.add(new Entry(2, 2));
        lineEntries.add(new Entry(3, 10));
        lineEntries.add(new Entry(4, 70));
        lineEntries.add(new Entry(5, 88));


        return lineEntries;
    }

}