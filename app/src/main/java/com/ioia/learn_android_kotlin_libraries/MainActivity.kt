package com.ioia.learn_android_kotlin_libraries

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import com.google.android.material.button.MaterialButton
import com.ioia.learn_android_kotlin_libraries.auth.AuthActivity
import com.ioia.learn_android_kotlin_libraries.carousel_view.CarouselViewActivity
import com.ioia.learn_android_kotlin_libraries.data_visualization.DataVisualizationActivity
import com.ioia.learn_android_kotlin_libraries.firebase.FirebaseActivity
import com.ioia.learn_android_kotlin_libraries.glide.GlideActivity
import com.ioia.learn_android_kotlin_libraries.image_processing.ImageProcessingActivity
import com.ioia.learn_android_kotlin_libraries.midtrans.MidtransActivity
import com.ioia.learn_android_kotlin_libraries.number_picker.NumberPickerActivity
import com.ioia.learn_android_kotlin_libraries.one_signal.OneSignalActivity
import com.ioia.learn_android_kotlin_libraries.page_stepper.PageStepperActivity
import com.ioia.learn_android_kotlin_libraries.table_view.TableViewActivity
import com.ioia.learn_android_kotlin_libraries.zxing_barcode.ZxingBarcodeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSoal()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun initSoal(){
        val components = mutableMapOf(
            "1. Authentication Library" to AuthActivity::class.java,
            "2. Carousel View" to CarouselViewActivity::class.java,
            "3. Data Visualization" to DataVisualizationActivity::class.java,
            "4. Firebase" to FirebaseActivity::class.java,
            "5. Glide" to GlideActivity::class.java,
            "6. Image Processing" to ImageProcessingActivity::class.java,
            "7. Midtrans" to MidtransActivity::class.java,
            "8. Number Picker" to NumberPickerActivity::class.java,
            "9. One Signal" to OneSignalActivity::class.java,
            "10. Page Stepper" to PageStepperActivity::class.java,
            "11. Table View" to TableViewActivity::class.java,
            "12. Zxing Barcode" to ZxingBarcodeActivity::class.java
        )

        components.forEach {
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            val button = MaterialButton(this, null, R.attr.materialButtonStyle)

            params.setMargins(16, 16, 16, 16)
            button.layoutParams = params
            button.text = it.key
            button.setOnClickListener {_ ->
                startActivity(Intent(this, it.value))
            }

            ll_main.addView(button)
        }
    }
}
