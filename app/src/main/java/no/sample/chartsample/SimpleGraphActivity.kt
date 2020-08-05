package no.sample.chartsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Cartesian
import kotlinx.android.synthetic.main.activity_main.*


class SimpleGraphActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        drawSinGraph();
    }

    private fun drawSinGraph() {

        var series: ArrayList<DataEntry> = ArrayList()

        //Step 1
        //Create a series of your data points for x and y axis
        for ( angle in 0..360 ) {

            var radian = Math.toRadians( angle.toDouble())
            series.add( ValueDataEntry( /* x-axis */ angle , /* y-axis */ Math.sin(radian) ) )
        }

        // Step 2 assign series to AnyChart column (Data Structure of library)
        val cartesian: Cartesian = AnyChart.column()
        cartesian.column(series) // set your

        // Step 3 assign column to chartview
        chartView.setChart(cartesian)
    }


}